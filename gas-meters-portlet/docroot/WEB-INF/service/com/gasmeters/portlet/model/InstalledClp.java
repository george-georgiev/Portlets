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

import com.gasmeters.portlet.service.ClpSerializer;
import com.gasmeters.portlet.service.InstalledLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author George
 */
public class InstalledClp extends BaseModelImpl<Installed> implements Installed {
	public InstalledClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Installed.class;
	}

	@Override
	public String getModelClassName() {
		return Installed.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _serialNums;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSerialNums(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _serialNums;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("serialNums", getSerialNums());
		attributes.put("date", getDate());
		attributes.put("currInd", getCurrInd());
		attributes.put("groupID", getGroupID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long serialNums = (Long)attributes.get("serialNums");

		if (serialNums != null) {
			setSerialNums(serialNums);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		Long currInd = (Long)attributes.get("currInd");

		if (currInd != null) {
			setCurrInd(currInd);
		}

		Integer groupID = (Integer)attributes.get("groupID");

		if (groupID != null) {
			setGroupID(groupID);
		}
	}

	@Override
	public long getSerialNums() {
		return _serialNums;
	}

	@Override
	public void setSerialNums(long serialNums) {
		_serialNums = serialNums;

		if (_installedRemoteModel != null) {
			try {
				Class<?> clazz = _installedRemoteModel.getClass();

				Method method = clazz.getMethod("setSerialNums", long.class);

				method.invoke(_installedRemoteModel, serialNums);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDate() {
		return _date;
	}

	@Override
	public void setDate(Date date) {
		_date = date;

		if (_installedRemoteModel != null) {
			try {
				Class<?> clazz = _installedRemoteModel.getClass();

				Method method = clazz.getMethod("setDate", Date.class);

				method.invoke(_installedRemoteModel, date);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCurrInd() {
		return _currInd;
	}

	@Override
	public void setCurrInd(long currInd) {
		_currInd = currInd;

		if (_installedRemoteModel != null) {
			try {
				Class<?> clazz = _installedRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrInd", long.class);

				method.invoke(_installedRemoteModel, currInd);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getGroupID() {
		return _groupID;
	}

	@Override
	public void setGroupID(int groupID) {
		_groupID = groupID;

		if (_installedRemoteModel != null) {
			try {
				Class<?> clazz = _installedRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupID", int.class);

				method.invoke(_installedRemoteModel, groupID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getInstalledRemoteModel() {
		return _installedRemoteModel;
	}

	public void setInstalledRemoteModel(BaseModel<?> installedRemoteModel) {
		_installedRemoteModel = installedRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _installedRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_installedRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			InstalledLocalServiceUtil.addInstalled(this);
		}
		else {
			InstalledLocalServiceUtil.updateInstalled(this);
		}
	}

	@Override
	public Installed toEscapedModel() {
		return (Installed)ProxyUtil.newProxyInstance(Installed.class.getClassLoader(),
			new Class[] { Installed.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		InstalledClp clone = new InstalledClp();

		clone.setSerialNums(getSerialNums());
		clone.setDate(getDate());
		clone.setCurrInd(getCurrInd());
		clone.setGroupID(getGroupID());

		return clone;
	}

	@Override
	public int compareTo(Installed installed) {
		int value = 0;

		value = DateUtil.compareTo(getDate(), installed.getDate());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InstalledClp)) {
			return false;
		}

		InstalledClp installed = (InstalledClp)obj;

		long primaryKey = installed.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{serialNums=");
		sb.append(getSerialNums());
		sb.append(", date=");
		sb.append(getDate());
		sb.append(", currInd=");
		sb.append(getCurrInd());
		sb.append(", groupID=");
		sb.append(getGroupID());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.gasmeters.portlet.model.Installed");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>serialNums</column-name><column-value><![CDATA[");
		sb.append(getSerialNums());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date</column-name><column-value><![CDATA[");
		sb.append(getDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currInd</column-name><column-value><![CDATA[");
		sb.append(getCurrInd());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupID</column-name><column-value><![CDATA[");
		sb.append(getGroupID());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _serialNums;
	private Date _date;
	private long _currInd;
	private int _groupID;
	private BaseModel<?> _installedRemoteModel;
}