package util;

import java.util.Scanner;

public class Main {

    static int computeH(double h) {
        double val =  Math.floor(Math.sqrt(h));
        if(val * (val + 1) > h) {
            return (int) (val - 1);
        }

        return (int) val;
    }

    public static void main(String [] s) {
        Scanner scan = new Scanner(System.in);
        double h =  scan.nextDouble();
//        long start = System.currentTimeMillis();
        int result = computeH(h);
        System.out.println(result);
//        long end = System.currentTimeMillis();
//        System.out.println((end-start));


    }
}
