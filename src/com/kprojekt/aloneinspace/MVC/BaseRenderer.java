package com.kprojekt.aloneinspace.MVC;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author Philon
 */
public abstract class BaseRenderer
{
	private SpriteBatch batch = new SpriteBatch();
	private AllData dataAccessor;
	private OrthographicCamera camera;
	private final boolean stretch;
	protected AloneSpaceFont font = new AloneSpaceFont( new BitmapFont( true ), batch );

	/**
	 * @param stretch if view should be stretched when resized
	 */
	public BaseRenderer( AllData dataAccessor, boolean stretch )
	{
		this.dataAccessor = dataAccessor;
		this.stretch = stretch;
		this.camera = new OrthographicCamera( Gdx.graphics.getWidth(), Gdx.graphics.getHeight() );
		camera.setToOrtho( true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight() );
	}

	public final void render( float delta )
	{
		Gdx.gl.glClearColor( 0.2f, 0.3f, 0.4f, 1 );
		Gdx.gl.glClear( GL10.GL_COLOR_BUFFER_BIT );
		camera.update();
		camera.apply( Gdx.gl10 );
		this.batch.setProjectionMatrix( camera.combined );
		this.batch.begin();
		this.innerRender();
		this.batch.end();
	}

	public final void resize( int width, int height )
	{
		if( !stretch )
		{
			camera.setToOrtho( true, width, height );
		}
	}

	protected final AllData getData()
	{
		return this.dataAccessor;
	}

	protected abstract void innerRender();

}
