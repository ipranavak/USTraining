package com.ust.srs.service;
import java.util.ArrayList;

import com.ust.srs.bean.*;

public interface Adminstrator {
	public String  addShip(ShipBean shipbean) ; 
	 
	public boolean  modifyShip(ShipBean Shipbean);
	 
	public int  removeShip(ArrayList<String> ShipId);
	 
	public String  addSchedule(ScheduleBean schedulebean);  
	
	public boolean  modifySchedule(ScheduleBean schedulebean);
	 
	public int  removeSchedule(ArrayList<String>  scheduleid);
	 
	public String  addRoute(RouteBean routebean);  
	 
	public boolean  modifyRoute(RouteBean routebean);
	 
	public int  removeRoute(String routeid);
	 
	public ShipBean  viewByShipId(String ShipId);
	 
	public RouteBean  viewByRouteId(String routeid);
	 
	public ArrayList<ShipBean>  viewByAllShips();
	 
	public ArrayList<RouteBean>  viewByAllRoute();
	 
	public ArrayList<ScheduleBean>  viewByAllSchedule();
	 
	public ScheduleBean  viewByScheduleId(String scheduleid);
	 
	public ArrayList<PassengerBean> viewPasengersByShip(String scheduleid);

}
