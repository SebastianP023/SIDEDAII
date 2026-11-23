package ec.edu.epn.sidedaii.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ec.edu.epn.sidedaii.view.PantallaBienvenida;
import ec.edu.epn.sidedaii.view.PantallaPrincipal;

/**
 * Controlador de la pantalla de bienvenida.
 */
public class BienvenidaController {

    private PantallaBienvenida bienvenida;
    private PantallaPrincipal principal;

    public BienvenidaController(PantallaBienvenida bienvenida,
            PantallaPrincipal principal) {
        this.bienvenida = bienvenida;
        this.principal = principal;

        this.bienvenida.getBotonIngresar().addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        BienvenidaController.this.bienvenida.setVisible(false);
                        BienvenidaController.this.principal.setLocationRelativeTo(null);
                        BienvenidaController.this.principal.setVisible(true);
                    }
                });
    }
}
