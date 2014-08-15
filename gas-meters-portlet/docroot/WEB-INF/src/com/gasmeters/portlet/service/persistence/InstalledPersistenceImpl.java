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

import com.gasmeters.portlet.NoSuchInstalledException;
import com.gasmeters.portlet.model.Installed;
import com.gasmeters.portlet.model.impl.InstalledImpl;
import com.gasmeters.portlet.model.impl.InstalledModelImpl;

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
import com.liferay.portal.kernel.util.CalendarUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the installed service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author George
 * @see InstalledPersistence
 * @see InstalledUtil
 * @generated
 */
public class InstalledPersistenceImpl extends BasePersistenceImpl<Installed>
	implements InstalledPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link InstalledUtil} to access the installed persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = InstalledImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(InstalledModelImpl.ENTITY_CACHE_ENABLED,
			InstalledModelImpl.FINDER_CACHE_ENABLED, InstalledImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(InstalledModelImpl.ENTITY_CACHE_ENABLED,
			InstalledModelImpl.FINDER_CACHE_ENABLED, InstalledImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(InstalledModelImpl.ENTITY_CACHE_ENABLED,
			InstalledModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(InstalledModelImpl.ENTITY_CACHE_ENABLED,
			InstalledModelImpl.FINDER_CACHE_ENABLED, InstalledImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygroupID",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
		new FinderPath(InstalledModelImpl.ENTITY_CACHE_ENABLED,
			InstalledModelImpl.FINDER_CACHE_ENABLED, InstalledImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygroupID",
			new String[] { Integer.class.getName() },
			InstalledModelImpl.GROUPID_COLUMN_BITMASK |
			InstalledModelImpl.DATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(InstalledModelImpl.ENTITY_CACHE_ENABLED,
			InstalledModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygroupID",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the installeds where groupID = &#63;.
	 *
	 * @param groupID the group i d
	 * @return the matching installeds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Installed> findBygroupID(int groupID) throws SystemException {
		return findBygroupID(groupID, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Installed> findBygroupID(int groupID, int start, int end)
		throws SystemException {
		return findBygroupID(groupID, start, end, null);
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
	@Override
	public List<Installed> findBygroupID(int groupID, int start, int end,
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

		List<Installed> list = (List<Installed>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Installed installed : list) {
				if ((groupID != installed.getGroupID())) {
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

			query.append(_SQL_SELECT_INSTALLED_WHERE);

			query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(InstalledModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupID);

				if (!pagination) {
					list = (List<Installed>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Installed>(list);
				}
				else {
					list = (List<Installed>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first installed in the ordered set where groupID = &#63;.
	 *
	 * @param groupID the group i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching installed
	 * @throws com.gasmeters.portlet.NoSuchInstalledException if a matching installed could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Installed findBygroupID_First(int groupID,
		OrderByComparator orderByComparator)
		throws NoSuchInstalledException, SystemException {
		Installed installed = fetchBygroupID_First(groupID, orderByComparator);

		if (installed != null) {
			return installed;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupID=");
		msg.append(groupID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInstalledException(msg.toString());
	}

	/**
	 * Returns the first installed in the ordered set where groupID = &#63;.
	 *
	 * @param groupID the group i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching installed, or <code>null</code> if a matching installed could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Installed fetchBygroupID_First(int groupID,
		OrderByComparator orderByComparator) throws SystemException {
		List<Installed> list = findBygroupID(groupID, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Installed findBygroupID_Last(int groupID,
		OrderByComparator orderByComparator)
		throws NoSuchInstalledException, SystemException {
		Installed installed = fetchBygroupID_Last(groupID, orderByComparator);

		if (installed != null) {
			return installed;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupID=");
		msg.append(groupID);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInstalledException(msg.toString());
	}

	/**
	 * Returns the last installed in the ordered set where groupID = &#63;.
	 *
	 * @param groupID the group i d
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching installed, or <code>null</code> if a matching installed could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Installed fetchBygroupID_Last(int groupID,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBygroupID(groupID);

		if (count == 0) {
			return null;
		}

		List<Installed> list = findBygroupID(groupID, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Installed[] findBygroupID_PrevAndNext(long serialNums, int groupID,
		OrderByComparator orderByComparator)
		throws NoSuchInstalledException, SystemException {
		Installed installed = findByPrimaryKey(serialNums);

		Session session = null;

		try {
			session = openSession();

			Installed[] array = new InstalledImpl[3];

			array[0] = getBygroupID_PrevAndNext(session, installed, groupID,
					orderByComparator, true);

			array[1] = installed;

			array[2] = getBygroupID_PrevAndNext(session, installed, groupID,
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

	protected Installed getBygroupID_PrevAndNext(Session session,
		Installed installed, int groupID, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INSTALLED_WHERE);

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
			query.append(InstalledModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupID);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(installed);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Installed> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the installeds where groupID = &#63; from the database.
	 *
	 * @param groupID the group i d
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBygroupID(int groupID) throws SystemException {
		for (Installed installed : findBygroupID(groupID, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(installed);
		}
	}

	/**
	 * Returns the number of installeds where groupID = &#63;.
	 *
	 * @param groupID the group i d
	 * @return the number of matching installeds
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

			query.append(_SQL_COUNT_INSTALLED_WHERE);

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

	private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "installed.groupID = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DATE = new FinderPath(InstalledModelImpl.ENTITY_CACHE_ENABLED,
			InstalledModelImpl.FINDER_CACHE_ENABLED, InstalledImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBydate",
			new String[] {
				Date.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATE = new FinderPath(InstalledModelImpl.ENTITY_CACHE_ENABLED,
			InstalledModelImpl.FINDER_CACHE_ENABLED, InstalledImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBydate",
			new String[] { Date.class.getName() },
			InstalledModelImpl.DATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DATE = new FinderPath(InstalledModelImpl.ENTITY_CACHE_ENABLED,
			InstalledModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBydate",
			new String[] { Date.class.getName() });

	/**
	 * Returns all the installeds where date = &#63;.
	 *
	 * @param date the date
	 * @return the matching installeds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Installed> findBydate(Date date) throws SystemException {
		return findBydate(date, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Installed> findBydate(Date date, int start, int end)
		throws SystemException {
		return findBydate(date, start, end, null);
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
	@Override
	public List<Installed> findBydate(Date date, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATE;
			finderArgs = new Object[] { date };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DATE;
			finderArgs = new Object[] { date, start, end, orderByComparator };
		}

		List<Installed> list = (List<Installed>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Installed installed : list) {
				if (!Validator.equals(date, installed.getDate())) {
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

			query.append(_SQL_SELECT_INSTALLED_WHERE);

			boolean bindDate = false;

			if (date == null) {
				query.append(_FINDER_COLUMN_DATE_DATE_1);
			}
			else {
				bindDate = true;

				query.append(_FINDER_COLUMN_DATE_DATE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(InstalledModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDate) {
					qPos.add(CalendarUtil.getTimestamp(date));
				}

				if (!pagination) {
					list = (List<Installed>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Installed>(list);
				}
				else {
					list = (List<Installed>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first installed in the ordered set where date = &#63;.
	 *
	 * @param date the date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching installed
	 * @throws com.gasmeters.portlet.NoSuchInstalledException if a matching installed could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Installed findBydate_First(Date date,
		OrderByComparator orderByComparator)
		throws NoSuchInstalledException, SystemException {
		Installed installed = fetchBydate_First(date, orderByComparator);

		if (installed != null) {
			return installed;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("date=");
		msg.append(date);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInstalledException(msg.toString());
	}

	/**
	 * Returns the first installed in the ordered set where date = &#63;.
	 *
	 * @param date the date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching installed, or <code>null</code> if a matching installed could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Installed fetchBydate_First(Date date,
		OrderByComparator orderByComparator) throws SystemException {
		List<Installed> list = findBydate(date, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Installed findBydate_Last(Date date,
		OrderByComparator orderByComparator)
		throws NoSuchInstalledException, SystemException {
		Installed installed = fetchBydate_Last(date, orderByComparator);

		if (installed != null) {
			return installed;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("date=");
		msg.append(date);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchInstalledException(msg.toString());
	}

	/**
	 * Returns the last installed in the ordered set where date = &#63;.
	 *
	 * @param date the date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching installed, or <code>null</code> if a matching installed could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Installed fetchBydate_Last(Date date,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countBydate(date);

		if (count == 0) {
			return null;
		}

		List<Installed> list = findBydate(date, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Installed[] findBydate_PrevAndNext(long serialNums, Date date,
		OrderByComparator orderByComparator)
		throws NoSuchInstalledException, SystemException {
		Installed installed = findByPrimaryKey(serialNums);

		Session session = null;

		try {
			session = openSession();

			Installed[] array = new InstalledImpl[3];

			array[0] = getBydate_PrevAndNext(session, installed, date,
					orderByComparator, true);

			array[1] = installed;

			array[2] = getBydate_PrevAndNext(session, installed, date,
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

	protected Installed getBydate_PrevAndNext(Session session,
		Installed installed, Date date, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_INSTALLED_WHERE);

		boolean bindDate = false;

		if (date == null) {
			query.append(_FINDER_COLUMN_DATE_DATE_1);
		}
		else {
			bindDate = true;

			query.append(_FINDER_COLUMN_DATE_DATE_2);
		}

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
			query.append(InstalledModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDate) {
			qPos.add(CalendarUtil.getTimestamp(date));
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(installed);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Installed> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the installeds where date = &#63; from the database.
	 *
	 * @param date the date
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeBydate(Date date) throws SystemException {
		for (Installed installed : findBydate(date, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(installed);
		}
	}

	/**
	 * Returns the number of installeds where date = &#63;.
	 *
	 * @param date the date
	 * @return the number of matching installeds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countBydate(Date date) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DATE;

		Object[] finderArgs = new Object[] { date };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_INSTALLED_WHERE);

			boolean bindDate = false;

			if (date == null) {
				query.append(_FINDER_COLUMN_DATE_DATE_1);
			}
			else {
				bindDate = true;

				query.append(_FINDER_COLUMN_DATE_DATE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDate) {
					qPos.add(CalendarUtil.getTimestamp(date));
				}

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

	private static final String _FINDER_COLUMN_DATE_DATE_1 = "installed.date IS NULL";
	private static final String _FINDER_COLUMN_DATE_DATE_2 = "installed.date = ?";

	public InstalledPersistenceImpl() {
		setModelClass(Installed.class);
	}

	/**
	 * Caches the installed in the entity cache if it is enabled.
	 *
	 * @param installed the installed
	 */
	@Override
	public void cacheResult(Installed installed) {
		EntityCacheUtil.putResult(InstalledModelImpl.ENTITY_CACHE_ENABLED,
			InstalledImpl.class, installed.getPrimaryKey(), installed);

		installed.resetOriginalValues();
	}

	/**
	 * Caches the installeds in the entity cache if it is enabled.
	 *
	 * @param installeds the installeds
	 */
	@Override
	public void cacheResult(List<Installed> installeds) {
		for (Installed installed : installeds) {
			if (EntityCacheUtil.getResult(
						InstalledModelImpl.ENTITY_CACHE_ENABLED,
						InstalledImpl.class, installed.getPrimaryKey()) == null) {
				cacheResult(installed);
			}
			else {
				installed.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all installeds.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(InstalledImpl.class.getName());
		}

		EntityCacheUtil.clearCache(InstalledImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the installed.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Installed installed) {
		EntityCacheUtil.removeResult(InstalledModelImpl.ENTITY_CACHE_ENABLED,
			InstalledImpl.class, installed.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Installed> installeds) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Installed installed : installeds) {
			EntityCacheUtil.removeResult(InstalledModelImpl.ENTITY_CACHE_ENABLED,
				InstalledImpl.class, installed.getPrimaryKey());
		}
	}

	/**
	 * Creates a new installed with the primary key. Does not add the installed to the database.
	 *
	 * @param serialNums the primary key for the new installed
	 * @return the new installed
	 */
	@Override
	public Installed create(long serialNums) {
		Installed installed = new InstalledImpl();

		installed.setNew(true);
		installed.setPrimaryKey(serialNums);

		return installed;
	}

	/**
	 * Removes the installed with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param serialNums the primary key of the installed
	 * @return the installed that was removed
	 * @throws com.gasmeters.portlet.NoSuchInstalledException if a installed with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Installed remove(long serialNums)
		throws NoSuchInstalledException, SystemException {
		return remove((Serializable)serialNums);
	}

	/**
	 * Removes the installed with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the installed
	 * @return the installed that was removed
	 * @throws com.gasmeters.portlet.NoSuchInstalledException if a installed with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Installed remove(Serializable primaryKey)
		throws NoSuchInstalledException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Installed installed = (Installed)session.get(InstalledImpl.class,
					primaryKey);

			if (installed == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchInstalledException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(installed);
		}
		catch (NoSuchInstalledException nsee) {
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
	protected Installed removeImpl(Installed installed)
		throws SystemException {
		installed = toUnwrappedModel(installed);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(installed)) {
				installed = (Installed)session.get(InstalledImpl.class,
						installed.getPrimaryKeyObj());
			}

			if (installed != null) {
				session.delete(installed);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (installed != null) {
			clearCache(installed);
		}

		return installed;
	}

	@Override
	public Installed updateImpl(com.gasmeters.portlet.model.Installed installed)
		throws SystemException {
		installed = toUnwrappedModel(installed);

		boolean isNew = installed.isNew();

		InstalledModelImpl installedModelImpl = (InstalledModelImpl)installed;

		Session session = null;

		try {
			session = openSession();

			if (installed.isNew()) {
				session.save(installed);

				installed.setNew(false);
			}
			else {
				session.merge(installed);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !InstalledModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((installedModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						installedModelImpl.getOriginalGroupID()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);

				args = new Object[] { installedModelImpl.getGroupID() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
					args);
			}

			if ((installedModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						installedModelImpl.getOriginalDate()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATE,
					args);

				args = new Object[] { installedModelImpl.getDate() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DATE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DATE,
					args);
			}
		}

		EntityCacheUtil.putResult(InstalledModelImpl.ENTITY_CACHE_ENABLED,
			InstalledImpl.class, installed.getPrimaryKey(), installed);

		return installed;
	}

	protected Installed toUnwrappedModel(Installed installed) {
		if (installed instanceof InstalledImpl) {
			return installed;
		}

		InstalledImpl installedImpl = new InstalledImpl();

		installedImpl.setNew(installed.isNew());
		installedImpl.setPrimaryKey(installed.getPrimaryKey());

		installedImpl.setSerialNums(installed.getSerialNums());
		installedImpl.setDate(installed.getDate());
		installedImpl.setCurrInd(installed.getCurrInd());
		installedImpl.setGroupID(installed.getGroupID());

		return installedImpl;
	}

	/**
	 * Returns the installed with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the installed
	 * @return the installed
	 * @throws com.gasmeters.portlet.NoSuchInstalledException if a installed with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Installed findByPrimaryKey(Serializable primaryKey)
		throws NoSuchInstalledException, SystemException {
		Installed installed = fetchByPrimaryKey(primaryKey);

		if (installed == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchInstalledException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return installed;
	}

	/**
	 * Returns the installed with the primary key or throws a {@link com.gasmeters.portlet.NoSuchInstalledException} if it could not be found.
	 *
	 * @param serialNums the primary key of the installed
	 * @return the installed
	 * @throws com.gasmeters.portlet.NoSuchInstalledException if a installed with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Installed findByPrimaryKey(long serialNums)
		throws NoSuchInstalledException, SystemException {
		return findByPrimaryKey((Serializable)serialNums);
	}

	/**
	 * Returns the installed with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the installed
	 * @return the installed, or <code>null</code> if a installed with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Installed fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Installed installed = (Installed)EntityCacheUtil.getResult(InstalledModelImpl.ENTITY_CACHE_ENABLED,
				InstalledImpl.class, primaryKey);

		if (installed == _nullInstalled) {
			return null;
		}

		if (installed == null) {
			Session session = null;

			try {
				session = openSession();

				installed = (Installed)session.get(InstalledImpl.class,
						primaryKey);

				if (installed != null) {
					cacheResult(installed);
				}
				else {
					EntityCacheUtil.putResult(InstalledModelImpl.ENTITY_CACHE_ENABLED,
						InstalledImpl.class, primaryKey, _nullInstalled);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(InstalledModelImpl.ENTITY_CACHE_ENABLED,
					InstalledImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return installed;
	}

	/**
	 * Returns the installed with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param serialNums the primary key of the installed
	 * @return the installed, or <code>null</code> if a installed with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Installed fetchByPrimaryKey(long serialNums)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)serialNums);
	}

	/**
	 * Returns all the installeds.
	 *
	 * @return the installeds
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Installed> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Installed> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Installed> findAll(int start, int end,
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

		List<Installed> list = (List<Installed>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_INSTALLED);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_INSTALLED;

				if (pagination) {
					sql = sql.concat(InstalledModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Installed>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Installed>(list);
				}
				else {
					list = (List<Installed>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the installeds from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Installed installed : findAll()) {
			remove(installed);
		}
	}

	/**
	 * Returns the number of installeds.
	 *
	 * @return the number of installeds
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

				Query q = session.createQuery(_SQL_COUNT_INSTALLED);

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

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the installed persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.gasmeters.portlet.model.Installed")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Installed>> listenersList = new ArrayList<ModelListener<Installed>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Installed>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(InstalledImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_INSTALLED = "SELECT installed FROM Installed installed";
	private static final String _SQL_SELECT_INSTALLED_WHERE = "SELECT installed FROM Installed installed WHERE ";
	private static final String _SQL_COUNT_INSTALLED = "SELECT COUNT(installed) FROM Installed installed";
	private static final String _SQL_COUNT_INSTALLED_WHERE = "SELECT COUNT(installed) FROM Installed installed WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "installed.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Installed exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Installed exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(InstalledPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"date"
			});
	private static Installed _nullInstalled = new InstalledImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Installed> toCacheModel() {
				return _nullInstalledCacheModel;
			}
		};

	private static CacheModel<Installed> _nullInstalledCacheModel = new CacheModel<Installed>() {
			@Override
			public Installed toEntityModel() {
				return _nullInstalled;
			}
		};
}