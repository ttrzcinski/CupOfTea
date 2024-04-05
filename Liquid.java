package com.ttrzcinski;

public class Liquid implements ILiquid {

	private Color _color;

	public Liquid(Color black) {
	}

	@Override
	public Color getColor() {
		return this._color;
	}

	@Override
	public void setColor(Color color) {
		this._color = color;
	}
}
