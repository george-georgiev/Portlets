package com.gasmeters.portlet.service.persistence;

import com.gasmeters.portlet.model.Installed;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.gasmeters.portlet.model.impl.InstalledImpl;

import java.util.Iterator;
import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class InstalledFinderImpl extends BasePersistenceImpl<Installed> implements InstalledFinder{
	
	public List<Installed> findDistinctDate(){
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(
		            DISTINCT_DATE);
			SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(false);
	        q.addEntity("Gasmeters_Installed", InstalledImpl.class);
	        
	        return (List<Installed>) q.list();
		}catch (Exception e) {
	        try {
	            throw new SystemException(e);
	        } catch (SystemException se) {
	            se.printStackTrace();
	        }
	    } finally {
	        closeSession(session);
	    }

	    return null;
	}
	
	public int countDistinctDate(){
		
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(
		            DISTINCT_DATE);
			SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(false);
	        q.addEntity("Gasmeters_Installed", InstalledImpl.class);
	        
	        int rows = 0;

	        Iterator itr = q.list().iterator();
	        
	        for(rows = 0; itr.hasNext(); rows++){
	        	
	        	itr.next();
	        	
	        }

	        return rows;
		}catch (Exception e) {
	        try {
	            throw new SystemException(e);
	        } catch (SystemException se) {
	            se.printStackTrace();
	        }
	    } finally {
	        closeSession(session);
	    }

	    return 0;
		
	}
	
	public List<Installed> findDistinctDateInRange(String start, String end){
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(
		            DISTINCT_DATE_IN_RANGE);
			SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(false);
	        q.addEntity("Gasmeters_Installed", InstalledImpl.class);
	        
	        QueryPos qPos = QueryPos.getInstance(q);
	        qPos.add(start);
	        qPos.add(end);
	        
	        return (List<Installed>) q.list();
		}catch (Exception e) {
	        try {
	            throw new SystemException(e);
	        } catch (SystemException se) {
	            se.printStackTrace();
	        }
	    } finally {
	        closeSession(session);
	    }

	    return null;
	}
	
	public int countDistinctDateInRange(String start, String end){
		
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(
		            DISTINCT_DATE_IN_RANGE);
			SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(false);
	        q.addEntity("Gasmeters_Installed", InstalledImpl.class);
	        
	        QueryPos qPos = QueryPos.getInstance(q);
	        qPos.add(start);
	        qPos.add(end);
	        
	        int rows = 0;

	        Iterator itr = q.list().iterator();
	        
	        for(rows = 0; itr.hasNext(); rows++){
	        	
	        	itr.next();
	        	
	        }

	        return rows;
		}catch (Exception e) {
	        try {
	            throw new SystemException(e);
	        } catch (SystemException se) {
	            se.printStackTrace();
	        }
	    } finally {
	        closeSession(session);
	    }

	    return 0;
		
	}
	
	public static final String DISTINCT_DATE =
		    InstalledFinder.class.getName() +
		        ".distinctDate";
	
	public static final String DISTINCT_DATE_IN_RANGE =
		    InstalledFinder.class.getName() +
		        ".distinctDateInRange";
	
}
