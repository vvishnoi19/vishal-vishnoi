package apnikaksha;
import java.util.*;

public class pattren2 {
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("ENTER NO. OF ROWS");
    int n= sc.nextInt();
   for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
      if(j==1 || j==i || i==n){
        System.out.print("*");}
      else{
        System.out.print(" ");
      }
    }
    System.out.println();
   }
 }   
}
