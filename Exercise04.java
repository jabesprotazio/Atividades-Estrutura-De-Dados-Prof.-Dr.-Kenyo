import java.util.Scanner;

public class Exercise04 {

    public void metodo() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a quantidade de números para serem ordenados: ");
        int n = teclado.nextInt();
        int[] numbers = new int[n];

        System.out.println("\nInforme os números: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "° ");
            numbers[i] = teclado.nextInt();
        }

        bubblesort(numbers, n);
    }

    public void bubblesort(int number[], int x) {
        int aux = 0;

        for (int j = 0; j < x; j++) {
            for (int i = 0; i < (x - j - 1); i++) {
                if (number[i] > number[i + 1]) {
                    aux = number[i + 1];
                    number[i + 1] = number[i];
                    number[i] = aux;
                }
            }
        }

        System.out.print("[");
        for (int i = 0; i < x; i++) {
            System.out.print(number[i]);
            if (i != (x - 1)) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        System.out.print("O 2° maior número é: ");
        int cont = x-1;

        while (cont >= 0) {
            if (number[cont] != number[cont - 1]) {
                System.out.print(number[cont -1]);
                System.out.println("\n");
                break;
            } else {
                cont = cont - 1;
            }
        }
    }

}

