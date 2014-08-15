/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.gasmeters.portlet.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.gasmeters.portlet.service.http.InstalledServiceSoap}.
 *
 * @author George
 * @see com.gasmeters.portlet.service.http.InstalledServiceSoap
 * @generated
 */
public class InstalledSoap implements Serializable {
	public static InstalledSoap toSoapModel(Installed model) {
		InstalledSoap soapModel = new InstalledSoap();

		soapModel.setSerialNums(model.getSerialNums());
		soapModel.setDate(model.getDate());
		soapModel.setCurrInd(model.getCurrInd());
		soapModel.setGroupID(model.getGroupID());

		return soapModel;
	}

	public static InstalledSoap[] toSoapModels(Installed[] models) {
		InstalledSoap[] soapModels = new InstalledSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static InstalledSoap[][] toSoapModels(Installed[][] models) {
		InstalledSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new InstalledSoap[models.length][models[0].length];
		}
		else {
			soapModels = new InstalledSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static InstalledSoap[] toSoapModels(List<Installed> models) {
		List<InstalledSoap> soapModels = new ArrayList<InstalledSoap>(models.size());

		for (Installed model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new InstalledSoap[soapModels.size()]);
	}

	public InstalledSoap() {
	}

	public long getPrimaryKey() {
		return _serialNums;
	}

	public void setPrimaryKey(long pk) {
		setSerialNums(pk);
	}

	public long getSerialNums() {
		return _serialNums;
	}

	public void setSerialNums(long serialNums) {
		_serialNums = serialNums;
	}

	public Date getDate() {
		return _date;
	}

	public void setDate(Date date) {
		_date = date;
	}

	public long getCurrInd() {
		return _currInd;
	}

	public void setCurrInd(long currInd) {
		_currInd = currInd;
	}

	public int getGroupID() {
		return _groupID;
	}

	public void setGroupID(int groupID) {
		_groupID = groupID;
	}

	private long _serialNums;
	private Date _date;
	private long _currInd;
	private int _groupID;
}