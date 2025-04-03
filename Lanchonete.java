import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Lanchonete {
	public static void main(String[] args) {
		
		// Arrrays de opções:
		// Menu Principal
		String[] selcPrincipal = {"(1) - Pães (fatia de pão!)", "(2) - Queijos (fatia)", "(3) - Carnes (fatia)",
				"(4) - Verduras (fatia)", "(5) - Molhos (porção)", "(6) - Outros", "(7) - Encerrar pedido"};
		// Menu de Pães
		String[] selcPaes = {"(1) - Pão Francês – R$ 0,25", "(2) - Pão Carteira – R$ 0,30", 
				"(3) - Pão de Hambúrguer – R$ 0,70", "(4) - Pão Árabe – R$ 1,30", 
				"(5) - Encerrar seleção"};
		// Menu Queijos
		String[] selcQueijo = {"(1) - Coalho R$ - 1,50", "(2) - Minas – R$ 1,80", "(3) - Muçarela – R$ 2,00",
				"(4) - Cream Cheese – 3,00", "(5) - Gorgonzola – R$ 3,50", "(6) - Encerrar seleção"};
		// Menu Carnes
		String[] selcCarne = {"(1) - Mortadela – R$ 0,50", "(2) - Apresuntado – R$ 1,00", "(3) - Bacon – R$ 1,30", 
				"(4) - Presunto – R$ 1,60", "(5) - Pepperoni – R$ 1,80", "(6) - Salame – R$ 2,00", 
				"(7) - Encerrar pedido"};
		// Menu Verdura
		String[] selcVerdura = {"(1) - Cebola – R$ 0,30", "(2) - Pimentão - R$ 0,45", "(3) - Tomate – R$ 0,50",
				"(4) - Encerrar seleção"};
		// Menu Molhos
		String[] selcMolho = {"(1) - Maionese – R$ 0,50", "(2) - Ketchup – R$ 0,50", 
				"(3) - Maionese Temperada – R$ 0,70", "(4) - Molho Tártaro – R$ 1,00", 
				"(5) - Barbecue – R$ 1,50", "(6) - Encerrar seleção"};
		// Menu Outros
		String[] selcOutros = {"(1) - Batata Palha – R$ 1,00", "(2) - Ovo – R$ 1,00", "(3) - Encerrar seleção"};
		
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> pedido = new HashMap<>();
		
		int opcao = 0;
		double valorFinal = 0;
		
		System.out.println("----- LANCHE SE PUDER -----");
		
		while (opcao != 7) {
		System.out.println("Escolha uma opção: ");
		for (String selc : selcPrincipal) {
			System.out.println(selc);
		}
		
		opcao = scanner.nextInt();
		
		if (opcao == 1) { // Arranjo do Menu de Pães
			System.out.println("Selecione um tipo de pão:");
			for (String selc : selcPaes) {
				System.out.println(selc);
			}
			
			int selecao = scanner.nextInt();
			
			if (selecao >= 1 && selecao <= 4) {
				String itemSelecionado = selcPaes[selecao - 1].replaceAll("^\\(\\d+\\) - ", "");
				pedido.put(itemSelecionado, pedido.getOrDefault(itemSelecionado, 0) + 1);
			}
			
			switch(selecao) {
			case 1: valorFinal += 0.25; continue;
			case 2: valorFinal += 0.30; continue;
			case 3: valorFinal += 0.70; continue;
			case 4: valorFinal += 1.30; continue;
			case 5: continue;
			default: System.out.println("Opção inválida!");
			}
						
		}else if (opcao == 2){ // Arranjo do Menu de Queijos
			System.out.println("Selecione um tipo de queijo:");
			for (String selc : selcQueijo) {
				System.out.println(selc);
			}
			
			int selecao = scanner.nextInt();
			
			if (selecao >= 1 && selecao <= 5) {
				String itemSelecionado = selcQueijo[selecao - 1].replaceAll("^\\(\\d+\\) - ", "");
				pedido.put(itemSelecionado, pedido.getOrDefault(itemSelecionado, 0) + 1);
			}
			
			switch (selecao) {
			case 1: valorFinal += 1.50;	continue;
			case 2: valorFinal += 1.80; continue;
			case 3: valorFinal += 2.00; continue;
			case 4: valorFinal += 3.00; continue;
			case 5: valorFinal += 3.50; continue;
			case 6: continue;
			default: System.out.println("Opção inválida!");
			}
		
		}else if (opcao == 3) { // Arranjo do Menu de Carne
			System.out.println("Selecione um tipo de carne:");
			for(String selc : selcCarne) {
				System.out.println(selc);
			}
			
			int selecao = scanner.nextInt();
			
			if (selecao >= 1 && selecao <= 6) {
				String itemSelecionado = selcCarne[selecao - 1].replaceAll("^\\(\\d+\\) - ", "");
				pedido.put(itemSelecionado, pedido.getOrDefault(itemSelecionado, 0) + 1);
			}
			
			switch(selecao) {
			case 1: valorFinal += 0.50;	continue;
			case 2: valorFinal += 1.00; continue;
			case 3: valorFinal += 1.30; continue;
			case 4: valorFinal += 1.60; continue;
			case 5: valorFinal += 1.80; continue;
			case 6: valorFinal += 2.00; continue;
			case 7: continue;
			default: System.out.println("Opção inválida!");
			}
			
		}else if (opcao == 4) { // Arranjo do Menu de Verduras
			System.out.println("Selecione um tipo de verdura:");
			for(String selc : selcVerdura) {
				System.out.println(selc);
			}
			
			int selecao = scanner.nextInt();
			
			if (selecao >= 1 && selecao <= 3) {
				String itemSelecionado = selcVerdura[selecao - 1].replaceAll("^\\(\\d+\\) - ", "");
				pedido.put(itemSelecionado, pedido.getOrDefault(itemSelecionado, 0) + 1);
			}
			
			switch(selecao) {
			case 1: valorFinal += 0.30;	continue;
			case 2: valorFinal += 0.45; continue;
			case 3: valorFinal += 0.50; continue;
			case 4: continue;
			default: System.out.println("Opção inválida!");
			}
			
		}else if (opcao == 5) { // Arranjo do Menu de Molhos
			System.out.println("Selecione um tipo de molho:");
			for(String selc : selcMolho) {
				System.out.println(selc);
			}
			
			int selecao = scanner.nextInt();
			
			if (selecao >= 1 && selecao <= 5) {
				String itemSelecionado = selcMolho[selecao - 1].replaceAll("^\\(\\d+\\) - ", "");
				pedido.put(itemSelecionado, pedido.getOrDefault(itemSelecionado, 0) + 1);
			}
			
			switch(selecao) {
			case 1: valorFinal += 0.50;	continue;
			case 2: valorFinal += 0.50; continue;
			case 3: valorFinal += 0.70; continue;
			case 4: valorFinal += 1.00; continue;
			case 5: valorFinal += 1.50; continue;
			case 6: continue;
			default: System.out.println("Opção inválida!");
			}
			
		}else if (opcao == 6) { // Arranjo do Menu Outros
			System.out.println("Selecione outros ingredientes disponiveis:");
			for(String selc : selcOutros) {
				System.out.println(selc);
			}
			
			int selecao = scanner.nextInt();
			
			if (selecao >= 1 && selecao <= 2) {
				String itemSelecionado = selcOutros[selecao -1].replaceAll("^\\(\\d+\\) - ", "");
				pedido.put(itemSelecionado, pedido.getOrDefault(itemSelecionado, 0) + 1);
			}
			
			switch(selecao) {
			case 1: valorFinal += 1.00;	continue;
			case 2: valorFinal += 1.00; continue;
			case 3: continue;
			default: System.out.println("Opção inválida!");
			}
			
		}else if (opcao == 7) {
			break;
		}else {
			System.out.println("Opção inválida");
		}
		
		}

		System.out.println("============================================");
		System.out.println("Itens selecionado:");
		
		for (Map.Entry<String, Integer> entry : pedido.entrySet()) {
            System.out.println( entry.getValue() + "un x " + entry.getKey());
        }
		
		System.out.println("============================================");
		System.out.println("Valor final do pedido: R$ " + String.format("%.2f", valorFinal));
		System.out.println("============================================");

	}
}
