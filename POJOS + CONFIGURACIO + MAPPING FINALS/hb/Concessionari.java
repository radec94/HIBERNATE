package hb;

import org.hibernate.mapping.Set;

public class Concessionari {
	private int id;
	private String nom;
	private String pais;
	private Set vehicles;
	private Set clients;
	
	public Concessionari(){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Set getVehicles() {
		return vehicles;
	}
	public void setVehicles(Set vehicles) {
		this.vehicles = vehicles;
	}
	public Set getClients() {
		return clients;
	}
	public void setClients(Set clients) {
		this.clients = clients;
	}
	
}
