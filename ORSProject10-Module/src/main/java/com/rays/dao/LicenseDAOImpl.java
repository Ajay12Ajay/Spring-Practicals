package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LicenseDTO;

@Repository
public class LicenseDAOImpl extends BaseDAOImpl<LicenseDTO> implements LicenseDAOInt {

    @Override
    public Class<LicenseDTO> getDTOClass() {
        return LicenseDTO.class;
    }

    @Override
    protected List<Predicate> getWhereClause(LicenseDTO dto, CriteriaBuilder builder, Root<LicenseDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (!isEmptyString(dto.getLicenseKey())) {
            whereCondition.add(builder.equal(qRoot.get("licenseKey"), dto.getLicenseKey()));
        }

        if (!isEmptyString(dto.getProductName())) {
            whereCondition.add(builder.like(qRoot.get("productName"), dto.getProductName() + "%"));
        }

        if (isNotNull(dto.getExpiryDate())) {
            whereCondition.add(builder.equal(qRoot.get("expiryDate"), dto.getExpiryDate()));
        }

        if (!isEmptyString(dto.getLicenseStatus())) {
            whereCondition.add(builder.like(qRoot.get("licenseStatus"), dto.getLicenseStatus() + "%"));
        }

        return whereCondition;
    }
}