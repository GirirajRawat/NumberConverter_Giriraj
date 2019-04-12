package com.example.numberconverter_giriraj;

public class NumberConverter_Giriraj {
    private final char[] array;
    private final int length_of_Array;
    private final String[] onesNumber = {"", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine"};
    private final String[] tensNumber = {"ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private final String[] aboveTwenty = {"twenty", "thirty", "forty", "fifty", "sixty",
            "seventy", "eighty", "ninety"};
    public final String[] hundreds = {"hundred", "hundreds"};

    public NumberConverter_Giriraj(int item) {
        array = String.valueOf(item).toCharArray();
        length_of_Array = array.length;

    }

    public String Check() {
        switch (length_of_Array) {
            case 1:
                return oneDigitHere(Character.getNumericValue(array[0]));
            case 2:
                return twoDigitHere(Character.getNumericValue(array[0]),
                        Character.getNumericValue(array[1]));
            case 3:
                return threeDigitHere(Character.getNumericValue(array[0]),
                        Character.getNumericValue(array[1]), Character.getNumericValue(array[2]));

        }
        return "sorry four digit is not available";
    }

    private String oneDigitHere(int x) {
        return onesNumber[x];
    }


    private String twoDigitHere(int x, int y) {
        if (x == 1) {
            return tensNumber[y];
        } else if (x == 0) {
            if (y == 0) {
                return "";
            } else {
                return onesNumber[y];

            }

        } else {
            if (y == 0) {
                return aboveTwenty[x - 2];
            }
            return aboveTwenty[x - 2] + oneDigitHere(y);
        }
    }

    private String threeDigitHere(int x, int y, int z) {
        if (x == 1){
            return onesNumber[x] + " " + hundreds[0] + " and " + twoDigitHere(y,z);
        }
        else{
            if ( y == 0 && z == 0){
                return onesNumber[x] + " " + hundreds[1] + twoDigitHere(y,z);
            }
            return onesNumber[x] + " " + hundreds[1] + " and " + twoDigitHere(y,z);
        }
    }
}


