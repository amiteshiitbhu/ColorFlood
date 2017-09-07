package com.amitesh.colorflood;

import java.util.ArrayList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Main1 {
	public static void main(String[] args)  {

		
			
			    ScriptEngineManager mgr = new ScriptEngineManager();
			    ScriptEngine engine = mgr.getEngineByName("JavaScript");
			    String foo = "1+2-4*5";
			    try {
					System.out.println(engine.eval(foo));
				} catch (ScriptException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
		

		// int a = s.length();
		// System.out.println(a);
		// int num = 0;
		// for (int i = 0; i < s.length(); i++) {
		// if ((int) (s.charAt(i)) == 43) {
		// num = num + ((int) s.charAt(i - 1) - '0');
		// } else {
		// if (i == s.length() - 1) {
		// num = num + ((int) s.charAt(s.length() - 1) - '0');
		// }
		//
		// }
		// if ((int) (s.charAt(i)) == 42) {
		// num = num + ((int) s.charAt(i - 1) - '0')
		// * ((int) s.charAt(i + 1) - '0');
		// } else {
		// if (i == s.length() - 1) {
		// num = num * ((int) s.charAt(s.length() - 1) - '0');
		// }
		//
		// }
		// if ((int) (s.charAt(i)) == 45) {
		// num = num - ((int) s.charAt(i + 1) - '0');
		// } else {
		// if (i == s.length() - 1) {
		// num = num - ((int) s.charAt(s.length() - 1) - '0');
		// }
		//
		// }
		// if ((int) (s.charAt(i)) == 47) {
		// num = num / ((int) s.charAt(i - 1) - '0');
		// } else {
		// if (i == s.length() - 1) {
		// num = num
		// + (((int) s.charAt(s.length() - 1) - '0') / ((int) s
		// .charAt(s.length() - 1) - '0'));
		// }
		//
		// }
		// }
		// System.out.println(num);

		// int num = 0;
		// for (int i = 0; i < s.length(); i++) {
		// int a = (int) s.charAt(i) - '0';
		// switch (a) {
		// case 1:
		// num = num + a;
		// break;
		// case 2:
		// num = num + a;
		// break;
		// case 3:
		// num = num + a;
		// break;
		// case 4:
		// num = num + a;
		// break;
		// case 5:
		// num = num + a;
		// break;
		// case 6:
		// num = num + a;
		// break;
		// case 7:
		// num = num + a;
		// break;
		// case 8:
		// num = num + a;
		// break;
		// case 9:
		// num = num + a;
		// break;
		// case 0:
		// num = num + a;
		// break;
		// case -5:
		// num = num + a;
		// break;
		// case -3:
		// num = num - a;
		// break;
		// case -6:
		// num = num * a;
		// break;
		// case -1:
		// num = num / a;
		// break;
		// }
		// }
		// System.out.println(num);
		//
		// }
}
}
