import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class selectionSort {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de elementos (máx 50): ");
        int s = sc.nextInt();
        sc.close();
        if(s > 50) System.out.println("o número ultrapassa o limite");
        else{
        int[] randomArr = new int[s];

        Random randnumgenerator = new Random();

        for (int i = 0; i < randomArr.length; i++){
            randomArr[i] = randnumgenerator.nextInt(100) + 1;
        }

        System.out.println("Array desodernado: " + Arrays.toString(randomArr));
        selectionsort(randomArr);
        System.out.println("Array ordenado: " + Arrays.toString(randomArr));
        }

}
public static void selectionsort(int[] arr) {
    int n = arr.length;
    for(int i = 0; i < n - 1; i++){

        // assumimos que a posição atual tem o menor elemento
        int min_idx = i;
        // iterar pela parte desordenada para achar o elemento mínimo real
        for(int j = i+1; j < n; j++){
            if (arr[j] < arr[min_idx]) {
                // atualizar min_idx pelo menor elemento se ele for encontrado
                min_idx = j;

            }
        }
        // levar o menor elemento para a posição correta
        int temp = arr[i];
        arr[i] = arr[min_idx];
        arr[min_idx] = temp;

    }
}
}
