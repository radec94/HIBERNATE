package hb;

public class Clients {
	private int id;
	private String nom;
	private int telefon;
	private Adreca adreca;
	
	public Clients(){}
	
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
	public int getTelefon() {
		return telefon;
	}
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}
	public Adreca getAdreca() {
		return adreca;
	}
	public void setAdreca(Adreca adreca) {
		this.adreca = adreca;
	}
}
