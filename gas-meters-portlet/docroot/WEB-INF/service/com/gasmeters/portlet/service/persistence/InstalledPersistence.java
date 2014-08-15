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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the installed service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author George
 * @see InstalledPersistenceImpl
 * @see InstalledUtil
 * @generated
 */
public interface InstalledPersistence extends BasePersistence<Installed> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InstalledUtil} to access the installed persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the installeds where groupID = &#63;.
	*
	* @param groupID the group i d
	* @return the matching installeds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.gasmeters.portlet.model.Installed> findBygroupID(
		int groupID) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.gasmeters.portlet.model.Installed> findBygroupID(
		int groupID, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.gasmeters.portlet.model.Installed> findBygroupID(
		int groupID, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first installed in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching installed
	* @throws com.gasmeters.portlet.NoSuchInstalledException if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Installed findBygroupID_First(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first installed in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching installed, or <code>null</code> if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Installed fetchBygroupID_First(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last installed in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching installed
	* @throws com.gasmeters.portlet.NoSuchInstalledException if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Installed findBygroupID_Last(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last installed in the ordered set where groupID = &#63;.
	*
	* @param groupID the group i d
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching installed, or <code>null</code> if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Installed fetchBygroupID_Last(
		int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.gasmeters.portlet.model.Installed[] findBygroupID_PrevAndNext(
		long serialNums, int groupID,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the installeds where groupID = &#63; from the database.
	*
	* @param groupID the group i d
	* @throws SystemException if a system exception occurred
	*/
	public void removeBygroupID(int groupID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of installeds where groupID = &#63;.
	*
	* @param groupID the group i d
	* @return the number of matching installeds
	* @throws SystemException if a system exception occurred
	*/
	public int countBygroupID(int groupID)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the installeds where date = &#63;.
	*
	* @param date the date
	* @return the matching installeds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.gasmeters.portlet.model.Installed> findBydate(
		java.util.Date date)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.gasmeters.portlet.model.Installed> findBydate(
		java.util.Date date, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.gasmeters.portlet.model.Installed> findBydate(
		java.util.Date date, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first installed in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching installed
	* @throws com.gasmeters.portlet.NoSuchInstalledException if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Installed findBydate_First(
		java.util.Date date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first installed in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching installed, or <code>null</code> if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Installed fetchBydate_First(
		java.util.Date date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last installed in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching installed
	* @throws com.gasmeters.portlet.NoSuchInstalledException if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Installed findBydate_Last(
		java.util.Date date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last installed in the ordered set where date = &#63;.
	*
	* @param date the date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching installed, or <code>null</code> if a matching installed could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Installed fetchBydate_Last(
		java.util.Date date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.gasmeters.portlet.model.Installed[] findBydate_PrevAndNext(
		long serialNums, java.util.Date date,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the installeds where date = &#63; from the database.
	*
	* @param date the date
	* @throws SystemException if a system exception occurred
	*/
	public void removeBydate(java.util.Date date)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of installeds where date = &#63;.
	*
	* @param date the date
	* @return the number of matching installeds
	* @throws SystemException if a system exception occurred
	*/
	public int countBydate(java.util.Date date)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the installed in the entity cache if it is enabled.
	*
	* @param installed the installed
	*/
	public void cacheResult(com.gasmeters.portlet.model.Installed installed);

	/**
	* Caches the installeds in the entity cache if it is enabled.
	*
	* @param installeds the installeds
	*/
	public void cacheResult(
		java.util.List<com.gasmeters.portlet.model.Installed> installeds);

	/**
	* Creates a new installed with the primary key. Does not add the installed to the database.
	*
	* @param serialNums the primary key for the new installed
	* @return the new installed
	*/
	public com.gasmeters.portlet.model.Installed create(long serialNums);

	/**
	* Removes the installed with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serialNums the primary key of the installed
	* @return the installed that was removed
	* @throws com.gasmeters.portlet.NoSuchInstalledException if a installed with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Installed remove(long serialNums)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.gasmeters.portlet.model.Installed updateImpl(
		com.gasmeters.portlet.model.Installed installed)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the installed with the primary key or throws a {@link com.gasmeters.portlet.NoSuchInstalledException} if it could not be found.
	*
	* @param serialNums the primary key of the installed
	* @return the installed
	* @throws com.gasmeters.portlet.NoSuchInstalledException if a installed with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Installed findByPrimaryKey(
		long serialNums)
		throws com.gasmeters.portlet.NoSuchInstalledException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the installed with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param serialNums the primary key of the installed
	* @return the installed, or <code>null</code> if a installed with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.gasmeters.portlet.model.Installed fetchByPrimaryKey(
		long serialNums)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the installeds.
	*
	* @return the installeds
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.gasmeters.portlet.model.Installed> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.gasmeters.portlet.model.Installed> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.gasmeters.portlet.model.Installed> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the installeds from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of installeds.
	*
	* @return the number of installeds
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}