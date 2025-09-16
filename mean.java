//A program that calculates the average of of 4 numerical inputs
public class mean{
    public static void average(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nexInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int sum = num1 + num2 + num3 + num4;
        int average = sum / 4;
        System.out.println("The average is:" + average);
    }
}