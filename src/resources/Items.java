package resources;

public class Items {
	
	private Products product;
	private Integer in = 0;
	private Integer out = 0;
	
	public Items(Products product, Integer in, Integer out) {
		this.setProduct(product);
		this.setIn(in);
		this.setOut(out);
	}
	
	public Products getProduct() { return this.product; }
	public Integer getIn() { return in; }
	public Integer getOut() { return out; }

	public void setProduct(Products product) { this.product = product; }
	public void setIn(Integer in) { this.in = in; }
	public void setOut(Integer out) { this.out = out; }	
	
	//Fix
	public Products fixProduct() {
		this.product.insertVolume(this.in - this.out);
		return this.product;
	}
}
