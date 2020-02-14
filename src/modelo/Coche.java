package modelo;
public class Coche extends Vehiculo {
	private int numeroDePuertas;
	private boolean descapotable;
	public Coche() {
		this.marca="";
		this.modelo="";
		this.color="";
		this.tipoDeCombustible="";
		this.cilindrada=0;
		this.numeroDePlazas=0;
		this.categoriaAmbiental="";
		this.numeroDePuertas=0;
		this.descapotable=false;
	}
	public Coche(String marca, String modelo, String color, String tipoDeCombustible, Integer cilindrada,
			Integer numeroDePlazas,String categoriaAmbiental,int numeroDePuertas,boolean descapotable){
		super(marca, modelo, color, tipoDeCombustible, cilindrada, numeroDePlazas, categoriaAmbiental);
		this.numeroDePuertas=numeroDePuertas;
		this.descapotable=descapotable;
	}
	public Integer getNumeroDePuertas() {
		return numeroDePuertas;
	}
	public void setNumeroDePuertas(Integer numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}
	public boolean isDescapotable() {
		return descapotable;
	}
	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	
	

}
