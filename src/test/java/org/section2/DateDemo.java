package org.section2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args){

        Date date = new Date();
        System.out.println(date);  // Fri Jul 11 12:07:02 IST 2025

        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sd.format(date));  /// 2025-07-11 12:08:11
    }

}
