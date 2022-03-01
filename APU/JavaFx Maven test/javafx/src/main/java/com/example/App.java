package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

import java.io.IOException;

import javafx.scene.Group;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.SKYBLUE);

        stage.setTitle("Stage Demo");
        stage.setScene(scene);
        // stage.setResizable(false); // Allows the window to be resized
        // stage.setHeight(500);
        // stage.setWidth(500);
        Text text = new Text();
        text.setText("This is the first line of text.");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Segoe UI", 50));
        text.setFill(Color.RED);

        Line line = new Line();
        line.setStartX(50);
        line.setStartY(100);
        line.setEndX(200);
        line.setEndY(100);
        line.setStroke(Color.RED);
        line.setOpacity(0.75);
        line.setStrokeWidth(5);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(150);
        rectangle.setY(50);
        rectangle.setWidth(150);
        rectangle.setHeight(150);
        rectangle.setFill(Color.GOLD);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.SILVER);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
            200.0, 200.0,
            300.0, 300.0,
            200.0, 200.0);
        triangle.setFill(Color.YELLOW);

        Circle circle = new Circle();
        circle.setCenterX(400.0);
        circle.setCenterY(400.0);
        circle.setRadius(150.0);
        circle.setFill(Color.ORANGE);

        // Image image = new Image("D:\\Documents\\Visual Studio\\Java\\APU\\JavaFx Maven test\\javafx\\src\\main\\java\\com\\example\\icon.jpg");
        // ImageView imageView = new ImageView(image);
        // imageView.setX(450);
        // imageView.setY(450);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        // root.getChildren().add(imageView);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch(args);
    }

}