package Models;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.tomcat.jni.User;

import Utils.dbutils;

public class Randonnees {
	int code_Randonnees;
	int nbPersonnes_Randonnees;
	Date dateDebut_Randonnees;
	Date dateFin_Randonnees;
	int code_Guides;
	public int getCode_Randonnees() {
		return code_Randonnees;
	}
	public void setCode_Randonnees(int code_Randonnees) {
		this.code_Randonnees = code_Randonnees;
	}
	public int getNbPersonnes_Randonnees() {
		return nbPersonnes_Randonnees;
	}
	public void setNbPersonnes_Randonnees(int nbPersonnes_Randonnees) {
		this.nbPersonnes_Randonnees = nbPersonnes_Randonnees;
	}
	public Date getDateDebut_Randonnees() {
		return dateDebut_Randonnees;
	}
	public void setDateDebut_Randonnees(Date dateDebut_Randonnees) {
		this.dateDebut_Randonnees = dateDebut_Randonnees;
	}
	public Date getDateFin_Randonnees() {
		return dateFin_Randonnees;
	}
	public void setDateFin_Randonnees(Date dateFin_Randonnees) {
		this.dateFin_Randonnees = dateFin_Randonnees;
	}
	public int getCode_Guides() {
		return code_Guides;
	}
	public void setCode_Guides(int code_Guides) {
		this.code_Guides = code_Guides;
	}
	public static ArrayList<Randonnees> getRandonnees(){
        ArrayList<Randonnees> randonnees = new ArrayList<>();
            
        try {
            String sql = "select * from randonnees;";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	Randonnees a = new Randonnees();
                a.setCode_Randonnees(rs.getInt("code_Randonnees"));
                a.setNbPersonnes_Randonnees(rs.getInt("nbPersonnes_Randonnees"));
                a.setDateDebut_Randonnees(rs.getDate("dateDebut_Randonnees"));
                a.setDateFin_Randonnees(rs.getDate("dateFin_Randonnees"));
                a.setCode_Guides(rs.getInt("code_Guides"));
                randonnees.add(a);
            }
            dbutils.deconnecter(c);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return randonnees;
    }
	public static ArrayList<Randonnees> getRandonnee(int code_Randonnees){
        ArrayList<Randonnees> randonnees = new ArrayList<>();
            
        try {
            String sql = "select * from randonnees where code_Randonnees = "+code_Randonnees+";";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	Randonnees a = new Randonnees();
                a.setCode_Randonnees(rs.getInt("code_Randonnees"));
                a.setNbPersonnes_Randonnees(rs.getInt("nbPersonnes_Randonnees"));
                a.setDateDebut_Randonnees(rs.getDate("dateDebut_Randonnees"));
                a.setDateFin_Randonnees(rs.getDate("dateFin_Randonnees"));
                a.setCode_Guides(rs.getInt("code_Guides"));
                randonnees.add(a);
            }
            dbutils.deconnecter(c);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return randonnees;
    }
	public static ArrayList<Randonnees> getRandonneeWithGuides(int code_Guides){
        ArrayList<Randonnees> randonnees = new ArrayList<>();
            
        try {
            String sql = "select * from randonnees where code_Guides = "+code_Guides+";";
            java.sql.Connection c = dbutils.connecter();
            java.sql.ResultSet rs = dbutils.query(sql, c);
          
            while (rs.next()){
            	Randonnees a = new Randonnees();
                a.setCode_Randonnees(rs.getInt("code_Randonnees"));
                a.setNbPersonnes_Randonnees(rs.getInt("nbPersonnes_Randonnees"));
                a.setDateDebut_Randonnees(rs.getDate("dateDebut_Randonnees"));
                a.setDateFin_Randonnees(rs.getDate("dateFin_Randonnees"));
                a.setCode_Guides(rs.getInt("code_Guides"));
                randonnees.add(a);
            }
            dbutils.deconnecter(c);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return randonnees;
    }
}
