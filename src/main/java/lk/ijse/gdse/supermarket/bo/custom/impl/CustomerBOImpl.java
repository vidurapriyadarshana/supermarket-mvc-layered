package lk.ijse.gdse.supermarket.bo.custom.impl;

import lk.ijse.gdse.supermarket.bo.custom.CustomerBO;
import lk.ijse.gdse.supermarket.dto.CustomerDTO;
import lk.ijse.gdse.supermarket.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {

    public String getNextCustomerId() throws SQLException {
        return null;
    }

    public boolean saveCustomer(CustomerDTO customerDTO) throws SQLException {
        return false;
    }

    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException {
        return null;
    }

    public boolean updateCustomer(CustomerDTO customerDTO) throws SQLException {
        return false;
    }

    public boolean deleteCustomer(String customerId) throws SQLException {
        return false;
    }

    public ArrayList<String> getAllCustomerIds() throws SQLException {
        return null;
    }

    public CustomerDTO findById(String selectedCusId) throws SQLException {
        return null;
    }
}
