package pkg1.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="mteam")
public class MTeamEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private long staffNo;
	private String staffName;
	private String email;
	private String mobile;
	private String trade;
	private boolean isManager;
	
	@OneToMany(mappedBy = "staffId")
	private List<MTeamEntity> authM;
	
	public MTeamEntity() {
		super();
	}
	
	public MTeamEntity(long id, long staffNo, String staffName, String email, String mobile, String trade,
			boolean isManager) {
		super();
		this.id = id;
		this.staffNo = staffNo;
		this.staffName = staffName;
		this.email = email;
		this.mobile = mobile;
		this.trade = trade;
		this.isManager = isManager;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(long staffNo) {
		this.staffNo = staffNo;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTrade() {
		return trade;
	}
	public void setTrade(String trade) {
		this.trade = trade;
	}
	public boolean isManager() {
		return isManager;
	}
	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}
	
}
