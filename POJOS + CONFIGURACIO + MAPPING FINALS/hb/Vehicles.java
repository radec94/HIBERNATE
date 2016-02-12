package hb;

public class Vehicles {
	private int id;
	private String model;
	private String versio;
	private Fabricant fabricant;
	private Ficha_tecnica ficha_tecnica;
	
	public Vehicles(){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVersio() {
		return versio;
	}
	public void setVersio(String versio) {
		this.versio = versio;
	}
	public Fabricant getFabricant() {
		return fabricant;
	}
	public void setFabricant(Fabricant fabricant) {
		this.fabricant = fabricant;
	}
	public Ficha_tecnica getFicha_tecnica() {
		return ficha_tecnica;
	}
	public void setFicha_tecnica(Ficha_tecnica ficha_tecnica) {
		this.ficha_tecnica = ficha_tecnica;
	}
}
