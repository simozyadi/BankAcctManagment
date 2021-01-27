package simo.devsid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable{
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clientCode;
	private	String	clientName;
	@OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
	private Collection<Acount> accounts;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String clientName) {
		super();
		this.clientName = clientName;
	}
	public Long getClientCode() {
		return clientCode;
	}
	public void setClientCode(Long clientCode) {
		this.clientCode = clientCode;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Collection<Acount> getAccounts() {
		return accounts;
	}
	public void setAccounts(Collection<Acount> accounts) {
		this.accounts = accounts;
	}
	
	

}
