import java.util.Scanner;

public class Exercise02 {

    public void metodo() {
        char[] letter = new char[100];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe uma palavra políndromo: ");
        String palavra = teclado.next();
        letter = palavra.toCharArray();
        int size = letter.length;
        size = size;
        int count = size;
        count -= 1;

        for (int i = 0; i < size; i++) {
            if(i == count && letter[i] == letter[count]){
                System.out.println("A palavra é um palíndromo!");
                break;
            }else if (letter[i] != letter[count]){
                System.out.println("A palavra não é palíndromo");
                break;
            }else{
                count = count - 1;
            }

        }
    }
}
