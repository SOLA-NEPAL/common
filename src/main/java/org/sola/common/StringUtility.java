package org.sola.common;

/**
 * Contains helping string methods
 */
public class StringUtility {
    
    /** 
     * Checks string for null or empty value and returns true if any of them. 
     * @param value String value to check
     */
    public static boolean isEmpty(String value){
        return value == null || value.isEmpty();
    }
    
    /** 
     * Returns empty string if provided value is null. 
     * @param value String value to check
     */
    public static String empty(String value){
        if(value == null){
            return "";
        } else {
            return value;
        }
    }
}
