package com.kprojekt.aloneinspace.MVC.menu.controller;

import java.util.logging.Logger;

import com.kprojekt.aloneinspace.MVC.AloneSpaceInput;
import com.kprojekt.aloneinspace.MVC.menu.model.MenuModel;

/**
 * @author Philon
 */
public class MenuController extends AloneSpaceInput
{

	private MenuModel model;

	public MenuController( MenuModel model )
	{
		this.model = model;
	}

	@Override
	public boolean touchDown( int x, int y )
	{
		return false;
	}

	@Override
	public boolean touchUp( int x, int y )
	{
		return false;
	}

	@Override
	public boolean dragged( int howX, int howY )
	{
		Logger.getAnonymousLogger().info( "Dragged x: " + howX + ", y: " + howY );
		if( howY > 50 )
		{
			this.model.selectNext();
			this.resetMoved();
		}
		if( howY < -50 )
		{
			this.model.selectPrevious();
			this.resetMoved();
		}
		if( howX > 50 )
		{
			this.model.activateSelected();
			this.resetMoved();
		}
		if( howX < -50 )
		{
			this.model.deactivateSelected();
			this.resetMoved();
		}
		return true;
	}

}
