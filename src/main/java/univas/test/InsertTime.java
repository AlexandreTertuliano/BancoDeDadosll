package univas.test;

import univas.dao.TimeDAO;
import univas.entidades.TimeModal;

public class InsertTime {
	
	public static void main(String[] agrs) {
        insertTime();
    }

    public static void insertTime() {
        TimeModal tiModel = new TimeModal();
        TimeDAO tiDAO = new TimeDAO();

        tiModel.setNome_time("Cruzeiro");
        tiModel.setCity("pouso alegre");
        tiModel.setTitulos(10);
        
        tiDAO.insertNewTime(tiModel);
      
    }
}
