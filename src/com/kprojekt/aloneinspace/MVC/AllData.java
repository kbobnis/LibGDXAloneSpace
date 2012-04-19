package com.kprojekt.aloneinspace.MVC;

import com.kprojekt.aloneinspace.MVC.menu.model.MenuItem;
import com.kprojekt.aloneinspace.MVC.menu.model.MenuModel;

/**
 * @author Philon
 */
public class AllData
{
	private MenuModel menuModel;

	public AllData()
	{
		MenuModel menuModel = new MenuModel();
		menuModel.addMenuItem( new MenuItem( "Play" ) );
		menuModel.addMenuItem( new MenuItem( "Options" ) );
		menuModel.addMenuItem( new MenuItem( "Exit" ) );
		this.menuModel = menuModel;
	}

	public MenuModel getMenuModel()
	{
		return this.menuModel;
	}

}
