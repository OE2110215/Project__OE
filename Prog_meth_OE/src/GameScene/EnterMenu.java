package GameScene;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import Window.SceneManager;
public class EnterMenu extends Canvas{
	private AudioClip audio = new AudioClip();
	
	public EnterMenu() {
		super(SceneManager.sceneWidth,SceneManager.sceneHeight);
		
		
		GraphicsContext gc = this.getGraphicsContext2D();
		addBackGround(gc);
		
		
	}
	private void addBackGround(GraphicsContext gc) {
		String path = "";
		Image background = new Image(path);
		gc.drawImage(background, 0,0, background.getWidth(), background.getHeight(),0,0,gc.getCanvas().getWidth(),gc.getCanvas().getHeight());	
	}
	
	
	private void addKeyEventHandler() {
		// todo
	}
	
}
