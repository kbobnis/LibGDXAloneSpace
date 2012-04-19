package com.kprojekt.aloneinspace.MVC.menu;

import com.badlogic.gdx.Gdx;
import com.kprojekt.aloneinspace.MVC.AllData;
import com.kprojekt.aloneinspace.MVC.Manager;
import com.kprojekt.aloneinspace.MVC.menu.controller.MenuController;
import com.kprojekt.aloneinspace.MVC.menu.renderer.MenuRenderer;

/**
 * @author Philon
 */
public class MenuManager extends Manager
{
	private MenuRenderer renderer;
	private MenuController controller;

	public MenuManager( AllData data )
	{
		this.renderer = new MenuRenderer( data );
		this.controller = new MenuController( data.getMenuModel() );
	}

	@Override
	public void render( float delta )
	{
		this.renderer.render( delta );
	}

	@Override
	public void resize( int width, int height )
	{
		this.renderer.resize( width, height );
	}

	@Override
	public void activateInputProcessor()
	{
		Gdx.input.setInputProcessor( this.controller );
	}

}
