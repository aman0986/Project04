package in.co.rays.bean;

import java.io.Serializable;
import java.sql.Timestamp;


public abstract class BaseBean implements Serializable, DropdownListBean, Comparable<BaseBean> {

	
	protected long id;
	protected String createdBy;
	protected String modifiedby;
	protected Timestamp creatDatetime;
	protected Timestamp modifiedDatetime;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}
	public Timestamp getCreatDatetime() {
		return creatDatetime;
	}
	public void setCreatDatetime(Timestamp creatDatetime) {
		this.creatDatetime = creatDatetime;
	}
	public Timestamp getModifiedDatetime() {
		return modifiedDatetime;
	}
	public void setModifiedDatetime(Timestamp modifiedDatetime) {
		this.modifiedDatetime = modifiedDatetime;
	}
	
	@Override
	public int compareTo(BaseBean next) {
		return getValue().compareTo(next.getValue());
	}
	
	
}
