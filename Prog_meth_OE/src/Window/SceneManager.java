package Window;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SceneManager {
	private static Stage managerStage;
	public static final int sceneWidth = 1000 ; 
	public static final int sceneHeight = 700;
	
	public static void initial(Stage stage) {
		managerStage = stage;
		managerStage.show();
	}
	
	public static void putToScene(Canvas canvas) {
		Scene scene = new Scene(new Pane(canvas),sceneWidth , sceneHeight);
		managerStage.setScene(scene);
	}
}
