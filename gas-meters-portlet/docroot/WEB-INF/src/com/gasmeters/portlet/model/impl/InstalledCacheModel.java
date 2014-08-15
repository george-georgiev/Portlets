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

import com.gasmeters.portlet.model.Installed;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Installed in entity cache.
 *
 * @author George
 * @see Installed
 * @generated
 */
public class InstalledCacheModel implements CacheModel<Installed>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{serialNums=");
		sb.append(serialNums);
		sb.append(", date=");
		sb.append(date);
		sb.append(", currInd=");
		sb.append(currInd);
		sb.append(", groupID=");
		sb.append(groupID);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Installed toEntityModel() {
		InstalledImpl installedImpl = new InstalledImpl();

		installedImpl.setSerialNums(serialNums);

		if (date == Long.MIN_VALUE) {
			installedImpl.setDate(null);
		}
		else {
			installedImpl.setDate(new Date(date));
		}

		installedImpl.setCurrInd(currInd);
		installedImpl.setGroupID(groupID);

		installedImpl.resetOriginalValues();

		return installedImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		serialNums = objectInput.readLong();
		date = objectInput.readLong();
		currInd = objectInput.readLong();
		groupID = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(serialNums);
		objectOutput.writeLong(date);
		objectOutput.writeLong(currInd);
		objectOutput.writeInt(groupID);
	}

	public long serialNums;
	public long date;
	public long currInd;
	public int groupID;
}