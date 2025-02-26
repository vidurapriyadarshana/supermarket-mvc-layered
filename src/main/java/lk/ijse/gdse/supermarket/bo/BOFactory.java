package lk.ijse.gdse.supermarket.bo;

import lk.ijse.gdse.supermarket.bo.custom.impl.CustomerBOImpl;
import lk.ijse.gdse.supermarket.bo.custom.impl.ItemBOImpl;
import lk.ijse.gdse.supermarket.bo.custom.impl.OrderBOImpl;
import lk.ijse.gdse.supermarket.bo.custom.impl.OrderDetailsBOImpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory() {

    }

    public static BOFactory getBoFactory() {
        return (boFactory == null) ? boFactory =
                new BOFactory() : boFactory;

    }

    public enum BOTypes {
        CUSTOMER,
        ITEM,
        ORDER,
        ORDER_DETAILS
    }

    public SuperBO getBO(BOTypes boTypes) {
        return switch (boTypes) {
            case CUSTOMER -> new CustomerBOImpl();
            case ITEM -> new ItemBOImpl();
            case ORDER -> new OrderBOImpl();
            case ORDER_DETAILS -> new OrderDetailsBOImpl();
        };
    }
}
