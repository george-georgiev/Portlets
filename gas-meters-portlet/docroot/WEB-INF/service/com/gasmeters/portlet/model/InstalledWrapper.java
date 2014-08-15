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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Installed}.
 * </p>
 *
 * @author George
 * @see Installed
 * @generated
 */
public class InstalledWrapper implements Installed, ModelWrapper<Installed> {
	public InstalledWrapper(Installed installed) {
		_installed = installed;
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

	/**
	* Returns the primary key of this installed.
	*
	* @return the primary key of this installed
	*/
	@Override
	public long getPrimaryKey() {
		return _installed.getPrimaryKey();
	}

	/**
	* Sets the primary key of this installed.
	*
	* @param primaryKey the primary key of this installed
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_installed.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the serial nums of this installed.
	*
	* @return the serial nums of this installed
	*/
	@Override
	public long getSerialNums() {
		return _installed.getSerialNums();
	}

	/**
	* Sets the serial nums of this installed.
	*
	* @param serialNums the serial nums of this installed
	*/
	@Override
	public void setSerialNums(long serialNums) {
		_installed.setSerialNums(serialNums);
	}

	/**
	* Returns the date of this installed.
	*
	* @return the date of this installed
	*/
	@Override
	public java.util.Date getDate() {
		return _installed.getDate();
	}

	/**
	* Sets the date of this installed.
	*
	* @param date the date of this installed
	*/
	@Override
	public void setDate(java.util.Date date) {
		_installed.setDate(date);
	}

	/**
	* Returns the curr ind of this installed.
	*
	* @return the curr ind of this installed
	*/
	@Override
	public long getCurrInd() {
		return _installed.getCurrInd();
	}

	/**
	* Sets the curr ind of this installed.
	*
	* @param currInd the curr ind of this installed
	*/
	@Override
	public void setCurrInd(long currInd) {
		_installed.setCurrInd(currInd);
	}

	/**
	* Returns the group i d of this installed.
	*
	* @return the group i d of this installed
	*/
	@Override
	public int getGroupID() {
		return _installed.getGroupID();
	}

	/**
	* Sets the group i d of this installed.
	*
	* @param groupID the group i d of this installed
	*/
	@Override
	public void setGroupID(int groupID) {
		_installed.setGroupID(groupID);
	}

	@Override
	public boolean isNew() {
		return _installed.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_installed.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _installed.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_installed.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _installed.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _installed.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_installed.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _installed.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_installed.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_installed.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_installed.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new InstalledWrapper((Installed)_installed.clone());
	}

	@Override
	public int compareTo(com.gasmeters.portlet.model.Installed installed) {
		return _installed.compareTo(installed);
	}

	@Override
	public int hashCode() {
		return _installed.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.gasmeters.portlet.model.Installed> toCacheModel() {
		return _installed.toCacheModel();
	}

	@Override
	public com.gasmeters.portlet.model.Installed toEscapedModel() {
		return new InstalledWrapper(_installed.toEscapedModel());
	}

	@Override
	public com.gasmeters.portlet.model.Installed toUnescapedModel() {
		return new InstalledWrapper(_installed.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _installed.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _installed.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_installed.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof InstalledWrapper)) {
			return false;
		}

		InstalledWrapper installedWrapper = (InstalledWrapper)obj;

		if (Validator.equals(_installed, installedWrapper._installed)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Installed getWrappedInstalled() {
		return _installed;
	}

	@Override
	public Installed getWrappedModel() {
		return _installed;
	}

	@Override
	public void resetOriginalValues() {
		_installed.resetOriginalValues();
	}

	private Installed _installed;
}