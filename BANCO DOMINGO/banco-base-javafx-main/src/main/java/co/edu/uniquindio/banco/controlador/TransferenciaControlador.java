package co.edu.uniquindio.banco.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import co.edu.uniquindio.banco.modelo.Banco;
import co.edu.uniquindio.banco.modelo.enums.CategoriaTransaccion;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class TransferenciaControlador {

    private final Banco banco = Banco.getInstancia();

    @FXML
    private TextField MontoTransferirTexField;

    @FXML
    private Label NuCuentaLabel;

    @FXML
    private TextField NumeroCuentaTextField;

    @FXML
    private ComboBox<?> comboCategorias;

    @FXML
    private Button TransferirButton;

    // Método para validar que los campos no estén vacíos
    private boolean validarCampos(String numeroCuentaDestino, String monto, CategoriaTransaccion categoria) {
        return !numeroCuentaDestino.isEmpty() && !monto.isEmpty();
    }

    // Método para mostrar un mensaje de éxito
    private void mostrarMensajeExito(String mensaje) {
        Alert alerta = new Alert(AlertType.INFORMATION);
        alerta.setTitle("Éxito");
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    // Método para mostrar un mensaje de error
    private void mostrarMensajeError(String mensaje) {
        Alert alerta = new Alert(AlertType.ERROR);
        alerta.setTitle("Error");
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    @FXML
    private void transferir() {
        String numeroCuentaDestino = NumeroCuentaTextField.getText();
        String montoStr = MontoTransferirTexField.getText();

        // Validar que los campos no estén vacíos
        if (!validarCampos(numeroCuentaDestino, montoStr, (CategoriaTransaccion) comboCategorias.getValue())) {
            // Mostrar un mensaje de error indicando que los campos son obligatorios
            // Por ejemplo:
            // mensajeErrorLabel.setText("Los campos son obligatorios.");
            return;
        }

        // Convertir el monto a float
        float monto = Float.parseFloat(montoStr);

        try {
            // Realizar la transferencia
            String numeroCuentaOrigen = null;
            banco.realizarTransferencia(numeroCuentaOrigen, numeroCuentaDestino, monto, (CategoriaTransaccion) comboCategorias.getValue());
            mostrarMensajeExito("La transferencia se realizó exitosamente.");
        } catch (Exception e) {
            mostrarMensajeError("Error al realizar la transferencia: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

    //metodos que faltan:
    //// Método para validar que los campos no estén vacíos
    //metodo para transferir
    //metodo consultar saldo
    //Metodo cerrar sesion
    //que abra la ventana transferir
    //llenar tabla





