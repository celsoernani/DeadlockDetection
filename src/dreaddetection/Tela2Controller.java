/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dreaddetection;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

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
    private Button ButtonGo;

    @FXML
    private TextField temp_verifica;

    @FXML
    private AnchorPane AncoraP4;

    @FXML
    private TextField minSol4;

    @FXML
    private TextField maxSol4;

    @FXML
    private TextField minUti4;

    @FXML
    private TextField maxUti4;

    @FXML
    private AnchorPane AncoraP5;

    @FXML
    private TextField minSol5;

    @FXML
    private TextField maxSol5;

    @FXML
    private TextField minUti5;

    @FXML
    private TextField maxUti5;

    @FXML
    private AnchorPane AncoraP6;

    @FXML
    private TextField minSol6;

    @FXML
    private TextField maxSol6;

    @FXML
    private TextField minUti6;

    @FXML
    private TextField maxUti6;

    @FXML
    private AnchorPane AncoraP1;

    @FXML
    private TextField minSol1;

    @FXML
    private TextField maxSol1;

    @FXML
    private TextField minUti1;

    @FXML
    private TextField maxUti1;

    @FXML
    private AnchorPane AncoraP2;

    @FXML
    private TextField minSol2;

    @FXML
    private TextField maxSol2;

    @FXML
    private TextField minUti2;

    @FXML
    private TextField maxUti2;

    @FXML
    private AnchorPane AncoraP8;

    @FXML
    private TextField minSol8;

    @FXML
    private TextField maxSol8;

    @FXML
    private TextField minUti8;

    @FXML
    private TextField maxUti8;

    @FXML
    private AnchorPane AncoraP3;

    @FXML
    private TextField minSol3;

    @FXML
    private TextField maxSol3;

    @FXML
    private TextField minUti3;

    @FXML
    private TextField maxUti3;

    @FXML
    private AnchorPane AncoraP10;

    @FXML
    private TextField minSol10;

    @FXML
    private TextField maxSol10;

    @FXML
    private TextField minUti10;

    @FXML
    private TextField maxUti10;

    @FXML
    private AnchorPane AncoraP7;

    @FXML
    private TextField minSol7;

    @FXML
    private TextField maxSol7;

    @FXML
    private TextField minUti7;

    @FXML
    private TextField maxUti7;

    @FXML
    private AnchorPane AncoraP9;

    @FXML
    private TextField minSol9;

    @FXML
    private TextField maxSol9;

    @FXML
    private TextField minUti9;

    @FXML
    private TextField maxUti9;

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

    public  Tela2Controller(int quant_recursos, int quant_processos){
        this.quant_recursos = quant_recursos;
        this.quant_processos = quant_processos;
        }

    private final int quant_recursos;
    private final int quant_processos;

    

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
        switch (quant_processos) {
           case 1:
               AncoraP1.setVisible(true);
               AncoraP2.setVisible(false);
               AncoraP3.setVisible(false);
               AncoraP4.setVisible(false);
               AncoraP5.setVisible(false);
               AncoraP6.setVisible(false);
               AncoraP7.setVisible(false);
               AncoraP8.setVisible(false);
               AncoraP9.setVisible(false);
               AncoraP10.setVisible(false);
               break;
           case 2:
               AncoraP1.setVisible(true);
               AncoraP2.setVisible(true);
               AncoraP3.setVisible(false);
               AncoraP4.setVisible(false);
               AncoraP5.setVisible(false);
               AncoraP6.setVisible(false);
               AncoraP7.setVisible(false);
               AncoraP8.setVisible(false);
               AncoraP9.setVisible(false);
               AncoraP10.setVisible(false);
               break;
           case 3:
               AncoraP1.setVisible(true);
               AncoraP2.setVisible(true);
               AncoraP3.setVisible(true);
               AncoraP4.setVisible(false);
               AncoraP5.setVisible(false);
               AncoraP6.setVisible(false);
               AncoraP7.setVisible(false);
               AncoraP8.setVisible(false);
               AncoraP9.setVisible(false);
               AncoraP10.setVisible(false);
               break;
           case 4:
               AncoraP1.setVisible(true);
               AncoraP2.setVisible(true);
               AncoraP3.setVisible(true);
               AncoraP4.setVisible(true);
               AncoraP5.setVisible(false);
               AncoraP6.setVisible(false);
               AncoraP7.setVisible(false);
               AncoraP8.setVisible(false);
               AncoraP9.setVisible(false);
               AncoraP10.setVisible(false);
               break;
           case 5:
               AncoraP1.setVisible(true);
               AncoraP2.setVisible(true);
               AncoraP3.setVisible(true);
               AncoraP4.setVisible(true);
               AncoraP5.setVisible(true);
               AncoraP6.setVisible(false);
               AncoraP7.setVisible(false);
               AncoraP8.setVisible(false);
               AncoraP9.setVisible(false);
               AncoraP10.setVisible(false);
               break;
           case 6:
               AncoraP1.setVisible(true);
               AncoraP2.setVisible(true);
               AncoraP3.setVisible(true);
               AncoraP4.setVisible(true);
               AncoraP5.setVisible(true);
               AncoraP6.setVisible(true);
               AncoraP7.setVisible(false);
               AncoraP8.setVisible(false);
               AncoraP9.setVisible(false);
               AncoraP10.setVisible(false);
               break;
           case 7:
               AncoraP1.setVisible(true);
               AncoraP2.setVisible(true);
               AncoraP3.setVisible(true);
               AncoraP4.setVisible(true);
               AncoraP5.setVisible(true);
               AncoraP6.setVisible(true);
               AncoraP7.setVisible(true);
               AncoraP8.setVisible(false);
               AncoraP9.setVisible(false);
               AncoraP10.setVisible(false);
               break;
           case 8:
               AncoraP1.setVisible(true);
               AncoraP2.setVisible(true);
               AncoraP3.setVisible(true);
               AncoraP4.setVisible(true);
               AncoraP5.setVisible(true);
               AncoraP6.setVisible(true);
               AncoraP7.setVisible(true);
               AncoraP8.setVisible(true);
               AncoraP9.setVisible(false);
               AncoraP10.setVisible(false);
               break;
           case 9:
               AncoraP1.setVisible(true);
               AncoraP2.setVisible(true);
               AncoraP3.setVisible(true);
               AncoraP4.setVisible(true);
               AncoraP5.setVisible(true);
               AncoraP6.setVisible(true);
               AncoraP7.setVisible(true);
               AncoraP8.setVisible(true);
               AncoraP9.setVisible(true);
               AncoraP10.setVisible(false);
               break;
           case 10:
               AncoraP1.setVisible(true);
               AncoraP2.setVisible(true);
               AncoraP3.setVisible(true);
               AncoraP4.setVisible(true);
               AncoraP5.setVisible(true);
               AncoraP6.setVisible(true);
               AncoraP7.setVisible(true);
               AncoraP8.setVisible(true);
               AncoraP9.setVisible(true);          
               AncoraP10.setVisible(true);
               break;
           default:
               break;
       }
    
    }
//    public void run(){
//            setarEspaços();
//    }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                 setarEspaços(); 
    }    
    
}
