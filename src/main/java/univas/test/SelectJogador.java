package univas.test;

import univas.dao.JogadorDAO;
import univas.entidades.JogadorModal;
import univas.entidades.TimeModal;

public class SelectJogador {
	
	public static void main(String[] agrs) {
        selectJogador();
    }

    public static void selectJogador() {
        JogadorModal joModal = new JogadorModal();
        JogadorDAO joDAO = new JogadorDAO();
        TimeModal tiModal = new TimeModal();
        
       
        joDAO.selectAllJogadores();
        
    }
}
