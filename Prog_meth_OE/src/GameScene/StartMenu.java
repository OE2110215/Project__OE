package GameScene;

import javafx.scene.canvas.*;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import ObjectShare.RenderableHolder;
import Window.SceneManager;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import ObjectShare.RenderableHolder;

public class StartMenu extends Canvas {
	
	public  StartMenu(){
		super(SceneManager.sceneWidth, SceneManager.sceneHeight);
		
		GraphicsContext gc = this.getGraphicsContext2D();
		
		
		drawBackGround(gc);
		drawTitle(gc);
		drawButton(gc);
		//stage.setFullScreen(true);
		
	}
	
	public void drawBackGround(GraphicsContext gc) {
		gc.drawImage(RenderableHolder.startManuBackGround,0,0,SceneManager.sceneWidth,SceneManager.sceneHeight);
//		this.drawImage(RenderableHolder.startManuBackGround, 0, 0,RenderableHolder.startManuBackGround.getWidth(),
//				RenderableHolder.startManuBackGround.getHeight() ,0,0,SceneManager.Width(),gc.getCanvas().getHeight());
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
	
	
}
