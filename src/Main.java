import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> toDoList = new ArrayList<>();

        while (true) {
            System.out.println("-== Menu Inicial ==-");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Exibir lista de Tarefas");
            System.out.println("3. Marcar tarefa como concluida");
            System.out.println("4. Sair");
            System.out.println("Escolha: ");

            int selectedOption = scanner.nextInt();
            scanner.nextLine();

            // Adicionar Tarefa
            if (selectedOption == 1) {
                System.out.println("Insira sua tarefa!");
                String newTask = scanner.nextLine();

                toDoList.add(new Task(newTask));
            }

            // Exibir Lista
            if (selectedOption == 2) {
                System.out.println("\n=== Lista de Tarefas ===");
                for (int i = 0; i < toDoList.size(); i++){
                    Task indexTask = toDoList.get(i);
                    System.out.println(i + 1 + ". " + indexTask.taskName + (indexTask.taskIsDone ? " [X]" : " [ ]"));
                }
                System.out.println("Para retornar ao menu, digite qualquer coisa!");
                scanner.nextLine();
            }

            // Marcar como Concluido
            if (selectedOption == 3) {
                System.out.println("Numero da Tarefa: ");
                int indexTask = scanner.nextInt();
                scanner.nextLine();

                if (indexTask >= 1 && indexTask <= toDoList.size()) {
                    indexTask--;
                    toDoList.get(indexTask).markTaskAsDone();
                } else {
                    System.out.println("Indice Invalido");
                }
            }

            // Sair
            if (selectedOption == 4) {
                System.out.println("Saindo...");
                break;
            }
        }
    }
}
