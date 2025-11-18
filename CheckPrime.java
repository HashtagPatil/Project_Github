import java.util.Scanner; 
public class CheckPrime{

	public static void main(String [] args){
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		boolean flag =true;
		for(int i=2;i<n/2;i++){
		   if(n%i==0){
		       flag =false;
			   break;
			}

		}
	if(flag==true){
		System.out.println("Its prime");
	}
	else{
		System.out.println("Its not prime");
	}
    }
}