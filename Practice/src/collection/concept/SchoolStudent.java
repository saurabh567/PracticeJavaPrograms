package collection.concept;

public class SchoolStudent extends Student{
	
	private String stream;
	private String schoolName;
	
	public SchoolStudent(String nam, int rolNo, boolean option, String stream, String schoolName) {
		super(nam, rolNo, option);
		this.stream = stream;
		this.schoolName = schoolName;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}	

}
