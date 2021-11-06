/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author fptshop
 */
public class XDate {

    static SimpleDateFormat format =new SimpleDateFormat();


    public static Date toDate(String date, String pattern){
        try {
            format.applyPattern(pattern);
            return format.parse(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static String toString(Date date,String pattern){
        format.applyPattern(pattern);
        return format.format(date);
    }
    
    public static Date addDay(Date date, long days){
        date.setTime(date.getTime()+days*24*60*60*1000);
        return date;
    }
    
    public static Date now() {
        return new Date();   //new Date lấy giờ hiện tại
    }
    
}
