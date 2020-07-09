package univas.test;

import univas.dao.TimeDAO;
import univas.entidades.TimeModal;

public class SelectTime {
	public static void main(String[] agrs) {
        selectTime();
    }

    public static void selectTime() {
        TimeModal tiModel = new TimeModal();
        TimeDAO tiDAO = new TimeDAO();


        tiDAO.getAllTimes();
    }

}
