package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import sample.Estructura.Busqueda_Implementos;


import java.awt.*;
import java.io.IOException;

public class Controller {

    @FXML
    TextField txtNumberControl;

    @FXML
    TextField txtPassword;
    String[][]arrayUsuarios=new String[3][3];
    @FXML protected void initialize(){
        arrayUsuarios[0][0]="Luis Grijalva"; arrayUsuarios[0][1]="ADMIN"; arrayUsuarios[0][2]="123";
        arrayUsuarios[1][0]="19CG0063"; arrayUsuarios[1][1]="19CG0063"; arrayUsuarios[1][2]="201201";
        arrayUsuarios[2][0]="Gerentes"; arrayUsuarios[2][1]="Gene2598_"; arrayUsuarios[2][2]="3258159875620fg58";
    }


    //accion del login
    public void ingresar(){
        String usuario=txtNumberControl.getText();
        String password=txtPassword.getText();
        Busqueda_Implementos busqueda=new Busqueda_Implementos();
        int indicie=busqueda.secuencial(arrayUsuarios,usuario,password);
        if(indicie>=0){
            try {
                Main.DatosUsuarios=arrayUsuarios[indicie][0];
                  Parent root = FXMLLoader.load(getClass().getResource("notas.fxml"));
                Scene scene=new Scene(root);
                Main.stage.setScene(scene);
                Main.stage.setMaximized(false);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Agenda 2020-2021");
            alert.setContentText("Datos invalidos, intenta nuevamente en Sing Up");
            alert.show();

        }
    }//login
    public void login(ActionEvent event){
        txtNumberControl.setEditable(false);
        txtPassword.setEditable(false);
        txtPassword.setVisible(false);
        txtNumberControl.setVisible(false);
        ingresar();
    }//Registro habilitado
    public void registro(ActionEvent event){
        txtPassword.setEditable(true);
        txtNumberControl.setEditable(true);
        txtNumberControl.setVisible(true);
        txtPassword.setVisible(true);
        txtPassword.clear();
        txtNumberControl.clear();
    }




}//controller
