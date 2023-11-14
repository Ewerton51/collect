package atividadesbootcamp141123;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class collectionFILA {

    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        Scanner var = new Scanner(System.in);

        int opcao;
        do {
            System.out.print("\nDigite uma opção (0 para sair, 1 para adicionar, 2 para listar, 3 para chamar): ");
            opcao = var.nextInt();
            var.nextLine();  // Consumir a quebra de linha após a leitura do número

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do Cliente: ");
                    String nomeCliente = var.nextLine();
                    filaClientes.add(nomeCliente);
                    System.out.println("\nFila: \n" + filaClientes + "\nCliente Adicionado!");
                    break;
                case 2:
                    System.out.println("\nLista de Clientes na Fila: \n" + filaClientes);
                    break;
                case 3:
                    if (!filaClientes.isEmpty()) {
                        String clienteChamado = filaClientes.poll();
                        System.out.println("\nFila: \n" + filaClientes + "\nO Cliente " + clienteChamado + " foi Chamado!");
                    } else {
                        System.out.println("\nA Fila está vazia!");
                    }
                    break;
                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        var.close();
    }
}