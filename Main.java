package School_Management;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher mellisa = new Teacher(2, "Mellisa", 700);
		Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(vanderhorn);

		Student tamasha = new Student(1, "Tamasha", 4);
		Student rakshith = new Student(2, "Rakshith Vasudev", 12);
		Student rabbi = new Student(3, "Rabbi", 5);
		List<Student> studentList = new ArrayList<>();

		studentList.add(tamasha);
		studentList.add(rabbi);
		studentList.add(rakshith);

		School ghs = new School(teacherList, studentList);

		Teacher megan = new Teacher(6, "Megan", 900);

		ghs.addTeacher(megan);

		tamasha.payFees(5000);
		rakshith.payFees(6000);
		System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

		System.out.println("------Making SCHOOL PAY SALARY----");
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("GHS has spent for salary to " + lizzy.getName()
				+ " and now has $" + ghs.getTotalMoneyEarned());

		vanderhorn.receiveSalary(vanderhorn.getSalary());
		System.out.println("GHS has spent for salary to " + vanderhorn.getName()
				+ " and now has $" + ghs.getTotalMoneyEarned());

		System.out.println(rakshith);
		mellisa.receiveSalary(mellisa.getSalary());
		System.out.println(mellisa);

		// Add more students and teachers here
		Student newStudent1 = new Student(4, "New Student 1", 8);
		Student newStudent2 = new Student(5, "New Student 2", 6);
		Teacher newTeacher1 = new Teacher(7, "New Teacher 1", 800);
		Teacher newTeacher2 = new Teacher(8, "New Teacher 2", 750);

		ghs.addStudent(newStudent1);
		ghs.addStudent(newStudent2);
		ghs.addTeacher(newTeacher1);
		ghs.addTeacher(newTeacher2);

		// Perform actions with the new students and teachers as needed

		// Example: Pay fees for new students
		newStudent1.payFees(3000);
		newStudent2.payFees(4000);

		// Example: Receive salary for new teachers
		newTeacher1.receiveSalary(newTeacher1.getSalary());
		newTeacher2.receiveSalary(newTeacher2.getSalary());

		// Example: Print the updated total money earned by the school
		System.out.println("Updated total money earned by the school: $" + ghs.getTotalMoneyEarned());

		// Example: Display the list of all teachers
		System.out.println("List of all teachers:");
		for (Teacher teacher : ghs.getTeachers()) {
			System.out.println(teacher);
		}

		// Example: Display the list of all students
		System.out.println("List of all students:");
		for (Student student : ghs.getStudents()) {
			System.out.println(student);
		}

		// Example: Check the total number of students and teachers
		System.out.println("Total number of students: " + ghs.getStudents().size());
		System.out.println("Total number of teachers: " + ghs.getTeachers().size());
	}

}
