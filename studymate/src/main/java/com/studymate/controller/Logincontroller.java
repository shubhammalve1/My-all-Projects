 
/* 
package com.studymate.controller;

import java.io.FileInputStream;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.studymate.firebase_connection.Firebaseservice;
import com.studymate.page2.page2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * LoginController manages the login UI and interactions with FirebaseService.
 */
/* 
public class Logincontroller extends Application {
    private Stage primaryStage;
    private Firebaseservice firebaseService;
    
    public void setPrimaryStageScene(Scene scene) {
        primaryStage.setScene(scene);
    }

    public void initializeLoginScene() {
        Scene loginScene = createLoginAndSignUpScene();
        primaryStage.setScene(loginScene);
    }

    private Scene createLoginAndSignUpScene() {
        Image img = new Image("file:src/main/resources/note.jpg");
        ImageView i = new ImageView(img);
        i.setFitHeight(800);
        i.setFitWidth(1000);

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.setMaxWidth(600);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(i, layout);

        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Button loginButton = new Button("Log In");
        Button signUpButton = new Button("Sign Up");

        firebaseService = new Firebaseservice(this, emailField, passwordField);

        loginButton.setOnAction(event -> firebaseService.login());
        signUpButton.setOnAction(event -> firebaseService.signUp());

        HBox buttonBox = new HBox(10, loginButton, signUpButton);
        layout.getChildren().addAll(emailField, passwordField, buttonBox);

        return new Scene(stackPane, 800, 800);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        // Initialize Firebase App
        try {
            FileInputStream serviceAccount = new FileInputStream("src/main/resources/studymate.json");
            FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://studymate-ts-default-rtdb.asia-southeast1.firebasedatabase.app")
                .build();
            FirebaseApp.initializeApp(options);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Create initial login and signup scene
        Scene scene = createLoginAndSignUpScene();
        primaryStage.setTitle("STUDYMATE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void navigateToPage2() {
        page2 page = new page2();
        try {
            page.start(primaryStage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/


////////////////////////THis is my code ////////


package com.studymate.controller;

import java.io.FileInputStream;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.studymate.firebase_connection.Firebaseservice;
import com.studymate.page2.page2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


 //LoginController manages the login UI and interactions with FirebaseService.
 
public class Logincontroller extends Application {
    private Stage primaryStage;
    private Firebaseservice firebaseService;
    
    public void setPrimaryStageScene(Scene scene) {
        primaryStage.setScene(scene);
    }

    public void initializeLoginScene() {
        Scene loginScene = createLoginAndSignUpScene();
        primaryStage.setScene(loginScene);
    }

    private Scene createLoginAndSignUpScene() {
        Image img = new Image("file:src/main/resources/note.jpg");
        ImageView i = new ImageView(img);
        i.setFitHeight(800);
        i.setFitWidth(1000);

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.setMaxWidth(600);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(i, layout);

        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Button loginButton = new Button("Log In");
        Button signUpButton = new Button("Sign Up");

        firebaseService = new Firebaseservice(this, emailField, passwordField);

        loginButton.setOnAction(event -> firebaseService.login());
        signUpButton.setOnAction(event -> firebaseService.signUp());

        HBox buttonBox = new HBox(10, loginButton, signUpButton);
        layout.getChildren().addAll(emailField, passwordField, buttonBox);

        return new Scene(stackPane, 800, 800);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        // Initialize Firebase App
        try {
            FileInputStream serviceAccount = new FileInputStream("src/main/resources/studymate.json");
            FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://studymate-ts-default-rtdb.asia-southeast1.firebasedatabase.app")
                .build();
            FirebaseApp.initializeApp(options);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Create initial login and signup scene
        Scene scene = createLoginAndSignUpScene();
        primaryStage.setTitle("STUDYMATE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void navigateToPage2() {
        page2 page = new page2(this);
        try {
            page.start(primaryStage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToFirebaseservice() {

        // Create the initial components
        Image image = new Image("file:studissapp/src/main/java/com/studiss/Assests/Images/Profileinfo.jpg");
        ImageView imageView = new ImageView(image);
    
        Label label1 = new Label("About Us...!!!");
        String labelFont = "-fx-font-family: 'Verdana'; -fx-font-size: 16px; -fx-text-fill: Black; -fx-font-weight: bold;";
        label1.setStyle(labelFont);
    
        // Create ImageView and Text for member 1
        Image image1 = new Image("file:F:/mavenproject/Stageproject/Studiss_App/studissapp/src/main/java/com/studiss/Assests/Images/shubhammalve.jpg");
        ImageView imageView1 = new ImageView(image1);
        imageView1.setStyle("-fx-border-color: black; -fx-border-width: 2px; -fx-border-radius: 5px;");
        imageView1.setFitWidth(100);
        imageView1.setFitHeight(100);
        imageView1.setPreserveRatio(true);
    
        Text text1 = new Text("Shubham Vilas Malve\nGroup Leader\nI am learning to code");
        text1.setStyle("-fx-font-weight: bold;");
        HBox hbox1 = new HBox(imageView1, text1);
        hbox1.setSpacing(10); // Adjust spacing as needed
        hbox1.setPadding(new Insets(10)); // Adjust padding as needed
        hbox1.setStyle("-fx-border-color: black; -fx-border-width: 2px; -fx-border-radius: 5px; -fx-background-color: lightblue;");
        
        // Create ImageView and Text for member 2
        Image image2 = new Image("file:F:/mavenproject/Stageproject/Studiss_App/studissapp/src/main/java/com/studiss/Assests/Images/shubhammalve.jpg");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setStyle("-fx-border-color: black; -fx-border-width: 2px; -fx-border-radius: 5px;");
        imageView2.setFitWidth(100);
        imageView2.setFitHeight(100);
        imageView2.setPreserveRatio(true);
    
        Text text2 = new Text("Tushar Tukaram Landge\nGroup Member\nI am learning to code");
        text2.setStyle("-fx-font-weight: bold;");
        HBox hbox2 = new HBox(imageView2, text2);
        hbox2.setSpacing(10); // Adjust spacing as needed
        hbox2.setPadding(new Insets(10)); // Adjust padding as needed
        hbox2.setStyle("-fx-border-color: black; -fx-border-width: 2px; -fx-border-radius: 5px; -fx-background-color: lightblue;");
    
        // Create VBox to hold both HBoxes vertically
        VBox root = new VBox(30, label1, hbox1, hbox2); // Adjust spacing between HBoxes as needed
        root.setPadding(new Insets(20));
        
        // Create the main StackPane
        StackPane stackPane = new StackPane(imageView, root);
    
        // Create the logout button
        Button logoutButton = new Button("Logout");
        logoutButton.setOnAction(event -> initializeLoginScene());
        
        // Position the logout button at the bottom
        StackPane.setAlignment(logoutButton, Pos.BOTTOM_CENTER);
        StackPane.setMargin(logoutButton, new Insets(10));
        stackPane.getChildren().add(logoutButton);
        
        // Create the scene and set it on the stage
        Scene scene = new Scene(stackPane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    

    }





/*package com.studiss.AboutUs;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class aboutUs extends Application {

    @Override
    public void start(Stage primaryStage) {

        Image image = new Image("file:studissapp/src/main/java/com/studiss/Assests/Images/Profileinfo.jpg");
        ImageView imageView = new ImageView(image);

        Label label1 = new Label("About Us...!!!");
        String labelFont = "-fx-font-family: 'Verdana'; -fx-font-size: 16px; -fx-text-fill: Black; -fx-font-weight: bold;";
        label1.setStyle(labelFont);

        // Create ImageView and Text for member 1
        Image image1 = new Image("file:F:/mavenproject/Stageproject/Studiss_App/studissapp/src/main/java/com/studiss/Assests/Images/shubhammalve.jpg");
        ImageView imageView1 = new ImageView(image1);
        imageView1.setStyle("-fx-border-color: black; -fx-border-width: 2px; -fx-border-radius: 5px;");
        imageView1.setFitWidth(100);
        imageView1.setFitHeight(100);
        imageView1.setPreserveRatio(true);

        Text text1 = new Text("Shubham Vilas Malve\nGroup Leader\nI am learning to code");
        text1.setStyle("-fx-font-weight: bold;");
        HBox hbox1 = new HBox(imageView1, text1);
        hbox1.setSpacing(10); // Adjust spacing as needed
        hbox1.setPadding(new Insets(10)); // Adjust padding as needed
        hbox1.setStyle("-fx-border-color: black; -fx-border-width: 2px; -fx-border-radius: 5px; -fx-background-color: lightblue;");
        
        // Create ImageView and Text for member 2
        Image image2 = new Image("file:F:/mavenproject/Stageproject/Studiss_App/studissapp/src/main/java/com/studiss/Assests/Images/shubhammalve.jpg");
        ImageView imageView2 = new ImageView(image2);
        imageView2.setStyle("-fx-border-color: black; -fx-border-width: 2px; -fx-border-radius: 5px;");
        imageView2.setFitWidth(100);
        imageView2.setFitHeight(100);
        imageView2.setPreserveRatio(true);

        Text text2 = new Text("Tushar Tukaram Landge\nGroup Member\nI am learning to code");
        text2.setStyle("-fx-font-weight: bold;");
        HBox hbox2 = new HBox(imageView2, text2);
        hbox2.setSpacing(10); // Adjust spacing as needed
        hbox2.setPadding(new Insets(10)); // Adjust padding as needed
        hbox2.setStyle("-fx-border-color: black; -fx-border-width: 2px; -fx-border-radius: 5px; -fx-background-color: lightblue;");

        // Create VBox to hold both HBoxes vertically
        VBox root = new VBox(30, label1, hbox1, hbox2); // Adjust spacing between HBoxes as needed
        root.setPadding(new Insets(20));
        //root.setStyle("-fx-border-color: ; -fx-border-width: 2px; -fx-border-radius: 5px;");
        
        StackPane sp = new StackPane(imageView,root);
        // Create the scene and set it on the stage
        Scene scene = new Scene(sp, 500, 500); // Set scene dimensions
        primaryStage.setTitle("About Us");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}


*/
