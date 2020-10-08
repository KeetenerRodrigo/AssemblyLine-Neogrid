package br.com.assemblyline.util;

import java.time.LocalDateTime;

/**
 * @author Keetener 
 * Date conversion class.
 */
public class DateUtil {

    /* Converts LocalDateTime to string */
    public static String dateToString(LocalDateTime localDateTime) {
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("hh:mma");
        String formattedString = localDateTime.format(formatter);

        return formattedString;
    }
}
