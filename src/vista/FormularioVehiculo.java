package vista;
import modelo.Vehiculo;
import java.util.Scanner;



public class FormularioVehiculo {
	Scanner teclado = new Scanner(System.in);
	
	
	public Vehiculo pideDatos(Vehiculo c) {
		Vehiculo v = new Vehiculo();
		
		System.out.println("Cual es la marca del vehiculo:");
		v.setMarca(teclado.nextLine());
		System.out.println("Modelo del vehiculo:");
		v.setModelo(teclado.nextLine());
		System.out.println("color del vehiculo");
		v.setColor(teclado.nextLine());
		System.out.println("Tipo de combustible:");
		v.setTipoDeCombustible(teclado.nextLine());
		System.out.println("Cilindrada:");
		v.setCilindrada(teclado.nextInt());
		System.out.println("Numero de plazas:");
		v.setNumeroDePlazas(teclado.nextInt());
		System.out.println("Categoria ambiental:");
		v.setCategoriaAmbiental(teclado.nextLine());
		return c;
	}
	
	
	
}
