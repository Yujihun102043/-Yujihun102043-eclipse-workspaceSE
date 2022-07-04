package listdtovo.order;

public class OrderDetail {
	private int orderDetail_no;
	private int order_no;
	private int order_qty;
	private int order_stmt;
	private int product_no;
	private int product_espresso;
	private int produt_syrup;
	
	public OrderDetail() {
		
	}

	public OrderDetail(int orderDetail_no, int order_no, int order_qty, int order_stmt, int product_no,
			int product_espresso, int produt_syrup) {
		super();
		this.orderDetail_no = orderDetail_no;
		this.order_no = order_no;
		this.order_qty = order_qty;
		this.order_stmt = order_stmt;
		this.product_no = product_no;
		this.product_espresso = product_espresso;
		this.produt_syrup = produt_syrup;
	}

	public int getOrderDetail_no() {
		return orderDetail_no;
	}

	public void setOrderDetail_no(int orderDetail_no) {
		this.orderDetail_no = orderDetail_no;
	}

	public int getOrder_no() {
		return order_no;
	}

	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}

	public int getOrder_qty() {
		return order_qty;
	}

	public void setOrder_qty(int order_qty) {
		this.order_qty = order_qty;
	}

	public int getOrder_stmt() {
		return order_stmt;
	}

	public void setOrder_stmt(int order_stmt) {
		this.order_stmt = order_stmt;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public int getProduct_espresso() {
		return product_espresso;
	}

	public void setProduct_espresso(int product_espresso) {
		this.product_espresso = product_espresso;
	}

	public int getProdut_syrup() {
		return produt_syrup;
	}

	public void setProdut_syrup(int produt_syrup) {
		this.produt_syrup = produt_syrup;
	}

	@Override
	public String toString() {
		return "OrderDetail [orderDetail_no=" + orderDetail_no + ", order_no=" + order_no + ", order_qty=" + order_qty
				+ ", order_stmt=" + order_stmt + ", product_no=" + product_no + ", product_espresso=" + product_espresso
				+ ", produt_syrup=" + produt_syrup + "]";
	}
	
	
}
