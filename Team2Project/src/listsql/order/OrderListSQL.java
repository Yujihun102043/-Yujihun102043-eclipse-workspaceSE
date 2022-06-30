package listsql.order;

public class OrderListSQL {
	public static final String ORDERLIST_INSERT
	="insert into orderList values(orderlist_orderdetail_no_seq.nextval,sysdate,?,?)";
	public static final String ORDERLIST_UPDATE
	="update orderList set order_date = ?, memeber_no = ?, order_price = ? where order_no =?";
	public static final String ORDERLIST_DELETE
	="delete from orderList where order_no = ?";
	public static final String ORDERLIST_SELECT_BY_NO
	="select * from orderList where order_no = ? ";
	public static final String ORDERLIST_SELECT_ALL
	="select * from orderList";
}
