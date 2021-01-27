package simo.devsid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employee implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long employeeCode;
	private String employeeName;
	
	@ManyToOne
	@JoinColumn(name = "EMP_SUP_CODE")
	private Employee employeeSup;
	
	@ManyToMany
	@JoinTable(name = "EMP_GR")
	private Collection<Group> groups;

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

	public Long getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(Long employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Employee getEmployeeSup() {
		return employeeSup;
	}

	public void setEmployeeSup(Employee employeeSup) {
		this.employeeSup = employeeSup;
	}

	public Collection<Group> getGroups() {
		return groups;
	}

	public void setGroups(Collection<Group> groups) {
		this.groups = groups;
	}

	
}
