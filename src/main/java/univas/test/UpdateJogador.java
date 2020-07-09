package univas.test;

import java.util.Date;

import univas.dao.JogadorDAO;
import univas.entidades.JogadorModal;
import univas.entidades.TimeModal;

public class UpdateJogador {
	
	public static void main(String[] agrs) {
        updateJogador();
    }

    public static void updateJogador() {
        JogadorModal joModal = new JogadorModal();
        JogadorDAO joDAO = new JogadorDAO();
        TimeModal tiModal = new TimeModal();
        
       
        joModal.setNome_jogador("Fernando");
        joModal.setPosicao("Zagueiro");
        joModal.setId_jogador(9);
        joModal.setDt_nascimento(new Date());
        joDAO.updateJogador(joModal);
        
    }
}
