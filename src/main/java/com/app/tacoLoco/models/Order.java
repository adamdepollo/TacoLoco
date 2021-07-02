package com.app.tacoLoco.models;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Order {
	
	private Integer veggieTacos;
	private Integer chickenTacos;
	private Integer beefTacos;
	private Integer chorizoTacos;
	private String total;
	
	public Order(Integer veggieTacos, Integer chickenTacos, Integer beefTacos, Integer chorizoTacos) {
		this.veggieTacos = veggieTacos;
		this.chickenTacos = chickenTacos;
		this.beefTacos = beefTacos;
		this.chorizoTacos = chorizoTacos;
		setTotal();
	}
	
	public void setTotal() {
		BigDecimal subtotal = new BigDecimal(getVeggieSubotal() + getBeefAndChickenSubtotal() + getChorizoSubtotal());
		if (orderSize() >= 4) {
			subtotal = applyDiscount(subtotal);
		}
		this.total = subtotal.setScale(2, RoundingMode.HALF_UP).toString();
	}

	private BigDecimal applyDiscount(BigDecimal subtotal) {
		return subtotal.multiply(new BigDecimal("0.8"));
	}

	private int orderSize() {
		return veggieTacos + chickenTacos + beefTacos + chorizoTacos;
	}

	private double getChorizoSubtotal() {
		return 3.5 * chorizoTacos;
	}

	private double getVeggieSubotal() {
		return 2.5 * veggieTacos;
	}

	private int getBeefAndChickenSubtotal() {
		return 3 * (chickenTacos + beefTacos);
	}
	
	public Integer getVeggieTacos() {
		return veggieTacos;
	}

	public Integer getChickenTacos() {
		return chickenTacos;
	}

	public Integer getBeefTacos() {
		return beefTacos;
	}

	public Integer getChorizoTacos() {
		return chorizoTacos;
	}

	public String getTotal() {
		return total;
	}

}
