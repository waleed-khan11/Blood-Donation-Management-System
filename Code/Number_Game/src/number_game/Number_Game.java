/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number_game;

/**
 *
 * @author Waleed
 */
import java.util.Scanner;

public class Number_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U'};
        char[] a1 = new char[7];
        char[] a2 = new char[7];
        char[] a3 = new char[7];

        for (int i = 0; i < 3; i++) {
            int k=0;
              for (int j = 0; j < arr.length; j+=3,k++) {
                a1[k] = arr[j];
                a2[k] = arr[j + 1];
                a3[k] = arr[j + 2];
            }
            
            for (int j = 0; j < a1.length; j++) {
                System.out.println(a1[j] + "\t" + a2[j] + "\t" + a3[j]);
                
            }

          

            System.out.println("Enter the Column of your Alphabet (1-3)");
            int a = s.nextInt();

            if (a == 1) {

                for (int j = 0; j < a1.length; j++) {

                    arr[j] = a2[j];
                    arr[j + 7] = a1[j];
                    arr[j + 14] = a3[j];

                }

            } else if (a == 2) {

                for (int j = 0; j < a1.length; j++) {

                    arr[j] = a1[j];
                    arr[j + 7] = a2[j];
                    arr[j + 14] = a3[j];

                }

            } else if (a == 3) {

                for (int j = 0; j < a1.length; j++) {

                    arr[j] = a2[j];
                    arr[j + 7] = a3[j];
                    arr[j + 14] = a1[j];
                }

            } else {
                System.out.println("Bola bhi tha lekin nhi bablu to chutia hai");
                System.exit(0);
            }

        }
        System.out.println("Your Alphabet is "+arr[10]);

    }

}
