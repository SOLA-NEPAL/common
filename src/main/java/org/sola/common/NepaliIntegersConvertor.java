/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.common;

import java.util.Locale;

/**
 *
 * @author KumarKhadka
 */
public class NepaliIntegersConvertor {

    public static String toNepaliInteger(String englishNumber) {
        return toNepaliInteger(englishNumber, true);
    }
    
    public static String toNepaliInteger(String arabicNumber, boolean replaceNonIntegers) {
        if (arabicNumber == null || arabicNumber.isEmpty()) {
            return null;
        }

        String nepaliNumber = "";

        if (replaceNonIntegers) {
            char[] charArray = arabicNumber.toCharArray();
            for (int i = 0; i < arabicNumber.length(); i++) {
                if (charArray[i] == '०' || charArray[i] == '0') {
                    nepaliNumber = nepaliNumber + "०";
                } else if (charArray[i] == '१' || charArray[i] == '1') {
                    nepaliNumber = nepaliNumber + "१";
                } else if (charArray[i] == '२' || charArray[i] == '2') {
                    nepaliNumber = nepaliNumber + "२";
                } else if (charArray[i] == '३' || charArray[i] == '3') {
                    nepaliNumber = nepaliNumber + "३";
                } else if (charArray[i] == '४' || charArray[i] == '4') {
                    nepaliNumber = nepaliNumber + "४";
                } else if (charArray[i] == '५' || charArray[i] == '5') {
                    nepaliNumber = nepaliNumber + "५";
                } else if (charArray[i] == '६' || charArray[i] == '6') {
                    nepaliNumber = nepaliNumber + "६";
                } else if (charArray[i] == '७' || charArray[i] == '7') {
                    nepaliNumber = nepaliNumber + "७";
                } else if (charArray[i] == '८' || charArray[i] == '8') {
                    nepaliNumber = nepaliNumber + "८";
                } else if (charArray[i] == '९' || charArray[i] == '9') {
                    nepaliNumber = nepaliNumber + "९";
                }
            }
        } else {
            nepaliNumber = arabicNumber.replace("0", "०").replace("1", "१").replace("2", "२").replace("3", "३").replace("4", "४").replace("5", "५").replace("6", "६").replace("7", "७").replace("8", "८").replace("9", "९");
        }
        return nepaliNumber;
    }

    public static Integer toInteger(String nepaliInteger) {
        String stringInteger = toStringInteger(nepaliInteger);
        if (stringInteger.isEmpty()) {
            return null;
        } else {
            return Integer.parseInt(stringInteger);
        }
    }

    public static String toStringInteger(String nepaliInteger) {
        return toStringInteger(nepaliInteger, true);
    }
    
    public static String toStringInteger(String nepaliInteger, boolean replaceNonIntegers) {
        if (nepaliInteger == null || nepaliInteger.isEmpty()) {
            return null;
        }

        String arabicNumber = "";

        if (replaceNonIntegers) {
            char[] charArray = nepaliInteger.toCharArray();
            for (int i = 0; i < nepaliInteger.length(); i++) {
                if (charArray[i] == '०' || charArray[i] == '0') {
                    arabicNumber = arabicNumber + "0";
                } else if (charArray[i] == '१' || charArray[i] == '1') {
                    arabicNumber = arabicNumber + "1";
                } else if (charArray[i] == '२' || charArray[i] == '2') {
                    arabicNumber = arabicNumber + "2";
                } else if (charArray[i] == '३' || charArray[i] == '3') {
                    arabicNumber = arabicNumber + "3";
                } else if (charArray[i] == '४' || charArray[i] == '4') {
                    arabicNumber = arabicNumber + "4";
                } else if (charArray[i] == '५' || charArray[i] == '5') {
                    arabicNumber = arabicNumber + "5";
                } else if (charArray[i] == '६' || charArray[i] == '6') {
                    arabicNumber = arabicNumber + "6";
                } else if (charArray[i] == '७' || charArray[i] == '7') {
                    arabicNumber = arabicNumber + "7";
                } else if (charArray[i] == '८' || charArray[i] == '8') {
                    arabicNumber = arabicNumber + "8";
                } else if (charArray[i] == '९' || charArray[i] == '9') {
                    arabicNumber = arabicNumber + "9";
                }
            }
        } else {
            arabicNumber = nepaliInteger.replace("०", "0").replace("१", "1")
                    .replace("२", "2").replace("३", "3").replace("४", "4")
                    .replace("५", "5").replace("६", "6").replace("७", "7")
                    .replace("८", "8").replace("९", "9");
        }
        return arabicNumber;
    }

    public static String getLocalizedValue(String str) {
        if (Locale.getDefault().getLanguage().equals("ne")) {
            return toNepaliInteger(str);
        } else {
            return toStringInteger(str);
        }
    }
}
