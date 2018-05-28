package me.cooper.rick.hackerrank.staticinit;

import java.util.Scanner;

public class Solution {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static int B = SCANNER.nextInt();
    private static int H = SCANNER.nextInt();
    private static boolean flag = B > 0 && H > 0;

    static {
        SCANNER.close();
        try {
            if (!flag) throw new Exception("Breadth and height must be positive");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }

}
