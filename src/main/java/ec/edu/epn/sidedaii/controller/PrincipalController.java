package ec.edu.epn.sidedaii.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ec.edu.epn.sidedaii.view.PantallaBienvenida;
import ec.edu.epn.sidedaii.view.PantallaPrincipal;

/**
 * Controlador del menu principal.
 */
public class PrincipalController {

    private PantallaPrincipal principal;
    private PantallaBienvenida bienvenida;

    public PrincipalController(PantallaPrincipal principal,
            PantallaBienvenida bienvenida) {
        this.principal = principal;
        this.bienvenida = bienvenida;

        principal.getBotonEficiencia().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                principal.mostrarModuloPendiente("Eficiencia algoritmica");
            }
        });

        principal.getBotonComplejidad().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                principal.mostrarModuloPendiente("Analisis de complejidad");
            }
        });

        principal.getBotonClases().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                principal.mostrarModuloPendiente("P, NP, NP-Hard y NP-Completo");
            }
        });

        principal.getBotonGrafos().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                principal.mostrarModuloPendiente("Teoria de grafos");
            }
        });

        principal.getBotonVolver().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                principal.setVisible(false);
                bienvenida.setLocationRelativeTo(null);
                bienvenida.setVisible(true);
            }
        });
    }
}
