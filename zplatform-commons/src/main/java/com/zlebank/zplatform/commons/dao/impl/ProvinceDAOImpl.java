/* 
 * ProvinceDAOImpl.java  
 * 
 * version TODO
 *
 * 2015年9月13日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.dao.impl;

import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zlebank.zplatform.commons.dao.ProvinceDAO;
import com.zlebank.zplatform.commons.dao.pojo.PojoProvince;

/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年9月13日 下午6:04:01
 * @since 
 */
@Repository("provinceDAO")
public class ProvinceDAOImpl extends HibernateBaseDAOImpl<PojoProvince>implements ProvinceDAO {

    /**
     *
     * @param code
     * @return
     */
    @Override
    public PojoProvince getProvinceByCode(String code) {
        return (PojoProvince)this.getSession().createCriteria(PojoProvince.class)
                .add(Restrictions.eq("", code)).uniqueResult();
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public PojoProvince getProvinceByXZCode(String code) {
        String hql = "from PojoProvince where xzCode = ?";
        Query query = getSession().createQuery(hql);
        query.setString(0, code);
        return (PojoProvince) query.uniqueResult();
    }

}