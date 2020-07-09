package univas.test;

import univas.dao.TimeDAO;
import univas.entidades.TimeModal;

public class UpdateTime {
	
	public static void main(String[] agrs) {
        updateTime();
    }

    public static void updateTime() {
        TimeModal tiModel = new TimeModal();
        TimeDAO tiDAO = new TimeDAO();


        tiModel.setId_time(8);
        tiModel.setNome_time("Vasco");
        tiModel.setCity("Congonhal");
        tiModel.setTitulos(9);
        
        tiDAO.updateTime(tiModel);

    }

}
