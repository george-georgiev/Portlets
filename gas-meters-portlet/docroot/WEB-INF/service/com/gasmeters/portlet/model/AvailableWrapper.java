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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Available}.
 * </p>
 *
 * @author George
 * @see Available
 * @generated
 */
public class AvailableWrapper implements Available, ModelWrapper<Available> {
	public AvailableWrapper(Available available) {
		_available = available;
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

	/**
	* Returns the primary key of this available.
	*
	* @return the primary key of this available
	*/
	@Override
	public long getPrimaryKey() {
		return _available.getPrimaryKey();
	}

	/**
	* Sets the primary key of this available.
	*
	* @param primaryKey the primary key of this available
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_available.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the serial nums of this available.
	*
	* @return the serial nums of this available
	*/
	@Override
	public long getSerialNums() {
		return _available.getSerialNums();
	}

	/**
	* Sets the serial nums of this available.
	*
	* @param serialNums the serial nums of this available
	*/
	@Override
	public void setSerialNums(long serialNums) {
		_available.setSerialNums(serialNums);
	}

	/**
	* Returns the group i d of this available.
	*
	* @return the group i d of this available
	*/
	@Override
	public int getGroupID() {
		return _available.getGroupID();
	}

	/**
	* Sets the group i d of this available.
	*
	* @param groupID the group i d of this available
	*/
	@Override
	public void setGroupID(int groupID) {
		_available.setGroupID(groupID);
	}

	@Override
	public boolean isNew() {
		return _available.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_available.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _available.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_available.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _available.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _available.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_available.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _available.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_available.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_available.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_available.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new AvailableWrapper((Available)_available.clone());
	}

	@Override
	public int compareTo(com.gasmeters.portlet.model.Available available) {
		return _available.compareTo(available);
	}

	@Override
	public int hashCode() {
		return _available.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.gasmeters.portlet.model.Available> toCacheModel() {
		return _available.toCacheModel();
	}

	@Override
	public com.gasmeters.portlet.model.Available toEscapedModel() {
		return new AvailableWrapper(_available.toEscapedModel());
	}

	@Override
	public com.gasmeters.portlet.model.Available toUnescapedModel() {
		return new AvailableWrapper(_available.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _available.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _available.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_available.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AvailableWrapper)) {
			return false;
		}

		AvailableWrapper availableWrapper = (AvailableWrapper)obj;

		if (Validator.equals(_available, availableWrapper._available)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Available getWrappedAvailable() {
		return _available;
	}

	@Override
	public Available getWrappedModel() {
		return _available;
	}

	@Override
	public void resetOriginalValues() {
		_available.resetOriginalValues();
	}

	private Available _available;
}