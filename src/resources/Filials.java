package resources;

import java.util.ArrayList;

public class Filials {
	
	private Integer id;
	private String name;
	private Stock stock;
	
	public Filials(Integer id) {
		this.setId(id);
		this.setName("filial: " + id);
		this.stock = new Stock();
	}

	public Filials(Integer id, Stock stock) {
		this.id = id;
		this.name = name;
		this.stock = stock;
	}
	
	//Gets [Genéricos]
	public Integer getId() { return id; }
	public String getName() { return name; }
	public ArrayList<Products> getStock() { return this.stock.getProducts(); }

	//Sets [Genéricos]
	public void setId(Integer id) { this.id = id; }
	public void setName(String name) { this.name = name; }

	@Override
	public String toString() {
		return "Filial: [id=" + id + ", name=" + name + ", stock=" + stock.toString() + "]";
	}
	
	
}
