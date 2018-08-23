package application;

import java.util.ArrayList;
import java.util.Scanner;

import resources.Filials;

public class AppDesafio {

	public static void main(String[] args) {
		
		ArrayList<Filials> filiais = new ArrayList<Filials>();
		int opc = -1;
		
		Scanner ler = new Scanner(System.in);
		
		while (opc != 0) {
			sop("Bem vindo ao S-toc");
			sop(" ----------- Selecione uma das opções: ----------");
			sop("Selecione uma opção para iniciar:");
			sop("1 - Visualizar lista de Filiais");
			sop("2 - Inserir nova Filial");
			sop("3 - Visualizar estoque de Filial");
			sop("4 - Inserir item em estoque de uma Filial");
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
				//Inserir item em estoque de uma filial
				
				
				break;
			default:
				sop("Tente novamente!");
			}
			
		}

	}
	
	private static void sop(String s) {
		System.out.println(s);
	}

}
