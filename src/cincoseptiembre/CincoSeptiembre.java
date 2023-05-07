/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cincoseptiembre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author suare
 */
public class CincoSeptiembre {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));       
       System.out.println("Ingrese 3 cadenas una cadena: ");   
       cadena c1=new cadena(br.readLine());
       cadena c2=new cadena(br.readLine());
       cadena c3=new cadena(br.readLine());
       cadena comparadora=new cadena ("");
       
       System.out.println("Primer cadena convertida: "+c1.convertir());
       System.out.println("La primera cadena termina en '.edu.co'?: "+c1.edu());      
       System.out.println("Son iguales la primera y la segunda?: "+c1.comparar(c2.getC1())); 
       System.out.println("Son iguales la primera y la segunda sin contar mayusculos o minusculas?: "+c1.comprarsinminmay(c2.getC1())); 
       System.out.println("La primera cadena comienza con 'http://'?: "+c1.http());
       System.out.println("La primera mitad de la primera cadena es: "+c1.primeramitad());
       System.out.println("La segunda mitad de la primera cadena es: "+c1.segundamitad());
       System.out.println("La primera cadena en mayusculas es: "+c1.cambiaramayusculas());
       System.out.println("La primera cadena en minusculas es: "+c1.cambiaraminusculas());   
       
       
       for(int i=0;i<3;i++)
       {       
        if(c1.odenar(c2.getC1())>0)
            {
                comparadora.setC1(c1.getC1());
                c1.setC1(c2.getC1());
                c2.setC1(comparadora.getC1());
            }
        if(c2.odenar(c3.getC1())>0)
            {
                comparadora.setC1(c2.getC1());
                c2.setC1(c3.getC1());
                c3.setC1(comparadora.getC1());
            }
       }       
       System.out.println("El orden de las cadenas es: ");
       System.out.println(c1.getC1());
       System.out.println(c2.getC1());
       System.out.println(c3.getC1());
          
       
    }
    
}

/*
        String c1="Santo";
        String c2="Tomas";
        String c3= c1+c2;
        String c4=2+"sedes"+c3;
        System.out.println(c3+"----"+c4);
        // TODO code application logic here
        String br;
        String br2;
        br=2+4+"Martes";
        br2=2+(4+"Martes");
        System.out.println(br+"---"+br2);
*/