package ObjectShare;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;


public class RenderableHolder {
	private static final RenderableHolder instance = new RenderableHolder();
	private List<IRenderable> entities; 
	private Comparator<IRenderable> comparator;
	public static Image attackImages[];
	public static Image startManuBackGround ; 
	public static AudioClip sounds;
	
	
	public static RenderableHolder getInstance() {
		return instance;
	}
	
	public RenderableHolder() {
		entities = new ArrayList<IRenderable>();
		comparator = (IRenderable o1 , IRenderable o2)-> {
			if(o1.getZ() > o2.getZ()) {return 1;}
			return -1;
		};
	}
	public void  loadResourse() {
		//todo 
		startManuBackGround = new Image(ClassLoader.getSystemResourceAsStream("StartGame.png").toString());
	}

	public void add(IRenderable entity) {
		entities.add(entity);
		//Sort by Z which determine in class logic
		Collections.sort(entities,comparator);
	}
	
	
}
