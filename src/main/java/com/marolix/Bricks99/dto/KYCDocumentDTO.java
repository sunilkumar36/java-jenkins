package com.marolix.Bricks99.dto;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

public class KYCDocumentDTO{
	
	private Integer id;
	private MultipartFile[] adhaar;
	private MultipartFile pancard;
	private BankDetailsDTO bankDetails;
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public MultipartFile[] getAdhaar() {
		return adhaar;
	}



	public void setAdhaar(MultipartFile[] adhaar) {
		this.adhaar = adhaar;
	}



	public MultipartFile getPancard() {
		return pancard;
	}



	public void setPancard(MultipartFile pancard) {
		this.pancard = pancard;
	}



	public BankDetailsDTO getBankDetails() {
		return bankDetails;
	}



	public void setBankDetails(BankDetailsDTO bankDetails) {
		this.bankDetails = bankDetails;
	}



	@Override
	public String toString() {
		return "KYCDocumentDTO [id=" + id + ", adhaar=" + Arrays.toString(adhaar) + ", pancard=" + pancard
				+ ", bankDetails=" + bankDetails + "]";
	}
	
	
}

