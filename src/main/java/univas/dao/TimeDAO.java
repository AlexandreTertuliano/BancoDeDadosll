package univas.dao;


import java.sql.Time;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import univas.entidades.TimeModal;
import univas.utils.HibernateUtil;


public class TimeDAO {
	
	public void insertNewTime(TimeModal time) {

		EntityManager em;
		em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(time);
		em.getTransaction().commit();

		System.out.println("Valor gerado pelo insert na tabela Time: " + time.getId_time());

	}

	public void getAllTimes() {
		
		EntityManager em = HibernateUtil.getEntityManager();
		String ql = "SELECT t FROM Time t";
		TypedQuery<TimeModal> query = em.createQuery(ql, TimeModal.class);
		List<TimeModal> time = query.getResultList();
		System.out.println("Times: " + time);

	}
	
	public void getTimeById(Integer id) {
		EntityManager em = HibernateUtil.getEntityManager();
		String ql = "select t from time t where t.id_time = :id";

		TypedQuery<TimeModal> query = em.createQuery(ql, TimeModal.class);
		query.setParameter("id", id);

		TimeModal time = query.getSingleResult();

		System.out.println("Time por id: " + time);
	}

	public void excluirTime(Integer id_time) {
		EntityManager em = HibernateUtil.getEntityManager();
		TimeModal time = em.find(TimeModal.class, id_time);
		if (time != null) {
			em.getTransaction().begin();
			em.remove(time);
			em.getTransaction().commit();
		} else {
			System.out.println("Time " + id_time + " não encontrado.");
		}
	}

	

	public void updateTime(TimeModal time) {
		EntityManager em = HibernateUtil.getEntityManager();

		TimeModal objTime = em.find(TimeModal.class, time.getId_time());
		if (objTime != null) {
			em.getTransaction().begin();
			em.merge(time);
			em.getTransaction().commit();
		} else {
			System.out.println("Time " + time.getId_time() + " não encontrado.");
		}
	}

}
