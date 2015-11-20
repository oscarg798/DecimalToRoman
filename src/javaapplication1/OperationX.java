/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author telematica
 */
public class OperationX {

    private static final String ONE_IN_ROMAN = "I";
    private static final String FIVE_IN_ROMAN = "V";
    private static final String TEN_IN_ROMAN = "X";

    public static String decimalToRoman(int x) {
        String romano = "";
        if (x > 0 && x <= 3) {
            romano = getRomanLessThan(x);
        } else if (x > 3 && x <= 8) {
            romano= getRomanFromFourToEight(x);
        } else if (x >= 9 && x <= 13) {
            romano= getRomanFromNineToThirteen(x);
        } else if (x >= 14 && x <= 23) {
            romano= TEN_IN_ROMAN + decimalToRoman(x-10);
        }else if(x >= 24){
            romano = TEN_IN_ROMAN + TEN_IN_ROMAN + decimalToRoman(x-20);
        }
        

        return romano;
    }

    public static String getRomanFromFourToEight(int x) {

        String s = "";
        if (x == 4) {
            s = ONE_IN_ROMAN + FIVE_IN_ROMAN;
        } else {

            s = FIVE_IN_ROMAN + getRomanLessThan(x - 5);

        }
        return s;
    }

    public static String getRomanLessThan(int x) {
        String s = "";
        for (int i = 1; i <= x; i++) {
            s += ONE_IN_ROMAN;
        }
        return s;
    }

    public static String getRomanFromNineToThirteen(int x) {
        String s = "";
        if (x == 9) {
            s = ONE_IN_ROMAN + TEN_IN_ROMAN;
        } else if (x > 9 && x <= 13) {
            s = TEN_IN_ROMAN + getRomanLessThan(x - 10);

        }

        return s;
    }

}
