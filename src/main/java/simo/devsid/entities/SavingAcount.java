package simo.devsid.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

@Entity
@DiscriminatorValue("SA")

@XmlType(name = "SA")
public class SavingAcount extends Acount{
	private double rate;

	public SavingAcount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAcount(String accountCode, Date createDate, Double balance, double rate) {
		super(accountCode, createDate, balance);
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
	
	

}
