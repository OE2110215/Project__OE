package GameScene;

import javafx.scene.canvas.*;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
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
		
		Canvas canvas = new Canvas(1000, 700);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		
		
		drawBackGround(gc);
		drawTitle(gc);
		drawButton(gc);
		//stage.setFullScreen(true);
		stage.setResizable(false);
		stage.show();
	}
	
	public void drawBackGround(GraphicsContext gc) {
		String image_path = "file:res/StartGame.png";
		Image javafx_logo = new Image(image_path);
		gc.drawImage(javafx_logo, 0, 0,javafx_logo.getWidth(),javafx_logo.getHeight() ,0,0,gc.getCanvas().getWidth(),gc.getCanvas().getHeight());
		
	}
	public void drawButton(GraphicsContext gc) {
		
	}
	public void drawTitle(GraphicsContext gc){
		gc.setLineWidth(2);
		gc.setFill(Color.DARKGRAY);
		//gc.setStroke(Color.BLACK);
		gc.setStroke(Color.AZURE);
		Font theFont = Font.font("BROADW",FontWeight.BOLD,58);
		gc.setFont(theFont);
		//gc.set
		gc.fillText("OE Story", gc.getCanvas().getWidth()/2-120, 80);
		gc.strokeText("OE Story", gc.getCanvas().getWidth()/2-120, 80);
		
		//theFont = Font.font(arg0)
	
	}
	public static void main(String[]args) {
		launch();
	}
	
}
