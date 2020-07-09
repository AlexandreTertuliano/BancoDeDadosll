package univas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import univas.entidades.JogadorModal;
import univas.entidades.TimeModal;
import univas.utils.HibernateUtil;

public class JogadorDAO {

	public void insertNewJogador(JogadorModal jogador) {
		EntityManager em = HibernateUtil.getEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(jogador);
			em.getTransaction().commit();
		}catch(Exception e) {
			System.out.println(e);
		}

		System.out.println("Valor gerado pelo insert na tabela Jogadores: " + jogador.getId_jogador());

	}

	public void selectAllJogadores() {
		
		EntityManager em = HibernateUtil.getEntityManager();
		String sql = "SELECT j FROM JogadorModal j";
		TypedQuery<JogadorModal> query = em.createQuery(sql, JogadorModal.class);
		List<JogadorModal> jogadores = query.getResultList();
		System.out.println("Jogadores: " + jogadores);

	}
	
	public void getJogadorById(Integer id) {
		EntityManager em = HibernateUtil.getEntityManager();
		String ql = "select t from jogador t where t.id_jogador = :id";

		TypedQuery<JogadorModal> query = em.createQuery(ql, JogadorModal.class);
		query.setParameter("id", id);

		JogadorModal jogador = query.getSingleResult();

		System.out.println("Jogador por id: " + jogador);
	}


	public void deleteJogador(Integer id_jogador) {
		EntityManager em = HibernateUtil.getEntityManager();
		JogadorModal jogador = em.find(JogadorModal.class, id_jogador);
		if (jogador != null) {
			em.getTransaction().begin();
			em.remove(jogador);
			em.getTransaction().commit();
		} else {
			System.out.println("Jogador " + id_jogador + " não encontrado.");
		}
	}

	

	public void updateJogador(JogadorModal jogador) {
		EntityManager em = HibernateUtil.getEntityManager();

		JogadorModal objJogador = em.find(JogadorModal.class, jogador.getId_jogador());
		if (objJogador != null) {
			em.getTransaction().begin();
			em.merge(jogador);
			em.getTransaction().commit();
		} else {
			System.out.println("Jogador " + jogador.getId_jogador() + " não encontrado.");
		}
	}
}
