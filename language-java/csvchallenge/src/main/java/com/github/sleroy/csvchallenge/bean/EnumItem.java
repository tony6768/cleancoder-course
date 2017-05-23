package com.github.sleroy.csvchallenge.bean;

/**
 * The Enum EnumItem.
 */
public enum EnumItem {

	/** The Pencil. */
	Pencil("Pencil"),
	/** The Binder. */
	Binder("Binder"),
	/** The Pen. */
	Pen("Pen"),
	/** The Desk. */
	Desk("Desk"),
	/** The Pen set. */
	PenSet("Pen Set");

	/** The name. */
	private String name;

	/**
	 * Instantiates a new enum item.
	 *
	 * @param name
	 *            the name
	 */
	EnumItem(String name) {
		this.name = name;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
}
