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

import com.gasmeters.portlet.model.Installed;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the installed service. This utility wraps {@link InstalledPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author George
 * @see InstalledPersistence
 * @see InstalledPersistenceImpl
 * @generated
 */
public class InstalledUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Installed installed) {
		getPersistence().clearCache(installed);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Installed> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Installed> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Installed> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Installed update(Installed installed)
		throws SystemException {
		return getPersistence().update(installed);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Installed update(Installed installed,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(installed, serviceContext);
	}

	/**
	* Returns all the installeds where groupID = &#63;.
	*
	* @param groupID the group i d
	* @return the matching installeds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.gasmeters.portlet.model.Installed> findBygroupID(
		int groupID) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupID(groupID);
	}

	/**
	* Returns a range of all the installeds where groupID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gasmeters.portlet.model.impl.InstalledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupID the group i d
	* @param start the lower bound of the range of installeds
	* @param end the upper bound of the range of installeds (not inclusive)
	* @return the range of matching installeds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.gasmeters.portlet.model.Installed> findBygroupID(
		int groupID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupID(groupID, start, end);
	}

	/**
	* Returns an ordered range of all the installeds where groupID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gasmeters.portlet.model.impl.InstalledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupID the group i d
	* @param start the lower bound of the range of installeds
	* @param end the upper bound of the range of installeds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching installeds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.gasmeters.portlet.model.Installed> findBygroupID(
		int groupID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygroupID(groupID, start, end, orderByComparator);
	}

	/**
	* Returns the first installed in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching installed
	* @throws com.gasmeters.portlet.NoSuchInstalledException if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed findBygroupID_First(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupID_First(groupID, orderByComparator);
	}

	/**
	* Returns the first installed in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching installed, or <code>null</code> if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed fetchBygroupID_First(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBygroupID_First(groupID, orderByComparator);
	}

	/**
	* Returns the last installed in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching installed
	* @throws com.gasmeters.portlet.NoSuchInstalledException if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed findBygroupID_Last(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupID_Last(groupID, orderByComparator);
	}

	/**
	* Returns the last installed in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching installed, or <code>null</code> if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed fetchBygroupID_Last(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBygroupID_Last(groupID, orderByComparator);
	}

	/**
	* Returns the installeds before and after the current installed in the ordered set where groupID = &#63;.
	*
	* @param serialNums the primary key of the current installed
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next installed
	* @throws com.gasmeters.portlet.NoSuchInstalledException if a installed with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed[] findBygroupID_PrevAndNext(
		long serialNums, int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygroupID_PrevAndNext(serialNums, groupID,
			orderByComparator);
	}

	/**
	* Removes all the installeds where groupID = &#63; from the database.
	*
	* @param groupID the group i d
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBygroupID(int groupID)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBygroupID(groupID);
	}

	/**
	* Returns the number of installeds where groupID = &#63;.
	*
	* @param groupID the group i d
	* @return the number of matching installeds
	* @throws SystemException if a system exception occurred
	*/
	public static int countBygroupID(int groupID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBygroupID(groupID);
	}

	/**
	* Returns all the installeds where date = &#63;.
	*
	* @param date the date
	* @return the matching installeds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.gasmeters.portlet.model.Installed> findBydate(
		java.util.Date date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBydate(date);
	}

	/**
	* Returns a range of all the installeds where date = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gasmeters.portlet.model.impl.InstalledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param date the date
	* @param start the lower bound of the range of installeds
	* @param end the upper bound of the range of installeds (not inclusive)
	* @return the range of matching installeds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.gasmeters.portlet.model.Installed> findBydate(
		java.util.Date date, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBydate(date, start, end);
	}

	/**
	* Returns an ordered range of all the installeds where date = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gasmeters.portlet.model.impl.InstalledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param date the date
	* @param start the lower bound of the range of installeds
	* @param end the upper bound of the range of installeds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching installeds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.gasmeters.portlet.model.Installed> findBydate(
		java.util.Date date, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBydate(date, start, end, orderByComparator);
	}

	/**
	* Returns the first installed in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching installed
	* @throws com.gasmeters.portlet.NoSuchInstalledException if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed findBydate_First(
		java.util.Date date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBydate_First(date, orderByComparator);
	}

	/**
	* Returns the first installed in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching installed, or <code>null</code> if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed fetchBydate_First(
		java.util.Date date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBydate_First(date, orderByComparator);
	}

	/**
	* Returns the last installed in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching installed
	* @throws com.gasmeters.portlet.NoSuchInstalledException if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed findBydate_Last(
		java.util.Date date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBydate_Last(date, orderByComparator);
	}

	/**
	* Returns the last installed in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching installed, or <code>null</code> if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed fetchBydate_Last(
		java.util.Date date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBydate_Last(date, orderByComparator);
	}

	/**
	* Returns the installeds before and after the current installed in the ordered set where date = &#63;.
	*
	* @param serialNums the primary key of the current installed
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next installed
	* @throws com.gasmeters.portlet.NoSuchInstalledException if a installed with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed[] findBydate_PrevAndNext(
		long serialNums, java.util.Date date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBydate_PrevAndNext(serialNums, date, orderByComparator);
	}

	/**
	* Removes all the installeds where date = &#63; from the database.
	*
	* @param date the date
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBydate(java.util.Date date)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBydate(date);
	}

	/**
	* Returns the number of installeds where date = &#63;.
	*
	* @param date the date
	* @return the number of matching installeds
	* @throws SystemException if a system exception occurred
	*/
	public static int countBydate(java.util.Date date)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBydate(date);
	}

