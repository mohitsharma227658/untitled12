import java.util.Scanner;

public class accesfile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 integer values");

        int[] marks=new int[5];
        //printting this array to see default value
        for(int i = 0; i < marks.length ; i++){
            System.out.println(marks[]);
        }
        //intitialise array with user input
        for(int i = 0; i< marks.length; i++){
            marks[i]= sc.nextInt();
        }
        //printing this array to check user values
        for(int i = 0; i< marks.length; i++) {
            System.out.print(marks[i] + ",");
        }
    }
}
