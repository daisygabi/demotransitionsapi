package com.gra.funwithtransitions.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {

    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy");
        return dateFormat.format(Calendar.getInstance().getTime());
    }
}