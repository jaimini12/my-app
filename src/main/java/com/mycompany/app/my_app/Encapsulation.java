package com.mycompany.app.my_app;

public class Encapsulation {
	public static void main(String[] args) {

		dept e = new dept();
		e.setdeptId(1001);
		System.out.println(e.getdeptId());
		e.setdeptId(1002);	
		System.out.println(e.getdeptId());
		}


}
class dept {
	private int deptId;

	public void setdeptId(int dId) {
		this.deptId = dId;
	}

	public int getdeptId() {
		return deptId;
	}
}