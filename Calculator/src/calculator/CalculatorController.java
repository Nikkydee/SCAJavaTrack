package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class CalculatorController implements Initializable {


    @FXML
    private TextField inputdisplay;

    @FXML
    private Button ac;

    @FXML
    private Button div;

    @FXML
    private Button minus;

    @FXML
    private Button equal;

    @FXML
    private Button zero;

    @FXML
    private Button dot;


       @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button one;

    @FXML
    private Button six;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button nine;

    @FXML
    private Button eight;

    @FXML


    private Button seven;

}

    @FXML
    private void Calculation(ActionEvent event){

        if (event.getSource()== one)
        {
            inputdisplay.appendText("1");

        }else if (event.getSource()== two){
            inputdisplay.appendText("2");

    }else if (event.getSource()== three){
        inputdisplay.appendText("3");

        }else if (event.getSource()== four){
        inputdisplay.appendText("4");

        }else if (event.getSource()== five){
        inputdisplay.appendText("5");

        }else if (event.getSource()== six){
        inputdisplay.appendText("6");

        }else if (event.getSource()== seven){
        inputdisplay.appendText("7");

        }else if (event.getSource()== eight){
        inputdisplay.appendText("8");

        }else if (event.getSource()== nine){
        inputdisplay.appendText("9");

        }else if (event.getSource()== zero){
        inputdisplay.appendText("0");

        }
        else if (event.getSource()== dot == 0) {
        inputdisplay.appendText(".");
        point = 1;

        }else if (event.getSource()== div){
       Double  input1 = Double.parseDouble ( (inputdisplay.getText ()) );
        inputdisplay.setText("");
        ps =3;
        point =1 ;
        }
    }

    @Override
    public void initialize (URL url, ResourceBundle resourceBundle) {

    }
