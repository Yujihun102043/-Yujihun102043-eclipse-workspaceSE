package listdtovo.order;

import java.sql.Date;

public class OrderDetail {
	private int order_no;
	private Date order_date;
	private int member_no;
	private int order_price;
	private int order_qty;
	
	public OrderDetail() {
		
	}

	public OrderDetail(int order_no, Date order_date, int member_no, int order_price, int order_qty) {
		super();
		this.order_no = order_no;
		this.order_date = order_date;
		this.member_no = member_no;
		this.order_price = order_price;
		this.order_qty = order_qty;
	}

	public int getOrder_no() {
		return order_no;
	}

	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public int getOrder_price() {
		return order_price;
	}

	public void setOrder_price(int order_price) {
		this.order_price = order_price;
	}

	public int getOrder_qty() {
		return order_qty;
	}

	public void setOrder_qty(int order_qty) {
		this.order_qty = order_qty;
	}

	@Override
	public String toString() {
		return "OrderDetail [order_no=" + order_no + ", order_date=" + order_date + ", member_no=" + member_no
				+ ", order_price=" + order_price + ", order_qty=" + order_qty + "]";
	}
	
	
}
