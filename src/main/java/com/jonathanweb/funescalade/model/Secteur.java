package com.jonathanweb.funescalade.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SECTEUR")
public class Secteur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	private String nom;
	
	private ArrayList<Voie> voies;
	
	private int site_id;
	
	public Secteur () {
		
	}
	
	public Secteur(String nom,int id) {
		this.nom=nom;
		this.site_id=id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Voie> getVoies() {
		return voies;
	}
	public void setVoies(ArrayList<Voie> voies) {
		this.voies = voies;
	}
	public int getSite_id() {
		return site_id;
	}
	public void setSite_id(int site_id) {
		this.site_id = site_id;
	}

	public synchronized int getId() {
		return id;
	}

	public synchronized void setId(int id) {
		this.id = id;
	}
	
}
