package resources;

public class Products {
	private Integer id;
	private Integer total = 0;
	private Integer reserve = 0;
	private Integer available = 0;
		
	public Products(Integer id){
		this.setId(id);
	}
	public Products(Integer id, Integer total, Integer reserve)  {
		this.setId(id);
		this.setReserve(reserve);
		this.updateStock();
	}

	public Integer getId() { return id; }
	public Integer getTotal() {  return total;  }
	public Integer getReserve() { return reserve; }
	
	public Integer getAvailable() {
		//Só pra garantir
		this.updateStock();
		return available;
	}
	
	private void setId(Integer id) { this.id = id; }
	
	public void setReserve(Integer volume) { 
		
		if ((this.reserve + volume) <= this.total) {
			this.reserve += volume;
		}
		this.updateStock();
	}
	
	/** 
	 * Este método atualiza a quantida de produtos, 
	 * depois da inserção ou remoção de dados. 
	 */
	private void updateStock() { 
		this.available = this.total - this.reserve; 
	}

	
	//inserir e remover volumes do Produto:
	
	//Para inserir: Inserir na quantidade total
	public void insertVolume(Integer volume) {
		if ((volume + this.total) > 0) {
			this.total += volume;
		}else {
			System.out.println("A quantidade é invalida para a inserção");
		}
	}
	
	//Para remover: Remover da quantidade total
	public void removeVolume(Integer volume) {
		if ((this.total - volume) >= this.available) {
			this.total -= volume;
			this.updateStock();
		}
	}
		
	@Override
	public String toString() {
		return "Products [id=" + id + ", total=" + total + ", reserve=" + reserve + ", available=" + available + "]";
	}
	
}
