import java.util.Scanner;
class  arr{
	public static void main(String [] args){
		int n;
		int c=0;
		int cp=0;
		int jk=0;
		Scanner ob=new Scanner(System.in);
		System.out.println("enter the array length");
		n=ob.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			System.out.println("enter"+i+"value");
				 a[i]=ob.nextInt();
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++){
			if(a[i]>0){
				c++;
			}
			else if(a[i]<0){
				cp++;
			}
			else{
				jk++;
			}
		}
			System.out.println("posts"+c);
				System.out.println("negs"+cp);
					System.out.println("0s"+jk);
	}
}