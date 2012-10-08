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
        String nepaliNumber="";
        char[] charArray = englishNumber.toCharArray();
        for (int i = 0; i < englishNumber.length(); i++) {
            if(charArray[i] == '०' || charArray[i] == '0'){
                nepaliNumber = nepaliNumber + "०";
            } else if(charArray[i] == '१' || charArray[i] == '1'){
                nepaliNumber = nepaliNumber + "१";
            } else if(charArray[i] == '२' || charArray[i] == '2'){
                nepaliNumber = nepaliNumber + "२";
            } else if(charArray[i] == '३' || charArray[i] == '3'){
                nepaliNumber = nepaliNumber + "३";
            } else if(charArray[i] == '४' || charArray[i] == '4'){
                nepaliNumber = nepaliNumber + "४";
            } else if(charArray[i] == '५' || charArray[i] == '5'){
                nepaliNumber = nepaliNumber + "५";
            } else if(charArray[i] == '६' || charArray[i] == '6'){
                nepaliNumber = nepaliNumber + "६";
            } else if(charArray[i] == '७' || charArray[i] == '7'){
                nepaliNumber = nepaliNumber + "७";
            } else if(charArray[i] == '८' || charArray[i] == '8'){
                nepaliNumber = nepaliNumber + "८";
            } else if(charArray[i] == '९' || charArray[i] == '9'){
                nepaliNumber = nepaliNumber + "९";
            }
        }
        return nepaliNumber;
    }

    public static Integer toInteger(String nepaliInteger) {
        String stringInteger = toStringInteger(nepaliInteger);
        if(stringInteger.isEmpty()){
            return null;
        } else {
            return Integer.parseInt(stringInteger);
        }
    }
    
    public static String toStringInteger(String nepaliInteger) {
        String englishNumber = "";
        char[] charArray = nepaliInteger.toCharArray();
        for (int i = 0; i < nepaliInteger.length(); i++) {
            if(charArray[i] == '०' || charArray[i] == '0'){
                englishNumber = englishNumber + "0";
            } else if(charArray[i] == '१' || charArray[i] == '1'){
                englishNumber = englishNumber + "1";
            } else if(charArray[i] == '२' || charArray[i] == '2'){
                englishNumber = englishNumber + "2";
            } else if(charArray[i] == '३' || charArray[i] == '3'){
                englishNumber = englishNumber + "3";
            } else if(charArray[i] == '४' || charArray[i] == '4'){
                englishNumber = englishNumber + "4";
            } else if(charArray[i] == '५' || charArray[i] == '5'){
                englishNumber = englishNumber + "5";
            } else if(charArray[i] == '६' || charArray[i] == '6'){
                englishNumber = englishNumber + "6";
            } else if(charArray[i] == '७' || charArray[i] == '7'){
                englishNumber = englishNumber + "7";
            } else if(charArray[i] == '८' || charArray[i] == '8'){
                englishNumber = englishNumber + "8";
            } else if(charArray[i] == '९' || charArray[i] == '9'){
                englishNumber = englishNumber + "9";
            }
        }
        return englishNumber;
    }

    public static String getLocalizedValue(String str) {
        if (Locale.getDefault().getLanguage().equals("np")) {
            return toNepaliInteger(str);
        } else {
            return toStringInteger(str);
        }
    }
}
