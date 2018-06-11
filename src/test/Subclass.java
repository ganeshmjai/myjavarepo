package test;

public class Subclass extends myabstract {
	
	
	public Subclass(){
		System.out.println("subclass constructor");
	}

	public void secondhigh(){
		double arr[]={1,2,3,8.1,5,0,3,2,6,8,11,13,23,3,4,21,23.3,56};
		double tem;
		/*int[] arr2= new int[4];
		int arr3[]= new int[4];*/
		
		for (int i=0;i<=arr.length;i++){
			
			for (int j=i+1;j<arr.length;j++){
				if (arr[i]<arr[j]){
					tem=arr[i];
					arr[i]=arr[j];
					arr[j]=tem;					
							
			}
				
			}
						
		}
		for (int k=0;k<arr.length;k++){
			System.out.println(arr[k]);
		}
		System.out.println("second highest " + arr[1]);
		string_fns();
		
	}
		public void string_fns(){
		String str;
		str="abfafa fafafa fbvbcbfjkl klcd";
		System.out.println(str.length());
		System.out.println(str.substring(0, 2));
		String str2=str.toUpperCase();
		System.out.println(str2);
		System.out.println(str.charAt(10));
		System.out.println(str.indexOf("a"));
		int num =12345;
		int rem;
		while (num >0){
		rem=(num%10);
		num=num/10;
		System.out.print(rem);
		}
		System.out.println();
		}
		/*String str1="name";
		char[] ch=str1.toCharArray();
		int nch=ch.length;
		for(int i =0;i<nch;i++){
			for(int k=nch-1;k>0;k--)
			if(ch[i]==ch[k]){
				System.out.print(ch[i]+ch[k]);	
				System.out.println();
			}
		}*/
		

	


	
	public  void abstmeth2(){
		System.out.println("abstr");
	}
	public  void abstmeth2(int a){
		System.out.println(a);
	}
	public  void abstmeth2(int c, int b){
		System.out.println(c+b);
	}
	
	
}
