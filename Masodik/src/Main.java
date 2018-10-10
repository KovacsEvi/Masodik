import org.omg.Messaging.SyncScopeHelper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. feladat:
		for (int i=0;i<args.length;i++)
		{
			System.out.print(Integer.parseInt(args[i]) +", ");
		}
		//2.feladat:
		System.out.println();
		for (int i=1;i<20;i++) {
			if (i%2==0)
			System.out.print(i+", ");
			
		}
		
		//3. feladat:
		System.out.println();
		for (int i=Integer.parseInt(args[0]);i<Integer.parseInt(args[1]);i++)
		{
			if(i%3==0)
			System.out.println(i);
		}
		//4.feladat
		System.out.println();
		int a=Integer.parseInt(args[0]);
		int oszto=0;
		for (int i=a; i>0;i--)
		{
			if (a%i==0)
			System.out.print(i+", ");
			oszto++;
		}
		if (oszto==2)
		{
			System.out.println("a szám prímszám");
		}else System.out.println("nem prímszám");
		
		//5 feladat
		System.out.println();
		if(args.length==2) {
			String szo=args[8];
			int c=Integer.parseInt(args[0]);
			for(int i=0;i<c;i++) {
				for(int j=0;j<i;j++) {
					System.out.print(" ");
				}
				System.out.println(szo);
			}
		}
		
		
		
		System.out.println();
				
		//6 feladat
		System.out.println();
		int b=Integer.parseInt(args[0]);
		
		for (int i=a; i>0;i--)
		{
			if (a%i==0)
			System.out.print(i+", ");
		}
		
	}

}
