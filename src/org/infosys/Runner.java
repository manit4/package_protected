package org.infosys;



//import org.infosys.controller.Human;
//
//class SuperHuman extends Human {
//	
//	int studying() {//inside the studying method, I could access the protected member from the different package through sub-class
//		
//		iq = iq + 5;
//		
//		return iq;
//	}
//}
//
//public class Runner {
//
//public static void main(String[] args) {
//	
//	SuperHuman sh = new SuperHuman();
//	
//	int iq = sh.studying();
//	
//	System.out.println("The IQ of SuperHuman object is "+iq);
//	
//	System.out.println(sh.iq);//you can not access the protected member outside the package directly...That is why I got the iq
//								//returned from the studying method of SuperHuman class...
//
//	
//
//}
//
//}

////--------------this is the second version-------------------
//
//import org.infosys.controller.Human;//for this below program, I need to access the Human class of different package so import
//					//statement is required...
//
//public class Runner {
//	
//	public static void main(String[] args) {
//		
//		Human h = new Human();
//		
//		System.out.println(h.iq);//you can not access the variable "iq" since the variable declared is protected and protected 
//							//member can not be accessed outside its package without sub-class...
//		
//	}
//
//}

//-------------------first version and in the first version, no imports are required since the Human class which I am trying to access
// from the Runner class are both in the same package...------------

//public class Runner {
//	
//	public static void main(String[] args) {
//		
//		Human h = new Human();
//		
//		System.out.println(h.value);//I could access the protected variable of Human class since protected keyword says
//				//you can access me inside the package as well as outside the package. If outside the package then you should 
//				//access through sub-class...
//				//I accessed the protected keyword since the Human class I am trying to access is in the same package as Runner class...
//		
//		
//	}
//
//}
