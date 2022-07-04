package listsql.order;

public class OrderDetailSQL {
	public static final String ORDERDETAIL_INSERT
	="insert into orderDetail values(orderDetail_order_no_seq.nextval,?,?,?,?,?,?)";
	public static final String ORDERDETAIL_UPDATE
	="update orderDetail set order_no = ?,order_qty = ?, order_stmt = ?, product_no = ?, product_espresso = ?, product_syrup = ? where orderdetail_no =?";
	public static final String ORDERDETAIL_DELETE
	="delete from orderDetail where orderdetail_no = ?";
	public static final String ORDERDETAIL_SELECT_BY_NO
	="select * from orderDetail where orderdetail_no = ?";
	public static final String ORDERDETAIL_SELECT_ALL
	="select * from orderDetail";
}
