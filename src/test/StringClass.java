package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringClass {

	public static void main(String[] args) throws Exception {
		System.out.println("enter the emailid");
		InputStreamReader ipt = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(ipt);
		String emailipnt = input.readLine();
		if (emailipnt.contains("@") && emailipnt.contains(".")) {
			String[] emailsplit = emailipnt.split("@");
			/*String[] emailsplit = emailipnt.split(".");*/
			System.out.println(emailsplit.length);
			if (emailsplit.length == 2) {
				System.out.println("valid email");

			} else {
				System.out.println("emailid hav more than one @");
			}
		} else {
			System.out.println("not valid email");
		}
	}
	
	public void monosubstrin(){
		String[] strarr={"13131313113"};
	}

}
