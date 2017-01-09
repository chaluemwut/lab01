package rmuti.test;

import org.fluttercode.datafactory.impl.DataFactory;

public class App {

	public static void main(String[] args) {
		
		
		StudentOperation obj = new StudentOperation();
		
		
		
		DataFactory df = new DataFactory();
		Student studentList[] = new Student[10];
		for (int i = 0; i < studentList.length; i++) {
			Student student = new Student();
			student.setName(df.getFirstName());
			student.setSurName(df.getLastName());
			studentList[i] = student;
		}

		for (int i = 0; i < studentList.length; i++) {
			Student student = studentList[i];
			System.out.println(student.getName());
		}

	}
}
