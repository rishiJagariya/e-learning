package com.elr.Elearning;

import java.util.List;
import javax.persistence.*;

@Entity
public class Cart {

	@Id
	private int cartId;

	@OneToOne(mappedBy = "Student")
	@JoinColumn(name = "studentId")
	private int studentId;

	@OneToMany(mappedBy = "Course")
	@JoinColumn(name = "courseId")
	private List items;

	@Column
	private int totalAmount;
	private int discount;

	public Cart()
	{
		
	}
	
	public Cart(int cartId, int studentId, List items, int totalAmount, int discount) {
		super();
		this.cartId = cartId;
		this.studentId = studentId;
		this.items = items;
		this.totalAmount = totalAmount;
		this.discount = discount;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public List getItems() {
		return items;
	}

	public void setItems(List items) {
		this.items = items;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int totalAmount) {
		this.discount = (10*totalAmount)/100;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", studentId=" + studentId + ", items=" + items + ", totalAmount="
				+ totalAmount + ", discount=" + discount + "]";
	}
	

}
