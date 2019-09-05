package com.sanyi.framework.service.impl;
import org.springframework.beans.factory.annotation.Autowired;

import com.sanyi.framework.dao.BedRepository;
import com.sanyi.framework.dao.RoomRepository;
import com.sanyi.framework.dtomapper.CommonMapper;
import com.sanyi.framework.exception.BusinessException;
import com.sanyi.framework.model.QBed;
import com.sanyi.framework.model.QRoom;
import com.sanyi.framework.model.Room;
import com.sanyi.framework.service.impl.BaseService;
import com.sanyi.framework.util.ObjectUtil;

import org.springframework.stereotype.Service;
import com.sanyi.framework.page.QueryParam;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.BooleanBuilder;
import java.util.function.Function;
import java.util.List;


@Service
public class RoomService extends BaseService<Room>{
	@Autowired
	RoomRepository roomRepository;
	@Autowired
	BedRepository bedRepository;
	@Autowired
	private CommonMapper commonMapper;
	/**
	 * jpa的查询条件
	 */
	@Override
	public Predicate packagePredicate(QueryParam<Room> queryDto) {
		final BooleanBuilder wherepredicate = new BooleanBuilder();
		wherepredicate.and(QRoom.room.deleted.eq(false));
		if (!ObjectUtil.isEmpty(queryDto.getQuery().getFloorTier())) {
			wherepredicate.and(QRoom.room.floorTier.eq(queryDto.getQuery().getFloorTier()));
		}
		return wherepredicate;
	}
	/**
	 * mybatis的查询条件
	 */
	@Override
	public Function<QueryParam, List> packageFindListMapper() {
		return (query) -> {
			return commonMapper.selectRoom(query);
		};
	}
	// 新增或者修改房间对象
	public Room saveRoom(Room room) throws BusinessException {
		bedRepository.saveAll(room.getBedList());
		return roomRepository.save(room);
	}
	// 根据固定的值查询获取房间对象
	public Room getRoomByFixationValue(String fixationValue) {
		// TODO Auto-generated method stub
		return roomRepository.getRoomByFixationValue(fixationValue);
	}


}
