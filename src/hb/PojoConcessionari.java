
public class PojoConcessionari {
	private int id_autonumeric;
	private float id_concessionari;
	private String id_client;
	private String nom;
	private String pais;
	
	public PojoConcessionari(){}
	
	public float getId_concessionari() {
		return id_concessionari;
	}

	public void setId_concessionari(float id_concessionari) {
		this.id_concessionari = id_concessionari;
	}

	public String getId_client() {
		return id_client;
	}
	public void setId_client(String id_client) {
		this.id_client = id_client;
	}
	
	public int getId_autonumeric() {
		return id_autonumeric;
	}
	public void setId_autonumeric(int id_autonumeric) {
		this.id_autonumeric = id_autonumeric;
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

	
	
	
	
}
