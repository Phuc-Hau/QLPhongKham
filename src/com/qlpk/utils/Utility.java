/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.utils;

import java.awt.Color;
import javax.swing.JPasswordField;
import com.qlpk.utils.Msgbox;
import static java.awt.Color.pink;
import static java.awt.Color.white;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
/**
 *
 * @author fptshop
 */
public class Utility {

    // Kiểm tra mật khẩu
    public static boolean CheckPass(JPasswordField txtPassword){
        String pass =new String(txtPassword.getPassword());
        String pattern = "^([a-zA-Z])(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{7,}$";
        txtPassword.setBackground(Color.white);
        if(pass.matches(pattern)==false){
            txtPassword.setBackground(Color.yellow);
            MsgBox.alert(txtPassword, "-Mật khẩu bắt đầu bằng chử \n"
                    + "-bao gồm cả số \n"
                    + "-ít nhất 8 ký tự\n"
                    + "-Không chứa khoảng trắng");
            return false;
        } else return true;
    }
    
    // kiểm tra Email
    public static boolean parseEmail(JTextField txtEmal){
        String rgx="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String email = txtEmal.getText();
        txtEmal.setBackground(white);
        if(email.matches(rgx)==false){
            txtEmal.setBackground(Color.yellow);
            MsgBox.alert(txtEmal.getRootPane(), txtEmal.getName() + " không đúng định dạng");
            return false;
        } else return true;
    }
    
    //gồm 10 số 
    //các đầu 3 số của nhà mạng
    public static boolean checkSDT(JTextField txtSDT) {
        txtSDT.setBackground(white);
        String id = txtSDT.getText();
        String rgx = "(086|096|097|098|032|033|034|035|036|037|038|039|089|090|093|070|079|077|078|076|088|091|094|083|084|085|081|082|092|056|058|099|059)[0-9]{7}";
        if (id.matches(rgx)) {
            return true;
        } else {
            txtSDT.setBackground(Color.yellow);
            MsgBox.alert(txtSDT.getRootPane(), txtSDT.getName() + " phải gồm 10 số\nđúng các đầu số của nhà mạng.");
            return false;
        }
    }
    
    // Set TextField color white
    public static void setBackground(JTextField txt){
        txt.setBackground(white);
    }
    
    // Kiểm tra rỗng
    public static boolean checkNullText(JTextField txt) {
        txt.setBackground(white);
        if (txt.getText().trim().length() > 0) {
            return true;
        } else {
            txt.setBackground(Color.yellow);
            return false;
        }
    }
    
    
    
    
    
}
