package lk.ijse.gdse.supermarket.bo.custom.impl;

import lk.ijse.gdse.supermarket.bo.custom.OrderBO;
import lk.ijse.gdse.supermarket.db.DBConnection;
import lk.ijse.gdse.supermarket.dto.OrderDTO;
import lk.ijse.gdse.supermarket.util.CrudUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class OrderBOImpl implements OrderBO {

    private final OrderDetailsBOImpl orderDetailsBOImpl = new OrderDetailsBOImpl();

    public String getNextOrderId() throws SQLException {
        return null;
    }

    public boolean saveOrder(OrderDTO orderDTO) throws SQLException {
        return false;
    }
}

