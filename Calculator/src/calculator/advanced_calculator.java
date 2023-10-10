package calculator;

import java.util.Scanner;

/**
 *
 * @author Hewlett Packard
 */
public class base_calculator {
    Scanner leer = new Scanner(System.in);
    public double multi(){
        
        System.out.println(" Digite dos numeros ");
        double b = leer.nextDouble();
        double a = leer.nextDouble();
        
        return b = (b * a);
    }
    public double division(){
        
        System.out.println(" Digite dos numeros ");
        double b = leer.nextDouble();
        double a = leer.nextDouble();

        if(a != 0){
           b = (b / a);
        }else{
          b = (b/1)
        }
      return b
        
    }
    
}
