

package com.gasmeters.portlet.service.impl;

import java.util.List;

import com.gasmeters.portlet.NoSuchAvailableException;
import com.gasmeters.portlet.model.Available;
import com.gasmeters.portlet.service.base.AvailableLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

public class AvailableLocalServiceImpl extends AvailableLocalServiceBaseImpl {
	
	public Available addMeter(long serialNums) throws SystemException{
		
		Available meter = availablePersistence.create(serialNums);
		meter.setGroupID(1);
		super.addAvailable(meter);
		return meter;
		
	}
	
	public Available deleteMeter(Available meter) throws SystemException{
		
		return availablePersistence.remove(meter);
		
	}
	
	public Available deleteMeter(long serialNums) throws NoSuchAvailableException, SystemException{
		
		Available meter = availablePersistence.findByPrimaryKey(serialNums);
		return deleteMeter(meter);
		
	}
	
	public List<Available> getMeters() throws SystemException{
		
		return availablePersistence.findAll();
		
	}
	
	public List<Available> getMeters(int start, int end) throws SystemException{
		
		return availablePersistence.findBygroupID(1, start, end);
		
	}
	
	public int getMetersCount() throws SystemException{
		
		return availablePersistence.countAll();
		
	}
	
}