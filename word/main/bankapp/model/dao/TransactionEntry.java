package com.bankapp.model.dao;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "transaction_table")
public class TransactionEntry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer txId;
	
    private String txInfo;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    
    private Double amount;
    
    @Enumerated(EnumType.STRING)
    private TxType txType;
    
	public TransactionEntry() {
		
	}
	
	public TransactionEntry(String txInfo, Double amount, TxType txType) {
		this.txInfo = txInfo;
		this.timestamp = new Date();
		this.amount = amount;
		this.txType = txType;
	}


	public Integer getTxId() {
		return txId;
	}

	public void setTxId(Integer txId) {
		this.txId = txId;
	}

	public String getTxInfo() {
		return txInfo;
	}

	public void setTxInfo(String txInfo) {
		this.txInfo = txInfo;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	
	public TxType getTxType() {
		return txType;
	}

	public void setTxType(TxType txType) {
		this.txType = txType;
	}
	
//	public Account getAccount() {
//		return account;
//	}
//
//	public void setAccount(Account account) {
//		this.account = account;
//	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionEntry [txId=");
		builder.append(txId);
		builder.append(", txInfo=");
		builder.append(txInfo);
		builder.append(", timestamp=");
		builder.append(timestamp);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", txType=");
		builder.append(txType);
		builder.append("]");
		return builder.toString();
	}
}
