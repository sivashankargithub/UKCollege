package pkg1.entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="auths")
public class AuthSEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id")
	private StudentEntity studentId;
	private String junk1;
	private LocalDateTime lastLogin;
	
	public AuthSEntity() {
		super();
	}
	public AuthSEntity(long id, StudentEntity studentId, String junk1, LocalDateTime lastLogin) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.junk1 = junk1;
		this.lastLogin = lastLogin;
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
	public String getJunk1() {
		return junk1;
	}
	public void setJunk1(String junk1) {
		this.junk1 = junk1;
	}
	public LocalDateTime getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}
}
