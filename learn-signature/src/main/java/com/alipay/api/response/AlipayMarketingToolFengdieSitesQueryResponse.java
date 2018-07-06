package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSitesQueryRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-16 20:19:23
 */
public class AlipayMarketingToolFengdieSitesQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6165941733811615389L;

	/** 
	 * 站点查询返回值
	 */
	@ApiField("data")
	private FengdieSitesQueryRespModel data;

	public void setData(FengdieSitesQueryRespModel data) {
		this.data = data;
	}
	public FengdieSitesQueryRespModel getData( ) {
		return this.data;
	}

}