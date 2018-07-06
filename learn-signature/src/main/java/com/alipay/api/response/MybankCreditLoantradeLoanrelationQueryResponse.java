package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanrelation.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-19 16:32:27
 */
public class MybankCreditLoantradeLoanrelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3757931276962313461L;

	/** 
	 * 是否有融资关系的标志
	 */
	@ApiField("loan_relation_flag")
	private Boolean loanRelationFlag;

	public void setLoanRelationFlag(Boolean loanRelationFlag) {
		this.loanRelationFlag = loanRelationFlag;
	}
	public Boolean getLoanRelationFlag( ) {
		return this.loanRelationFlag;
	}

}