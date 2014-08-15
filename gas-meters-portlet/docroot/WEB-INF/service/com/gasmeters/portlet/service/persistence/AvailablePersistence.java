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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the available service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author George
 * @see AvailablePersistenceImpl
 * @see AvailableUtil
 * @generated
 */
public interface AvailablePersistence extends BasePersistence<Available> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AvailableUtil} to access the available persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the availables where groupID = &#63;.
	*
	* @param groupID the group i d
	* @return the matching availables
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.gasmeters.portlet.model.Available> findBygroupID(
		int groupID) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.gasmeters.portlet.model.Available> findBygroupID(
		int groupID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.gasmeters.portlet.model.Available> findBygroupID(
		int groupID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first available in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching available
	* @throws com.gasmeters.portlet.NoSuchAvailableException if a matching available could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Available findBygroupID_First(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchAvailableException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first available in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching available, or <code>null</code> if a matching available could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Available fetchBygroupID_First(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last available in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching available
	* @throws com.gasmeters.portlet.NoSuchAvailableException if a matching available could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Available findBygroupID_Last(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchAvailableException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last available in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching available, or <code>null</code> if a matching available could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Available fetchBygroupID_Last(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.gasmeters.portlet.model.Available[] findBygroupID_PrevAndNext(
		long serialNums, int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchAvailableException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the availables where groupID = &#63; from the database.
	*
	* @param groupID the group i d
	* @throws SystemException if a system exception occurred
	*/
	public void removeBygroupID(int groupID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of availables where groupID = &#63;.
	*
	* @param groupID the group i d
	* @return the number of matching availables
	* @throws SystemException if a system exception occurred
	*/
	public int countBygroupID(int groupID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the available in the entity cache if it is enabled.
	*
	* @param available the available
	*/
	public void cacheResult(com.gasmeters.portlet.model.Available available);

	/**
	* Caches the availables in the entity cache if it is enabled.
	*
	* @param availables the availables
	*/
	public void cacheResult(
		java.util.List<com.gasmeters.portlet.model.Available> availables);

	/**
	* Creates a new available with the primary key. Does not add the available to the database.
	*
	* @param serialNums the primary key for the new available
	* @return the new available
	*/
	public com.gasmeters.portlet.model.Available create(long serialNums);

	/**
	* Removes the available with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serialNums the primary key of the available
	* @return the available that was removed
	* @throws com.gasmeters.portlet.NoSuchAvailableException if a available with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Available remove(long serialNums)
		throws com.gasmeters.portlet.NoSuchAvailableException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.gasmeters.portlet.model.Available updateImpl(
		com.gasmeters.portlet.model.Available available)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the available with the primary key or throws a {@link com.gasmeters.portlet.NoSuchAvailableException} if it could not be found.
	*
	* @param serialNums the primary key of the available
	* @return the available
	* @throws com.gasmeters.portlet.NoSuchAvailableException if a available with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Available findByPrimaryKey(
		long serialNums)
		throws com.gasmeters.portlet.NoSuchAvailableException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the available with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param serialNums the primary key of the available
	* @return the available, or <code>null</code> if a available with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Available fetchByPrimaryKey(
		long serialNums)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the availables.
	*
	* @return the availables
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.gasmeters.portlet.model.Available> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.gasmeters.portlet.model.Available> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.gasmeters.portlet.model.Available> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the availables from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of availables.
	*
	* @return the number of availables
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}