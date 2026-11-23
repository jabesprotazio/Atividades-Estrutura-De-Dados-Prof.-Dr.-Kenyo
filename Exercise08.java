import java.util.Scanner;

public class Exercise08 {
    public void metodo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");
        String palavra = teclado.next();

        char[] caracteres = palavra.toCharArray();
        int size = caracteres.length;
        int cont = 0;

        for (int i = 0; i < size ; i++) {
            for (int j = i+1; j < size; j++) {
                if (caracteres[i] == caracteres[j]){
                    cont += 1;
                }
            }
            if(cont == 0){
                System.out.println("O primeiro caractere não repetido é: " + caracteres[i]);
                break;
            }
            cont = 0;
        }
    }
}
