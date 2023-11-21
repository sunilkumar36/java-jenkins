package com.marolix.Bricks99.dto;

import org.springframework.web.multipart.MultipartFile;

public class BankDetailsDTO {
	private Integer bankId;
	private MultipartFile bankPassbook;

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public MultipartFile getBankPassbook() {
		return bankPassbook;
	}

	public void setBankPassbook(MultipartFile bankPassbook) {
		this.bankPassbook = bankPassbook;
	}

	@Override
	public String toString() {
		return "BankDetailsDTO [bankId=" + bankId + ", bankPassbook=" + bankPassbook + "]";
	}

}
