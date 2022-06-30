package listsql.order;

public class CartSQL {
	public static final String CART_INSERT
	="insert into cart values(?,cart_cart_no_seq.nextval,?,?)";
	public static final String CART_UPDATE
	="update cart set product_no = ?, member_no = ?, cart_qty = ? where cart_no=?";
	public static final String CART_DELETE
	="delete from cart where cart_no=?";
	public static final String CART_SELECT_BY_NO
	="select * from cart where cart_no=?";
	public static final String CART_SELECT_ALL
	="select * from cart";
}
