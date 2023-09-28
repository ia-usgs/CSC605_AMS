package com.UserInterface;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AMS_Application extends Application {
    static List<AnchorPane> pages = new ArrayList<AnchorPane>();
    private static int index = 0;

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(AMS_Application.class.getResource("/Login.fxml")); // ApplianceManagement ApplianceRegistration

        Scene scene = new Scene(fxmlLoader.load(), 600, 400); // ApplianceManagement
        //Scene scene = new Scene(fxmlLoader.load(), 400, 550); // ApplianceRegistration
        stage.setTitle("ApplianceManagementSystem");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}