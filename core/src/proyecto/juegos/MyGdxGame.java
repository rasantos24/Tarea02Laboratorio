package proyecto.juegos;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	
	Texture img1;
	Texture img2;
	Texture img3;
	Texture img4;
	Texture img5;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		
		img1 = new Texture("nave001.png");
		img2 = new Texture("enemigo003.png");
		img3 = new Texture("enemigo004.png");
		img4 = new Texture("luna005.png");
		img5 = new Texture("misil006.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		
		batch.draw(img1, 100, 100);
		batch.draw(img2, 500, 200);
		batch.draw(img3, 400, 400);
		batch.draw(img4, 350, 350);
		batch.draw(img5, 200, 100);
		batch.end();
	}
}
