package lab;

class student{
	String usn;
	String name;
	String branch;
	long phno;
	float percentage;
	student(String usn,String name,String branch,long phno,float percentage)
	{
		this.usn=usn;
		this.name=name;
		this.branch=branch;
		this.phno=phno;
		this.percentage=percentage;
	}
	public void display()
	{
		System.out.println("USN"+usn);
		System.out.println("NAME:"+name);
		System.out.println("BRANCH:"+branch);
		System.out.println("PHNO: "+phno);
		System.out.println("PERCENTAGE: " + percentage);
		System.out.println("-------------------------");
	}
}

public class pg5 {

	public static void main(String[] args) {
	 student std1 = new student("$$#$","manoj","cse",342432422,84.34344f);
	 student std2 = new student("$$#$","manoj","cse",342432432,84.34344f);
	 std1.display();
	 std2.display();
	}

}
