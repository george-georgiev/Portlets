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

import com.gasmeters.portlet.NoSuchAvailableException;
import com.gasmeters.portlet.model.Available;
import com.gasmeters.portlet.model.impl.AvailableImpl;
import com.gasmeters.portlet.model.impl.AvailableModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the available service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author George
 * @see AvailablePersistence
 * @see AvailableUtil
 * @generated
 */
public class AvailablePersistenceImpl extends BasePersistenceImpl<Available>
	implements AvailablePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AvailableUtil} to access the available persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AvailableImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AvailableModelImpl.ENTITY_CACHE_ENABLED,
			AvailableModelImpl.FINDER_CACHE_ENABLED, AvailableImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AvailableModelImpl.ENTITY_CACHE_ENABLED,
			AvailableModelImpl.FINDER_CACHE_ENABLED, AvailableImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AvailableModelImpl.ENTITY_CACHE_ENABLED,
			AvailableModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(AvailableModelImpl.ENTITY_CACHE_ENABLED,
			AvailableModelImpl.FINDER_CACHE_ENABLED, AvailableImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygroupID",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(AvailableModelImpl.ENTITY_CACHE_ENABLED,
			AvailableModelImpl.FINDER_CACHE_ENABLED, AvailableImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygroupID",
			new String[] { Integer.class.getName() },
			AvailableModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(AvailableModelImpl.ENTITY_CACHE_ENABLED,
			AvailableModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygroupID",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the availables where groupID = &#63;.
	 *
	 * @param groupID the group i d
	 * @return the matching availables
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Available> findBygroupID(int groupID) throws SystemException {
		return findBygroupID(groupID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Available> findBygroupID(int groupID, int start, int end)
		throws SystemException {
		return findBygroupID(groupID, start, end, null);
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
	@Override
	public List<Available> findBygroupID(int groupID, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupID };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
			finderArgs = new Object[] { groupID, start, end, orderByComparator };
		}

		List<Available> list = (List<Available>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Available available : list) {
				if ((groupID != available.getGroupID())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_AVAILABLE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AvailableModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupID);

				if (!pagination) {
					list = (List<Available>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Available>(list);
				}
				else {
					list = (List<Available>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Available findBygroupID_First(int groupID,
		OrderByComparator orderByComparator)
		throws NoSuchAvailableException, SystemException {
		Available available = fetchBygroupID_First(groupID, orderByComparator);

		if (available != null) {
			return available;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupID=");
		msg.append(groupID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAvailableException(msg.toString());
	}

	/**
	 * Returns the first available in the ordered set where groupID = &#63;.
	 *
	 * @param groupID the group i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching available, or <code>null</code> if a matching available could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Available fetchBygroupID_First(int groupID,
		OrderByComparator orderByComparator) throws SystemException {
		List<Available> list = findBygroupID(groupID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Available findBygroupID_Last(int groupID,
		OrderByComparator orderByComparator)
		throws NoSuchAvailableException, SystemException {
		Available available = fetchBygroupID_Last(groupID, orderByComparator);

		if (available != null) {
			return available;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupID=");
		msg.append(groupID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAvailableException(msg.toString());
	}

	/**
	 * Returns the last available in the ordered set where groupID = &#63;.
	 *
	 * @param groupID the group i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching available, or <code>null</code> if a matching available could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Available fetchBygroupID_Last(int groupID,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBygroupID(groupID);

		if (count == 0) {
			return null;
		}

		List<Available> list = findBygroupID(groupID, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Available[] findBygroupID_PrevAndNext(long serialNums, int groupID,
		OrderByComparator orderByComparator)
		throws NoSuchAvailableException, SystemException {
		Available available = findByPrimaryKey(serialNums);

		Session session = null;

		try {
			session = openSession();

			Available[] array = new AvailableImpl[3];

			array[0] = getBygroupID_PrevAndNext(session, available, groupID,
					orderByComparator, true);

			array[1] = available;

			array[2] = getBygroupID_PrevAndNext(session, available, groupID,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Available getBygroupID_PrevAndNext(Session session,
		Available available, int groupID, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_AVAILABLE_WHERE);

		query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(AvailableModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(available);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Available> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the availables where groupID = &#63; from the database.
	 *
	 * @param groupID the group i d
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBygroupID(int groupID) throws SystemException {
		for (Available available : findBygroupID(groupID, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(available);
		}
	}

	/**
	 * Returns the number of availables where groupID = &#63;.
	 *
	 * @param groupID the group i d
	 * @return the number of matching availables
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBygroupID(int groupID) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

		Object[] finderArgs = new Object[] { groupID };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_AVAILABLE_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupID);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "available.groupID = ?";

	public AvailablePersistenceImpl() {
		setModelClass(Available.class);
	}

	/**
	 * Caches the available in the entity cache if it is enabled.
	 *
	 * @param available the available
	 */
	@Override
	public void cacheResult(Available available) {
		EntityCacheUtil.putResult(AvailableModelImpl.ENTITY_CACHE_ENABLED,
			AvailableImpl.class, available.getPrimaryKey(), available);

		available.resetOriginalValues();
	}

	/**
	 * Caches the availables in the entity cache if it is enabled.
	 *
	 * @param availables the availables
	 */
	@Override
	public void cacheResult(List<Available> availables) {
		for (Available available : availables) {
			if (EntityCacheUtil.getResult(
						AvailableModelImpl.ENTITY_CACHE_ENABLED,
						AvailableImpl.class, available.getPrimaryKey()) == null) {
				cacheResult(available);
			}
			else {
				available.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all availables.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(AvailableImpl.class.getName());
		}

		EntityCacheUtil.clearCache(AvailableImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the available.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Available available) {
		EntityCacheUtil.removeResult(AvailableModelImpl.ENTITY_CACHE_ENABLED,
			AvailableImpl.class, available.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Available> availables) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Available available : availables) {
			EntityCacheUtil.removeResult(AvailableModelImpl.ENTITY_CACHE_ENABLED,
				AvailableImpl.class, available.getPrimaryKey());
		}
	}

	/**
	 * Creates a new available with the primary key. Does not add the available to the database.
	 *
	 * @param serialNums the primary key for the new available
	 * @return the new available
	 */
	@Override
	public Available create(long serialNums) {
		Available available = new AvailableImpl();

		available.setNew(true);
		available.setPrimaryKey(serialNums);

		return available;
	}

	/**
	 * Removes the available with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param serialNums the primary key of the available
	 * @return the available that was removed
	 * @throws com.gasmeters.portlet.NoSuchAvailableException if a available with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Available remove(long serialNums)
		throws NoSuchAvailableException, SystemException {
		return remove((Serializable)serialNums);
	}

	/**
	 * Removes the available with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the available
	 * @return the available that was removed
	 * @throws com.gasmeters.portlet.NoSuchAvailableException if a available with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Available remove(Serializable primaryKey)
		throws NoSuchAvailableException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Available available = (Available)session.get(AvailableImpl.class,
					primaryKey);

			if (available == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAvailableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(available);
		}
		catch (NoSuchAvailableException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Available removeImpl(Available available)
		throws SystemException {
		available = toUnwrappedModel(available);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(available)) {
				available = (Available)session.get(AvailableImpl.class,
						available.getPrimaryKeyObj());
			}

			if (available != null) {
				session.delete(available);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (available != null) {
			clearCache(available);
		}

		return available;
	}

	@Override
	public Available updateImpl(com.gasmeters.portlet.model.Available available)
		throws SystemException {
		available = toUnwrappedModel(available);

		boolean isNew = available.isNew();

		AvailableModelImpl availableModelImpl = (AvailableModelImpl)available;

		Session session = null;

		try {
			session = openSession();

			if (available.isNew()) {
				session.save(available);

				available.setNew(false);
			}
			else {
				session.merge(available);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !AvailableModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((availableModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						availableModelImpl.getOriginalGroupID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { availableModelImpl.getGroupID() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(AvailableModelImpl.ENTITY_CACHE_ENABLED,
			AvailableImpl.class, available.getPrimaryKey(), available);

		return available;
	}

	protected Available toUnwrappedModel(Available available) {
		if (available instanceof AvailableImpl) {
			return available;
		}

		AvailableImpl availableImpl = new AvailableImpl();

		availableImpl.setNew(available.isNew());
		availableImpl.setPrimaryKey(available.getPrimaryKey());

		availableImpl.setSerialNums(available.getSerialNums());
		availableImpl.setGroupID(available.getGroupID());

		return availableImpl;
	}

	/**
	 * Returns the available with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the available
	 * @return the available
	 * @throws com.gasmeters.portlet.NoSuchAvailableException if a available with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Available findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAvailableException, SystemException {
		Available available = fetchByPrimaryKey(primaryKey);

		if (available == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAvailableException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return available;
	}

	/**
	 * Returns the available with the primary key or throws a {@link com.gasmeters.portlet.NoSuchAvailableException} if it could not be found.
	 *
	 * @param serialNums the primary key of the available
	 * @return the available
	 * @throws com.gasmeters.portlet.NoSuchAvailableException if a available with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Available findByPrimaryKey(long serialNums)
		throws NoSuchAvailableException, SystemException {
		return findByPrimaryKey((Serializable)serialNums);
	}

	/**
	 * Returns the available with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the available
	 * @return the available, or <code>null</code> if a available with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Available fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Available available = (Available)EntityCacheUtil.getResult(AvailableModelImpl.ENTITY_CACHE_ENABLED,
				AvailableImpl.class, primaryKey);

		if (available == _nullAvailable) {
			return null;
		}

		if (available == null) {
			Session session = null;

			try {
				session = openSession();

				available = (Available)session.get(AvailableImpl.class,
						primaryKey);

				if (available != null) {
					cacheResult(available);
				}
				else {
					EntityCacheUtil.putResult(AvailableModelImpl.ENTITY_CACHE_ENABLED,
						AvailableImpl.class, primaryKey, _nullAvailable);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(AvailableModelImpl.ENTITY_CACHE_ENABLED,
					AvailableImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return available;
	}

	/**
	 * Returns the available with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param serialNums the primary key of the available
	 * @return the available, or <code>null</code> if a available with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Available fetchByPrimaryKey(long serialNums)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)serialNums);
	}

	/**
	 * Returns all the availables.
	 *
	 * @return the availables
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Available> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Available> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Available> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Available> list = (List<Available>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_AVAILABLE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_AVAILABLE;

				if (pagination) {
					sql = sql.concat(AvailableModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Available>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Available>(list);
				}
				else {
					list = (List<Available>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the availables from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Available available : findAll()) {
			remove(available);
		}
	}

	/**
	 * Returns the number of availables.
	 *
	 * @return the number of availables
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_AVAILABLE);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the available persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.gasmeters.portlet.model.Available")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Available>> listenersList = new ArrayList<ModelListener<Available>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Available>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(AvailableImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_AVAILABLE = "SELECT available FROM Available available";
	private static final String _SQL_SELECT_AVAILABLE_WHERE = "SELECT available FROM Available available WHERE ";
	private static final String _SQL_COUNT_AVAILABLE = "SELECT COUNT(available) FROM Available available";
	private static final String _SQL_COUNT_AVAILABLE_WHERE = "SELECT COUNT(available) FROM Available available WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "available.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Available exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Available exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(AvailablePersistenceImpl.class);
	private static Available _nullAvailable = new AvailableImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Available> toCacheModel() {
				return _nullAvailableCacheModel;
			}
		};

	private static CacheModel<Available> _nullAvailableCacheModel = new CacheModel<Available>() {
			@Override
			public Available toEntityModel() {
				return _nullAvailable;
			}
		};
}