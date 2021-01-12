/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a05_introducao_javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author ander
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMensagem;
    @FXML
    private Button btnClique;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        if(lblMensagem.getText().equals("CHEGUEIIIII !!!!")){
            lblMensagem.setText("Aqui vai ser escrito a tua mensagem");
        }else{
            lblMensagem.setText("CHEGUEIIIII !!!!");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
