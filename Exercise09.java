import java.util.Scanner;

public class Exercise09 {
    public void metodo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos números serão utilizados? ");
        int size = teclado.nextInt();
        int[] tamanho = new int[size];

        System.out.println("Informe os números: ");
        for (int i = 0; i < size; i++) {
            System.out.print((i+1) + "° ");
            tamanho[i] = teclado.nextInt();
        }

        System.out.print("Qual número será o alvo? ");
        int number = teclado.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if (tamanho[i] + tamanho[j] == number) {
                    System.out.println("Os índices dos números são " + i + " e " + j);
                    break;
                }
            }
            break;
        }
    }
}
