package com.ust.srs.service;

import java.util.ArrayList;
import java.util.Map;

import com.ust.srs.bean.PassengerBean;
import com.ust.srs.bean.ReservationBean;
import com.ust.srs.bean.ScheduleBean;

public interface Customer {
	public ArrayList<ScheduleBean> viewScheduleByRoute (String source, String destination, String date);
	
	public String reserveTicket(ReservationBean reservationBean, ArrayList<PassengerBean> passengerBean); 
	 
	public boolean cancelTicket(String reservationId);
	 
	public Map<ReservationBean,PassengerBean> viewTicket(String reservationId) ;
	public Map<ReservationBean,PassengerBean>  printTicket(String reservationId);
	 
	
}
