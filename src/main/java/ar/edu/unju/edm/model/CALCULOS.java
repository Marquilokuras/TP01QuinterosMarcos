package ar.edu.unju.edm.model;

import java.util.Scanner;
import org.springframework.stereotype.Component;
import java.util.*;

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
	  System.out.println("Ingrese una año por teclado: ");
	  int fecha = lectura.nextInt();

	  System.out.println(fecha);
	  
	  String Punto2 = "null";
      
      if(fecha%4 == 0) {
    	  if(fecha%100 != 0 || fecha%400 == 0) {
    		  return Punto2 = "Es un año Bisiesto";
    	  }else {
    		  Punto2 = "No es un Año Bisiesto"; 
    	  }
      }else {
    	  Punto2 = "No es un Año Bisiesto";
      }
     return Punto2;
 }

  public String ResolverPunto3() { 
	  String Punto3 ="null";
	  int cont = 0;
	  do{
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
		  cont++;
		}while(cont<5);
	return Punto3;  
  }
  
  public String ResolverPunto4() {
      String Punto4 = "null";
      boolean encontrado = true;
      do {
    	  Scanner num = new Scanner(System.in);
		  System.out.println("Ingrese una Numero Entero: ");
		  int punto = num.nextInt();
		  
		  if(punto>0 && punto<13) {
			  System.out.println("El Numero " + punto + " corresponde a un mes");
			  Punto4 = "El Numero " + punto + " corresponde a un mes"; 
		  }else {
			  System.out.println("El Numero " + punto + " No corresponde a un mes");
			  Punto4 = "El Numero " + punto + " NO corresponde a un mes"; 
			  encontrado = false;
		  }
      }while(encontrado != false);
      
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
 
  public String ResolverPunto6() {
      String Punto6 = "null";
      boolean encontrado = true;
      
      while(encontrado == true) {
    	  
    	  Scanner num = new Scanner(System.in);
    	  System.out.println("Ingrese una Numero Entero: ");
		  int punto = num.nextInt();
 		  
		  if(punto == 6) {
			  System.out.println("Alumno regularizado"); 
			  Punto6 = "Alumno regularizado";
		  }else {
			  if(punto >= 7 && punto <= 10) {
				  System.out.println("El alumno promociona"); 
				  Punto6 = "Alumno promociona";
			  }else {
				  if(punto < 6  && punto >= 1) {
					  System.out.println("El alumno desaprueba"); 
					  Punto6 = "Alumno desaprueba";
				  }else {
					  if(punto <= 0) {
						  System.out.println("Valor no valido"); 
						  Punto6 = "Valor no valido";
						  encontrado = false;
					  }
				  }
			  }
		}
		  
      }
      
     return Punto6;
  }
  
  /*public int ResolverPunto7() { //falta terminar 
	  int Punto7=0;
	  int serie = 1;
	  boolean sumar=true;
	  //String cadena="Serie: ";
	  int e=1;
	  int n = 0;
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
  }*/
  
  public String ResolverPunto8() { 
	  String Punto8 = "";
	  int resultado = 1;
	  int factorMultiplicador = 1;
	  
	  do {
		  resultado = numero1 * factorMultiplicador;
		  factorMultiplicador += 1;
		  Punto8 = Punto8 + resultado + " - "; 
		  System.out.println(Punto8);
	  }while((resultado + numero1)<=100);
	  
	  return Punto8;
  }
    
  public String ResolverPunto9() { 
      String Punto9 = "";
      int i = 320;
      
      for(i=320;i>=160;i=i-20) {
    	  Punto9 = Punto9 + i + " - ";
    	  System.out.println(Punto9);
      }
      
     return Punto9;
  } 
  
  public String ResolverPunto10() { 
	  String Punto10 = "";
	  int valor = 320;
	  
	  while(valor >= 160) {
		  Punto10 = Punto10 + valor + " - "; 
		  System.out.println(Punto10);
		  valor = valor - 20;
	  }
	  
	  return Punto10;
  }
  
  public String ResolverPunto11() { 
	  String Punto11 = "";
	  int valor = 320;
	  
	  do {
		  Punto11 = Punto11 + valor + " - "; 
		  System.out.println(Punto11);
		  valor = valor - 20;
	  }while(valor >= 160);
	  
	  return Punto11;
  }
  
  public double ResolverPunto12() {
      double Punto12;
      double g = 9.81;
      Punto12 = Math.sqrt((2 * numero1) / g );
      
     return Punto12;
  } 
  
  
}