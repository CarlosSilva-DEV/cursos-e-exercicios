package entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student implements Comparable<Student> {
	private Integer code;
	private Set<Course> courses = new HashSet<>();
	
	// Construtor
	public Student() {
	}

	public Student(Integer code) {
		this.code = code;
	}
	
	// getters e setters
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	
	public Set<Course> getCourses() {
		return courses;
	}

	// hascode e equals
	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(code, other.code);
	}
	
	// metodos
	public void enroll(Course course) {
		courses.add(course);
	}

	@Override
	public int compareTo(Student other) {
		return code.compareTo(other.getCode());
	}
}
