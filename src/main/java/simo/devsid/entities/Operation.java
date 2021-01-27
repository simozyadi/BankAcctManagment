package simo.devsid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length = 1)
public abstract class Operation implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long operationNumber;
	private Date operationDate;
	private double amount;
	
	@ManyToOne
	@JoinColumn(name = "ACT_CODE")
	private Acount acount;
	
	@ManyToOne
	@JoinColumn(name = "EMP_CODE")
	private Employee employee;

	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operation(Date operationDate, double amount) {
		super();
		this.operationDate = operationDate;
		this.amount = amount;
	}

	public Long getOperationNumber() {
		return operationNumber;
	}

	public void setOperationNumber(Long operationNumber) {
		this.operationNumber = operationNumber;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Acount getAcount() {
		return acount;
	}

	public void setAcount(Acount acount) {
		this.acount = acount;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	

}
