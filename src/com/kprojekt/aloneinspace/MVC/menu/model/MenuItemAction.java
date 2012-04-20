package com.kprojekt.aloneinspace.MVC.menu.model;

/**
 * @author Philon 
 */
public class MenuItemAction extends MenuItem
{
	private final Action action;

	public enum Action
	{
		ACTION_NEW_GAME, ACTION_QUIT_GAME
	}

	public MenuItemAction( String name, Action action )
	{
		super( name );
		this.action = action;
	}

	public Action getAction()
	{
		return this.action;
	}

}
