/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class TaiKhoan_ctrl extends Oracle {
    public boolean Login (String username, String password){
        String query = "select * from TaiKhoan where TenTK = ?, Password = ?";
        try{
        PreparedStatement presmt = con.prepareStatement(query);
        presmt.setString(1,username);
        presmt.setString(2,password);
        ResultSet rs = presmt.executeQuery();
        if (rs.next())
            return true;
        else return false;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
