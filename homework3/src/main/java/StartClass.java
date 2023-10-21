import java.util.Arrays;
import java.util.Scanner;

public class StartClass {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }
    public static void task1() {
        System.out.println("TASK1");
        System.out.println("enter number:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++){
            a[i] = i * i;
            System.out.println(a[i]);
        }
        System.out.println(Arrays.toString(a));
    }
    public static void task2() {
        System.out.println("TASK2");
        for (int i = 9; i > 0; i--) {
            for (int j = 9; j > 0; j--) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
    public static void task3() {
        System.out.println("TASK3");
        System.out.println("while");
        int[] a = {30,20,25,10,15};
        int i = 0;
        while (i < a.length){
            System.out.println(a[i]);
            i++;
        }
        System.out.println("do while");
        int j = 0;
        do {
            System.out.println(a[j]);
            j++;
        } while (j < a.length);
    }
    public static void task4() {
        System.out.println("TASK4");
        int[][] a = new int[4][8];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 8; j++){
                a[i][j] = i * j;
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 8; j++){
                System.out.println(i + "," + j + "=" + a[i][j]);
            }
        }
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
        System.out.println(Arrays.toString(a[2]));
        System.out.println(Arrays.toString(a[3]));
    }
}
