/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fptshop
 */
public class JdbcHelper {

    public static String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String dburl ="jdbc:sqlserver://localhost;database=QL_PhongKham";
    public static String user ="sa";
    public static String pass ="qlphongkham";
    
    static {
        try {
            Class.forName(driver);
            //Connection con=DriverManager.getConnection(dburl, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static PreparedStatement getStatement(String sql,Object...args)throws SQLException{
        
        Connection con =DriverManager.getConnection(dburl, user, pass);
        PreparedStatement stmt =null;
        
        if(sql.startsWith("{"))stmt=con.prepareCall(sql);    
        else stmt=con.prepareStatement(sql);
        for(int i=0; i<args.length;i++){
            stmt.setObject(i+1, args[i]);
        }
        return stmt;
    }
    
    
    public static int Update(String sql ,Object...agrs){
        try {
            PreparedStatement stmt = getStatement(sql, agrs);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        
    }

    public static ResultSet query(String sql ,Object...args) {
        try {
            PreparedStatement stmt=getStatement(sql, args);
            try{
                return stmt.executeQuery();
            }finally{
                //pstmt.getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);         
        }
    }
    
    public static Object value(String sql ,Object...args){
        try {
            ResultSet rs = query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    } 
    
    
}
