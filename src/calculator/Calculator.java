/* GOMEZ Nathanael  
 * TP0*
   Exo 3
   27 septembre 2021
*/
package calculator;

import java.util.Scanner;

/**
 *
 * @author Natha
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operaor:\n1)add\n2)substract\n3)multiply\n4)divide\n5)modulo");
      int operateur; 
      Scanner sc= new Scanner(System.in);
      System.out.println("\nQuel operation souhaitez-vous faire? :");
      operateur=sc.nextInt();
      if (operateur<=0 || operateur>=6){
        System.out.println("\nErreur!");
        System.exit(0);
    }
      int operande1;
      System.out.println("\nEntrer le premier nombre :");
      operande1=sc.nextInt();
      
      int operande2;
      System.out.println("\nEntrer le second nombre :");
      operande2=sc.nextInt();
     
       int resultat=0;
       
     
    
       
       switch(operateur){
           case 1 -> resultat=operande1+operande2;
           case 2 -> resultat=operande1-operande2;
           case 3 -> resultat=operande1*operande2;
           case 4 -> resultat=operande1/operande2;
           case 5 -> resultat=operande1%operande2;
       }
      
       System.out.println("le résultat est " +resultat);
       
