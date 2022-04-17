package ar.edu.unju.edm.model;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component

public class CALCULOS {

  private int numero1;
  private int numero2;

  public CALCULOS() {

  }

  public int getNumero1() {
      return numero1;
  }

  public void setNumero1(int numero1) {
      this.numero1 = numero1;
  }

  public int getNumero2() {
      return numero2;
  }

  public void setNumero2(int numero2) {
      this.numero2 = numero2;
  }

  public int ResolverPunto1() {
      int Punto1=1;
      
      for( int i = 1; i <= numero1; i++ ) {
          Punto1 *= i;
       }
  
     return Punto1;
  }
  
  
  public String ResolverPunto2() {
	  
	  Scanner lectura = new Scanner(System.in);
	  System.out.println("Ingrese una fecha por teclado: ");
	  int fecha = lectura.nextInt();

	  System.out.println(fecha);
	  
	  String Punto2 = "null";
      
      if(fecha%4 == 0) {
    	  if(fecha%100 != 0 || fecha%400 == 0) {
    		  return Punto2 = "Es un año Bisiesto";
    	  }else {
    		  Punto2 = "No es un Anio Bisiesto"; 
    	  }
      }else {
    	  Punto2 = "No es un Anio Bisiesto";
      }
     return Punto2;
 }

  
  public String ResolverPunto3() { //verlo mejor no anda repetitiva
	  String Punto3 ="null";
	  
	  Scanner num = new Scanner(System.in);
	  System.out.println("Ingrese una Numero Entero: ");
	  int punto = num.nextInt();
		  
	  if(punto%2==0) {
		  System.out.println("El Numero " + punto + " ingresado es Par");
		  Punto3 = "El Numero ingresado es Par";
	  }else {
		  System.out.println("El Numero " + punto + " ingresado es Impar");
		  Punto3 = "El Numero ingresado es Impar";
	  }

	return Punto3;  
  }
  
  
  public String ResolverPunto4() {
      String Punto4 = "null";
      
	      Scanner num = new Scanner(System.in);
		  System.out.println("Ingrese una Numero Entero: ");
		  int punto = num.nextInt();
		  
		  if(punto>0 && punto<13) {
			  System.out.println("El Numero " + punto + " corresponde a un mes");
		  }else {
			  System.out.println("El Numero " + punto + " No corresponde a un mes");
		  }
		  
     return Punto4;
  }

  public String ResolverPunto5() {
      String Punto5 = "null";
      
	  Scanner num = new Scanner(System.in);
	  System.out.println("Ingrese una Numero Entero: ");
	  int punto = num.nextInt();
		  
	  switch (punto) {
	  		case 1:  Punto5 = "Enero";
	                break;
	        case 2:  Punto5 = "Febrero";
	                break;
	        case 3:  Punto5 = "Marzo";
	        		break;
	        case 4:  Punto5 = "Abril";
	                break;
	        case 5:  Punto5 = "Mayo";
	             	break;
	        case 6:  Punto5 = "Junio";
	                break;
	        case 7:  Punto5 = "Julio";
	                break;
	        case 8:  Punto5 = "Agosto";
	                break;
	        case 9:  Punto5 = "Septiembre";
                     break;
	        case 10: Punto5 = "Octubre";
	            	 break;
	        case 11: Punto5 = "Noviembre";
                 	 break;
	        case 12: Punto5 = "Diciembre";
                	 break;
	        default: Punto5 = "No es un Mes";
	                 break;
	        }
	  System.out.println(Punto5);
     return Punto5;
  }
 
  public int ResolverPunto7() { //falta terminar
	  int Punto7=0;
	  int serie = 1;
	  boolean sumar=true;
	  //String cadena="Serie: ";
	  int e=1;
	  int n;
	  int i=2;
	  int j=40;
	  int elementos [];
	  
	  elementos = new int[n];
	  elementos[0]=1;
	  //cadena=cadena.concat(String.valueOf(serie) + "  ");
	  
	  for(int cont=0;cont==2;cont++) {
		  if(sumar==true){
		          serie+=4;
		          elementos[e]=serie;
		      }else{
		
		          serie-=2;
		          elementos[e]=serie;
		      }
		     
		      sumar=!sumar;
		      e++;
	  }
	
	  System.out.print("Serie a partir de array: ");
	  for ( j=0; j<elementos.length;j++) {
	      System.out.print(elementos[j]+ "  ");
	  }
	  return Punto7;
  }
}