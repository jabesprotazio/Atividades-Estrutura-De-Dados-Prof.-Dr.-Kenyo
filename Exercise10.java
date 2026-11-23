import java.util.Scanner;

public class Exercise10 {

    public void metodo() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos números haverá no 1° array: ");
        int num1 = teclado.nextInt();
        System.out.print("Quantos números haverá no 2° array: ");
        int num2 = teclado.nextInt();

        int[] array1 = new int[num1];
        System.out.println("Informe os números do 1° array:");
        for (int i = 0; i < num1; i++) {
            System.out.print((i + 1) + "° ");
            array1[i] = teclado.nextInt();
        }

        int[] array2 = new int[num1];
        System.out.println("Informe os números do 2° array:");
        for (int i = 0; i < num2; i++) {
            System.out.print((i + 1) + "° ");
            array2[i] = teclado.nextInt();
        }

        bubblesort(array1,num1);
        bubblesort(array2,num2);

        int bigsize = num1 + num2;
        int[] numend = new int[bigsize];

        for (int i = 0; i < num1; i++) {
            numend[i] = array1[i];
            if(i == (num1-1)){
                int count = i+1;
                for (int j = 0; j < num2 ; j++) {
                    numend[count] = array2[j];
                    count++;
                }
            }
        }

        bubblesort(numend,bigsize);

        System.out.print("[");
        for (int i = 0; i < bigsize; i++) {
            System.out.print(numend[i]);
            if(i != (bigsize-1)){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

        public int[] bubblesort(int number[], int x){
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
            return number;
        }

}
