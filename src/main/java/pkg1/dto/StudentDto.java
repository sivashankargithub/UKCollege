package pkg1.dto;

import pkg1.entity.StudentEntity;

public class StudentDto {
	private long locationId;
	private StudentEntity student;
	
	public long getLocationId() {
		return locationId;
	}
	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}
	public StudentEntity getStudent() {
		return student;
	}
	public void setStudent(StudentEntity student) {
		this.student = student;
	}
}
