package com.su.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SuDateUtil {

    private String pattern;

    public SuDateUtil(String pattern) {
        this.pattern = pattern;
    }

    public String dateToStr(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

}
