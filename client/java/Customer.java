package client.java;

public class Customer {
	public void payBill() {
		System.out.println("pbill paid");
	}
	public static void main(String args[]) {
		Customer c = new Customer();
		c.payBill();
	}
}
