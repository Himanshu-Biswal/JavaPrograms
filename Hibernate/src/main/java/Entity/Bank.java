package Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Bank {
@Id
 private int bId;
 private String bName;
 private String ifsc;
 
 @OneToMany
 private List<Account> accout;
 
 
public int getbId() {
	return bId;
}
public void setbId(int bId) {
	this.bId = bId;
}
public String getbName() {
	return bName;
}
public void setbName(String bName) {
	this.bName = bName;
}
public String getIfsc() {
	return ifsc;
}
public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}


public List<Account> getAccout() {
	return accout;
}
public void setAccout(List<Account> accout) {
	this.accout = accout;
}
@Override
public String toString() {
	return "Entity_04_Bank [bId=" + bId + ", bName=" + bName + ", ifsc=" + ifsc + "]";
}
public Bank() {
//	super();
}
 
 
}
