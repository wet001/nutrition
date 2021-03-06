package com.wet.api.nutrition.model.usda.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsdaMeasure
{
	private String label;
	
	@JsonProperty("eqv")
	private double grams;
	
	@JsonProperty("qty")
	private double quantity;
	
	private double value;
	
	public String getLabel()
	{
		return label;
	}
	
	public void setLabel(String label)
	{
		this.label = label;
	}
	
	public double getGrams()
	{
		return grams;
	}
	
	public void setGrams(double grams)
	{
		this.grams = grams;
	}
	
	public double getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(double quantity)
	{
		this.quantity = quantity;
	}
	
	public double getValue()
	{
		return value;
	}
	
	public void setValue(double value)
	{
		this.value = value;
	}
}