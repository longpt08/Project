/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;



/**
 *
 * @author Phon
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ThanhVien;
public class Oracle {
 
    public static Connection con;
    public Oracle() {
            //Thiết lập kết nối đến cơ sở dữ liệu
            String url = "jdbc:oracle:thin:@localhost:1521:orclLong";
            String username = "Universe";
            String password = "universe";
            try{
                con = DriverManager.getConnection(url, username, password);
            }
            catch (SQLException e){
                e.printStackTrace();
            }
    }
}
   

