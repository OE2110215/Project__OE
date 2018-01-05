package GameScene;

import javafx.scene.canvas.*;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class StartMenu extends Application {
	@Override
	public void start(Stage stage){
		StackPane root = new StackPane();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("OE Story");
		
		Canvas canvas = new Canvas(600, 600);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		
		String image_path = "file:res/StartGame.png";
		drawImage(gc,image_path);
		drawFilledText(gc);
		
		stage.show();
	}
	
	public void drawImage(GraphicsContext gc, String image_path) {
		Image javafx_logo = new Image(image_path);
		gc.drawImage(javafx_logo, 0, 0);
	}
	
	public void drawFilledText(GraphicsContext gc){
		gc.setLineWidth(2);
		gc.setFill(Color.DARKGRAY);
		gc.setStroke(Color.AZURE);
		Font theFont = Font.font("OE Story",FontWeight.LIGHT,58);
		gc.setFont(theFont);
		
		gc.fillText("OE Story", 200, 80);
		
		gc.setLineWidth(2.0);
		gc.setFill(Color.DARKGRAY);
	}
	
}
