package collection.concept;

public class CollegeStudent extends Student {
	
	
	private String branch;
	private String name;
	
	public CollegeStudent(String nam, int rolNo, boolean option) {
		super(nam, rolNo, option);
		// TODO Auto-generated constructor stub
	}

	public CollegeStudent(String nam, int rolNo, boolean option, String branch, String collegeName) {
		super(nam, rolNo, option);
		this.branch = branch;
		this.name = collegeName;
		super.setName(collegeName + super.getName());
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
