package TADVetor;
import java.util.Scanner;

public class TADVetor {

    public static void main(String[] args) {
        int aux;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho que deseja para o vetor: ");
        aux = sc.nextInt();
        Vetor vetor = new Vetor(aux);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Inserir elemento");
            System.out.println("2. Alterar elemento");
            System.out.println("3. Limpar elemento");
            System.out.println("4. Exibir elemento");
            System.out.println("5. Localizar elemento");
            System.out.println("6. Remover último elemento vago");
            System.out.println("7. Mostrar Vetor");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção:");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    vetor.inserir();
                    break;
                case 2:
                    vetor.alterar();
                    break;
                case 3:
                    vetor.limpar();
                    break;
                case 4:
                    vetor.exibir();
                    break;
                case 5:
                    vetor.localizar();
                    break;
                case 6:
                    vetor.remover();
                    break;
                case 7:
                    vetor.imprimir();
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (choice != 0);
    }
}
