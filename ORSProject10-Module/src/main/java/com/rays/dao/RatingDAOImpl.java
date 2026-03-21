package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.RatingDTO;

@Repository
public class RatingDAOImpl extends BaseDAOImpl<RatingDTO> implements RatingDAOInt {

    @Override
    public Class<RatingDTO> getDTOClass() {
        return RatingDTO.class;
    }

    @Override
    protected List<Predicate> getWhereClause(RatingDTO dto, CriteriaBuilder builder, Root<RatingDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (!isEmptyString(dto.getRatingCode())) {
            whereCondition.add(builder.equal(qRoot.get("ratingCode"), dto.getRatingCode()));
        }

        if (!isEmptyString(dto.getUserName())) {
            whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName() + "%"));
        }

        if (dto.getRatingValue() != null) {
            whereCondition.add(builder.equal(qRoot.get("ratingValue"), dto.getRatingValue()));
        }

        if (!isEmptyString(dto.getRatingStatus())) {
            whereCondition.add(builder.equal(qRoot.get("ratingStatus"), dto.getRatingStatus() ));
        }

        return whereCondition;
    }
}