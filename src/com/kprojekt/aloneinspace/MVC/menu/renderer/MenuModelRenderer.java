package com.kprojekt.aloneinspace.MVC.menu.renderer;

import com.kprojekt.aloneinspace.MVC.AllData;
import com.kprojekt.aloneinspace.MVC.BaseScreenRenderer;
import com.kprojekt.aloneinspace.MVC.menu.model.MenuItem;
import com.kprojekt.aloneinspace.MVC.menu.model.MenuModel;
import com.kprojekt.aloneinspace.MVC.menu.renderer.menuItem.MenuItemRendererFactory;

/**
 * @author Philon
 */
public class MenuModelRenderer extends BaseScreenRenderer
{
	public MenuModelRenderer( AllData data )
	{
		super( data, true );
	}

	@Override
	protected void innerRender()
	{
		MenuModel menuModel = this.getData().getMenuModel();
		int yOff = 30;
		for( MenuItem menuItem : menuModel.getMenuItems() )
		{
			MenuItemRendererFactory.getRenderer( menuItem ).render( menuItem, 50, yOff );
			yOff += 30;
		}
	}
}
