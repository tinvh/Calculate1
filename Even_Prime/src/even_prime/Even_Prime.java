/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even_prime;

/**
 *
 * @author Hoang Tin
 */
public class Even_Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printEvenNumbers(10, 20);
        System.out.println("");
        printPrimeNums(50);
        System.out.println("");
    }
    
    static void printEvenNumbers(int a, int b) {
        int i, tmp;
        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        for (i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void printPrimeNums(int a) {
        if (a <= 0) {
            System.out.println("Number must be greater than 0");
        } else {
            int i, j, tmp;
            for (i = 2; i < a; i++) {
                tmp = 0;
                for (j = 1; j < a; j++) {
                    if (i % j == 0) {
                        tmp++;
                    }
                }
                if (tmp < 3) {
                    System.out.print(" " + i);
                }
            }
        }
    }

}
