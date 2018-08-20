import java.util.*;
public class test {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a number :");
	int n=in.nextInt();
	if(n>0 && n%2==0)
	{
		System.out.println("EVEN");
	}
	else if(n>0 && n%2!=0){
		System.out.println("ODD");
	}
	else {
		System.out.println("INVALID");
	}
}
}
