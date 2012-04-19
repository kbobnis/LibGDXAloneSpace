package com.kprojekt.aloneinspace;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.kprojekt.aloneinspace.MVC.MVCsManager;

/**
 * @author Philon
 */
public class AloneInSpaceGame extends Game implements Screen
{
	private MVCsManager mvcsManager;

	@Override
	public void create()
	{
		this.mvcsManager = new MVCsManager();
		setScreen( this );
	}

	@Override
	public void render( float delta )
	{
		this.mvcsManager.render( delta );
	}

	@Override
	public void show()
	{

	}

	@Override
	public void hide()
	{
	}

	@Override
	public void resize( int width, int height )
	{
		this.mvcsManager.resize( width, height );
	}

	@Override
	public void pause()
	{
	}

	@Override
	public void resume()
	{
	}

	@Override
	public void dispose()
	{
	}
}
