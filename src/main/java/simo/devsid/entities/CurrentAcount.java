package simo.devsid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

@Entity
@DiscriminatorValue("CA")
@XmlType(name = "CA")
public class CurrentAcount extends Acount implements Serializable {
	private double overdraft;

	public CurrentAcount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAcount(String accountCode, Date createDate, Double balance, double overdraft) {
		super(accountCode, createDate, balance);
		this.overdraft = overdraft;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	
	

}
