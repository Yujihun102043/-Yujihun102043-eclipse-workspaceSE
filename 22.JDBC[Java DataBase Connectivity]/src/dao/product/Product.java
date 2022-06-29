package dao.product;

import java.sql.Date;

public class Product {
	private int 	product_no;
	private String  product_name;
	private String  product_short_desc;
	private double 	product_price;
	private Date 	product_ipgo_date;
	
	public Product() {
		
	}
	
	public Product(int product_no, String product_name, String product_short_desc, double product_price,
			Date product_ipgo_date) {
		super();
		this.product_no = product_no;
		this.product_name = product_name;
		this.product_short_desc = product_short_desc;
		this.product_price = product_price;
		this.product_ipgo_date = product_ipgo_date;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_short_desc() {
		return product_short_desc;
	}

	public void setProduct_short_desc(String product_short_desc) {
		this.product_short_desc = product_short_desc;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public Date getProduct_ipgo_date() {
		return product_ipgo_date;
	}

	public void setProduct_ipgo_date(Date product_ipgo_date) {
		this.product_ipgo_date = product_ipgo_date;
	}

	@Override
	public String toString() {
		return "Product [product_no=" + product_no + ", product_name=" + product_name + ", product_short_desc="
				+ product_short_desc + ", product_price=" + product_price + ", product_ipgo_date=" + product_ipgo_date
				+ "]";
	}
	
	
}
