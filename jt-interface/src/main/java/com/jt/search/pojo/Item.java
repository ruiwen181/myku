package com.jt.search.pojo;

import org.apache.solr.client.solrj.beans.Field;

import com.jt.common.po.BasePojo;

//对应solr中的数据，solr中的数据来之mysql的tb_item
public class Item extends BasePojo {
	//id,title,price,sellPoint,image
	//@Field设置属性id的值对应solr中数据的id field
	@Field("id")
	private Long id;
	
	@Field("title")
	private String title;
	
	@Field("sellPoint")
	private String sellPoint;
	//controller把list<item>放到request中,jsp 中用jstl,foreach search.jsp中item.images
	@Field("image")
	private String images;
	
	@Field("price")
	private Long price;

	public String[] getImages() {
		//1.png,2.png
		return images.split(",");
	}

	public void setImages(String images) {
		this.images = images;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSellPoint() {
		return sellPoint;
	}

	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

}

