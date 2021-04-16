package Models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.tomcat.jni.User;

import Utils.dbutils;

public class Ascensions {
	int code_Sommets;
	int code_Abris;
	String difficulte_Ascensions;
	int duree_Ascensions;
	public int getCode_Sommets() {
		return code_Sommets;
	}
	public void setCode_Sommets(int code_Sommets) {
		this.code_Sommets = code_Sommets;
	}
	public int getCode_Abris() {
		return code_Abris;
	}
	public void setCode_Abris(int code_Abris) {
		this.code_Abris = code_Abris;
	}
	public String getDifficulte_Ascensions() {
		return difficulte_Ascensions;
	}
	public void setDifficulte_Ascensions(String difficulte_Ascensions) {
		this.difficulte_Ascensions = difficulte_Ascensions;
	}
	public int getDuree_Ascensions() {
		return duree_Ascensions;
	}
	public void setDuree_Ascensions(int duree_Ascensions) {
		this.duree_Ascensions = duree_Ascensions;
	}
	public static ArrayList<Ascensions> getAscensions(){
        ArrayList<Ascensions> ascension = new ArrayList<>();
            
        try {
            String sql = "select * from ascension;";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	Ascensions a = new Ascensions();
                a.setCode_Sommets(rs.getInt("code_Sommets"));
                a.setCode_Abris(rs.getInt("code_Abris"));
                a.setDifficulte_Ascensions(rs.getString("difficulte_Ascension"));
                a.setDuree_Ascensions(rs.getInt("duree_Ascension"));
                ascension.add(a);
            }
            dbutils.deconnecter(c);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ascension;
    }
	public static ArrayList<Ascensions> getAscensionsWithSommets(int code_Sommet){
        ArrayList<Ascensions> ascension = new ArrayList<>();
            
        try {
            String sql = "select * from ascension where code_Sommets = "+code_Sommet+";";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	Ascensions a = new Ascensions();
                a.setCode_Sommets(rs.getInt("code_Sommets"));
                a.setCode_Abris(rs.getInt("code_Abris"));
                a.setDifficulte_Ascensions(rs.getString("difficulte_Ascension"));
                a.setDuree_Ascensions(rs.getInt("duree_Ascension"));
                ascension.add(a);
            }
            dbutils.deconnecter(c);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ascension;
    }
	public static ArrayList<Ascensions> getAscensionsWithAbris(int code_Abris){
        ArrayList<Ascensions> ascension = new ArrayList<>();
            
        try {
            String sql = "select * from ascension where code_Abris = "+code_Abris+";";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	Ascensions a = new Ascensions();
                a.setCode_Sommets(rs.getInt("code_Sommets"));
                a.setCode_Abris(rs.getInt("code_Abris"));
                a.setDifficulte_Ascensions(rs.getString("difficulte_Ascension"));
                a.setDuree_Ascensions(rs.getInt("duree_Ascension"));
                ascension.add(a);
            }
            dbutils.deconnecter(c);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ascension;
    }
}
