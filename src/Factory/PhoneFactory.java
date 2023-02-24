package Factory;

import Entity.SamsungNote8;
import Entity.SamsungS8;

/*this class return a phone without create a new Object  */


public class PhoneFactory {
	public static MobilePhone getPhone(String phoneModel,String battInfo,int size) {
		
		MobilePhone phone;
		
		if("SamsungS8".equalsIgnoreCase(phoneModel)) {
			phone = new SamsungS8(phoneModel, battInfo, size);
			
		}
		else if("SamsungNote8".equalsIgnoreCase(phoneModel)) {
			phone = new SamsungNote8(phoneModel, battInfo, size);
		}
		else {
			throw new RuntimeException("Insert valid phone model");
		}
			
		return phone;
		
	}	
}
