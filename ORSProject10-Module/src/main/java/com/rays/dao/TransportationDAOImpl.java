package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.TransportationDTO;

@Repository
public class TransportationDAOImpl extends BaseDAOImpl<TransportationDTO> implements TransportationDAOInt {

    @Override
    public Class<TransportationDTO> getDTOClass() {
        return TransportationDTO.class;
    }

    @Override
    protected List<Predicate> getWhereClause(TransportationDTO dto, CriteriaBuilder builder,
            Root<TransportationDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (!isEmptyString(dto.getDescription())) {
            whereCondition.add(builder.equal(qRoot.get("description"), dto.getDescription()));
        }

        if (!isEmptyString(dto.getMode())) {
            whereCondition.add(builder.like(qRoot.get("mode"), dto.getMode() + "%"));
        }

        if (isNotNull(dto.getDob())) {
            whereCondition.add(builder.equal(qRoot.get("dob"), dto.getDob()));
        }

        if (!isEmptyString(dto.getCost())) {
            whereCondition.add(builder.like(qRoot.get("cost"), dto.getCost() + "%"));
        }

        return whereCondition;
    }
}