package hr;

public class Hr {
	String employeename="ganesh";
	String managername="praveen";
	public void employee() {
		System.out.println("employee name is: "+employeename);
	}
	public void manager() {
		System.out.println("manager name is: "+managername);
	}
	public static void main(String args[]) {
		Hr h = new Hr();
		h.employee();
		h.manager();
	}

	

}
