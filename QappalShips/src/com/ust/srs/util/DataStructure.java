package com.ust.srs.util;

import java.util.ArrayList;
import com.ust.srs.bean.*;

public class DataStructure {
	ArrayList<CredentialsBean> Cred= new ArrayList<>();
	ArrayList<PassengerBean> Passenger= new ArrayList<>();
	ArrayList<ProfileBean> Profile= new ArrayList<>();
	ArrayList<ReservationBean> Reserve= new ArrayList<>();
	ArrayList<RouteBean> Route= new ArrayList<>();
	ArrayList<ScheduleBean> Schedule= new ArrayList<>();
	ArrayList<ShipBean> Ship= new ArrayList<>();
	public DataStructure() {
		Ship.add(new ShipBean("AR-100","Artemis",120,100));
		Ship.add(new ShipBean("AT-101","Atlantic",130,100));
		Ship.add(new ShipBean("PS-102","Poseidon",140,100));
		Ship.add(new ShipBean("TR-103","Titanic",150,100));
		
		Passenger.add(new PassengerBean("QS001","X1","ABC",18,"M"));
		Passenger.add(new PassengerBean("QS002","X2","XYZ",20,"M"));
		Passenger.add(new PassengerBean("QS003","X3","PQR",18,"F"));
		Passenger.add(new PassengerBean("QS004","X4","LMN",34,"F"));
		
//		Schedule.add(new ScheduleBean("S001", "", null, null))
		
	}
	public ArrayList<CredentialsBean> getCred() {
		return Cred;
	}
	public void setCred(ArrayList<CredentialsBean> cred) {
		Cred.add(cred);
	}
	public ArrayList<PassengerBean> getPassenger() {
		return Passenger;
	}
	public void setPassenger(ArrayList<PassengerBean> passenger) {
		Passenger.add(passenger);
	}
	public ArrayList<ProfileBean> getProfile() {
		return Profile;
	}
	public void setProfile(ArrayList<ProfileBean> profile) {
		.add();
	}
	public ArrayList<ReservationBean> getReserve() {
		return Reserve;
	}
	public void setReserve(ArrayList<ReservationBean> reserve) {
		Reserve = reserve;
	}
	public ArrayList<RouteBean> getRoute() {
		return Route;
	}
	public void setRoute(ArrayList<RouteBean> route) {
		Route = route;
	}
	public ArrayList<ScheduleBean> getSchedule() {
		return Schedule;
	}
	public void setSchedule(ArrayList<ScheduleBean> schedule) {
		Schedule = schedule;
	}
	public ArrayList<ShipBean> getShip() {
		return Ship;
	}
	public void setShip(ArrayList<ShipBean> ship) {
		Ship = ship;
	}
	
	

}
