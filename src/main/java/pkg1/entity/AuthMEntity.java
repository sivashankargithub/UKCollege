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
@Table(name="authm")
public class AuthMEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "staff_id")
	private MTeamEntity staffId;
	private String junk2;
	private LocalDateTime lastLogin;
	
	public AuthMEntity() {
		super();
	}

	public AuthMEntity(long id, MTeamEntity staffId, String junk2, LocalDateTime lastLogin) {
		super();
		this.id = id;
		this.staffId = staffId;
		this.junk2 = junk2;
		this.lastLogin = lastLogin;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public MTeamEntity getStaffId() {
		return staffId;
	}

	public void setStaffId(MTeamEntity staffId) {
		this.staffId = staffId;
	}

	public String getJunk2() {
		return junk2;
	}

	public void setJunk2(String junk2) {
		this.junk2 = junk2;
	}

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}
}
