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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.gasmeters.portlet.service.http.AvailableServiceSoap}.
 *
 * @author George
 * @see com.gasmeters.portlet.service.http.AvailableServiceSoap
 * @generated
 */
public class AvailableSoap implements Serializable {
	public static AvailableSoap toSoapModel(Available model) {
		AvailableSoap soapModel = new AvailableSoap();

		soapModel.setSerialNums(model.getSerialNums());
		soapModel.setGroupID(model.getGroupID());

		return soapModel;
	}

	public static AvailableSoap[] toSoapModels(Available[] models) {
		AvailableSoap[] soapModels = new AvailableSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AvailableSoap[][] toSoapModels(Available[][] models) {
		AvailableSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AvailableSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AvailableSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AvailableSoap[] toSoapModels(List<Available> models) {
		List<AvailableSoap> soapModels = new ArrayList<AvailableSoap>(models.size());

		for (Available model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AvailableSoap[soapModels.size()]);
	}

	public AvailableSoap() {
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

	public int getGroupID() {
		return _groupID;
	}

	public void setGroupID(int groupID) {
		_groupID = groupID;
	}

	private long _serialNums;
	private int _groupID;
}