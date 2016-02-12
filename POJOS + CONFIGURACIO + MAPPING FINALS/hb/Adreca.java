package hb;

public class Adreca {
	private int id;
	private String carrer;
	private int codi_postal;
	private String poblacio;
	
	public Adreca(){}
	
	
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}

	public int getCodi_postal() {
		return codi_postal;
	}
	public void setCodi_postal(int codi_postal) {
		this.codi_postal = codi_postal;
	}
	public String getPoblacio() {
		return poblacio;
	}
	public void setPoblacio(String poblacio) {
		this.poblacio = poblacio;
	}


	public String getCarrer() {
		return carrer;
	}


	public void setCarrer(String carrer) {
		this.carrer = carrer;
	}
}
