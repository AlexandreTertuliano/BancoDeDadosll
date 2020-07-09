package univas.test;

import java.util.Date;

import univas.dao.JogadorDAO;
import univas.entidades.JogadorModal;
import univas.entidades.TimeModal;

public class InsertJogador {
	
	public static void main(String[] agrs) {
        insertJogador();
    }

    public static void insertJogador() {
        JogadorModal joModal = new JogadorModal();
        JogadorDAO joDAO = new JogadorDAO();
        TimeModal tiModal = new TimeModal();
        tiModal.setId_time(8);
       
        joModal.setNome_jogador("Alexandre");
        joModal.setPosicao("Atacante");
        joModal.setId_time(tiModal);
        joModal.setDt_nascimento(new Date());
        
        joDAO.insertNewJogador(joModal);
        
        
    }
}

