package vista;
import modelo.Camion;
import modelo.Coche;
import java.util.Scanner;
public class FormularioCoche {
	Scanner teclado = new Scanner(System.in);
	
	public Coche pideDatos() {
		Coche co = new Coche();
		
		
		System.out.println("Cual es la marca del vehiculo:");
		co.setMarca(teclado.nextLine());
		System.out.println("Modelo del vehiculo:");
		co.setModelo(teclado.nextLine());
		System.out.println("color del vehiculo");
		co.setColor(teclado.nextLine());
		System.out.println("Tipo de combustible:");
		co.setTipoDeCombustible(teclado.nextLine());
		System.out.println("Cilindrada:");
		co.setCilindrada(teclado.nextInt());
		System.out.println("Numero de plazas:");
		co.setNumeroDePlazas(teclado.nextInt());
		System.out.println("Categoria ambiental:");
		co.setCategoriaAmbiental(teclado.nextLine());
		System.out.println("Numero de puertas:");
		co.setNumeroDePuertas(teclado.nextInt());
		System.out.println("Descapotable:(SI O NO)");
		if("si".equals(teclado.nextLine())) {
			co.setDescapotable(true);
		}else {
			co.setDescapotable(false);
		}
		return co;
	}
	public void muestraDatos(Coche co) {
		System.out.println("Marca: "+co.getMarca());
		System.out.println("Modelo: "+co.getModelo());
		System.out.println("Color: "+co.getColor());
		System.out.println("Tipo De Combustible: "+co.getTipoDeCombustible());
		System.out.println("Cilindrada: "+co.getCilindrada());
		System.out.println("Numero de Plazas: "+co.getNumeroDePlazas());
		System.out.println("Categoria Ambiental: "+co.getCategoriaAmbiental());
		System.out.println("Numero de Puertas: "+co.getNumeroDePuertas());
		System.out.println("Galibo: "+co.isDescapotable());
		
	}	
	
}
