package Models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.tomcat.jni.User;

import Utils.dbutils;

public class Sommets {
	float altitude_Sommets;
	String nom_Sommets;
	int code_Sommets;
	public float getAltitude_Sommets() {
		return altitude_Sommets;
	}
	public void setAltitude_Sommets(float altitude_Sommets) {
		this.altitude_Sommets = altitude_Sommets;
	}
	public String getNom_Sommets() {
		return nom_Sommets;
	}
	public void setNom_Sommets(String nom_Sommets) {
		this.nom_Sommets = nom_Sommets;
	}
	public int getCode_Sommets() {
		return code_Sommets;
	}
	public void setCode_Sommets(int code_Sommets) {
		this.code_Sommets = code_Sommets;
	}
    public static ArrayList<Sommets> getSommets(){
        ArrayList<Sommets> sommets = new ArrayList<>();
            
        try {
            String sql = "select * from sommets;";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
                Sommets a = new Sommets();
                a.setCode_Sommets(rs.getInt("code_Sommets"));
                a.setAltitude_Sommets(rs.getFloat("nom_Sommets"));
                a.setNom_Sommets(rs.getString("altitude_Sommets"));
                sommets.add(a);
            }
            dbutils.deconnecter(c);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sommets;
    }
    public static ArrayList<Sommets> getSommet(int id_sommets){
        ArrayList<Sommets> sommets = new ArrayList<>();
            
        try {
            String sql = "select * from sommets where code_Sommets = "+id_sommets+";";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
                Sommets a = new Sommets();
                a.setCode_Sommets(rs.getInt("code_Sommets"));
                a.setAltitude_Sommets(rs.getFloat("nom_Sommets"));
                a.setNom_Sommets(rs.getString("altitude_Sommets"));
                sommets.add(a);
            }
            dbutils.deconnecter(c);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sommets;
    }
    public static ArrayList<Sommets> getSommetsWithAbri(int code_Abris){
        ArrayList<Sommets> sommets = new ArrayList<>();
            
        try {
            String sql = "select code_Sommets from ascension where code_Abris = "+code_Abris+";";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	String sql1 = "select * from sommets where code_Sommets= "+rs.getInt("code_Sommets")+";";
                java.sql.Connection c1 = dbutils.connecter();
                java.sql.ResultSet rs1 = dbutils.query(sql1, c1);
                while (rs1.next()){
                	Sommets a = new Sommets();
                    a.setCode_Sommets(rs1.getInt("code_Sommets"));
                    a.setAltitude_Sommets(rs1.getFloat("nom_Sommets"));
                    a.setNom_Sommets(rs1.getString("altitude_Sommets"));
                    sommets.add(a);
                }
            }
            dbutils.deconnecter(c);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sommets;
    }
        
}
