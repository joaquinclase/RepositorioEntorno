package vista;

import modelo.Camion;
import modelo.Moto;
import java.util.Scanner;



public class FormularioMoto {
	Scanner teclado = new Scanner(System.in);
	
	public Moto pideDatos() {
		Moto m = new Moto();
		
		System.out.println("Cual es la marca del vehiculo:");
		m.setMarca(teclado.nextLine());
		System.out.println("Modelo del vehiculo:");
		m.setModelo(teclado.nextLine());
		System.out.println("color del vehiculo");
		m.setColor(teclado.nextLine());
		System.out.println("Tipo de combustible:");
		m.setTipoDeCombustible(teclado.nextLine());
		System.out.println("Cilindrada:");
		m.setCilindrada(teclado.nextInt());
		System.out.println("Numero de plazas:");
		m.setNumeroDePlazas(teclado.nextInt());
		teclado.nextLine();
		System.out.println("Categoria ambiental:");
		m.setCategoriaAmbiental(teclado.nextLine());
		do {
		System.out.println("Tipo de moto:(Custom,Deportiva o Squad)");
		m.setTipoDeMoto(teclado.nextLine());
		}while("Custom".equals(teclado.nextLine()) || "Deportiva".equals(teclado.nextLine()) || "Squad".equals(teclado.nextLine()));
		System.out.println("Numero de ruedas:");
		m.setNumeroDeRuedas(teclado.nextInt());
		return m;
	}
		public void muestraDatos(Moto m) {
			System.out.println("Marca: "+m.getMarca());
			System.out.println("Modelo: "+m.getModelo());
			System.out.println("Color: "+m.getColor());
			System.out.println("Tipo De Combustible: "+m.getTipoDeCombustible());
			System.out.println("Cilindrada: "+m.getCilindrada());
			System.out.println("Numero de Plazas: "+m.getNumeroDePlazas());
			System.out.println("Categoria Ambiental: "+m.getCategoriaAmbiental());
			System.out.println("Tipo de Moto: "+m.getTipoDeMoto());
			System.out.println("Galibo: "+m.getNumeroDeRuedas());
			
		}
}
