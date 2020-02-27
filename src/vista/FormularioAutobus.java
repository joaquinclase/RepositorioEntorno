package vista;

import modelo.Autobus;
import modelo.Moto;

import java.util.Scanner;

public class FormularioAutobus {
	Scanner teclado = new Scanner(System.in);
	public Autobus pideDatos() {
		Autobus a = new Autobus();
		
		
		
		System.out.println("Cual es la marca del vehiculo:");
		a.setMarca(teclado.nextLine());
		System.out.println("Modelo del vehiculo:");
		a.setModelo(teclado.nextLine());
		System.out.println("color del vehiculo");
		a.setColor(teclado.nextLine());
		System.out.println("Tipo de combustible:");
		a.setTipoDeCombustible(teclado.nextLine());
		System.out.println("Cilindrada:");
		a.setCilindrada(teclado.nextInt());
		System.out.println("Numero de plazas:");
		a.setNumeroDePlazas(teclado.nextInt());
		System.out.println("Categoria ambiental:");
		a.setCategoriaAmbiental(teclado.nextLine());
		System.out.println("¿Es publico?: (Si o No)");
		if("si".equals(teclado.nextLine())) {
			a.setPublico(true);
		}else {
			a.setPublico(false);
		}
		System.out.println("Articulado: (Si o no)");
		if("si".equals(teclado.nextLine())) {
			a.setArticulado(true);
		}else {
			a.setArticulado(false);
		}
		System.out.println("Urbano: (Si o no)");
		if("si".equals(teclado.nextLine())) {
			a.setUrbano(true);
		}else {
			a.setUrbano(false);
		}
		return a;
	}
	public void muestraDatos(Autobus a) {
		System.out.println("Marca: "+a.getMarca());
		System.out.println("Modelo: "+a.getModelo());
		System.out.println("Color: "+a.getColor());
		System.out.println("Tipo De Combustible: "+a.getTipoDeCombustible());
		System.out.println("Cilindrada: "+a.getCilindrada());
		System.out.println("Numero de Plazas: "+a.getNumeroDePlazas());
		System.out.println("Categoria Ambiental: "+a.getCategoriaAmbiental());
		System.out.println("Publicidad: "+a.isPublico());
		System.out.println("Articulado: "+a.isArticulado());
		System.out.println("Urbano: "+a.isUrbano());
		
	}
}
