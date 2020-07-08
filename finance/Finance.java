package finance;
public class Finance{
		int salary=25000;
		int pf=1200;
		int hra=500;
		public void aboutSalary(){
			System.out.println("salary is: "+salary);
			System.out.println("pf is: "+pf);
			System.out.println("hra is: "+hra);
			
		}
		public static void main(String args[]){
			Finance f = new Finance();
			f.aboutSalary();
		}
}
