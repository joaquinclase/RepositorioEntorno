package modelo;

public class Vehiculo {
	protected String marca;
	protected String modelo;
	protected String color;
	protected String tipoDeCombustible;
	protected int cilindrada;
	protected int numeroDePlazas;
	protected String categoriaAmbiental;
	
	public Vehiculo() {
		this.marca="";
		this.modelo="";
		this.color="";
		this.tipoDeCombustible="";
		this.cilindrada=0;
		this.numeroDePlazas=0;
		this.categoriaAmbiental="";
	}
	public Vehiculo(String marca, String modelo, String color, String tipoDeCombustible, int cilindrada,int numeroDePlazas, String categoriaAmbiental) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipoDeCombustible = tipoDeCombustible;
		this.cilindrada = cilindrada;
		this.numeroDePlazas = numeroDePlazas;
		this.categoriaAmbiental = categoriaAmbiental;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipoDeCombustible() {
		return tipoDeCombustible;
	}
	public void setTipoDeCombustible(String tipoDeCombustible) {
		this.tipoDeCombustible = tipoDeCombustible;
	}
	public Integer getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}
	public Integer getNumeroDePlazas() {
		return numeroDePlazas;
	}
	public void setNumeroDePlazas(Integer numeroDePlazas) {
		this.numeroDePlazas = numeroDePlazas;
	}
	public String getCategoriaAmbiental() {
		return categoriaAmbiental;
	}
	public void setCategoriaAmbiental(String categoriaAmbiental) {
		this.categoriaAmbiental = categoriaAmbiental;
	}
	
	
	

}
