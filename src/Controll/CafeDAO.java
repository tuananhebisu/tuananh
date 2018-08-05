/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import Model.Order;
import Model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CafeDAO {

    public Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/coffee";
        String user = "root";
        String password = "";
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    public boolean checkLogin(String u, String p, Connection conn) throws SQLException {
        String sql = "select * from tbluser \n"
                + "where username=? and password=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, u);
        ps.setString(2, p);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return true;
        } else {
            return false;
        }

    }

    public ArrayList<Order> List(Connection conn) throws SQLException {
        ArrayList<Order> ar = new ArrayList<>();
        try {

            String sql = "select *from tblorders ";
            Statement st = conn.createStatement();
            ResultSet s = st.executeQuery(sql);
            Order or;
            if (s.next()) {
              or= new Order(s.getString("tbluser_user"), s.getString("tbluser_password"));
              ar.add(or);
            } else {
                return null;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return ar;

    }
    
   

}
