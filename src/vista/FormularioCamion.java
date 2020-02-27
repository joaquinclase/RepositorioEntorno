package vista;
import modelo.Camion;
import java.util.Scanner;

public class FormularioCamion {
	Scanner teclado = new Scanner(System.in);
	
	public Camion pideDatos() {
		Camion ca = new Camion();
		
		System.out.println("Cual es la marca del vehiculo:");
		ca.setMarca(teclado.nextLine());
		System.out.println("Modelo del vehiculo:");
		ca.setModelo(teclado.nextLine());
		System.out.println("color del vehiculo");
		ca.setColor(teclado.nextLine());
		System.out.println("Tipo de combustible:");
		ca.setTipoDeCombustible(teclado.nextLine());
		System.out.println("Cilindrada:");
		ca.setCilindrada(teclado.nextInt());
		System.out.println("Numero de plazas:");
		ca.setNumeroDePlazas(teclado.nextInt());
		teclado.nextLine();
		System.out.println("Categoria ambiental:");
		ca.setCategoriaAmbiental(teclado.nextLine());
		System.out.println("Tara maxima:");
		ca.setTaraMaxima(teclado.nextInt());
		System.out.println("Galibo:");
		ca.setGalibo(teclado.nextInt());
		return ca;
		
	}
	
	public void muestraDatos(Camion ca) {
		System.out.println("Marca: "+ca.getMarca());
		System.out.println("Modelo: "+ca.getModelo());
		System.out.println("Color: "+ca.getColor());
		System.out.println("Tipo De Combustible: "+ca.getTipoDeCombustible());
		System.out.println("Cilindrada: "+ca.getCilindrada());
		System.out.println("Numero de Plazas: "+ca.getNumeroDePlazas());
		System.out.println("Categoria Ambiental: "+ca.getCategoriaAmbiental());
		System.out.println("Tara Maxima: "+ca.getTaraMaxima());
		System.out.println("Galibo: "+ca.getGalibo());
		
	}
	
}
