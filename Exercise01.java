import java.util.Scanner;

public class Exercise01 {

    public void metodo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a quantidade de números a serem somados: ");
        int size = teclado.nextInt();
        System.out.println("Informe os números: ");
        int[] numeros = new int[size];
        int soma = 0;

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ": ");
            numeros[i] = teclado.nextInt();
            soma += numeros[i];
        }
        System.out.println("A soma total é: " + soma);
    }
}
