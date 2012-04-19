package com.kprojekt.aloneinspace.MVC.menu.model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author Philon 
 */
public class MenuModel
{
	private List<MenuItem> menuItems = new ArrayList<MenuItem>();

	public void addMenuItem( MenuItem menuItem )
	{
		//at least one must be selected
		this.menuItems.add( menuItem );

		if( !this.isAnySelected() )
		{
			menuItem.select( true );
		}
	}

	private boolean isAnySelected()
	{
		for( MenuItem tmp : this.menuItems )
		{
			if( tmp.isSelected() )
			{
				return true;
			}
		}
		return false;
	}

	public List<MenuItem> getMenuItems()
	{
		return this.menuItems;
	}

	public void selectNext()
	{
		Logger.getAnonymousLogger().info( "Selecting next " );

		for( int i = 0; i < this.menuItems.size(); i++ )
		{
			MenuItem tmp = this.menuItems.get( i );
			if( tmp.isSelected() )
			{
				tmp.select( false );
				MenuItem tmpNext = this.menuItems.get( (i + 1) % (this.menuItems.size()) );
				tmpNext.select( true );
				break;
			}
		}
	}

	public void selectPrevious()
	{
		Logger.getAnonymousLogger().info( "Selecting next " );

		for( int i = this.menuItems.size() - 1; i >= 0; i-- )
		{
			MenuItem tmp = this.menuItems.get( i );
			if( tmp.isSelected() )
			{
				tmp.select( false );
				MenuItem tmpPrevious = this.menuItems.get( (i - 1) >= 0 ? i - 1 : this.menuItems.size() - 1 );
				tmpPrevious.select( true );
				break;
			}
		}
	}

	public void activateSelected( boolean b )
	{
		for( MenuItem item : this.menuItems )
		{
			if( item.isSelected() )
			{
				item.activate( b );
			}
		}

	}

}
