package resources;

import java.util.ArrayList;

public class Filials {
	
	private Integer id;
	private String name;
	private ArrayList<Products> ListProducts;//Lembrar que os produtos não podem ser repetidos
	
	public Filials(Integer id, String name) {
		this.setId(id);
		this.setName(name);
		this.ListProducts = new ArrayList<Products>();
	}

	public Filials(Integer id, String name, ArrayList<Products> listProducts) {
		this.id = id;
		this.name = name;
		ListProducts = listProducts;
	}

	public Integer getId() { return id; }
	public String getName() { return name; }
	public ArrayList<Products> getListProducts() { return ListProducts; }


	public void setId(Integer id) { this.id = id; }
	public void setName(String name) { this.name = name; }
	public void setListProducts(ArrayList<Products> listProducts) { ListProducts = listProducts; }
	
	/**
	 * Inserir UM produto na lista de produtos da filial
	 * */
	public boolean insertProduct(Products product) {
		
		for(int i=0; i < this.ListProducts.size(); i++) {
			if (this.ListProducts.get(i).getId() == product.getId()) { 
				return false;
			}
		}
		this.ListProducts.add(product);
		return true;
	}
	
	/**
	 * Inserir VÁRIOS produtos na lista de produtos da filial
	 * */
	public ArrayList<Products> insertProducts(ArrayList<Products> products) {
		
		ArrayList<Products> ctrl = new ArrayList<Products>();
		boolean find = false;
		for (int i=0; i < products.size(); i++) {
			for (int j=0; j < this.ListProducts.size(); j++) {
				if (products.get(i).getId() == this.ListProducts.get(j).getId()) {
					find = true;
					break;
				}
			}
			if (find) {
				ctrl.add(products.get(i));
			}else {
				this.ListProducts.add(products.get(i));
			}
			find = false;
		}
		
		return ctrl;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
