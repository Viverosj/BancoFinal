package co.edu.uniquindio.banco.controlador;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.banco.modelo.Usuario;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PanelClienteControlador{

    //private final Banco banco = Banco.getInstancia();
    ObservableList<Usuario> listaUsuarios = FXCollections.observableArrayList();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonCerrarSesion;

    @FXML
    private Button buttonConsultar;

    @FXML
    private Button buttonTransferir;

    @FXML
    private Label cuentaLabel;

    @FXML
    private TableView<?> tableAdministracion;

    @FXML
    private TableColumn<?, ?> tcCateroria;

    @FXML
    private TableColumn<?, ?> tcFecha;

    @FXML
    private TableColumn<?, ?> tcTipo;

    @FXML
    private TableColumn<?, ?> tcUsuario;

    @FXML
    private TableColumn<?, ?> tcValor;

    @FXML
    private Label usuarioLabel;

    @FXML
    void onCerrarSesion(ActionEvent event) {

    }

    @FXML
    void onConsultar(ActionEvent event) {

    }

    @FXML
    void onTransferir(ActionEvent event) {

    }

}