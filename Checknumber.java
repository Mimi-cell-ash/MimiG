/*Write a program that checks if a number is positive, negative, or zero.
👉 Example: if num = -4, the output should be Negative*/

public class CheckNumber{
    public static void main (String [] args){
        int i = -2;
        while (i <= 5){
            if (i > 0){
                System.out.println(i + "Number is positive");
            } else if (i < 0){
                System.out.println(i + "Number is negative");
            }else{
                System.out.println( i + "Number is zero");
            }
            i++;
            }
            }
        }