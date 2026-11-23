import java.util.Scanner;

public class Exercise07 {

    public void metodo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a quantidade de números: ");
        int n = teclado.nextInt();
        System.out.println("Informe os números: ");
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + "°: ");
            numeros[i] = teclado.nextInt();
        }

        int[] contador = new int[n-1];
        int cont = 0;

        for (int i = 0; i < n; i++) {
            cont+=1;
            contador[i] = cont;
            if (contador[i] == numeros[i]){
                continue;
            }else {
                System.out.println("O número faltante é: " + contador[i]);
                break;
            }
        }

    }
}
