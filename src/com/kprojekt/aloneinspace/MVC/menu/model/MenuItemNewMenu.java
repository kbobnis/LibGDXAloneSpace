package com.kprojekt.aloneinspace.MVC.menu.model;

/**
 * @author Philon 
 */
public class MenuItemNewMenu extends MenuItem
{
	private final MenuModel model;

	public MenuItemNewMenu( String name, MenuModel model )
	{
		super( name );
		this.model = model;
	}

	public MenuModel getModel()
	{
		return this.model;
	}
}
