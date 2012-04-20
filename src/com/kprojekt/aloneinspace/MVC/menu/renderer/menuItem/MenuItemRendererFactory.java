package com.kprojekt.aloneinspace.MVC.menu.renderer.menuItem;

import com.kprojekt.aloneinspace.MVC.menu.model.MenuItem;
import com.kprojekt.aloneinspace.MVC.menu.model.MenuItemAction;
import com.kprojekt.aloneinspace.MVC.menu.model.MenuItemNewMenu;

/**
 * @author Philon
 */
public class MenuItemRendererFactory
{
	private static MenuItemActionRenderer menuItemActionRenderer = new MenuItemActionRenderer();
	private static MenuitemNewMenuRenderer menuItemNewMenuRenderer = new MenuitemNewMenuRenderer();
	private static MenuItemRenderer menuItemRenderer = new MenuItemRenderer();

	public static MenuItemRenderer getRenderer( MenuItem menuItem )
	{
		if( menuItem instanceof MenuItemAction )
		{
			return MenuItemRendererFactory.menuItemActionRenderer;
		}
		if( menuItem instanceof MenuItemNewMenu )
		{
			return MenuItemRendererFactory.menuItemNewMenuRenderer;
		}
		return MenuItemRendererFactory.menuItemRenderer;
	}

}
