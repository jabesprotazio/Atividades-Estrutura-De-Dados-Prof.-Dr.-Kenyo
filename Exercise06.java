import java.util.Scanner;

public class Exercise06 {

    public void metodo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a quantidade de números que deseja verificar: ");
        int quantidade = teclado.nextInt();
        int[] numeros_original = new int[quantidade];
        int[] numeros_pares = new int[quantidade];
        int cont = 0;

        System.out.println("Informe os números: ");
        for (int i = 0; i < quantidade; i++) {
            System.out.print((i+1) + "°: ");
            numeros_original[i] = teclado.nextInt();
            if (numeros_original[i]%2 == 0){
                numeros_pares[cont] = numeros_original[i];
                cont += 1;
            }
        }

        System.out.println("Os números pares são: ");
        System.out.print("[");
        for (int i = 0; i < cont; i++) {
            System.out.print(numeros_pares[i]);
            if(i != (cont-1)){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
