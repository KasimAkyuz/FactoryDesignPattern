package Entity;

import Factory.MobilePhone;

public class SamsungNote8 implements MobilePhone{
	
	private String phoneModel;
	private String battary;
	private int size;
	
	
	@Override
	public String getmodelInfo() {
		
		return null;
	}
	@Override
	public String getBattary() {
		
		return null;
	}
	@Override
	public int getSize() {
		
		return 0;
	}
	public SamsungNote8(String phoneModel, String battary, int size) {
	
		this.phoneModel = phoneModel;
		this.battary = battary;
		this.size = size;
	}
	@Override
	public String toString() {
		return "SamsungS8 [phoneModel=" + phoneModel + ", battary=" + battary + ", size=" + size + "]";
	}
	
		
	

}
