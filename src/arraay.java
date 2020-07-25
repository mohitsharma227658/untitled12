/*
an application to count total number of even elemnts in a given array
you have to create an array
then processs it
 */


public class arraay {
    public static void main(String[] args) {
        int[] arr = {11,23,44,56,78,98,65,45,3,,33,55,66,77,88,99,22,32,12,23};
        int count = 0;
        //processing the array
        for (int i= 0; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        //print the total number of even elemnts
        System.out.println("total even elemnts = " + count);
    }
}
/*
create an appliction to find \,sum of all elements stored on even index
 */



    public class arraay {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < ar.length; i += 2) {
            sum = sum + ar[i];
        }
    }
    System.out.println("sum of all even indexing" + sum);
}


        }



