package com.Encapsulation;

class Account
{
	private long acc_no;
	
	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	private String name,email;
	
	private float amount;
}



public class Encap_exp {

	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.setName("ram");
		
		acc.setAcc_no(35365333);
		
		acc.setEmail("shgdhgf");
		
		acc.setAmount(20000f);
		
		System.out.println(acc.getAcc_no()+ " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
		
		// TODO Auto-generated method stub

	}

}
