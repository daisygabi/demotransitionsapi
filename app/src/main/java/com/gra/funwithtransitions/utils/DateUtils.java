package com.gra.funwithtransitions.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {

    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(Calendar.getInstance().getTime());
    }
}