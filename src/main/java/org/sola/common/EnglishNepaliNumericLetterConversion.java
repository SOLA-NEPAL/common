/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sola.common;

/**
 *
 * @author KumarKhadka
 */
public class EnglishNepaliNumericLetterConversion {
       
    public static String toNepali(String englishNumber){   
        String nepaliNumber=englishNumber;
        if("".equals(nepaliNumber)){
            return nepaliNumber;
        }          
        nepaliNumber=nepaliNumber.trim();   
        nepaliNumber=nepaliNumber.replace('0', '०');
        nepaliNumber=nepaliNumber.replace('1', '१');
        nepaliNumber= nepaliNumber.replace('2', '२');
        nepaliNumber= nepaliNumber.replace('3', '३');
        nepaliNumber= nepaliNumber.replace('4', '४');
        nepaliNumber= nepaliNumber.replace('5', '५');
        nepaliNumber= nepaliNumber.replace('6', '६');
        nepaliNumber= nepaliNumber.replace('7', '७');
        nepaliNumber= nepaliNumber.replace('8', '८');
        nepaliNumber= nepaliNumber.replace('9', '९'); 
        
        return nepaliNumber;
    }
        
  
       
    public static String toEnglish(String nepali){       
              
        if("".equals(nepali)){
            return nepali;
        }
        nepali=nepali.trim();   
        nepali=nepali.replace('०', '0');
        nepali=nepali.replace('१', '1');
        nepali=nepali.replace('२', '2');
        nepali=nepali.replace('३', '3');
        nepali=nepali.replace('४', '4');
        nepali=nepali.replace('५', '5');
        nepali=nepali.replace('६', '6');
        nepali=nepali.replace('७', '7');
        nepali=nepali.replace('८', '8');
        nepali=nepali.replace('९', '9'); 
        
        return nepali;
    }     
}
