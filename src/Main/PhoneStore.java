package Main;

import Factory.MobilePhone;
import Factory.PhoneFactory;

/* Phone Store uses phoneFactory to get new phone Object.
 Factory Design Pattern make it is that get a object without class we only use an interface  */


public class PhoneStore {

	public static void main(String[] args) {
		
		MobilePhone s8 = PhoneFactory.getPhone("SamsungS8","3600mah", 1200);
		MobilePhone note8 = PhoneFactory.getPhone("SamsungNote8","5400mah", 1700);
		
		System.out.println("Samsung s8 entity :");
		System.out.println(s8);
		
		System.out.println("Samsung note8 entity :");
		System.out.println(note8);
		

	}

}
