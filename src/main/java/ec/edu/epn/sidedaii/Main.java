package ec.edu.epn.sidedaii;

import javax.swing.SwingUtilities;

import ec.edu.epn.sidedaii.controller.BienvenidaController;
import ec.edu.epn.sidedaii.controller.PrincipalController;
import ec.edu.epn.sidedaii.model.SistemaModel;
import ec.edu.epn.sidedaii.view.PantallaBienvenida;
import ec.edu.epn.sidedaii.view.PantallaPrincipal;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SistemaModel modelo = new SistemaModel();

            PantallaBienvenida bienvenida = new PantallaBienvenida(modelo);
            PantallaPrincipal principal = new PantallaPrincipal(modelo);

            new BienvenidaController(bienvenida, principal);
            new PrincipalController(principal, bienvenida);

            bienvenida.setVisible(true);
        });
    }
}
