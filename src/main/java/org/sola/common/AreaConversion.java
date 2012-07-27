/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.common;

/**
 *
 * @author Dinesh
 */
public class AreaConversion {  

    public static String getAreaInLocalUnit(String unit, double areaInSqMt) {
        String convertedArea = "";
        return convertedArea;
    }

    private static double convertBighaKathaDhurToSquareMeter(String bighaKathaDhur) {
        double area = 0;
        String[] temp = bighaKathaDhur.split("-");
        String[] bigha = new String[3];
        System.arraycopy(temp, 0, bigha, 0, temp.length);
        for (int i = 0; i < bigha.length; i++) {
            if (bigha[i] == null) {
                bigha[i] = "0";
            }
        }
        if (bigha.length == 0) {
            return area;
        } else {
            area = 6772.63 * Double.parseDouble(bigha[0]) + 338.63 * Double.parseDouble(bigha[1]) + 16.93 * Double.parseDouble(bigha[2]);
        }
        return area;

    }

    private static double convertRopaniAnaPaisaDamToSquareMeter(String ropaniAnaPaisaDam) {
        double area = 0;
        String[] ropani = ropaniAnaPaisaDam.split("-");
        if (ropani.length == 0) {
            return area;
        } else {
            area = Double.parseDouble(ropani[0]) * 508.737 + Double.parseDouble(ropani[1]) * 31.796 + Double.parseDouble(ropani[2]) * 7.949 + Double.parseDouble(ropani[3]) * 1.987;
        }
        return area;
    }

    public static double getAreaInSqMt(String unit, String areaInLocalUnit) {
        double area = 0;
        if (areaInLocalUnit == null) {
            return 0;
        } else {
            if ("Square Meter".equals(unit)) {
                area = Double.parseDouble(areaInLocalUnit);
            } else if ("Bigha-Katha-Dhur".equals(unit)) {
                area = convertBighaKathaDhurToSquareMeter(areaInLocalUnit);
            } else if ("Square Feet".equals(unit)) {
                area = 0.093 * Double.parseDouble(areaInLocalUnit);
            } else if ("Hectare".equals(unit)) {
                area = 10000 * Double.parseDouble(areaInLocalUnit);
            } else if ("Ropani-Ana-Paisa-Dam".equals(unit)) {
                area = convertRopaniAnaPaisaDamToSquareMeter(areaInLocalUnit);
            }


        }

        return area;
    }
}
