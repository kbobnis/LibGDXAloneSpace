package com.kprojekt.aloneinspace.MVC.menu.renderer;

import com.badlogic.gdx.graphics.Color;
import com.kprojekt.aloneinspace.MVC.AllData;
import com.kprojekt.aloneinspace.MVC.BaseRenderer;
import com.kprojekt.aloneinspace.MVC.menu.model.MenuItem;
import com.kprojekt.aloneinspace.MVC.menu.model.MenuModel;

/**
 * @author Philon
 */
public class MenuRenderer extends BaseRenderer
{

	public MenuRenderer( AllData data )
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
			this.font.scale( menuItem.isSelected() ? 1.5f : 1 );
			this.font.color( menuItem.isActivated() ? Color.RED : Color.WHITE );
			this.font.draw( "yOff: " + yOff + ", " + menuItem.getName(), 50, yOff );
			yOff += 30;
		}
	}
}
