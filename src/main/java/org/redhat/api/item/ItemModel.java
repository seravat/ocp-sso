package org.redhat.api.item;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemModel implements Serializable {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String year;
	
	private String make;
	
	private String model;
	
	private String status = "ACTIVE";
	
	private Date createDate = new Date(System.currentTimeMillis());
	
	private Date lastUpdateDate = new Date(System.currentTimeMillis());
	
	
	
	
	
	/*
	 * below this line is generated by the ide
	 */
	
	private static final long serialVersionUID = -7384751271101505737L;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@Override
	public String toString() {
		return "ItemModel [id=" + id + ", year=" + year + ", make=" + make + ", model=" + model + ", status=" + status
				+ ", createDate=" + createDate + ", lastUpdateDate=" + lastUpdateDate + "]";
	}

}
