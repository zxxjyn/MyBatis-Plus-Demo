package com.amaduse.demo.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDao {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(1548832320000L);
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-mm-dd hh24:mi:ss");
        System.out.println(sdf.format(date));
    }
}
