package com.kprojekt.aloneinspace.MVC;

import com.kprojekt.aloneinspace.MVC.menu.model.MenuItemAction;
import com.kprojekt.aloneinspace.MVC.menu.model.MenuItemAction.Action;
import com.kprojekt.aloneinspace.MVC.menu.model.MenuItemNewMenu;
import com.kprojekt.aloneinspace.MVC.menu.model.MenuModel;

/**
 * @author Philon
 */
public class AllData
{
	private MenuModel menuModel;

	public AllData()
	{
		MenuModel optionModel = new MenuModel();
		optionModel.addMenuItem( new MenuItemAction( "Description", null ) );
		optionModel.addMenuItem( new MenuItemAction( "Brightness", null ) );

		MenuModel menuModel = new MenuModel();
		menuModel.addMenuItem( new MenuItemAction( "Play", Action.ACTION_NEW_GAME ) );
		menuModel.addMenuItem( new MenuItemNewMenu( "Options", optionModel ) );
		menuModel.addMenuItem( new MenuItemAction( "Exit", Action.ACTION_QUIT_GAME ) );
		this.menuModel = menuModel;
	}

	public MenuModel getMenuModel()
	{
		return this.menuModel;
	}

}
