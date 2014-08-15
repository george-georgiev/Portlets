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

package com.gasmeters.portlet.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Installed. This utility wraps
 * {@link com.gasmeters.portlet.service.impl.InstalledLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author George
 * @see InstalledLocalService
 * @see com.gasmeters.portlet.service.base.InstalledLocalServiceBaseImpl
 * @see com.gasmeters.portlet.service.impl.InstalledLocalServiceImpl
 * @generated
 */
public class InstalledLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.gasmeters.portlet.service.impl.InstalledLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the installed to the database. Also notifies the appropriate model listeners.
	*
	* @param installed the installed
	* @return the installed that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed addInstalled(
		com.gasmeters.portlet.model.Installed installed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addInstalled(installed);
	}

	/**
	* Creates a new installed with the primary key. Does not add the installed to the database.
	*
	* @param serialNums the primary key for the new installed
	* @return the new installed
	*/
	public static com.gasmeters.portlet.model.Installed createInstalled(
		long serialNums) {
		return getService().createInstalled(serialNums);
	}

	/**
	* Deletes the installed with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serialNums the primary key of the installed
	* @return the installed that was removed
	* @throws PortalException if a installed with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed deleteInstalled(
		long serialNums)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteInstalled(serialNums);
	}

	/**
	* Deletes the installed from the database. Also notifies the appropriate model listeners.
	*
	* @param installed the installed
	* @return the installed that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed deleteInstalled(
		com.gasmeters.portlet.model.Installed installed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteInstalled(installed);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gasmeters.portlet.model.impl.InstalledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gasmeters.portlet.model.impl.InstalledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.gasmeters.portlet.model.Installed fetchInstalled(
		long serialNums)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchInstalled(serialNums);
	}

	/**
	* Returns the installed with the primary key.
	*
	* @param serialNums the primary key of the installed
	* @return the installed
	* @throws PortalException if a installed with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed getInstalled(
		long serialNums)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getInstalled(serialNums);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the installeds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gasmeters.portlet.model.impl.InstalledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of installeds
	* @param end the upper bound of the range of installeds (not inclusive)
	* @return the range of installeds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.gasmeters.portlet.model.Installed> getInstalleds(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInstalleds(start, end);
	}

	/**
	* Returns the number of installeds.
	*
	* @return the number of installeds
	* @throws SystemException if a system exception occurred
	*/
	public static int getInstalledsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getInstalledsCount();
	}

	/**
	* Updates the installed in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param installed the installed
	* @return the installed that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed updateInstalled(
		com.gasmeters.portlet.model.Installed installed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateInstalled(installed);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.gasmeters.portlet.model.Installed addMeter(
		long serialNums, long currInd, int month, int day, int year) {
		return getService().addMeter(serialNums, currInd, month, day, year);
	}

	public static java.util.List<com.gasmeters.portlet.model.Installed> getMeters()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMeters();
	}

	public static int getMetersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMetersCount();
	}

	public static java.util.List<com.gasmeters.portlet.model.Installed> getDistinctDate() {
		return getService().getDistinctDate();
	}

	public static int getDistinctDateCount() {
		return getService().getDistinctDateCount();
	}

	public static java.util.List<com.gasmeters.portlet.model.Installed> getDistinctDateInRange(
		java.lang.String start, java.lang.String end) {
		return getService().getDistinctDateInRange(start, end);
	}

	public static int getDistinctDateCountInRange(java.lang.String start,
		java.lang.String end) {
		return getService().getDistinctDateCountInRange(start, end);
	}

	public static java.util.List<com.gasmeters.portlet.model.Installed> getMetersByDate(
		int month, int day, int year) {
		return getService().getMetersByDate(month, day, year);
	}

	public static int getMetersCountByDate(int month, int day, int year) {
		return getService().getMetersCountByDate(month, day, year);
	}

	public static int getMetersCountByDate(java.util.Date date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMetersCountByDate(date);
	}

	public static void clearService() {
		_service = null;
	}

	public static InstalledLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					InstalledLocalService.class.getName());

			if (invokableLocalService instanceof InstalledLocalService) {
				_service = (InstalledLocalService)invokableLocalService;
			}
			else {
				_service = new InstalledLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(InstalledLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(InstalledLocalService service) {
	}

	private static InstalledLocalService _service;
}