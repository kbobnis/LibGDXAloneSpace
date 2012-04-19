package com.kprojekt.aloneinspace.MVC;

import com.badlogic.gdx.InputProcessor;

/**
 * @author Philon
 */
public abstract class AloneSpaceInput implements InputProcessor
{
	private int downX;
	private int downY;
	private int movedX;
	private int movedY;

	@Override
	public final boolean keyDown( int keycode )
	{
		return false;
	}

	@Override
	public final boolean keyUp( int keycode )
	{
		return false;
	}

	@Override
	public final boolean keyTyped( char character )
	{
		return false;
	}

	@Override
	public final boolean touchDown( int x, int y, int pointer, int button )
	{
		boolean res = this.touchDown( x, y );
		this.downX = x;
		this.downY = y;
		this.movedX = 0;
		this.movedY = 0;
		return res;
	}

	public abstract boolean touchDown( int x, int y );

	@Override
	public final boolean touchUp( int x, int y, int pointer, int button )
	{
		boolean res = this.touchUp( x, y );
		return res;
	}

	public abstract boolean touchUp( int x, int y );

	@Override
	public final boolean touchDragged( int x, int y, int pointer )
	{
		this.movedX += x - this.downX;
		this.downX = x;
		this.movedY += y - this.downY;
		this.downY = y;

		boolean res = this.dragged( this.movedX, this.movedY );
		return res;
	}

	public abstract boolean dragged( int howX, int howY );

	@Override
	public final boolean touchMoved( int x, int y )
	{
		return false;
	}

	@Override
	public final boolean scrolled( int amount )
	{
		return false;
	}

	protected void resetMoved()
	{
		this.movedX = 0;
		this.movedY = 0;
	}
}
