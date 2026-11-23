package ec.edu.epn.sidedaii.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import ec.edu.epn.sidedaii.model.SistemaModel;

/**
 * Vista 1: pantalla de bienvenida del sistema.
 */
public class PantallaBienvenida extends JFrame {

    private static final long serialVersionUID = 1L;

    private final Color azul = new Color(16, 29, 58);
    private final Color rojo = new Color(215, 25, 32);

    private JButton botonIngresar;

    public PantallaBienvenida(SistemaModel modelo) {
        setTitle(modelo.getNombre() + " - Bienvenida");
        setSize(900, 600);
        setMinimumSize(new Dimension(750, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel principal = new JPanel(new BorderLayout(20, 20));
        principal.setBackground(Color.WHITE);
        principal.setBorder(BorderFactory.createEmptyBorder(35, 50, 35, 50));

        JLabel logo = crearLogo();
        principal.add(logo, BorderLayout.NORTH);

        JPanel centro = new JPanel();
        centro.setBackground(Color.WHITE);
        centro.setLayout(new javax.swing.BoxLayout(
                centro, javax.swing.BoxLayout.Y_AXIS));

        JLabel nombre = new JLabel(modelo.getNombre(), SwingConstants.CENTER);
        nombre.setAlignmentX(CENTER_ALIGNMENT);
        nombre.setFont(new Font("Arial", Font.BOLD, 42));
        nombre.setForeground(azul);

        JLabel nombreCompleto = new JLabel(
                "<html><div style='text-align:center;width:600px;'>"
                + modelo.getNombreCompleto()
                + "</div></html>", SwingConstants.CENTER);
        nombreCompleto.setAlignmentX(CENTER_ALIGNMENT);
        nombreCompleto.setFont(new Font("Arial", Font.PLAIN, 21));
        nombreCompleto.setForeground(new Color(65, 65, 65));

        JLabel institucion = new JLabel(modelo.getInstitucion());
        institucion.setAlignmentX(CENTER_ALIGNMENT);
        institucion.setFont(new Font("Arial", Font.BOLD, 18));
        institucion.setForeground(rojo);

        JLabel carrera = new JLabel(modelo.getCarrera());
        carrera.setAlignmentX(CENTER_ALIGNMENT);
        carrera.setFont(new Font("Arial", Font.PLAIN, 16));
        carrera.setForeground(azul);

        centro.add(nombre);
        centro.add(javax.swing.Box.createVerticalStrut(15));
        centro.add(nombreCompleto);
        centro.add(javax.swing.Box.createVerticalStrut(25));
        centro.add(institucion);
        centro.add(javax.swing.Box.createVerticalStrut(8));
        centro.add(carrera);

        principal.add(centro, BorderLayout.CENTER);

        JPanel inferior = new JPanel();
        inferior.setBackground(Color.WHITE);

        botonIngresar = new JButton("INGRESAR AL SISTEMA");
        botonIngresar.setFont(new Font("Arial", Font.BOLD, 16));
        botonIngresar.setForeground(Color.WHITE);
        botonIngresar.setBackground(azul);
        botonIngresar.setFocusPainted(false);
        botonIngresar.setBorderPainted(false);
        botonIngresar.setPreferredSize(new Dimension(240, 48));

        inferior.add(botonIngresar);
        principal.add(inferior, BorderLayout.SOUTH);

        add(principal);
    }

    private JLabel crearLogo() {
        java.net.URL recurso = getClass().getResource("/imagenes/logo-epn.png");

        if (recurso == null) {
            JLabel aviso = new JLabel("ESCUELA POLITECNICA NACIONAL",
                    SwingConstants.CENTER);
            aviso.setFont(new Font("Arial", Font.BOLD, 20));
            aviso.setForeground(azul);
            return aviso;
        }

        ImageIcon icono = new ImageIcon(recurso);
        Image imagen = icono.getImage().getScaledInstance(
                210, 125, Image.SCALE_SMOOTH);

        JLabel etiqueta = new JLabel(new ImageIcon(imagen));
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        return etiqueta;
    }

    public JButton getBotonIngresar() {
        return botonIngresar;
    }
}
