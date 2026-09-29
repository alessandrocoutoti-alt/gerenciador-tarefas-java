import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    tarefas.add(titulo);
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                        System.out.print("Digite o número da tarefa a remover: ");
                        int indice = scanner.nextInt();
                        scanner.nextLine();

                        if (indice >= 1 && indice <= tarefas.size()) {
                            String removida = tarefas.remove(indice - 1);
                            System.out.println("Tarefa '" + removida + "' removida!");
                        } else {
                            System.out.println("Número inválido.");
                        }
                    }
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}