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

package com.gasmeters.portlet.model.impl;

import com.gasmeters.portlet.model.Available;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Available in entity cache.
 *
 * @author George
 * @see Available
 * @generated
 */
public class AvailableCacheModel implements CacheModel<Available>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{serialNums=");
		sb.append(serialNums);
		sb.append(", groupID=");
		sb.append(groupID);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Available toEntityModel() {
		AvailableImpl availableImpl = new AvailableImpl();

		availableImpl.setSerialNums(serialNums);
		availableImpl.setGroupID(groupID);

		availableImpl.resetOriginalValues();

		return availableImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		serialNums = objectInput.readLong();
		groupID = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(serialNums);
		objectOutput.writeInt(groupID);
	}

	public long serialNums;
	public int groupID;
}