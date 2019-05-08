////package com.company;
////import java.util.Arrays;
////import java.util.function.Function;
////
////public class Main {
////
////    public static void LambdaFunkcija (Function <Double, Double>  func) {
////        for (double i=0;i<=100;i++) {
////            System.out.println (func.apply(i));
////        }
////    }
////
////    public static void main (String[] args) {
////        LambdaFunkcija (x -> x*x+2*x+1);
////    }
////}
////
////

package com.company;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Integer brojevi[]=new Integer[] {11,12,13,14,123,41};


        for(int i=0; i<5; i++) {
            System.out.println (brojevi[i]);
        }
    }


    private static int sum(int x) {
        return x;

    }
}
