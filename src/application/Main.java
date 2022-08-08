package application;
	
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			root.getChildren().add(new Label("Zeyad's Branch"));
			root.getChildren().add(new Label("JiaqiChen's label"));
			root.getChildren().add(new Label("jiaqi's branch"));
			root.getChildren().add(new Label("Zeyad's Branch"));
			Scene scene = new Scene(root,400,400);
			primaryStage.setTitle("Zeyad Elrayes");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
