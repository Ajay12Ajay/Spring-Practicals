package com.rays.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.rays.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAOInt {

	@Autowired
	public SessionFactory sessionFactory;

	@Override
	public long add(UserDTO dto) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		long pk = (Long) session.save(dto);
		return pk;

	}

	@Override
	public void update(UserDTO dto) throws DataAccessException {
		Session session = sessionFactory.getCurrentSession();
		session.update(dto);

	}

	@Override
	public void delete(long id) throws DataAccessException {
		UserDTO dto = findByPk(id);
		Session session = sessionFactory.getCurrentSession();
		session.delete(dto);

	}

	@Override
	public List search(UserDTO dto, int pageNo, int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UserDTO.class);

		if (dto != null) {
			if (dto.getId() != null && dto.getId() > 0) {
				criteria.add(Restrictions.eq("id", dto.getId()));
			}

			if (dto.getFirstName() != null && dto.getFirstName().length() > 0) {
				criteria.add(Restrictions.like("firstName", dto.getFirstName() + "%"));
			}

			if (dto.getLastName() != null && dto.getLastName().length() > 0) {
				criteria.add(Restrictions.like("lastName", dto.getLastName() + "%"));
			}

			if (dto.getLogin() != null && dto.getLogin().length() > 0) {
				criteria.add(Restrictions.like("login", dto.getLogin() + "%"));
			}

			if (dto.getAddress() != null && dto.getAddress().length() > 0) {
				criteria.add(Restrictions.like("address", dto.getAddress() + "%"));
			}
		}

		if (pageSize > 0) {
			pageNo = (pageNo - 1) * pageSize;
			criteria.setFirstResult(pageNo);
			criteria.setMaxResults(pageSize);
		}
		List list = criteria.list();
		return list;

	}

	@Override
	public UserDTO authenticate(String login, String password) {
		UserDTO dto = null;
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UserDTO.class);

		criteria.add(Restrictions.eq("login", login));
		criteria.add(Restrictions.eq("password", password));

		List<UserDTO> list = criteria.list();

		if (list.size() == 1) {
			dto = list.get(0);
		}
		return dto;
	}

	@Override
	public UserDTO findByLogin(String login) throws DataAccessException {
		UserDTO dto = null;

		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(UserDTO.class);
		criteria.add(Restrictions.eq("login", login));

		List<UserDTO> list = criteria.list();

		if (list.size() == 1) {
			dto = list.get(0);
		}
		return dto;
	}

	@Override
	public UserDTO findByPk(long id) throws DataAccessException {
		UserDTO dto = null;
		Session session = sessionFactory.getCurrentSession();
		dto = session.get(UserDTO.class, id);
		return dto;
	}

}
