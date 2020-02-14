package modelo;
public class Moto extends Vehiculo{
	private String tipoDeMoto;
	private int numeroDeRuedas;
	public Moto() {
		this.marca="";
		this.modelo="";
		this.color="";
		this.tipoDeCombustible="";
		this.cilindrada=0;
		this.numeroDePlazas=0;
		this.categoriaAmbiental="";
		this.tipoDeMoto="";
		this.numeroDeRuedas=0;
	}
	public Moto(String marca, String modelo, String color, String tipoDeCombustible, Integer cilindrada,
			Integer numeroDePlazas, String categoriaAmbiental,String tipoDeMoto,int numeroDeRuedas) {
		super(marca, modelo, color, tipoDeCombustible, cilindrada, numeroDePlazas, categoriaAmbiental);
		this.tipoDeMoto=tipoDeMoto;
		this.numeroDeRuedas=numeroDeRuedas;
		
	}
	public String getTipoDeMoto() {
		return tipoDeMoto;
	}
	public void setTipoDeMoto(String tipoDeMoto) {
		this.tipoDeMoto = tipoDeMoto;
	}
	public Integer getNumeroDeRuedas() {
		return numeroDeRuedas;
	}
	public void setNumeroDeRuedas(Integer numeroDeRuedas) {
		this.numeroDeRuedas = numeroDeRuedas;
	}
	

}
