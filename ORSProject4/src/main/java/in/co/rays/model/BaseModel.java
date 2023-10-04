package in.co.rays.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.logging.Logger;



import in.co.rays.bean.DropdownListBean;
import in.co.rays.exception.DatabaseException;

public abstract class BaseModel implements Serializable, DropdownListBean, Comparable<BaseModel> {

private static Logger log = Logger.getLogger(BaseModel.class);

protected long id;
protected String createdby;
protected String  modifiedby;
protected Timestamp createdDatetime;
protected Timestamp modifiedDatetime;
public static Logger getLog() {
	return log;
}
public static void setLog(Logger log) {
	log = log;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getCreatedby() {
	return createdby;
}
public void setCreatedby(String createdby) {
	this.createdby = createdby;
}
public String getModifiedby() {
	return modifiedby;
}
public void setModifiedby(String modifiedby) {
	this.modifiedby = modifiedby;
}
public Timestamp getCreatedDatetime() {
	return createdDatetime;
}
public void setCreatedDatetime(Timestamp createdDatetime) {
	this.createdDatetime = createdDatetime;
}
public Timestamp getModifiedDatetime() {
	return modifiedDatetime;
}
public void setModifiedDatetime(Timestamp modifiedDatetime) {
	this.modifiedDatetime = modifiedDatetime;
}
@Override
	public int compareTo(BaseModel next) {
		return (int)(id - next.getId());
	}

	
}
	

