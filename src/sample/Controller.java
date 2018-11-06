package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Controller {

    ArrayList<String> numbers = new ArrayList<String>();
    int resultat;

    @FXML
    public TextField talDisplay;

    public void plusMetode(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        System.out.println(s + " er nu tilføjet. ");
        numbers.add(s);
        talDisplay.clear();
    }

    public void resultat(ActionEvent actionEvent) {

        // Indlæser en string for textfeltet
        String s = talDisplay.getText();
        System.out.println(s + " er nu tilføjet ");
        numbers.add(s);
        talDisplay.clear();


        for (String number: numbers) {
            resultat += Integer.parseInt(number);
        }
        System.out.println("Det bliver: " + resultat);
        talDisplay.setText(Integer.toString(resultat));
    }
}
