package stack;
import java.util.*;
public class countdigit { public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER DIGGIT:");
    int n=sc.nextInt();
    int count=0;
    while(n!=0){
        n=n/10;
        count +=1;
        
    }
    System.out.println("NO.OF DIGITS ARE :"+count);

}
    
}
