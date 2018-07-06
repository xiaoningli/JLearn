package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-15 16:28:18
 */
public class AlipayEcoMycarImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6186784153177984563L;

	/** 
	 * 图片Id
	 */
	@ApiField("img_id")
	private String imgId;

	/** 
	 * 图片地址，url全是小写
	 */
	@ApiField("img_url")
	private String imgUrl;

	public void setImgId(String imgId) {
		this.imgId = imgId;
	}
	public String getImgId( ) {
		return this.imgId;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getImgUrl( ) {
		return this.imgUrl;
	}

}