package application;

import java.util.ArrayList;
import java.util.Scanner;

import resources.Filials;
import resources.Items;
import resources.Products;

public class AppDesafio {

	public static void main(String[] args) {
		
		ArrayList<Filials> filiais = new ArrayList<Filials>();
		int opc = -1;
		
		Scanner ler = new Scanner(System.in);
		
		sop("Bem vindo ao S-toc");
		while (opc != 0) {
			sop(" ----------- Selecione uma das opções: ----------");
			sop("Selecione uma opção para iniciar:");
			sop("1 - Visualizar lista de Filiais");
			sop("2 - Inserir nova Filial");
			sop("3 - Visualizar estoque de Filial");
			sop("4 - Atualizar item em estoque de uma Filial");
			sop("0 - Para sair");
			sop(" ----------- ---------- ----------");
			sop("");
			
			opc = ler.nextInt();
			ler.nextLine();
			
			switch(opc) {
			case 0:
				sop("Saindo...");
				break;
			case 1:
				//Visualizar a lista de filiais
				for (int i=0; i<filiais.size(); i++) {
					sop(filiais.get(i).toString());
				}
				break;
			case 2:
				//Inserir nova filial
				sop("Insiria o id da filial:");
				int id2 = 0;
				id2 = ler.nextInt();
				Filials nFilial = new Filials(id2);
				
				//É preciso criar um código separado para testar se ela existe
				filiais.add(nFilial);
				sop("Ok, feito!");
				
				break;
			case 3:
				//Visualizar estoque de uma filial
				sop("Inserir o id da filial");
				int id3 = 0;
				id3 = ler.nextInt();
		
				for(int i=0; i < filiais.size(); i++) {
					if(filiais.get(i).getId() == id3) {
						sop(filiais.get(i).getStock().toString());
					}
				}
				
				break;
			case 4:
				//Atualizar item em estoque de uma filial
				sop("Inserir o id da filial");
				int id4 = 0;
				id4 = ler.nextInt();
				int posFilial = -1;
				//Buscar a filial:
				for (int i=0; i < filiais.size(); i++) {
					if (filiais.get(i).getId() == id4) {
						posFilial = i;
						break;
					}
				}
				
				if (posFilial < 0) {sop("Filial não foi encontrada!"); break;}
				
				sop("Inserir o id do produto");
				int idP4 = 0;
				idP4 = ler.nextInt();
				
				sop("Inserir a quantidade para entrada:");
				int qtdIn4 = 0;
				qtdIn4 = ler.nextInt();
				
				sop("Inserir a quantidade para saída:");
				int qtdOut4 = 0;
				qtdOut4 = ler.nextInt();
				
				Products pro4 = new Products(idP4);
				Items item4 = new Items(pro4, qtdIn4, qtdOut4);
				
				//Buscar dentro do estoque da filial
				
				filiais.get(posFilial).insertOnStock(item4);
				sop("Feito, Ok!");
				
				break;

			default:
				sop("Tente novamente!");
			}	
		}
		ler.close();
	}
	
	private static void sop(String s) {
		System.out.println(s);
	}

}
