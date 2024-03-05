package TADVetor;

import java.util.Scanner;


/* * @Author Tiago Oliveira * */

public class Vetor {
    Scanner sc = new Scanner(System.in);
    private int aux;
    private int[] vetor;

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public Vetor(int aux) {
        this.aux = aux;
        this.vetor = new int[aux];
    }

    public void imprimir() {
        int[] vetor_aux = new int[aux];
        vetor_aux = this.getVetor();
        System.out.println("#########################");
        for (int i = 0; i < aux; i++) {
            System.out.println("__\n" + "| " + vetor_aux[i] + " |");
        }
        System.out.println("#########################");
    }

    public void alterar() {
        int pos = 0, valor = 0;
        int[] vetor_aux = new int[aux];

        if (valor < 100) {
            vetor_aux = this.getVetor();
            System.out.println("Digite a posição que deseja alterar "
                    + "(Lembrando que contém " + (vetor_aux.length - 1) + " posições): ");
            pos = sc.nextInt();
            System.out.println("Digite o valor que deseja insetir: ");
            valor = sc.nextInt();
        } else {
            System.out.println("Valor Digitado fora do escopo aceito (2 - 100)");
            alterar();
        }
        vetor_aux[pos] = valor;
        this.setVetor(vetor_aux);
    }

    public void limpar() {
        int pos = 0, valor = 0;

        System.out.println("Digite a posição que deseja limpar: ");
        pos = sc.nextInt();
        if (pos >= 0 && pos < aux) {
            int[] vetor_aux = this.getVetor();
            vetor_aux[pos] = 0;
            this.setVetor(vetor_aux);
            System.out.println("Posição " + pos + " limpa.");
        } else {
            System.out.println("Posição inválida. Digite uma posição dentro do intervalo [0, " + (aux - 1) + "].");
        }
    }

    public void exibir() {
        int pos = 0, valor = 0;
        int[] vetor_aux = new int[aux];
        vetor_aux = this.getVetor();

        System.out.println("Digite a posição que deseja visualizar "
                + "(Entre 1 " + "e " + vetor_aux.length + ")");
        pos = sc.nextInt();
        System.out.println("o valor nesta posição é: " + vetor_aux[pos]);
    }

    public void inserir() {
        int valor = 0, pos = 0;
        int[] vetor_aux = new int[aux];

        System.out.println("Informe o valor que Deseja Inserir ( de 0 a 100 ): ");
        valor = sc.nextInt();

        for (int i = 0; i < aux; i++) {
            vetor_aux[i] = this.getVetor()[i];
        }

        boolean encontrouZero = false;
        for (int i = 0; i < aux; i++) {
            if (vetor_aux[i] == 0) {
                encontrouZero = true;
                System.out.println("Posição " + i + " está faltando.");
            }
        }

        if (encontrouZero) {
            System.out.println("Informe a posição que Deseja inserir o valor:");
            pos = sc.nextInt();

            if (pos >= 0 && pos < aux) {
                if (!numeroRepetido(valor)) {
                    if (valor < 100) {
                        vetor_aux[pos] = valor;
                        this.setVetor(vetor_aux);
                        System.out.println("Valor inserido na posição " + pos + ".");
                    } else {
                        System.out.println("Por favor, informe um valor menor que 100 para inserir dentro do Vetor.");
                    }
                } else {
                    System.out.println("Este valor já está presente no vetor. Não são permitidos números repetidos.");
                }
            } else {
                System.out.println("Posição inválida. Digite uma posição dentro do intervalo [0, " + (aux - 1) + "].");
            }
        } else {
            System.out.println("Não há posições faltando. O vetor está cheio.");
        }
    }

    private boolean numeroRepetido(int numero) {
        int[] vetor_aux = this.getVetor();
        for (int i = 0; i < aux; i++) {
            if (vetor_aux[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public void localizar() {
        int valor;
        int[] vetor_aux = new int[aux];
        vetor_aux = this.getVetor();
        System.out.println("Digite o valor que deseja buscar: ");
        valor = sc.nextInt();
        for (int i = 0; i < aux; i++) {
            if (vetor_aux[i] == valor) {
                System.out.println("a posição que ele se encontra é: " + i);
            }
        }
    }

    public void remover() {
        int ult_pos_vaga = 0;
        int[] vetor_aux = new int[aux];
        vetor_aux = this.getVetor();
        for (int i = 0; i < aux; i++) {
            if (vetor_aux[i] == 0) {
                ult_pos_vaga = i;
            }
            vetor_aux[ult_pos_vaga] = 0;
        }
        this.setVetor(vetor_aux);
    }
}

