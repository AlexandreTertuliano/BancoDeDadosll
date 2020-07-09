package univas.test;

import univas.dao.JogadorDAO;
import univas.entidades.JogadorModal;
import univas.entidades.TimeModal;

public class DeleteJogador {
	
	public static void main(String[] agrs) {
        deleteJogador();
    }

    public static void deleteJogador() {
        JogadorModal joModal = new JogadorModal();
        JogadorDAO joDAO = new JogadorDAO();
        TimeModal tiModal = new TimeModal();
        
       
        joDAO.deleteJogador(2);
        
    }
}
