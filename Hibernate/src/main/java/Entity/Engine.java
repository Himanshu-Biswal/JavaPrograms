package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Engine {
	@Id
	private int eid;
	private String type;
	private int cc;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public Engine() {
		
	}
	@Override
	public String toString() {
		return "Enginee [eid=" + eid + ", type=" + type + ", cc=" + cc + "]";
	}
	

}
