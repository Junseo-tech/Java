package polymorphism;

public class VIPCustomer extends Customer {
	private  int agentID; //고객 상담원 아이디
	double saleRatio; // 할인율

	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + " 입니다 ";
	}
	
	public int getAgentID() {
		return agentID;
	}


}
