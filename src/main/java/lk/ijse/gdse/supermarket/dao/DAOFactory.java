package lk.ijse.gdse.supermarket.dao;

import lk.ijse.gdse.supermarket.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.gdse.supermarket.dao.custom.impl.ItemDAOImpl;
import lk.ijse.gdse.supermarket.dao.custom.impl.OrderDAOImpl;
import lk.ijse.gdse.supermarket.dao.custom.impl.OrderDetailsDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getDaoFactory() {
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }

    public enum DAOTypes {
        CUSTOMER,
        ITEM,
        ORDER,
        ORDER_DETAILS
    }

    public SuperDAO getDAO(DAOTypes daoTypes) {
        return switch (daoTypes) {
            case CUSTOMER -> new CustomerDAOImpl();
            case ITEM -> new ItemDAOImpl();
            case ORDER -> new  OrderDAOImpl();
            case ORDER_DETAILS -> new OrderDetailsDAOImpl();
        };
    }
}
