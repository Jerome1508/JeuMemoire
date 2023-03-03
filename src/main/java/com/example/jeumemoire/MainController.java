package com.example.jeumemoire;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;




public class MainController {




    @FXML
    private Label Label1;

    @FXML
    private Label Label2;

    @FXML
    private Label Label3;

    @FXML
    private Label Label4;

    @FXML
    private Label Label5;

    @FXML
    private Label Label6;

    @FXML
    private Label Label7;

    @FXML
    private Label Label8;

    @FXML
    private Label Label;

    @FXML
    protected int Compter() {
        int count = 0;
        if (!Label1.getText().equals("")) {
            count++;
        }
        if (!Label2.getText().equals("")) {
            count++;
        }
        if (!Label3.getText().equals("")) {
            count++;
        }
        if (!Label4.getText().equals("")) {
            count++;
        }
        if (!Label5.getText().equals("")) {
            count++;
        }
        if (!Label6.getText().equals("")) {
            count++;
        }
        if (!Label7.getText().equals("")) {
            count++;
        }
        if (!Label8.getText().equals("")) {
            count++;
        }
        return count;
    }

    private boolean Victoire() {
        String[] labels = {Label1.getText(), Label2.getText(), Label3.getText(), Label4.getText(), Label5.getText(), Label6.getText(), Label7.getText(), Label8.getText()};

        for (int i = 0; i < labels.length; i++) {
            if (!labels[i].equals("")) {
                for (int j = i + 1; j < labels.length; j++) {
                    if (!labels[j].equals("") && labels[i].equals(labels[j])) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
    private void Cgagneoupas() {
        if(Victoire() == true){
            Label.setText("Victoire t'as gagné");
        }
    }
    @FXML
    protected void onButton1Click() {
        if (Label1.getText().equals("Chat")) {
            Label1.setText("");
        } else if(Compter() < 2 ){
            Label1.setText("Chat");
        }
        Cgagneoupas();
    }



    @FXML
    protected void onButton2Click() {
        if (Label2.getText().equals("Chien")) {
            Label2.setText("");
        } else if(Compter() < 2 ) {
            Label2.setText("Chien");
        }
        Cgagneoupas();
    }
    @FXML
    protected void onButton3Click() {
        if (Label3.getText().equals("Chat")) {
            Label3.setText("");
        } else if(Compter() < 2 ) {
            Label3.setText("Chat");
        }
        Cgagneoupas();
    }

    @FXML
    protected void onButton4Click() {
        if (Label4.getText().equals("Chien")) {
            Label4.setText("");
        } else if(Compter() < 2 ) {
            Label4.setText("Chien");
        }
        Cgagneoupas();
    }

    @FXML
    protected void onButton5Click() {
            if (Label5.getText().equals("Rat")) {
            Label5.setText("");
        } else if(Compter() < 2 ) {
            Label5.setText("Rat");
        }
        Cgagneoupas();
    }

    @FXML
    protected void onButton6Click() {
        if (Label6.getText().equals("Rat")) {
            Label6.setText("");
        } else if(Compter() < 2 ) {
            Label6.setText("Rat");
        }
        Cgagneoupas();
    }
    @FXML
    protected void onButton7Click() {
        if (Label7.getText().equals("Pigeon")) {
            Label7.setText("");
        } else if(Compter() < 2 ) {
            Label7.setText("Pigeon");
        }
        Cgagneoupas();
    }

    @FXML
    protected void onButton8Click() {
        if (Label8.getText().equals("Pigeon")) {
            Label8.setText("");
        } else if(Compter() < 2 ) {
            Label8.setText("Pigeon");
        }
        Cgagneoupas();
    }











}