 package apnikaksha;

    import java.util.Scanner;
    
    public class hollowrhombus {public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("ENTER NO. OF ROWS:");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=6;j++){
            if(i==1 || i==n || j==1 || j==6){
            System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    }
    
        
    }
    

