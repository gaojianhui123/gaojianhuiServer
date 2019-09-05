package com.sanyi.framework.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import com.sanyi.framework.model.LienPersonnelTanHuaRelate;

public interface LienPersonnelTanHuaRelateRepository extends BaseRepository<LienPersonnelTanHuaRelate>{

	@Query(value="SELECT * FROM t_lien_tanhua WHERE lpId = (?1) AND nurseId = (?2) and deleted is FALSE",nativeQuery=true)
	List<LienPersonnelTanHuaRelate> findByLpIdAndNurseId(String lpId, String nurseId);
	@Query(value="SELECT * FROM t_lien_tanhua WHERE nurseId = (?1) AND deleted is FALSE",nativeQuery=true)
	List<LienPersonnelTanHuaRelate> findByNurseId(String nurseId);
	//根据nurseId 查询谈话记录表列表
	@Query(value="SELECT * FROM t_lien_tanhua where deleted is false and nurseId = ?1",nativeQuery=true)
	List<LienPersonnelTanHuaRelate> findLPTanHuaRelateByNurseId(String nurseId);

}
