package com.kprojekt.aloneinspace.MVC.menu.renderer.menuItem;

import com.badlogic.gdx.graphics.Color;
import com.kprojekt.aloneinspace.MVC.BaseScreenRenderer;
import com.kprojekt.aloneinspace.MVC.menu.model.MenuItem;

/**
 * @author Philon
 */
public class MenuitemNewMenuRenderer extends MenuItemRenderer
{

	@Override
	public void render( MenuItem menuItem, int x, int y )
	{
		BaseScreenRenderer.font.color( menuItem.isActivated() ? Color.PINK : Color.WHITE );
		BaseScreenRenderer.font.scale( menuItem.isSelected() ? 1.5f : 1 );
		BaseScreenRenderer.font.draw( "newMenu: " + menuItem.getName(), x, y );
	}
}
