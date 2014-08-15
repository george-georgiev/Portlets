
package com.gasmeters.portlet.service.impl;


import com.gasmeters.portlet.model.Installed;
import com.gasmeters.portlet.service.base.InstalledLocalServiceBaseImpl;
import com.gasmeters.portlet.service.persistence.InstalledFinderUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;

import java.util.Date;
import java.util.Calendar;
import java.util.List;

public class InstalledLocalServiceImpl extends InstalledLocalServiceBaseImpl {
	
	public Installed addMeter(long serialNums, long currInd, int month, int day, int year){
		
		Installed meter = installedPersistence.create(serialNums);
		meter.setCurrInd(currInd);
		meter.setGroupID(1);
		Calendar dateCal = CalendarFactoryUtil.getCalendar();
		dateCal.set(year, month, day);
	    dateCal.set(Calendar.HOUR_OF_DAY, 0);
	    dateCal.set(Calendar.MINUTE, 0);
	    dateCal.set(Calendar.SECOND, 0);
	    dateCal.set(Calendar.MILLISECOND, 0);
		Date date = dateCal.getTime();
		meter.setDate(date);
		try {
			super.addInstalled(meter);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return meter;
		
	}
	
	public List<Installed> getMeters() throws SystemException{
		
		return installedPersistence.findAll();
		
	}
	
	public int getMetersCount() throws SystemException{
		
		return installedPersistence.countAll();
		
	}
	
	public List<Installed> getDistinctDate(){
		
		return InstalledFinderUtil.findDistinctDate();
		
	}
	
	public int getDistinctDateCount(){
		
		return InstalledFinderUtil.countDistinctDate();
	}
	
public List<Installed> getDistinctDateInRange(String start, String end){
		
		return InstalledFinderUtil.findDistinctDateInRange(start, end);
		
	}
	
	public int getDistinctDateCountInRange(String start, String end){
		
		return InstalledFinderUtil.countDistinctDateInRange(start, end);
	}
	
	public List<Installed> getMetersByDate(int month, int day, int year) {
		
		List<Installed> meters= null;
		Calendar dateCal = CalendarFactoryUtil.getCalendar();
		dateCal.set(year, month, day);
		Date date = dateCal.getTime();
		try {
			meters = installedPersistence.findBydate(date);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return meters;
		
	}
	
	public int getMetersCountByDate(int month, int day, int year){
		
		int count = 0;
		Calendar dateCal = CalendarFactoryUtil.getCalendar();
		dateCal.set(year, month, day);
		Date date = dateCal.getTime();
		try {
			count = installedPersistence.countBydate(date);
		} catch (SystemException e) {
			e.printStackTrace();
		}
		return count;
		
	}
	
	public int getMetersCountByDate(Date date) throws SystemException{
		
		return installedPersistence.countBydate(date);
		
	}
	
}