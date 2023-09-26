/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._lab;

import connection.DBConnection;


/**
 *
 * @author INGESIS
 */
public class App {
    public static void main(String[] args){
        DBConnection conn = DBConnection.getDBConnection();
        conn.connect("empleados");
        conn.comprobarIntancia(conn);
        conn.disconnect();
        DBConnection conn2 = DBConnection.getDBConnection();
        conn2.connect("nomina");
        conn2.comprobarIntancia(conn2);
        conn2.disconnect();
    }
    
}
