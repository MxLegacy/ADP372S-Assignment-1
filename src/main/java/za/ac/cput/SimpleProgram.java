package za.ac.cput;

/**
 *
 * @author Tawfeeq Cupido
 */
public class SimpleProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here

        int     num1= 10009,
                num2= 2005,
                num3= 98755;

        if(num1> num2 && num1 > num3)
        {
            System.out.println(num1+ " is the largest number");
        }

        else if(num2> num1 && num2 > num3)
        {
            System.out.println(num2+ " is the largest number");
        }

        else
        {
            System.out.println(num3+ " is the largest number");
        }

    }

}