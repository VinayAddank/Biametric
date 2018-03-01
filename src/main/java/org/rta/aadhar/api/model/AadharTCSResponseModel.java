package org.rta.aadhar.api.model;

import java.io.Serializable;

/**
 * AadharResponseModel provides details for aadhar response
 * 
 * @author Sriram
 *
 */
public class AadharTCSResponseModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ResponseType responseType;
	private String responseDesc;
	private AadharTCSResponse aadharTCSResponse;

	public String getResponseDesc() {
		return responseDesc;
	}

	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}

	public AadharTCSResponse getAadharTCSResponse() {
		return aadharTCSResponse;
	}

	public void setAadharTCSResponse(AadharTCSResponse aadharTCSResponse) {
		this.aadharTCSResponse = aadharTCSResponse;
	}

	public ResponseType getResponseType() {
		return responseType;
	}

	public void setResponseType(ResponseType responseType) {
		this.responseType = responseType;
	}

	public AadharTCSResponseModel(ResponseType responseType, String errorDesc) {
		this.responseType = responseType;
		this.responseDesc = errorDesc;
	}

	public AadharTCSResponseModel(ResponseType responseType, String errorDesc, AadharTCSResponse aadharTCSResponse) {
        this.responseType = responseType;
        this.responseDesc = errorDesc;
		this.aadharTCSResponse = aadharTCSResponse;
	}

	public String getErrorDesc() {
		return responseDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.responseDesc = errorDesc;
	}


}
