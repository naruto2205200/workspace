package com.mybatis.pojo;

public class OrderDetail {
	/** ���I��ӆ����ϸ��Id */
    private Integer id;
    /** ӆ��Id */
    private Integer ordersId;
    /** ��Ʒid */
    private Integer itemsId;
    /** ��Ʒ�������� */
    private Integer itemsNum;
    // ��ϸ��Ӧ����Ʒ��Ϣ
    private Items items;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}
	public Integer getItemsId() {
		return itemsId;
	}
	public void setItemsId(Integer itemsId) {
		this.itemsId = itemsId;
	}
	public Integer getItemsNum() {
		return itemsNum;
	}
	public void setItemsNum(Integer itemsNum) {
		this.itemsNum = itemsNum;
	}
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	@Override
	public String toString() {
		 return "OrderDetail [id=" + id + ", ordersId=" + ordersId + ", itemsId=" + itemsId
	                + ", itemsNum=" + itemsNum + "]";
	}
    
}