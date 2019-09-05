package com.sanyi.framework.dao;

import org.springframework.data.jpa.repository.Query;

import com.sanyi.framework.dao.BaseRepository;
import com.sanyi.framework.model.Room;

public interface RoomRepository extends BaseRepository<Room>{

	@Query(value="select * from t_room where deleted = false and fixationValue = ?1 limit 1",nativeQuery=true)
	Room getRoomByFixationValue(String fixationValue);

}
