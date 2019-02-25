package practice14.common;

public class DBCourse implements Course {

	public String getCourseName() {
		return "DB基礎";

	}

	public String[] getCourseUnit() {
		String [] str = {"DB基礎","SQL基礎","正規化正規化","SQL応用"};
		return str;
	}



}
