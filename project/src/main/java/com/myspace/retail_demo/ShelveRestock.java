package com.myspace.retail_demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("ShelveRestock")
public class ShelveRestock implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Quantity Added to Shelve")
	private java.lang.Integer quantity;
	@org.kie.api.definition.type.Label(value = "Restocked?")
	private java.lang.Boolean restocked;

	public ShelveRestock() {
	}

	public java.lang.Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(java.lang.Integer quantity) {
		this.quantity = quantity;
	}

	public java.lang.Boolean getRestocked() {
		return this.restocked;
	}

	public void setRestocked(java.lang.Boolean restocked) {
		this.restocked = restocked;
	}

	public ShelveRestock(java.lang.Integer quantity, java.lang.Boolean restocked) {
		this.quantity = quantity;
		this.restocked = restocked;
	}

}