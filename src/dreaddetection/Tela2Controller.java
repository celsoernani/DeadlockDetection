/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreaddetection;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author celso
 */
public class Tela2Controller implements Initializable {
    
    @FXML
    private AnchorPane Ancora1;

    @FXML
    private TextField Nome1;

    @FXML
    private AnchorPane Ancora3;

    @FXML
    private TextField Nome3;

    @FXML
    private AnchorPane Ancora5;

    @FXML
    private TextField Nome5;

    @FXML
    private AnchorPane Ancora7;

    @FXML
    private TextField Nome7;

    @FXML
    private AnchorPane Ancora9;

    @FXML
    private TextField Nome9;

    @FXML
    private AnchorPane Ancora2;

    @FXML
    private TextField Nome2;

    @FXML
    private AnchorPane Ancora4;

    @FXML
    private TextField Nome4;

    @FXML
    private AnchorPane Ancora6;

    @FXML
    private TextField Nome6;

    @FXML
    private AnchorPane Ancora8;

    @FXML
    private TextField Nome8;

    @FXML
    private AnchorPane Ancora10;

    @FXML
    private TextField Nome10;

    @FXML
    private Button buttonGO;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
              //  pegar valores e nomes dos recursos
                FXMLLoader TelaGrafo = new FXMLLoader(getClass().getResource("TelaGrafo.fxml"));
               //TODO parametrizar "TelaGrafoController
                TelaGrafo.setController(new TelaGrafoController());
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(TelaGrafo.load()));
                stage.show();
    }


        private final int quant_recursos;
    public  Tela2Controller(int quant_recursos){
        this.quant_recursos = quant_recursos;
 
        }

    
    public void RecursosSetup(int quant_recursos) {
               for(int i = 0; i<quant_recursos; i++) {
                   

			
		}
    }  
    
     
 

    

    public void setarEspaços(){
       switch (quant_recursos) {
           case 1:
               Ancora1.setVisible(true);
               Ancora2.setVisible(false);
               Ancora3.setVisible(false);
               Ancora4.setVisible(false);
               Ancora5.setVisible(false);
               Ancora6.setVisible(false);
               Ancora7.setVisible(false);
               Ancora8.setVisible(false);
               Ancora9.setVisible(false);
               Ancora10.setVisible(false);
               
               break;
           case 2:
               Ancora1.setVisible(true);
               Ancora2.setVisible(true);
               Ancora3.setVisible(false);
               Ancora4.setVisible(false);
               Ancora5.setVisible(false);
               Ancora6.setVisible(false);
               Ancora7.setVisible(false);
               Ancora8.setVisible(false);
               Ancora9.setVisible(false);
               Ancora10.setVisible(false);
               break;
           case 3:
               Ancora1.setVisible(true);
               Ancora2.setVisible(true);
               Ancora3.setVisible(true);
               Ancora4.setVisible(false);
               Ancora5.setVisible(false);
               Ancora6.setVisible(false);
               Ancora7.setVisible(false);
               Ancora8.setVisible(false);
               Ancora9.setVisible(false);
               Ancora10.setVisible(false);
               break;
           case 4:
               Ancora1.setVisible(true);
               Ancora2.setVisible(true);
               Ancora3.setVisible(true);
               Ancora4.setVisible(true);
               Ancora5.setVisible(false);
               Ancora6.setVisible(false);
               Ancora7.setVisible(false);
               Ancora8.setVisible(false);
               Ancora9.setVisible(false);
               Ancora10.setVisible(false);
               break;
           case 5:
               Ancora1.setVisible(true);
               Ancora2.setVisible(true);
               Ancora3.setVisible(true);
               Ancora4.setVisible(true);
               Ancora5.setVisible(true);
               Ancora6.setVisible(false);
               Ancora7.setVisible(false);
               Ancora8.setVisible(false);
               Ancora9.setVisible(false);
               Ancora10.setVisible(false);
               break;
           case 6:
               Ancora1.setVisible(true);
               Ancora2.setVisible(true);
               Ancora3.setVisible(true);
               Ancora4.setVisible(true);
               Ancora5.setVisible(true);
               Ancora6.setVisible(true);
               Ancora7.setVisible(false);
               Ancora8.setVisible(false);
               Ancora9.setVisible(false);
               Ancora10.setVisible(false);
               break;
           case 7:
               Ancora1.setVisible(true);
               Ancora2.setVisible(true);
               Ancora3.setVisible(true);
               Ancora4.setVisible(true);
               Ancora5.setVisible(true);
               Ancora6.setVisible(true);
               Ancora7.setVisible(true);
               Ancora8.setVisible(false);
               Ancora9.setVisible(false);
               Ancora10.setVisible(false);
               break;
           case 8:
               Ancora1.setVisible(true);
               Ancora2.setVisible(true);
               Ancora3.setVisible(true);
               Ancora4.setVisible(true);
               Ancora5.setVisible(true);
               Ancora6.setVisible(true);
               Ancora7.setVisible(true);
               Ancora8.setVisible(true);
               Ancora9.setVisible(false);
               Ancora10.setVisible(false);
               break;
           case 9:
               Ancora1.setVisible(true);
               Ancora2.setVisible(true);
               Ancora3.setVisible(true);
               Ancora4.setVisible(true);
               Ancora5.setVisible(true);
               Ancora6.setVisible(true);
               Ancora7.setVisible(true);
               Ancora8.setVisible(true);
               Ancora9.setVisible(true);
               Ancora10.setVisible(false);
               break;
           case 10:
               Ancora1.setVisible(true);
               Ancora2.setVisible(true);
               Ancora3.setVisible(true);
               Ancora4.setVisible(true);
               Ancora5.setVisible(true);
               Ancora6.setVisible(true);
               Ancora7.setVisible(true);
               Ancora8.setVisible(true);
               Ancora9.setVisible(true);          
               Ancora10.setVisible(true);
               break;
           default:
               break;
       }
        
    
    }

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                 setarEspaços(); 
    }    
    
}
