package com.kprojekt.aloneinspace.MVC;

import java.util.ArrayList;
import java.util.List;

import com.kprojekt.aloneinspace.MVC.menu.MenuManager;

/**
 * @author Philon
 */
public class MVCsManager
{
	private AllData dataAccessor;
	private List<Manager> managers = new ArrayList<Manager>();
	private Manager actualManager;

	public MVCsManager()
	{
		this.dataAccessor = new AllData();
		MenuManager menuManager = new MenuManager( this.dataAccessor );
		this.managers.add( menuManager );
		this.actualManager = menuManager;
	}

	public void render( float delta )
	{
		this.actualManager.activateInputProcessor();
		this.actualManager.render( delta );
	}

	public void resize( int width, int height )
	{
		this.actualManager.resize( width, height );
	}

}
