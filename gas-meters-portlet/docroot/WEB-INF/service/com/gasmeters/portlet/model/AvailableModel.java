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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Available service. Represents a row in the &quot;GasMeters_Available&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.gasmeters.portlet.model.impl.AvailableModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.gasmeters.portlet.model.impl.AvailableImpl}.
 * </p>
 *
 * @author George
 * @see Available
 * @see com.gasmeters.portlet.model.impl.AvailableImpl
 * @see com.gasmeters.portlet.model.impl.AvailableModelImpl
 * @generated
 */
public interface AvailableModel extends BaseModel<Available> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a available model instance should use the {@link Available} interface instead.
	 */

	/**
	 * Returns the primary key of this available.
	 *
	 * @return the primary key of this available
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this available.
	 *
	 * @param primaryKey the primary key of this available
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the serial nums of this available.
	 *
	 * @return the serial nums of this available
	 */
	public long getSerialNums();

	/**
	 * Sets the serial nums of this available.
	 *
	 * @param serialNums the serial nums of this available
	 */
	public void setSerialNums(long serialNums);

	/**
	 * Returns the group i d of this available.
	 *
	 * @return the group i d of this available
	 */
	public int getGroupID();

	/**
	 * Sets the group i d of this available.
	 *
	 * @param groupID the group i d of this available
	 */
	public void setGroupID(int groupID);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Available available);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Available> toCacheModel();

	@Override
	public Available toEscapedModel();

	@Override
	public Available toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}