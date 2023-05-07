/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cincoseptiembre;

/**
 *
 * @author suare
 */
public class cadena {
    private String c1;
    
    public cadena(String c1) 
    {
        this.c1 = c1;    
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    
    public String convertir()
            {
            return c1.replace('a','4').replace('e','3').replace('i','1').replace('o','0').replace('u','v')
                     .replace('A','4').replace('E','3').replace('I','1').replace('O','0').replace('U','v');
            }
    
    public boolean edu()
            {
            boolean comp=false;
            comp=c1.endsWith(".edu.co")||c1.endsWith(".EDU.CO");
            return comp;
            }
    
    public int odenar(String c2)
            {
                return c1.compareTo(c2);
            }
    
    public boolean comparar(String c2)
    {
        return c1.equals(c2);
    }
    
    public boolean comprarsinminmay(String c2)
    {
        return c1.equalsIgnoreCase(c2);
    }
            
            
    
    public boolean http()
    {
        boolean comp=false;
        comp=c1.startsWith("http://")||c1.startsWith("HTTP://");
        return comp;
    }
    
    public String primeramitad()
    {
        String c2=null;
        int mitad;
        mitad=(c1.length())/2;   
        c2=c1.substring(0,mitad);
        return c2;
    }
    
    public String segundamitad()
    {
        String c2=null;
        int mitad;
        mitad=(c1.length())/2;
        c2=c1.substring(mitad);
        return c2;
    }
    
    public String cambiaramayusculas()
    {
        
        return c1.replace('a','A').replace('b','B').replace('c','C').replace('d','D').
                  replace('e','E').replace('f','F').replace('g','G').replace('h','H').
                  replace('i','I').replace('j','J').replace('k','K').replace('l','L').
                  replace('m','M').replace('n','N').replace('ñ','Ñ').replace('o','O').
                  replace('p','P').replace('q','Q').replace('r','R').replace('s','S').
                  replace('t','T').replace('u','U').replace('v','V').replace('w','W').
                  replace('x','X').replace('y','Y').replace('z','Z');
    }
    
    public String cambiaraminusculas()
    {
        
        return c1.replace('A','a').replace('B','b').replace('C','c').replace('D','d').
                  replace('E','e').replace('F','f').replace('G','g').replace('H','h').
                  replace('I','i').replace('J','j').replace('K','k').replace('L','l').
                  replace('M','m').replace('N','n').replace('Ñ','ñ').replace('O','o').
                  replace('P','P').replace('Q','q').replace('R','r').replace('S','s').
                  replace('T','t').replace('U','u').replace('V','v').replace('W','w').
                  replace('X','x').replace('Y','y').replace('Z','z');
    }
}
