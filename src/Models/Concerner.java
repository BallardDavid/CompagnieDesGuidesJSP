package Models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.tomcat.jni.User;

import Utils.dbutils;

public class Concerner {
	int code_Sommets;
	int code_Randonnees;
	Date date_Concerner;
	public int getCode_Sommets() {
		return code_Sommets;
	}
	public void setCode_Sommets(int code_Sommets) {
		this.code_Sommets = code_Sommets;
	}
	public int getCode_Randonnees() {
		return code_Randonnees;
	}
	public void setCode_Randonnees(int code_Randonnees) {
		this.code_Randonnees = code_Randonnees;
	}
	public Date getDate_Concerner() {
		return date_Concerner;
	}
	public void setDate_Concerner(Date date_Concerner) {
		this.date_Concerner = date_Concerner;
	}
	public static ArrayList<Concerner> getConcernerWithRandonnees(int code_Randonnees){
        ArrayList<Concerner> concerner = new ArrayList<>();
            
        try {
            String sql = "select * from concerner where code_Randonnees = "+code_Randonnees+";";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	Concerner a = new Concerner();
                a.setCode_Randonnees(rs.getInt("code_Randonnees"));
                a.setCode_Sommets(rs.getInt("code_Sommets"));
                a.setDate_Concerner(rs.getDate("date_Concernre"));
                concerner.add(a);
            }
            dbutils.deconnecter(c);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return concerner;
    }
	public static ArrayList<Concerner> getConcernerWithSommets(int code_Sommets){
        ArrayList<Concerner> concerner = new ArrayList<>();
            
        try {
            String sql = "select * from concerner where code_Sommets = "+code_Sommets+";";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	Concerner a = new Concerner();
                a.setCode_Randonnees(rs.getInt("code_Randonnees"));
                a.setCode_Sommets(rs.getInt("code_Sommets"));
                a.setDate_Concerner(rs.getDate("date_Concernre"));
                concerner.add(a);
            }
            dbutils.deconnecter(c);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return concerner;
    }

}
