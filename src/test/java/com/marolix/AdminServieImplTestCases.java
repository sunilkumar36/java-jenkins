package com.marolix;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.marolix.Bricks99.dto.SellerDTO;
import com.marolix.Bricks99.entity.SellerAddress;
import com.marolix.Bricks99.entity.Seller;
import com.marolix.Bricks99.exception.Bricks99Exception;
import com.marolix.Bricks99.repository.SellerRepository;
import com.marolix.Bricks99.service.AdminService;
import com.marolix.Bricks99.service.AdminServiceImpl;

@ExtendWith(MockitoExtension.class)
public class AdminServieImplTestCases {
	@Mock
	private SellerRepository sellerRepository;
	@InjectMocks
	private AdminService adminService = new AdminServiceImpl();

	@Test
	public void viewSellersValidTest() throws Bricks99Exception {
		List<SellerDTO> ldto = new ArrayList<SellerDTO>();
		SellerDTO dto = new SellerDTO();

		
		List<Seller> isr = new ArrayList<Seller>();
		Seller sr = new Seller();
		sr.setSellerId(1);
		
		sr.setEmail("");
		sr.setContact("");
		sr.setFirstName("");
		sr.setLastName("");

		SellerAddress sa = new SellerAddress();
		sa.setAddressLine1("");
		sa.setAddressLine2("");
		sa.setCity("");
		sa.setPincode("");
		sr.setAddress(sa);
		isr.add(sr);
		dto = SellerDTO.entityToDTO(sr);
		ldto.add(dto);
		SellerDTO.entityToDTO(sr);
		Mockito.when(sellerRepository.findAll()).thenReturn(isr);
		Assertions.assertEquals(ldto, adminService.viewAllSellers());

	}
}
