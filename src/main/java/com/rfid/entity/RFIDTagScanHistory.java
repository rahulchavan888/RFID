package com.rfid.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class RFIDTagScanHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String rfid_tage;
	private String rfid_reader_name;
	private Date timestamp;
	@ManyToOne
	@JoinColumn(name = "Student", foreignKey = @ForeignKey(name = "FK_TagScanHistory_Student"))
	private Student student;

	@JsonIgnore
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRfid_tage() {
		return rfid_tage;
	}

	public void setRfid_tage(String rfid_tage) {
		this.rfid_tage = rfid_tage;
	}

	public String getRfid_reader_name() {
		return rfid_reader_name;
	}

	public void setRfid_reader_name(String rfid_reader_name) {
		this.rfid_reader_name = rfid_reader_name;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "RFIDTagScanHistory [id=" + id + ", rfid_tage=" + rfid_tage + ", rfid_reader_name=" + rfid_reader_name
				+ ", timestamp=" + timestamp + ", student=" + student + "]";
	}

}
