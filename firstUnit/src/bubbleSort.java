import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class bubbleSort {
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
        bubblesort(randomArr);
        System.out.println("Array ordenado: " + Arrays.toString(randomArr));
        }

    }
     public static void bubblesort(int[] arr) {
        int size = arr.length;

        // loop through array size-1 times
        for (int i = 0; i < size - 1; i++) {
            // loop until end of unsorted elements
            for (int j = 0; j < size - i - 1; j++) {
                // swap left and right elements if left is greater
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


