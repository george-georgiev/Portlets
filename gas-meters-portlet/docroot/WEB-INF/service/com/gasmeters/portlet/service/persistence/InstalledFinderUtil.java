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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author George
 */
public class InstalledFinderUtil {
	public static java.util.List<com.gasmeters.portlet.model.Installed> findDistinctDate() {
		return getFinder().findDistinctDate();
	}

	public static int countDistinctDate() {
		return getFinder().countDistinctDate();
	}

	public static java.util.List<com.gasmeters.portlet.model.Installed> findDistinctDateInRange(
		java.lang.String start, java.lang.String end) {
		return getFinder().findDistinctDateInRange(start, end);
	}

	public static int countDistinctDateInRange(java.lang.String start,
		java.lang.String end) {
		return getFinder().countDistinctDateInRange(start, end);
	}

	public static InstalledFinder getFinder() {
		if (_finder == null) {
			_finder = (InstalledFinder)PortletBeanLocatorUtil.locate(com.gasmeters.portlet.service.ClpSerializer.getServletContextName(),
					InstalledFinder.class.getName());

			ReferenceRegistry.registerReference(InstalledFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(InstalledFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(InstalledFinderUtil.class, "_finder");
	}

	private static InstalledFinder _finder;
}