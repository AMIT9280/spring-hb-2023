package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class EmployeeEntity {
		@Id
		@GeneratedValue
		Integer EmployeeId;
		String employeeName;
		
		@OneToOne
		@JoinColumn(name="address_id",referencedColumnName = "addressId")
		AddressEntity address;
		
		public Integer getEmployeeId() {
			return EmployeeId;
		}
		public void setEmployeeId(Integer employeeId) {
			EmployeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public AddressEntity getAddress() {
			return address;
		}
		public void setAddress(AddressEntity address) {
			this.address = address;
		}
		
		
}
