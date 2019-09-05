package com.sanyi.framework.dao;

import org.springframework.data.jpa.repository.Query;
import com.sanyi.framework.model.Nurse;

public interface NurseRepository extends BaseRepository<Nurse>{
	@Query(value="select * from t_nurse where deleted = false and tanHuaShenQingId = ?1 and submitTime = ?2 limit 1",nativeQuery=true)
	Nurse findNurseByTanHuaShenQingId(String tanHuaShenQingId, String dateString);
	@Query(value="select * from t_nurse where deleted = false and lienPersonnelid = ?1 and submitTime = ?2 limit 1",nativeQuery=true)
	Nurse getNurseByLpIdAndTime(String lienPersonnelid, String submitTime);

}
