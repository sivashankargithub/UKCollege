package pkg1.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="studentrooms")
public class StudentRoomsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private StudentEntity studentId;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "room_id")
	private RoomsEntity roomsId;
	
	public StudentRoomsEntity(long id, StudentEntity studentId, RoomsEntity roomsId) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.roomsId = roomsId;
	}
	public StudentRoomsEntity() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public StudentEntity getStudentId() {
		return studentId;
	}
	public void setStudentId(StudentEntity studentId) {
		this.studentId = studentId;
	}
	public RoomsEntity getRoomsId() {
		return roomsId;
	}
	public void setRoomsId(RoomsEntity roomsId) {
		this.roomsId = roomsId;
	}
}
