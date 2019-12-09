package com.validator.comment.model;

public class ResponseBean {

	private boolean isVaid;
	private String responseMessage;

	public ResponseBean() {
		super();
	}

	public ResponseBean(boolean isVaid, String responseMessage) {
		super();
		this.isVaid = isVaid;
		this.responseMessage = responseMessage;
	}

	public boolean isVaid() {
		return isVaid;
	}

	public void setVaid(boolean isVaid) {
		this.isVaid = isVaid;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
}
