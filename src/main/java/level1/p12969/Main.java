package level1.p12969;

import java.util.Scanner;

public class Main {
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= b; i++) {
            for(int j = 1; j <= a; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}