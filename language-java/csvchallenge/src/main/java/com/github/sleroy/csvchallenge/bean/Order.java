package com.github.sleroy.csvchallenge.bean;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * The Class Order.
 */
public class Order {
	
	/** The order date. */
	private LocalDate orderDate;
	
	/** The region. */
	private EnumRegion region;
	
	/** The rep. */
	private String rep;
	
	/** The item. */
	private EnumItem item;
	
	/** The units. */
	private int units;
	
	/** The unit cost. */
	private BigDecimal unitCost;
	
	/** The total. */
	private BigDecimal total;

	/**
	 * Gets the order date.
	 *
	 * @return the order date
	 */
	public LocalDate getOrderDate() {
		return orderDate;
	}

	/**
	 * Sets the order date.
	 *
	 * @param orderDate the new order date
	 */
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * Gets the region.
	 *
	 * @return the region
	 */
	public EnumRegion getRegion() {
		return region;
	}

	/**
	 * Sets the region.
	 *
	 * @param region the new region
	 */
	public void setRegion(EnumRegion region) {
		this.region = region;
	}

	/**
	 * Gets the rep.
	 *
	 * @return the rep
	 */
	public String getRep() {
		return rep;
	}

	/**
	 * Sets the rep.
	 *
	 * @param rep the new rep
	 */
	public void setRep(String rep) {
		this.rep = rep;
	}

	/**
	 * Gets the item.
	 *
	 * @return the item
	 */
	public EnumItem getItem() {
		return item;
	}

	/**
	 * Sets the item.
	 *
	 * @param item the new item
	 */
	public void setItem(EnumItem item) {
		this.item = item;
	}

	/**
	 * Gets the units.
	 *
	 * @return the units
	 */
	public int getUnits() {
		return units;
	}

	/**
	 * Sets the units.
	 *
	 * @param units the new units
	 */
	public void setUnits(int units) {
		this.units = units;
	}

	/**
	 * Gets the unit cost.
	 *
	 * @return the unit cost
	 */
	public BigDecimal getUnitCost() {
		return unitCost;
	}

	/**
	 * Sets the unit cost.
	 *
	 * @param unitCost the new unit cost
	 */
	public void setUnitCost(BigDecimal unitCost) {
		this.unitCost = unitCost;
	}

	/**
	 * Gets the total.
	 *
	 * @return the total
	 */
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * Sets the total.
	 *
	 * @param total the new total
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
}
