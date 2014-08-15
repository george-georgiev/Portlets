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

import com.gasmeters.portlet.service.AvailableLocalServiceUtil;
import com.gasmeters.portlet.service.ClpSerializer;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author George
 */
public class AvailableClp extends BaseModelImpl<Available> implements Available {
	public AvailableClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Available.class;
	}

	@Override
	public String getModelClassName() {
		return Available.class.getName();
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
		attributes.put("groupID", getGroupID());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long serialNums = (Long)attributes.get("serialNums");

		if (serialNums != null) {
			setSerialNums(serialNums);
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

		if (_availableRemoteModel != null) {
			try {
				Class<?> clazz = _availableRemoteModel.getClass();

				Method method = clazz.getMethod("setSerialNums", long.class);

				method.invoke(_availableRemoteModel, serialNums);
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

		if (_availableRemoteModel != null) {
			try {
				Class<?> clazz = _availableRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupID", int.class);

				method.invoke(_availableRemoteModel, groupID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getAvailableRemoteModel() {
		return _availableRemoteModel;
	}

	public void setAvailableRemoteModel(BaseModel<?> availableRemoteModel) {
		_availableRemoteModel = availableRemoteModel;
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

		Class<?> remoteModelClass = _availableRemoteModel.getClass();

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

		Object returnValue = method.invoke(_availableRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			AvailableLocalServiceUtil.addAvailable(this);
		}
		else {
			AvailableLocalServiceUtil.updateAvailable(this);
		}
	}

	@Override
	public Available toEscapedModel() {
		return (Available)ProxyUtil.newProxyInstance(Available.class.getClassLoader(),
			new Class[] { Available.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		AvailableClp clone = new AvailableClp();

		clone.setSerialNums(getSerialNums());
		clone.setGroupID(getGroupID());

		return clone;
	}

	@Override
	public int compareTo(Available available) {
		int value = 0;

		if (getSerialNums() < available.getSerialNums()) {
			value = -1;
		}
		else if (getSerialNums() > available.getSerialNums()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(obj instanceof AvailableClp)) {
			return false;
		}

		AvailableClp available = (AvailableClp)obj;

		long primaryKey = available.getPrimaryKey();

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
		StringBundler sb = new StringBundler(5);

		sb.append("{serialNums=");
		sb.append(getSerialNums());
		sb.append(", groupID=");
		sb.append(getGroupID());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.gasmeters.portlet.model.Available");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>serialNums</column-name><column-value><![CDATA[");
		sb.append(getSerialNums());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupID</column-name><column-value><![CDATA[");
		sb.append(getGroupID());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _serialNums;
	private int _groupID;
	private BaseModel<?> _availableRemoteModel;
}