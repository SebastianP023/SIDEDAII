package ec.edu.epn.sidedaii.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import ec.edu.epn.sidedaii.model.SistemaModel;

/**
 * Vista 2: menu principal con los cuatro temas del sistema.
 */
public class PantallaPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;

    private final Color azul = new Color(16, 29, 58);
    private final Color rojo = new Color(215, 25, 32);
    private final Color fondo = new Color(243, 245, 249);

    private JButton botonEficiencia;
    private JButton botonComplejidad;
    private JButton botonClases;
    private JButton botonGrafos;
    private JButton botonVolver;

    public PantallaPrincipal(SistemaModel modelo) {
        setTitle(modelo.getNombre() + " - Menu principal");
        setSize(1050, 680);
        setMinimumSize(new Dimension(850, 580));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel principal = new JPanel(new BorderLayout(20, 20));
        principal.setBackground(fondo);
        principal.setBorder(BorderFactory.createEmptyBorder(25, 35, 25, 35));

        JPanel encabezado = new JPanel(new BorderLayout());
        encabezado.setBackground(fondo);

        JLabel titulo = new JLabel("MENU PRINCIPAL");
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setForeground(azul);

        JLabel subtitulo = new JLabel(modelo.getNombreCompleto());
        subtitulo.setFont(new Font("Arial", Font.PLAIN, 15));
        subtitulo.setForeground(new Color(80, 80, 80));

        JPanel textos = new JPanel(new GridLayout(2, 1, 0, 5));
        textos.setBackground(fondo);
        textos.add(titulo);
        textos.add(subtitulo);

        encabezado.add(textos, BorderLayout.CENTER);
        principal.add(encabezado, BorderLayout.NORTH);

        JPanel tarjetas = new JPanel(new GridLayout(2, 2, 22, 22));
        tarjetas.setBackground(fondo);

        botonEficiencia = crearBoton(
                "01", "EFICIENCIA ALGORITMICA",
                "Estudio del rendimiento de los algoritmos");
        botonComplejidad = crearBoton(
                "02", "ANALISIS DE COMPLEJIDAD",
                "Complejidad temporal y espacial");
        botonClases = crearBoton(
                "03", "P - NP - NP-HARD - NP-COMPLETO",
                "Clasificacion de problemas computacionales");
        botonGrafos = crearBoton(
                "04", "TEORIA DE GRAFOS",
                "Algoritmos y recorridos sobre grafos");

        tarjetas.add(botonEficiencia);
        tarjetas.add(botonComplejidad);
        tarjetas.add(botonClases);
        tarjetas.add(botonGrafos);

        principal.add(tarjetas, BorderLayout.CENTER);

        JPanel pie = new JPanel(new BorderLayout());
        pie.setBackground(fondo);

        JLabel carrera = new JLabel(modelo.getInstitucion()
                + " | " + modelo.getCarrera());
        carrera.setFont(new Font("Arial", Font.BOLD, 13));
        carrera.setForeground(azul);

        botonVolver = new JButton("VOLVER A BIENVENIDA");
        botonVolver.setForeground(Color.WHITE);
        botonVolver.setBackground(rojo);
        botonVolver.setFocusPainted(false);
        botonVolver.setBorderPainted(false);

        pie.add(carrera, BorderLayout.WEST);
        pie.add(botonVolver, BorderLayout.EAST);

        principal.add(pie, BorderLayout.SOUTH);

        add(principal);
    }

    private JButton crearBoton(String numero, String titulo, String descripcion) {
        JButton boton = new JButton(
                "<html><div style='text-align:center;'>"
                + "<span style='font-size:28px;color:#D71920;'>"
                + numero + "</span><br><br>"
                + "<b>" + titulo + "</b><br><br>"
                + "<span style='font-size:11px;color:#555555;'>"
                + descripcion + "</span><br><br>"
                + "<span style='color:#D71920;'>SELECCIONAR</span>"
                + "</div></html>");

        boton.setBackground(Color.WHITE);
        boton.setForeground(azul);
        boton.setFont(new Font("Arial", Font.BOLD, 15));
        boton.setFocusPainted(false);
        boton.setBorder(BorderFactory.createLineBorder(
                new Color(210, 215, 225), 2));
        return boton;
    }

    public JButton getBotonEficiencia() {
        return botonEficiencia;
    }

    public JButton getBotonComplejidad() {
        return botonComplejidad;
    }

    public JButton getBotonClases() {
        return botonClases;
    }

    public JButton getBotonGrafos() {
        return botonGrafos;
    }

    public JButton getBotonVolver() {
        return botonVolver;
    }

    public void mostrarModuloPendiente(String nombreModulo) {
        JOptionPane.showMessageDialog(
                this,
                "El modulo " + nombreModulo
                + " se desarrollara en la siguiente etapa.",
                "SIDEDAII",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
