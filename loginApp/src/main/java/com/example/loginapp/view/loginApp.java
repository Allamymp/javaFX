package com.example.loginapp.view;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class loginApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane pane = new AnchorPane();
        pane.setPrefSize(600, 400);

        TextField txLogin = new TextField();
        txLogin.setPromptText("Digite seu login aqui!");


        PasswordField txPassword = new PasswordField();
        txPassword.setPromptText("Digite sua senha aqui!");

        Button btEntrar = new Button("Entrar");
        Button btSair = new Button("Sair");

        pane.setStyle("-fx-background-color: linear-gradient(from 0% 0% to 100% 100%, blue 0%, silver 100%)");

        pane.getChildren().addAll(txLogin, txPassword, btEntrar, btSair);


        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        txLogin.setLayoutX((pane.getWidth() - txLogin.getWidth()) / 2);
        txLogin.setLayoutY(50);

        txPassword.setLayoutX((pane.getWidth() - txPassword.getWidth()) / 2);
        txPassword.setLayoutY(100);

        btEntrar.setLayoutX(
                ((pane.getWidth() - btEntrar.getWidth()) / 2)
        );
        btEntrar.setLayoutY(150);
        btSair.setLayoutX((pane.getWidth() - btSair.getWidth()) / 2);
        btSair.setLayoutY(200);


    }

    public static void main(String[] args) {
        launch(args);
    }
}