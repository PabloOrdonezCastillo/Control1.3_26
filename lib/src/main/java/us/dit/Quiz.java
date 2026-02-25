
//Pablo Ordonez Castillo
//uvus:BRL2259
//pass:434

package us.dit;

public class Quiz {

    public static void main(String[] args) {
        int[] numeros = {4, 9, 2, 7};
        System.out.println(maximo(numeros));
    }

    public static int maximo(int[] array) {
        int max = array[0];
        for (int n : array) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}