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

package com.gasmeters.portlet.service.persistence;

import com.gasmeters.portlet.model.Available;
import com.gasmeters.portlet.service.AvailableLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author George
 * @generated
 */
public abstract class AvailableActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public AvailableActionableDynamicQuery() throws SystemException {
		setBaseLocalService(AvailableLocalServiceUtil.getService());
		setClass(Available.class);

		setClassLoader(com.gasmeters.portlet.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("serialNums");
	}
}