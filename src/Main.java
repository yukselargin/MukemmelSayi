import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int total=0,i;
        String correct="";

        System.out.print("Bir sayı giriniz: ");
        int n= input.nextInt();

        for(i=1;i<n;i++){
            if(n%i==0){
                total+=i;
            }
        }
        if(n==total && n!=1){
            correct= "Mükemmel sayıdır";
        }else{
            correct= "Mükemmel sayı değildir";
        }
        System.out.println(n+" "+correct);
    }
}