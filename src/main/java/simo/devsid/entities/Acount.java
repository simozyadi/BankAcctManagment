package simo.devsid.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ACT_TYPE",discriminatorType = DiscriminatorType.STRING,length = 2)

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,include = JsonTypeInfo.As.PROPERTY,property = "type")
@JsonSubTypes({
		@JsonSubTypes.Type(value = CurrentAcount.class,name = "CA"),
		@JsonSubTypes.Type(value = SavingAcount.class,name = "SA")
})

@XmlSeeAlso({CurrentAcount.class,SavingAcount.class})
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
	@JsonIgnore
	@XmlTransient
	public Collection<Operation> getOperations() {
		return operations;
	}
	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}
	
	

}