	/**
	* Caches the installed in the entity cache if it is enabled.
	*
	* @param installed the installed
	*/
	public static void cacheResult(
		com.gasmeters.portlet.model.Installed installed) {
		getPersistence().cacheResult(installed);
	}

	/**
	* Caches the installeds in the entity cache if it is enabled.
	*
	* @param installeds the installeds
	*/
	public static void cacheResult(
		java.util.List<com.gasmeters.portlet.model.Installed> installeds) {
		getPersistence().cacheResult(installeds);
	}

	/**
	* Creates a new installed with the primary key. Does not add the installed to the database.
	*
	* @param serialNums the primary key for the new installed
	* @return the new installed
	*/
	public static com.gasmeters.portlet.model.Installed create(long serialNums) {
		return getPersistence().create(serialNums);
	}

	/**
	* Removes the installed with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serialNums the primary key of the installed
	* @return the installed that was removed
	* @throws com.gasmeters.portlet.NoSuchInstalledException if a installed with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed remove(long serialNums)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(serialNums);
	}

	public static com.gasmeters.portlet.model.Installed updateImpl(
		com.gasmeters.portlet.model.Installed installed)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(installed);
	}

	/**
	* Returns the installed with the primary key or throws a {@link com.gasmeters.portlet.NoSuchInstalledException} if it could not be found.
	*
	* @param serialNums the primary key of the installed
	* @return the installed
	* @throws com.gasmeters.portlet.NoSuchInstalledException if a installed with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed findByPrimaryKey(
		long serialNums)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(serialNums);
	}

	/**
	* Returns the installed with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param serialNums the primary key of the installed
	* @return the installed, or <code>null</code> if a installed with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Installed fetchByPrimaryKey(
		long serialNums)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(serialNums);
	}

	/**
	* Returns all the installeds.
	*
	* @return the installeds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.gasmeters.portlet.model.Installed> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.gasmeters.portlet.model.Installed> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the installeds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gasmeters.portlet.model.impl.InstalledModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of installeds
	* @param end the upper bound of the range of installeds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of installeds
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.gasmeters.portlet.model.Installed> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the installeds from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of installeds.
	*
	* @return the number of installeds
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static InstalledPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (InstalledPersistence)PortletBeanLocatorUtil.locate(com.gasmeters.portlet.service.ClpSerializer.getServletContextName(),
					InstalledPersistence.class.getName());

			ReferenceRegistry.registerReference(InstalledUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(InstalledPersistence persistence) {
	}

	private static InstalledPersistence _persistence;
}