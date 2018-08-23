package resources;

import java.util.ArrayList;

public class Stock {
	
	ArrayList<Products> products;
	
	public Stock() {
		this.products = new ArrayList<Products>();
	}
	
	public ArrayList<Products> getProducts(){
		return this.products;
	}
			
	/**
	 * Atualizar os itens dentro da filial:
	 * Se o item existir, seus dados são atualizados
	 * Senão, é criado um novo com os dados que vieram
	 * */
	public void updateItem(Items item) {
		int pos = -1;	
		for(int i=0; i < this.products.size(); i++) {
			if (this.products.get(i).getId() == item.getProduct().getId()) { 
				pos = i;
				break;
			}
		}
		
		if (pos>=0) {
			this.products.get(pos).insertVolume(item.getIn() - item.getOut());
		}else {
			//Item ainda não existe
			this.products.add(item.fixProduct());
		}
	}
	
}
