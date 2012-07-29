/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.common;

import java.text.DecimalFormat;

/**
 *
 * @author Dinesh
 */
public class AreaConversion {

    private static DecimalFormat fourDForm = new DecimalFormat("#.####");

    public static String getAreaInLocalUnit(String unit, double areaInSqMt) {
        String convertedArea = "";

        if ("Square Meter".equals(unit)) {
            convertedArea = Double.toString(areaInSqMt);
        } else if ("Bigha-Katha-Dhur".equals(unit)) {
            convertedArea = convertSqMeterToBighaKathaDhur(areaInSqMt);
        } else if ("Square Feet".equals(unit)) {
            convertedArea = Double.toString(areaInSqMt / 0.093);
        } else if ("Hectare".equals(unit)) {
            convertedArea = Double.toString(areaInSqMt / 10000);
        } else if ("Ropani-Ana-Paisa-Dam".equals(unit)) {
            convertedArea = convertSqMeterToRopaniAnaPaisaDam(areaInSqMt);
        }

        return convertedArea;
    }

    private static String convertSqMeterToBighaKathaDhur(double areaInSqmt) {
        String convertedArea;
        int[] bigha = new int[2];
        bigha[0] = (int) (areaInSqmt / 6772.631616);
        double temp = areaInSqmt % 6772.631616;
        bigha[1] = (int) (temp / 338.6315808);
        temp = temp % 338.6315808;
        temp = temp / 16.93157904;
        temp = Double.valueOf(fourDForm.format(temp));
        convertedArea = Integer.toString(bigha[0]) + "-" + Integer.toString(bigha[1]) + "-" + String.format("{0:F3}", Double.toString(temp));
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
            area = 6772.631616 * Double.parseDouble(bigha[0]) + 338.6315808 * Double.parseDouble(bigha[1]) + 16.93157904 * Double.parseDouble(bigha[2]);
        }
        return area;

    }

    private static String convertSqMeterToRopaniAnaPaisaDam(double areaInSqmt) {
        String convertedArea;
        int[] ropani = new int[3];
        ropani[0] = (int) (areaInSqmt / 508.73704704);
        double temp = areaInSqmt % 508.73704704;
        ropani[1] = (int) (temp / 31.79606544);
        temp = temp % 31.79606544;
        ropani[2] = (int) (temp / 7.94901636);
        temp = temp % 7.94901636;
        temp = temp / 1.98725409;
        temp = Double.valueOf(fourDForm.format(temp));
        convertedArea = Integer.toString(ropani[0]) + "-" + Integer.toString(ropani[1]) + "-" + Integer.toString(ropani[2]) + "-" + Double.toString(temp);
        return convertedArea;
    }

    private static double convertRopaniAnaPaisaDamToSquareMeter(String ropaniAnaPaisaDam) {
        double area = 0;
        String[] temp = ropaniAnaPaisaDam.split("-");
        String[] ropani = new String[4];
        System.arraycopy(temp, 0, ropani, 0, temp.length);
        for (int i = 0; i < 4; i++) {
            if (ropani[i] == null) {
                ropani[i] = "0";
            }
        }
        if (ropani.length == 0) {
            return area;
        } else {
            area = Double.parseDouble(ropani[0]) * 508.73704704 + Double.parseDouble(ropani[1]) * 31.79606544 + Double.parseDouble(ropani[2]) * 7.94901636 + Double.parseDouble(ropani[3]) * 1.98725409;
        }
        return area;
    }

    public static double getAreaInSqMt(String unit, String areaInLocalUnit) {
        double area = 0;
        if (areaInLocalUnit == null || areaInLocalUnit.equals("")) {
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
        area = Double.valueOf(fourDForm.format(area));
        return area;
    }
}
