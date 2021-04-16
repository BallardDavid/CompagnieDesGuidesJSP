package Models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.tomcat.jni.User;

import Utils.dbutils;

public class Abris {
	String nom_Abris;
	String type_Abris; 
	String altitude_Abris;
	String places_Abris;
	String prixNuit_Abris;
	String prixRepas_Abris;
	String telGardien_Abris;
	int code_Valle;
	int code_Abris;
	public int getCode_Abris() {
		return code_Abris;
	}
	public void setCode_Abris(int code_Abris) {
		this.code_Abris = code_Abris;
	}
	public String getNom_Abris() {
		return nom_Abris;
	}
	public void setNom_Abris(String nom_Abris) {
		this.nom_Abris = nom_Abris;
	}
	public String getType_Abris() {
		return type_Abris;
	}
	public void setType_Abris(String type_Abris) {
		this.type_Abris = type_Abris;
	}
	public String getAltitude_Abris() {
		return altitude_Abris;
	}
	public void setAltitude_Abris(String altitude_Abris) {
		this.altitude_Abris = altitude_Abris;
	}
	public String getPlaces_Abris() {
		return places_Abris;
	}
	public void setPlaces_Abris(String places_Abris) {
		this.places_Abris = places_Abris;
	}
	public String getPrixNuit_Abris() {
		return prixNuit_Abris;
	}
	public void setPrixNuit_Abris(String prixNuit_Abris) {
		this.prixNuit_Abris = prixNuit_Abris;
	}
	public String getPrixRepas_Abris() {
		return prixRepas_Abris;
	}
	public void setPrixRepas_Abris(String prixRepas_Abris) {
		this.prixRepas_Abris = prixRepas_Abris;
	}
	public String getTelGardien_Abris() {
		return telGardien_Abris;
	}
	public void setTelGardien_Abris(String telGardien_Abris) {
		this.telGardien_Abris = telGardien_Abris;
	}
	public int getCode_Vallee() {
		return code_Valle;
	}
	public void setCode_Vallee(int code_Valle) {
		this.code_Valle = code_Valle;
	}
    public String toString() {
        return "Abris{" + "code_Abris=" + this.getCode_Abris() + ", TypeAbris=" + this.getType_Abris() + ", AltitudeAbris=" + this.getAltitude_Abris() + ", Places_Abris=" + this.getPlaces_Abris() + ", PrixNuit_Abris=" + this.getPrixNuit_Abris() + ", PrixRepas_Abris= " + this.getPrixRepas_Abris()+ ", TelGardien=" +this.getTelGardien_Abris()+ ",CodeVallees" + this.getCode_Vallee()+'}';
    }
    public ArrayList<Abris> getAbri(int id_Abris){
		ArrayList<Abris> abris = new ArrayList<Abris>();
		try {
            String sql = "select * from abris where code_Abris = "+id_Abris+";";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	Abris a = new Abris();
                a.setCode_Abris(rs.getInt("code_Abris"));
                a.setNom_Abris(rs.getString("nom_Abris"));
                a.setType_Abris(rs.getString("type_Abris"));
                a.setAltitude_Abris(rs.getString("altitude_Abris"));
                a.setPlaces_Abris(rs.getString("places_Abris"));
                a.setPrixNuit_Abris(rs.getString("prixNuit_Abris"));
                a.setPrixRepas_Abris(rs.getString("prixRepas_Abris"));
                a.setTelGardien_Abris(rs.getString("telGardien_Abros"));
                a.setCode_Vallee(rs.getInt("code_Vallees"));
                abris.add(a);
            }
            dbutils.deconnecter(c);
		}catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    	return abris;
    }
    public ArrayList<Abris> getAbris(){
		ArrayList<Abris> abris = new ArrayList<Abris>();
		try {
            String sql = "select * from abris;";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	Abris a = new Abris();
                a.setCode_Abris(rs.getInt("code_Abris"));
                a.setNom_Abris(rs.getString("nom_Abris"));
                a.setType_Abris(rs.getString("type_Abris"));
                a.setAltitude_Abris(rs.getString("altitude_Abris"));
                a.setPlaces_Abris(rs.getString("places_Abris"));
                a.setPrixNuit_Abris(rs.getString("prixNuit_Abris"));
                a.setPrixRepas_Abris(rs.getString("prixRepas_Abris"));
                a.setTelGardien_Abris(rs.getString("telGardien_Abros"));
                a.setCode_Vallee(rs.getInt("code_Vallees"));
                abris.add(a);
            }
            dbutils.deconnecter(c);
		}catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    	return abris;
    }
    public ArrayList<Abris> getAbriParVallees(int codeVallees){
		ArrayList<Abris> abris = new ArrayList<Abris>();
		try {
            String sql = "select * from abris where code_Vallees = "+codeVallees+";";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	Abris a = new Abris();
                a.setCode_Abris(rs.getInt("code_Abris"));
                a.setNom_Abris(rs.getString("nom_Abris"));
                a.setType_Abris(rs.getString("type_Abris"));
                a.setAltitude_Abris(rs.getString("altitude_Abris"));
                a.setPlaces_Abris(rs.getString("places_Abris"));
                a.setPrixNuit_Abris(rs.getString("prixNuit_Abris"));
                a.setPrixRepas_Abris(rs.getString("prixRepas_Abris"));
                a.setTelGardien_Abris(rs.getString("telGardien_Abros"));
                a.setCode_Vallee(rs.getInt("code_Vallees"));
                abris.add(a);
            }
            dbutils.deconnecter(c);
		}catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    	return abris;
    }
}
