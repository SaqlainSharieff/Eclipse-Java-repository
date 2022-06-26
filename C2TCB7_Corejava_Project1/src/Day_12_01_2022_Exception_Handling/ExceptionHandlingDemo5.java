package Day_12_01_2022_Exception_Handling;

public class ExceptionHandlingDemo5 extends Exception {

	int sid;

	ExceptionHandlingDemo5() {
	}

	public ExceptionHandlingDemo5(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Exception :: Student id not found!!";
	}

	@Override
	public String getMessage() {
		return "Student with id " + sid + " Not found!!";
	}

}