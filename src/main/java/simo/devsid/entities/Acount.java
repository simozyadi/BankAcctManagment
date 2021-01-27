package simo.devsid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ACT_TYPE",discriminatorType = DiscriminatorType.STRING,length = 2)
public abstract class Acount implements Serializable {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String accountCode;
	private Date createDate;
	private	Double balance;
	@ManyToOne
	@JoinColumn(name = "CLIENT_CODE")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "EMPLOYEE_CODE")
	private Employee employee;
	@OneToMany(mappedBy = "acount")
	private Collection<Operation> operations;
	public Acount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Acount(String accountCode, Date createDate, Double balance) {
		super();
		this.accountCode = accountCode;
		this.createDate = createDate;
		this.balance = balance;
	}
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Collection<Operation> getOperations() {
		return operations;
	}
	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}
	
	

}