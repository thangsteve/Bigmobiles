package model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Customers;
import model.OrderDetails;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2019-05-26T19:21:48")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, BigDecimal> total;
    public static volatile SingularAttribute<Orders, Date> createdDate;
    public static volatile SingularAttribute<Orders, String> processStatus;
    public static volatile SingularAttribute<Orders, String> orderID;
    public static volatile SingularAttribute<Orders, String> shipNote;
    public static volatile CollectionAttribute<Orders, OrderDetails> orderDetailsCollection;
    public static volatile SingularAttribute<Orders, Customers> customerID;
    public static volatile SingularAttribute<Orders, String> shipName;
    public static volatile SingularAttribute<Orders, Date> shipDate;
    public static volatile SingularAttribute<Orders, String> shipAddress;
    public static volatile SingularAttribute<Orders, String> shipPhone;
    public static volatile SingularAttribute<Orders, Boolean> orderState;

}