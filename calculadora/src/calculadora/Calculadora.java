/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author BRAYAN
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Calcular micalculadora=new Calcular(10,2);
//aqui el 10 se pasa al operando 1 y el 2 al operando 2
int suma=micalculadora.sumar();
System.out.println("La suma es:"+suma);
    }

}
