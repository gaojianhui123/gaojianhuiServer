package com.sanyi.framework.dao;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TanhuashenqingRepository extends BaseRepository<Tanhuashenqing>{
	@Query(value="SELECT * FROM t_tanhuashenqing WHERE lpId = ( ?1 ) AND deleted IS FALSE",nativeQuery=true)
	List<Tanhuashenqing> findByLienPersonnelId(String lpId);
	/**
	 * 导出谈话名单   根据谈话申请的id 获取被调查人代号、填报部门、填报人、填报日期、人员信息
	 * 导出全部留置人员信息一览表
	 * @param id
	 * @return
	 */
	@Query(value="SELECT * FROM t_tanhuashenqing  WHERE deleted = FALSE and id = ?1 limit 1",nativeQuery=true)
	Tanhuashenqing findTanHuaShenQingExport(String id);

	@Query(value="SELECT t_tanhuashenqing.*	FROM t_tanhuashenqing LEFT JOIN t_lien_personnel ON t_lien_personnel.id = t_tanhuashenqing.lpId" +
			" WHERE	 t_lien_personnel.kanhuLiLiang = ?1 AND t_lien_personnel.outStatus = '0' AND t_lien_personnel.deleted = FALSE  AND t_tanhuashenqing.deleted = 0 and t_tanhuashenqing.shenpiStatus = '1' ",nativeQuery=true)
	List<Tanhuashenqing> findTanHuaShenQingExportAll (String kanhuliliang);
}
