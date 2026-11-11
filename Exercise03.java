import java.util.Scanner;

public class Exercise03 {

    public void metodo(){
        Scanner teclado = new Scanner(System.in);
        String palavra;
        char[] vogais;
        System.out.print("Informe uma palavra com vogais: ");
        palavra = teclado.next();
        vogais = palavra.toCharArray();
        int size = vogais.length;
        int conta = 0, conte = 0, conti = 0, conto = 0, contu = 0;


        for (int i = 0; i < size; i++) {
            switch (vogais[i]) {
                case 'a':
                    conta += 1;
                    break;
                case 'e':
                    conte += 1;
                    break;
                case 'i':
                    conti += 1;
                    break;
                case 'o':
                    conto += 1;
                    break;
                case 'u':
                    contu += 1;
                    break;
            }
        }

        if(conta == 0 && conte == 0 && conti == 0 && conto == 0 && conto == 0){
            System.out.println("A palavra não possui vogal!");
        }else {
            System.out.println("Vogal 'a': " + conta + "\n" + "Vogal 'e': " + conte + "\n" + "Vogal 'i': " + conti + "\n" + "Vogal 'o': " + conto + "\n" + "Vogal 'u': " + contu + "\n");
        }


    }
}
