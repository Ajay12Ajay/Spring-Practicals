package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.HealthCheckDTO;

@Repository
public class HealthCheckDAOImpl extends BaseDAOImpl<HealthCheckDTO> implements HealthCheckDAOInt {

    @Override
    public Class<HealthCheckDTO> getDTOClass() {
        return HealthCheckDTO.class;
    }

    @Override
    protected List<Predicate> getWhereClause(HealthCheckDTO dto, CriteriaBuilder builder,
            Root<HealthCheckDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (!isEmptyString(dto.getHealthCode())) {
            whereCondition.add(builder.equal(qRoot.get("healthCode"), dto.getHealthCode()));
        }

        if (!isEmptyString(dto.getServiceName())) {
            whereCondition.add(builder.like(qRoot.get("serviceName"), dto.getServiceName() + "%"));
        }

        if (!isEmptyString(dto.getUptime())) {
            whereCondition.add(builder.like(qRoot.get("uptime"), dto.getUptime() + "%"));
        }

        if (!isEmptyString(dto.getStatus())) {
            whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
        }

        return whereCondition;
    }
}