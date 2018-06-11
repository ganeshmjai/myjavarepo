package test;

public class Myown {
	
	public Myown(){
		System.out.println("constructor");
	}
	Subclass sb=new Subclass();
	static int f=5;
	
	public static void main(String[] args) {
		
		
		Myown obj =new Myown();
		for(int i=1;i<=7;i=i+2)
		{
			for(int j=7;j>=i;j=j-2){
				System.out.print(j);
			}
			System.out.println();	
			
		}
				
		
		int x=0;int y=1;
			System.out.print(x+" "+y+" ");
		for (int i=1;i<=10;i++){
			int z=x+y;
			System.out.print(z+" ");
			x=y;
			y=z;
		}
		System.out.println();
		for(int i=1;i<=4;i++)
		{
			for (int j=i;j<=4;j++){
			System.out.print(" ");
			}
			for(int a=1;a<=i;a++){
				System.out.print(a);
			}
			for (int j=1;j<=i-1;j++){
				System.out.print(j);
				}
				for(int a=i;a<=i-1;a++){
					System.out.print(" ");
				}
		
			System.out.println();
		}
		obj.abtracttest();
		f=10;
		System.out.println(obj.f);
	}
	
	public void abtracttest(){
		f=16;
		sb.secondhigh();
		sb.abstmeth2(2,3);
		sb.abstmeth2();
		sb.abstmeth2(f);
		
	}

}

/*
   1
  121
 12321
1234321

011235813
*/