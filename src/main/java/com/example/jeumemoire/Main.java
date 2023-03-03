package com.example.jeumemoire;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javafx.scene.Group;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;





public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {



        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Jeu de mémoire!");
        stage.setScene(scene);
        stage.show();




    }


    public static void letsgo(Stage stage) throws IOException {


        InputStream stream = new FileInputStream("D:\\JeuMemoire\\target\\chat.jpg");
        Image image = new Image(stream);
        ImageView imageView = new ImageView();
        imageView.setImage(image);
        imageView.setX(10);
        imageView.setY(10);
        imageView.setFitWidth(575);
        imageView.setPreserveRatio(true);
        Group root = new Group(imageView);
        Scene scene1 = new Scene(root, 595, 370);
        stage.setTitle("Displaying Image");
        stage.setScene(scene1);
        stage.show();

    }


    public static void main(String[] args) {


        launch();
    }
}