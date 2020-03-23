/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renashbell;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class RenAshbell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p = sc.nextInt();

        for (int i = 0; i < N - 1; i++) {
            int t = sc.nextInt();
            if (i == N - 2) {
                if (t >= p) {
                    System.out.println("NO");
                    break;
                } else {
                    System.out.println("YES");
                }
            }
            if (t >= p) {
                System.out.println("NO");
                break;
            }
        }

    }
}
