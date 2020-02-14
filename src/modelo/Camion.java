package modelo;
public class Camion extends Vehiculo {
	private int taraMaxima;
	private int galibo;
	public Camion(){
		this.marca="";
		this.modelo="";
		this.color="";
		this.tipoDeCombustible="";
		this.cilindrada=0;
		this.numeroDePlazas=0;
		this.categoriaAmbiental="";
		this.taraMaxima=0;
		this.galibo=0;
		
	}
	public Camion(String marca, String modelo, String color, String tipoDeCombustible, Integer cilindrada,
			Integer numeroDePlazas, String categoriaAmbiental,int taraMaxima,int galibo) {
		super(marca, modelo, color, tipoDeCombustible, cilindrada, numeroDePlazas, categoriaAmbiental);
		this.taraMaxima=taraMaxima;
		this.galibo=galibo;
	}
	public int getTaraMaxima() {
		return taraMaxima;
	}
	public void setTaraMaxima(int taraMaxima) {
		this.taraMaxima = taraMaxima;
	}
	public int getGalibo() {
		return galibo;
	}
	public void setGalibo(int galibo) {
		this.galibo = galibo;
	}
	

}
