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
 * Provides a wrapper for {@link AvailableLocalService}.
 *
 * @author George
 * @see AvailableLocalService
 * @generated
 */
public class AvailableLocalServiceWrapper implements AvailableLocalService,
	ServiceWrapper<AvailableLocalService> {
	public AvailableLocalServiceWrapper(
		AvailableLocalService availableLocalService) {
		_availableLocalService = availableLocalService;
	}

	/**
	* Adds the available to the database. Also notifies the appropriate model listeners.
	*
	* @param available the available
	* @return the available that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.gasmeters.portlet.model.Available addAvailable(
		com.gasmeters.portlet.model.Available available)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.addAvailable(available);
	}

	/**
	* Creates a new available with the primary key. Does not add the available to the database.
	*
	* @param serialNums the primary key for the new available
	* @return the new available
	*/
	@Override
	public com.gasmeters.portlet.model.Available createAvailable(
		long serialNums) {
		return _availableLocalService.createAvailable(serialNums);
	}

	/**
	* Deletes the available with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serialNums the primary key of the available
	* @return the available that was removed
	* @throws PortalException if a available with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.gasmeters.portlet.model.Available deleteAvailable(
		long serialNums)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.deleteAvailable(serialNums);
	}

	/**
	* Deletes the available from the database. Also notifies the appropriate model listeners.
	*
	* @param available the available
	* @return the available that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.gasmeters.portlet.model.Available deleteAvailable(
		com.gasmeters.portlet.model.Available available)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.deleteAvailable(available);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _availableLocalService.dynamicQuery();
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
		return _availableLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gasmeters.portlet.model.impl.AvailableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _availableLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gasmeters.portlet.model.impl.AvailableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _availableLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _availableLocalService.dynamicQueryCount(dynamicQuery);
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
		return _availableLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.gasmeters.portlet.model.Available fetchAvailable(long serialNums)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.fetchAvailable(serialNums);
	}

	/**
	* Returns the available with the primary key.
	*
	* @param serialNums the primary key of the available
	* @return the available
	* @throws PortalException if a available with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.gasmeters.portlet.model.Available getAvailable(long serialNums)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.getAvailable(serialNums);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the availables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gasmeters.portlet.model.impl.AvailableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of availables
	* @param end the upper bound of the range of availables (not inclusive)
	* @return the range of availables
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.gasmeters.portlet.model.Available> getAvailables(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.getAvailables(start, end);
	}

	/**
	* Returns the number of availables.
	*
	* @return the number of availables
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getAvailablesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.getAvailablesCount();
	}

	/**
	* Updates the available in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param available the available
	* @return the available that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.gasmeters.portlet.model.Available updateAvailable(
		com.gasmeters.portlet.model.Available available)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.updateAvailable(available);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _availableLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_availableLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _availableLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.gasmeters.portlet.model.Available addMeter(long serialNums)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.addMeter(serialNums);
	}

	@Override
	public com.gasmeters.portlet.model.Available deleteMeter(
		com.gasmeters.portlet.model.Available meter)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.deleteMeter(meter);
	}

	@Override
	public com.gasmeters.portlet.model.Available deleteMeter(long serialNums)
		throws com.gasmeters.portlet.NoSuchAvailableException,
			com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.deleteMeter(serialNums);
	}

	@Override
	public java.util.List<com.gasmeters.portlet.model.Available> getMeters()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.getMeters();
	}

	@Override
	public java.util.List<com.gasmeters.portlet.model.Available> getMeters(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.getMeters(start, end);
	}

	@Override
	public int getMetersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _availableLocalService.getMetersCount();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public AvailableLocalService getWrappedAvailableLocalService() {
		return _availableLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedAvailableLocalService(
		AvailableLocalService availableLocalService) {
		_availableLocalService = availableLocalService;
	}

	@Override
	public AvailableLocalService getWrappedService() {
		return _availableLocalService;
	}

	@Override
	public void setWrappedService(AvailableLocalService availableLocalService) {
		_availableLocalService = availableLocalService;
	}

	private AvailableLocalService _availableLocalService;
}