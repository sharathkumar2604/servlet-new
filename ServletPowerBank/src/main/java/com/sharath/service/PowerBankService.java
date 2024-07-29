package com.sharath.service;

import com.sharath.dto.PowerBankDto;

import java.util.List;

public interface PowerBankService {

	public boolean save(PowerBankDto dto);

	public List<PowerBankDto> readAll();

	public List<PowerBankDto> readByName(String name);

	public PowerBankDto readById(String id);

	public PowerBankDto readByNameAndMah(String name, String mah);

	public boolean updatePriceByNameAndMah(String price, String name, String mah);

	public boolean deleteByNamePriceAndMah(String name, String price, String mah);
}
