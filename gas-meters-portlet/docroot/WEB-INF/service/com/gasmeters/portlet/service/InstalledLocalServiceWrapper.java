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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link InstalledLocalService}.
 *
 * @author George
 * @see InstalledLocalService
 * @generated
 */
public class InstalledLocalServiceWrapper implements InstalledLocalService,
	ServiceWrapper<InstalledLocalService> {
	public InstalledLocalServiceWrapper(
		InstalledLocalService installedLocalService) {
		_installedLocalService = installedLocalService;
	}

	/**
	* Adds the installed to the database. Also notifies the appropriate model listeners.
	*
	* @param installed the installed
	* @return the installed that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.gasmeters.portlet.model.Installed addInstalled(
		com.gasmeters.portlet.model.Installed installed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.addInstalled(installed);
	}

	/**
	* Creates a new installed with the primary key. Does not add the installed to the database.
	*
	* @param serialNums the primary key for the new installed
	* @return the new installed
	*/
	@Override
	public com.gasmeters.portlet.model.Installed createInstalled(
		long serialNums) {
		return _installedLocalService.createInstalled(serialNums);
	}

	/**
	* Deletes the installed with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serialNums the primary key of the installed
	* @return the installed that was removed
	* @throws PortalException if a installed with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.gasmeters.portlet.model.Installed deleteInstalled(
		long serialNums)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.deleteInstalled(serialNums);
	}

	/**
	* Deletes the installed from the database. Also notifies the appropriate model listeners.
	*
	* @param installed the installed
	* @return the installed that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.gasmeters.portlet.model.Installed deleteInstalled(
		com.gasmeters.portlet.model.Installed installed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.deleteInstalled(installed);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _installedLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.gasmeters.portlet.model.Installed fetchInstalled(long serialNums)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.fetchInstalled(serialNums);
	}

	/**
	* Returns the installed with the primary key.
	*
	* @param serialNums the primary key of the installed
	* @return the installed
	* @throws PortalException if a installed with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.gasmeters.portlet.model.Installed getInstalled(long serialNums)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.getInstalled(serialNums);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.gasmeters.portlet.model.Installed> getInstalleds(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.getInstalleds(start, end);
	}

	/**
	* Returns the number of installeds.
	*
	* @return the number of installeds
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getInstalledsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.getInstalledsCount();
	}

	/**
	* Updates the installed in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param installed the installed
	* @return the installed that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.gasmeters.portlet.model.Installed updateInstalled(
		com.gasmeters.portlet.model.Installed installed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.updateInstalled(installed);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _installedLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_installedLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _installedLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.gasmeters.portlet.model.Installed addMeter(long serialNums,
		long currInd, int month, int day, int year) {
		return _installedLocalService.addMeter(serialNums, currInd, month, day,
			year);
	}

	@Override
	public java.util.List<com.gasmeters.portlet.model.Installed> getMeters()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.getMeters();
	}

	@Override
	public int getMetersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.getMetersCount();
	}

	@Override
	public java.util.List<com.gasmeters.portlet.model.Installed> getDistinctDate() {
		return _installedLocalService.getDistinctDate();
	}

	@Override
	public int getDistinctDateCount() {
		return _installedLocalService.getDistinctDateCount();
	}

	@Override
	public java.util.List<com.gasmeters.portlet.model.Installed> getDistinctDateInRange(
		java.lang.String start, java.lang.String end) {
		return _installedLocalService.getDistinctDateInRange(start, end);
	}

	@Override
	public int getDistinctDateCountInRange(java.lang.String start,
		java.lang.String end) {
		return _installedLocalService.getDistinctDateCountInRange(start, end);
	}

	@Override
	public java.util.List<com.gasmeters.portlet.model.Installed> getMetersByDate(
		int month, int day, int year) {
		return _installedLocalService.getMetersByDate(month, day, year);
	}

	@Override
	public int getMetersCountByDate(int month, int day, int year) {
		return _installedLocalService.getMetersCountByDate(month, day, year);
	}

	@Override
	public int getMetersCountByDate(java.util.Date date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _installedLocalService.getMetersCountByDate(date);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public InstalledLocalService getWrappedInstalledLocalService() {
		return _installedLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedInstalledLocalService(
		InstalledLocalService installedLocalService) {
		_installedLocalService = installedLocalService;
	}

	@Override
	public InstalledLocalService getWrappedService() {
		return _installedLocalService;
	}

	@Override
	public void setWrappedService(InstalledLocalService installedLocalService) {
		_installedLocalService = installedLocalService;
	}

	private InstalledLocalService _installedLocalService;
}