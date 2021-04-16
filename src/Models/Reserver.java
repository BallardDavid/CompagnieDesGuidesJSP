package Models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.tomcat.jni.User;

import Utils.dbutils;

public class Reserver {
	int code_Abris;
	int code_Randonnees;
	Date date_Reserver;
	String statut_Reserver;
	public int getCode_Abris() {
		return code_Abris;
	}
	public void setCode_Abris(int code_Abris) {
		this.code_Abris = code_Abris;
	}
	public int getCode_Randonnees() {
		return code_Randonnees;
	}
	public void setCode_Randonnees(int code_Randonnees) {
		this.code_Randonnees = code_Randonnees;
	}
	public Date getDate_Reserver() {
		return date_Reserver;
	}
	public void setDate_Reserver(Date date_Reserver) {
		this.date_Reserver = date_Reserver;
	}
	public String getStatut_Reserver() {
		return statut_Reserver;
	}
	public void setStatut_Reserver(String statut_Reserver) {
		this.statut_Reserver = statut_Reserver;
	}
	public static ArrayList<Reserver> getReserverWithAbris(int code_Abris){
        ArrayList<Reserver> reserver = new ArrayList<>();
            
        try {
            String sql = "select * from reserver where code_Abris = "+code_Abris+";";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	Reserver a = new Reserver();
                a.setCode_Randonnees(rs.getInt("code_Randonnees"));
                a.setCode_Abris(rs.getInt("code_Abris"));
                a.setDate_Reserver(rs.getDate("date_Reserver"));
                a.setStatut_Reserver(rs.getString("statut_Reserver"));
                reserver.add(a);
            }
            dbutils.deconnecter(c);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reserver;
    }
	public static ArrayList<Reserver> getReserverWithRandonnees(int code_Randonnees){
        ArrayList<Reserver> reserver = new ArrayList<>();
            
        try {
            String sql = "select * from reserver where code_Randonnees = "+code_Randonnees+";";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	Reserver a = new Reserver();
                a.setCode_Randonnees(rs.getInt("code_Randonnees"));
                a.setCode_Abris(rs.getInt("code_Abris"));
                a.setDate_Reserver(rs.getDate("date_Reserver"));
                a.setStatut_Reserver(rs.getString("statut_Reserver"));
                reserver.add(a);
            }
            dbutils.deconnecter(c);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reserver;
    }
	public static ArrayList<Reserver> getReservers(){
        ArrayList<Reserver> reserver = new ArrayList<>();
            
        try {
            String sql = "select * from reserver;";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	Reserver a = new Reserver();
                a.setCode_Randonnees(rs.getInt("code_Randonnees"));
                a.setCode_Abris(rs.getInt("code_Abris"));
                a.setDate_Reserver(rs.getDate("date_Reserver"));
                a.setStatut_Reserver(rs.getString("statut_Reserver"));
                reserver.add(a);
            }
            dbutils.deconnecter(c);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reserver;
    }
}
