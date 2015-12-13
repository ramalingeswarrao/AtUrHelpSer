package com.aturhelp.services.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aturhelp.common.milk.Appartment;
import com.aturhelp.common.milk.FlatNo;
import com.aturhelp.common.milk.GetFlatsData;
import com.aturhelp.common.milk.Location;
import com.aturhelp.common.milk.MilkPackets;
import com.aturhelp.common.milk.RoomMilk;
import com.aturhelp.common.milk.Route;
import com.aturhelp.dao.MilkDAO;
import com.aturhelp.services.MilkService;

@Component
public class MilkServiceImpl implements MilkService{

final static Logger LOG = Logger.getLogger(MilkServiceImpl.class);
	
	@Autowired(required=true)
	MilkDAO milkDAO;
	
	@Override
	public boolean createPackets(MilkPackets milkPackets) {
		return milkDAO.craetePackets(milkPackets);
	}

	@Override
	public boolean createAppartment(Appartment appartment) {
		return milkDAO.createAppartment(appartment);
	}

	@Override
	public boolean createFlatNo(FlatNo flatNo) {
		return milkDAO.createFlatNo(flatNo);
	}

	@Override
	public boolean createLocation(Location location) {
		return milkDAO.createLocation(location);
	}

	@Override
	public boolean createRoomMilk(RoomMilk roomMilk) {
		return milkDAO.createRoomMilk(roomMilk);
	}

	@Override
	public boolean createRoute(Route route) {
		return milkDAO.createRoute(route);
	}

	@Override
	public List<MilkPackets> getMilkPackets() {
		return milkDAO.getMilkPackets();
	}

	@Override
	public List<Appartment> getAppartments(String id) {
		return milkDAO.getAppartments(id);
	}

	@Override
	public List<Location> getLocations() {
		return milkDAO.getLocations();
	}

	@Override
	public List<Route> getRoutes() {
		return milkDAO.getRoutes();
	}

	@Override
	public List<GetFlatsData> getFlatDetails() {
		return milkDAO.getFlatDetails();
	}

	@Override
	public List<FlatNo> getFlatNoDetails(String appId) {
		return milkDAO.getFlatNoDetails(appId);
	}

}
