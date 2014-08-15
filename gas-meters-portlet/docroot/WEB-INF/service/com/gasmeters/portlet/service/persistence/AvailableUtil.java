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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the available service. This utility wraps {@link AvailablePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author George
 * @see AvailablePersistence
 * @see AvailablePersistenceImpl
 * @generated
 */
public class AvailableUtil {
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
	public static void clearCache(Available available) {
		getPersistence().clearCache(available);
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
	public static List<Available> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Available> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Available> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Available update(Available available)
		throws SystemException {
		return getPersistence().update(available);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Available update(Available available,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(available, serviceContext);
	}

	/**
	* Returns all the availables where groupID = &#63;.
	*
	* @param groupID the group i d
	* @return the matching availables
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.gasmeters.portlet.model.Available> findBygroupID(
		int groupID) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupID(groupID);
	}

	/**
	* Returns a range of all the availables where groupID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gasmeters.portlet.model.impl.AvailableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupID the group i d
	* @param start the lower bound of the range of availables
	* @param end the upper bound of the range of availables (not inclusive)
	* @return the range of matching availables
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.gasmeters.portlet.model.Available> findBygroupID(
		int groupID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupID(groupID, start, end);
	}

	/**
	* Returns an ordered range of all the availables where groupID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gasmeters.portlet.model.impl.AvailableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupID the group i d
	* @param start the lower bound of the range of availables
	* @param end the upper bound of the range of availables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching availables
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.gasmeters.portlet.model.Available> findBygroupID(
		int groupID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygroupID(groupID, start, end, orderByComparator);
	}

	/**
	* Returns the first available in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching available
	* @throws com.gasmeters.portlet.NoSuchAvailableException if a matching available could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Available findBygroupID_First(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchAvailableException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupID_First(groupID, orderByComparator);
	}

	/**
	* Returns the first available in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching available, or <code>null</code> if a matching available could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Available fetchBygroupID_First(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBygroupID_First(groupID, orderByComparator);
	}

	/**
	* Returns the last available in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching available
	* @throws com.gasmeters.portlet.NoSuchAvailableException if a matching available could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Available findBygroupID_Last(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchAvailableException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findBygroupID_Last(groupID, orderByComparator);
	}

	/**
	* Returns the last available in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching available, or <code>null</code> if a matching available could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Available fetchBygroupID_Last(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchBygroupID_Last(groupID, orderByComparator);
	}

	/**
	* Returns the availables before and after the current available in the ordered set where groupID = &#63;.
	*
	* @param serialNums the primary key of the current available
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next available
	* @throws com.gasmeters.portlet.NoSuchAvailableException if a available with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Available[] findBygroupID_PrevAndNext(
		long serialNums, int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchAvailableException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findBygroupID_PrevAndNext(serialNums, groupID,
			orderByComparator);
	}

	/**
	* Removes all the availables where groupID = &#63; from the database.
	*
	* @param groupID the group i d
	* @throws SystemException if a system exception occurred
	*/
	public static void removeBygroupID(int groupID)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeBygroupID(groupID);
	}

	/**
	* Returns the number of availables where groupID = &#63;.
	*
	* @param groupID the group i d
	* @return the number of matching availables
	* @throws SystemException if a system exception occurred
	*/
	public static int countBygroupID(int groupID)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countBygroupID(groupID);
	}

	/**
	* Caches the available in the entity cache if it is enabled.
	*
	* @param available the available
	*/
	public static void cacheResult(
		com.gasmeters.portlet.model.Available available) {
		getPersistence().cacheResult(available);
	}

	/**
	* Caches the availables in the entity cache if it is enabled.
	*
	* @param availables the availables
	*/
	public static void cacheResult(
		java.util.List<com.gasmeters.portlet.model.Available> availables) {
		getPersistence().cacheResult(availables);
	}

	/**
	* Creates a new available with the primary key. Does not add the available to the database.
	*
	* @param serialNums the primary key for the new available
	* @return the new available
	*/
	public static com.gasmeters.portlet.model.Available create(long serialNums) {
		return getPersistence().create(serialNums);
	}

	/**
	* Removes the available with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serialNums the primary key of the available
	* @return the available that was removed
	* @throws com.gasmeters.portlet.NoSuchAvailableException if a available with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Available remove(long serialNums)
		throws com.gasmeters.portlet.NoSuchAvailableException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(serialNums);
	}

	public static com.gasmeters.portlet.model.Available updateImpl(
		com.gasmeters.portlet.model.Available available)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(available);
	}

	/**
	* Returns the available with the primary key or throws a {@link com.gasmeters.portlet.NoSuchAvailableException} if it could not be found.
	*
	* @param serialNums the primary key of the available
	* @return the available
	* @throws com.gasmeters.portlet.NoSuchAvailableException if a available with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Available findByPrimaryKey(
		long serialNums)
		throws com.gasmeters.portlet.NoSuchAvailableException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(serialNums);
	}

	/**
	* Returns the available with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param serialNums the primary key of the available
	* @return the available, or <code>null</code> if a available with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.gasmeters.portlet.model.Available fetchByPrimaryKey(
		long serialNums)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(serialNums);
	}

	/**
	* Returns all the availables.
	*
	* @return the availables
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.gasmeters.portlet.model.Available> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.gasmeters.portlet.model.Available> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the availables.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gasmeters.portlet.model.impl.AvailableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of availables
	* @param end the upper bound of the range of availables (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of availables
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.gasmeters.portlet.model.Available> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the availables from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of availables.
	*
	* @return the number of availables
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static AvailablePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (AvailablePersistence)PortletBeanLocatorUtil.locate(com.gasmeters.portlet.service.ClpSerializer.getServletContextName(),
					AvailablePersistence.class.getName());

			ReferenceRegistry.registerReference(AvailableUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(AvailablePersistence persistence) {
	}

	private static AvailablePersistence _persistence;
}