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

/**
 * @author George
 */
public interface InstalledFinder {
	public java.util.List<com.gasmeters.portlet.model.Installed> findDistinctDate();

	public int countDistinctDate();

	public java.util.List<com.gasmeters.portlet.model.Installed> findDistinctDateInRange(
		java.lang.String start, java.lang.String end);

	public int countDistinctDateInRange(java.lang.String start,
		java.lang.String end);
}