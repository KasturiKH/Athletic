package com.xworkz.athelet.constant;

public enum MySqlPropertie{
	
	URL("jdbc:mysql://localhost:3306/Athelet"), USERNAME("root"), PASSWORD("Kasturi@123");

	private String val;

	private MySqlPropertie(String val) 
	{
		this.val = val;
	}

	public String getVal() {
		return val;

}
}
