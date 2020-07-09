package univas.test;

import univas.dao.TimeDAO;
import univas.entidades.TimeModal;

public class DeleteTime {
	
	public static void main(String[] agrs) {
        deleteTime();
    }

    public static void deleteTime() {
        TimeModal tiModel = new TimeModal();
        TimeDAO tiDAO = new TimeDAO();


        tiDAO.excluirTime(3);
    }

}
