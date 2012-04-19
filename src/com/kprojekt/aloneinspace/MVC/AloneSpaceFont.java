package com.kprojekt.aloneinspace.MVC;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * @author Philon 
 */
public class AloneSpaceFont
{
	private BitmapFont font;
	private final SpriteBatch batch;

	public AloneSpaceFont( BitmapFont bitmapFont, SpriteBatch batch )
	{
		this.font = bitmapFont;
		this.batch = batch;
	}

	public void draw( String string, int x, int y )
	{
		this.font.draw( batch, string, x, y );
	}

	public void scale( float f )
	{
		this.font.setScale( f );
	}

	public void color( Color color )
	{
		this.font.setColor( color );
	}
}
