package vista;

import java.util.Scanner;

import modelo.Autobus;
import modelo.Camion;
import modelo.Coche;
import modelo.Moto;

/**
 * Clase que contiene el metodo menu
 * @author daniel.salas
 *
 */
public class Menu {
	/**
	 * Metodo menu que pide datos y muestra los datos
	 */
	public void menu() {
	int opcion;
	FormularioCoche c=new FormularioCoche();
	Coche co=new Coche();
	FormularioMoto mo=new FormularioMoto();
	Moto m=new Moto();
	FormularioCamion cam=new FormularioCamion();
	Camion ca=new Camion();
	FormularioAutobus au=new FormularioAutobus();
	Autobus a=new Autobus();
	do{
		Scanner t=new Scanner(System.in);
		System.out.println("¿Que quieres hacer?");
		System.out.println("1.Meter datos de un coche");
		System.out.println("2.Meter datos de una moto");
		System.out.println("3.Meter datos de un camion");
		System.out.println("4.Meter datos de un autobus");
		System.out.println("0.Salir");
		System.out.println("Que opcion quieres hacer: ");
		opcion=t.nextInt();
		switch(opcion) {
		case 1:
			co=c.pideDatos();
			c.muestraDatos(co);
			break;
		case 2:
			m=mo.pideDatos();
			mo.muestraDatos(m);
			break;
		case 3:
			ca=cam.pideDatos();
			cam.muestraDatos(ca);
			break;
		case 4:
			a=au.pideDatos();
			au.muestraDatos(a);
		case 0:
			System.out.println("Adios.");
			break;
			
		}
	}while(opcion!=0);
}
}
