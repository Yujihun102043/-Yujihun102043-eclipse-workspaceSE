package listsql.order;

public class OrderDetailSQL {
	public static final String ORDERDETAIL_INSERT
	="insert into orderDetail values(?,cart_cart_no_seq.nextval,?,?)";
	public static final String ORDERDETAIL_UPDATE
	="update orderDetail set order_date = ?, member_no = ?, order_price = ?, order+qty=? where oreder_no = ?";
	public static final String ORDERDETAIL_DELETE
	="delete from orderDetail where oreder_no = ?";
	public static final String ORDERDETAIL_SELECT_BY_NO
	="select * from orderDetail where oreder_no = ?";
	public static final String ORDERDETAIL_SELECT_ALL
	="select * from orderDetail";
}
