package com.kprojekt.aloneinspace.MVC;

/**
 * @author Philon
 */
public abstract class Manager
{
	public abstract void render( float delta );

	public abstract void activateInputProcessor();

	public abstract void resize( int width, int height );

}
