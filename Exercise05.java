import java.util.Scanner;

public class Exercise05 {

    public void metodo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um texto: ");
        String texto = teclado.nextLine();

        String[] pedacos = texto.split("\\s");
        int size = pedacos.length;

        for (int i = (size-1); i >= 0 ; i--) {
            System.out.print(pedacos[i] + " ");
        }
        System.out.println("\n");
    }
}
