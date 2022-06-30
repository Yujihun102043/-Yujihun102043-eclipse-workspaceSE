package listsql.order;

public class OrderListSQL {
	public static final String ORDERLIST_INSERT
	="insert into OrderList values(ORDERDETAIL_NO_SEQ,?,?,?,?)";
	public static final String ORDERLIST_UPDATE
	="update OrderList set ORDERDETAIL_NO=?,ORDER_NO=?,ORDER_QTY=?,ORDER_STMT=?,PRODUCT_NO=?";
	public static final String ORDERLIST_DELETE
	="delete from OrderList where ORDERDETAIL_NO=?";
	public static final String ORDERLIST_SELECT_BY_NO
	="select * from OrderList where ORDERDETAIL_NO=?";
	public static final String ORDERLIST_SELECT_ALL
	="select * from OrderList";
}
