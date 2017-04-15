/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 *
 * @author henry hace tarea
 */
public class RegistroEmpleadoController {
    @FXML
    private Label titulo;
    //Labels usados para mostrar que va en cada casilla 
    @FXML
    private Label titNombre;
    @FXML
    private Label titCi;
    @FXML
    private Label titTelefono;
    @FXML
    private Label titDireccion;
    //CAMPOS DE TEXTO
    @FXML
    private TextField tfNombre;
    @FXML
    private TextField tfCi;
    @FXML
    private TextField tfTelefono;
    @FXML
    private TextField tfDireccion;
    //Botones
    @FXML
    private Button btnRegistrar;
    
    @FXML
    private void registrar(ActionEvent e){
        JOptionPane.showMessageDialog(null, "REGISTRADO");
    }
}
