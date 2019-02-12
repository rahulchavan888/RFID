package com.rfid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rfid.dao.RFIDDao;
import com.rfid.dto.request.RFIDTagDataRequest;
import com.rfid.entity.RFIDTagScanHistory;
import com.rfid.entity.Student;

@Service
public class RFIDService {

	@Autowired
	private RFIDDao rfidDao;

	public void saveRFIDScanData(RFIDTagDataRequest request) {

		String tag = request.getRfid_tage();
		Student student = rfidDao.findStundentByTag(tag);
		if (student != null) {
			RFIDTagScanHistory tagScanHistory = new RFIDTagScanHistory();
			tagScanHistory.setStudent(student);
			tagScanHistory.setRfid_reader_name(request.getRfid_reader_name());
			tagScanHistory.setRfid_tage(request.getRfid_tage());
			tagScanHistory.setTimestamp(request.getTimestamp());
			rfidDao.saveTagData(tagScanHistory);
		}
	}

	public List<RFIDTagScanHistory> getAllRFIDTagScanHistory() {
		return rfidDao.getAllRFIDTagScanHistory();
	}

}
