package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PressReleaseDTO;

@Repository
public class PressReleaseDAOImpl extends BaseDAOImpl<PressReleaseDTO> implements PressReleaseDAOInt {

    @Override
    public Class<PressReleaseDTO> getDTOClass() {
        return PressReleaseDTO.class;
    }

    @Override
    protected List<Predicate> getWhereClause(PressReleaseDTO dto, CriteriaBuilder builder,
            Root<PressReleaseDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (dto.getPressReleaseId() != null) {
            whereCondition.add(builder.equal(qRoot.get("pressReleaseId"), dto.getPressReleaseId()));
        }

        if (!isEmptyString(dto.getTitle())) {
            whereCondition.add(builder.like(qRoot.get("title"), dto.getTitle() + "%"));
        }

        if (isNotNull(dto.getReleaseDate())) {
            whereCondition.add(builder.equal(qRoot.get("releaseDate"), dto.getReleaseDate()));
        }

        if (!isEmptyString(dto.getAuthor())) {
            whereCondition.add(builder.like(qRoot.get("author"), dto.getAuthor() + "%"));
        }

        return whereCondition;
    }
}