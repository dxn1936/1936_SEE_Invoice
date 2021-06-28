package com.newhibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER_INFORMATION")
public class Customer_info {
	
	@Id
private int invoiceid;
private String name;
private int totalamt;
public int getinvoice_id() {
	return invoiceid;
}
public void setinvoice_id(int invoiceid) {
	this.invoiceid = invoiceid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getFinaltotal_Amount() {
	return totalamt;
}
public void setFinaltotal_Amount(int totalamt) {
	this.totalamt = totalamt;
}

}
