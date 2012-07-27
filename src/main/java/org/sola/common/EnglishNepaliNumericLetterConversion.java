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
public class EnglishNepaliNumericLetterConversion {

    public static String toNepali(String englishNumber) {
        String nepaliNumber;
        char[] charArray = englishNumber.toCharArray();
        for (int i = 0; i < englishNumber.length(); i++) {
            switch (charArray[i]) {
                case '0':
                    charArray[i] = '०';
                    break;
                case '1':
                    charArray[i] = '१';
                    break;
                case '2':
                    charArray[i] = '२';
                    break;
                case '3':
                    charArray[i] = '३';
                    break;
                case '4':
                    charArray[i] = '४';
                    break;
                case '5':
                    charArray[i] = '५';
                    break;
                case '6':
                    charArray[i] = '६';
                    break;
                case '7':
                    charArray[i] = '७';
                    break;
                case '8':
                    charArray[i] = '८';
                    break;
                case '9':
                    charArray[i] = '९';
                    break;
            }
        }
        nepaliNumber = new String(charArray);
        return nepaliNumber;
    }

    public static String toEnglish(String nepaliNumber) {

        String englishNumber;
        char[] charArray = nepaliNumber.toCharArray();
        for (int i = 0; i < nepaliNumber.length(); i++) {
            switch (charArray[i]) {
                case '०':
                    charArray[i] = '0';
                    break;
                case '१':
                    charArray[i] = '1';
                    break;
                case '२':
                    charArray[i] = '2';
                    break;
                case '३':
                    charArray[i] = '3';
                    break;
                case '४':
                    charArray[i] = '4';
                    break;
                case '५':
                    charArray[i] = '5';
                    break;
                case '६':
                    charArray[i] = '6';
                    break;
                case '७':
                    charArray[i] = '7';
                    break;
                case '८':
                    charArray[i] = '8';
                    break;
                case '९':
                    charArray[i] = '9';
                    break;

            }
        }
        englishNumber = new String(charArray);
        return englishNumber;
    }

    public static String getLocalizedValue(String str) {

        if (Locale.getDefault().getLanguage().equals("np")) {
            return toNepali(str);
        } else {
            return toEnglish(str);
        }
    }
}
