package com.kprojekt.aloneinspace.MVC.menu.model;

/**
 * @author Philon 
 */
public abstract class MenuItem
{
	private String name;
	private boolean selected;
	private boolean activated;

	public MenuItem( String name )
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public boolean isSelected()
	{
		return this.selected;
	}

	public void select( boolean b )
	{
		this.selected = b;
	}

	public void activate( boolean b )
	{
		this.activated = b;
	}

	public boolean isActivated()
	{
		return this.activated;
	}

}
