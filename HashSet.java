import java.util.HashSet;
import java.util.Scanner;
public class main{
	public static void main(String[]args){
		HashSet<String>students=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 students names:");
		for(int i=0;i<5;i++){
			String name=sc.nextLine();
			students.add(name);
		}
	}
}