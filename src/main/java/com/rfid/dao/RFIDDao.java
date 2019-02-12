package com.rfid.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rfid.entity.RFIDTagScanHistory;
import com.rfid.entity.Student;
import com.rfid.repository.RFIDTagScanHistoryRepository;
import com.rfid.repository.StudentRepository;

@Transactional
@Repository
public class RFIDDao {

	@Autowired
	private RFIDTagScanHistoryRepository historyRepository;

	@Autowired
	private StudentRepository studentRepository;

	public void saveTagData(RFIDTagScanHistory tagScanHistory) {
		historyRepository.save(tagScanHistory);
	}

	public Student findStundentByTag(String tagid) {
		return studentRepository.findBytagid(tagid);
	}

	public List<RFIDTagScanHistory> getAllRFIDTagScanHistory() {
		return historyRepository.findAll();
	}

}
