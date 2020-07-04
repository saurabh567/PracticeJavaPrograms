package collection.concept;

public class Student {

	private String name;
	private int rollNo;
	private boolean opt;
	
	public Student(String nam, int rolNo, boolean option) {
		super();
		this.name = nam;
		this.rollNo = rolNo;
		this.opt = option;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public boolean isOpt() {
		return opt;
	}
	public void setOpt(boolean opt) {
		this.opt = opt;
	}
	
	
}
