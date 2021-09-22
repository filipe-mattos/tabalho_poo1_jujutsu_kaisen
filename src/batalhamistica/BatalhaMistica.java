/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package batalhamistica;

/**
 *
 * @author Conexos
 */
public class BatalhaMistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Ser obj = new Feiticeiro("Teste",80,1.80);
       Ser obj2 = new Maldicao("Bob",280,3.20);

       System.out.println(obj.getNome());
       System.out.println(obj.getPeso());
       System.out.println(obj.getAltura());
       System.out.println(obj.getEnergia());

       System.out.println(obj2.getNome());
       System.out.println(obj2.getPeso());
       System.out.println(obj2.getAltura());
       System.out.println(obj2.getEnergia());




    }

}
