package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.HostelRoomAllocationDTO;

@Repository
public class HostelRoomAllocationDAOImpl extends BaseDAOImpl<HostelRoomAllocationDTO> implements HostelRoomAllocationDAOInt {

    @Override
    public Class<HostelRoomAllocationDTO> getDTOClass() {
        return HostelRoomAllocationDTO.class;
    }

    @Override
    protected List<Predicate> getWhereClause(HostelRoomAllocationDTO dto, CriteriaBuilder builder,
            Root<HostelRoomAllocationDTO> qRoot) {

        List<Predicate> whereCondition = new ArrayList<>();

        if (!isEmptyString(dto.getStudent_name())) {
            whereCondition.add(builder.like(qRoot.get("student_name"), dto.getStudent_name() + "%"));
        }

        if (!isEmptyString(dto.getRoom_number())) {
            whereCondition.add(builder.equal(qRoot.get("room_number"), dto.getRoom_number()));
        }

        if (isNotNull(dto.getAllotment_date())) {
            whereCondition.add(builder.equal(qRoot.get("allotment_date"), dto.getAllotment_date()));
        }

        if (!isEmptyString(dto.getBlock_name())) {
            whereCondition.add(builder.like(qRoot.get("block_name"), dto.getBlock_name() + "%"));
        }

        return whereCondition;
    }
}