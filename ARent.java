package domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public abstract class ARent implements Serializable {
	private static final long serialVersionUID = 1L;
	private String rentId;
	private LocalDateTime checkoutDateTime;
	private LocalDateTime returnDateTime;
	private double totalRentPrice;
	private Customer customer;

	public ARent(String rentId, LocalDateTime checkoutDateTime, LocalDateTime returnDateTime,
			List<AProduct> rentedProduct, double totalRentPrice, Customer customer) {
		this.rentId = rentId;
		this.checkoutDateTime = checkoutDateTime;
		this.returnDateTime = returnDateTime;
		this.totalRentPrice = totalRentPrice;
		this.customer = customer;
		customer.listRentProduct(rentedProduct);

	}

	public void addRentProduct(AProduct product) {
		customer.rentProduct(product);
	}

	public boolean removeRentProduct(AProduct product) {
		return customer.removeRentProduct(product);
	}

	public String getRentId() {
		return rentId;
	}

	public void setRentId(String rentId) {
		this.rentId = rentId;
	}

	public LocalDateTime getCheckoutDateTime() {
		return checkoutDateTime;
	}

	public void setCheckoutDateTime(LocalDateTime checkoutDateTime) {
		this.checkoutDateTime = checkoutDateTime;
	}

	public LocalDateTime getReturnDateTime() {
		return returnDateTime;
	}

	public void setReturnDateTime(LocalDateTime returnDateTime) {
		this.returnDateTime = returnDateTime;
	}

	public double getTotalRentPrice() {
		return totalRentPrice;
	}

	public void setTotalRentPrice(double totalRentPrice) {
		this.totalRentPrice = totalRentPrice;
	}

	public Customer getUser() {
		return customer;
	}

	public void setUser(Customer customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkoutDateTime == null) ? 0 : checkoutDateTime.hashCode());
		result = prime * result + ((rentId == null) ? 0 : rentId.hashCode());
		result = prime * result + ((returnDateTime == null) ? 0 : returnDateTime.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalRentPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ARent other = (ARent) obj;
		if (checkoutDateTime == null) {
			if (other.checkoutDateTime != null)
				return false;
		} else if (!checkoutDateTime.equals(other.checkoutDateTime))
			return false;
		if (rentId == null) {
			if (other.rentId != null)
				return false;
		} else if (!rentId.equals(other.rentId))
			return false;
		if (returnDateTime == null) {
			if (other.returnDateTime != null)
				return false;
		} else if (!returnDateTime.equals(other.returnDateTime))
			return false;
		if (Double.doubleToLongBits(totalRentPrice) != Double.doubleToLongBits(other.totalRentPrice))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ARent [rentId=" + rentId + ", checkoutDateTime=" + checkoutDateTime + ", returnDateTime="
				+ returnDateTime + ", totalRentPrice=" + totalRentPrice + ", customer=" + customer + "]";
	}

}