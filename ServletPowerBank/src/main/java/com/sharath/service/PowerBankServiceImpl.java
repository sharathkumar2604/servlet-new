package com.sharath.service;

import java.util.List;

import com.sharath.dto.PowerBankDto;
import com.sharath.repo.PowerBankRepo;
import com.sharath.repo.PowerBankRepoImpl;

public class PowerBankServiceImpl implements PowerBankService {

	PowerBankRepo repo = new PowerBankRepoImpl();

	public boolean save(PowerBankDto dto) {

		if (dto.getName().length() > 2) {
			if (dto.getMah().length()>2) {
				if (dto.getMaterialType().length() > 2) {
					if (dto.getPrice().length()>2)
					{
						return repo.save(dto);
					}
				}
			}
		}
		return false;
	}

	@Override
	public List<PowerBankDto> readAll() {

		return repo.readAll();
	}

	@Override
	public List<PowerBankDto> readByName(String name) {
		if (name.length() > 2) {
			return repo.readByName(name);
		}
		return null;
	}

	@Override
	public PowerBankDto readById(String id) {
		if (id.length() > 0) {
			return repo.readById(id);
		}
		return null;
	}

	@Override
	public PowerBankDto readByNameAndMah(String name, String mah) {
		if (name.length() > 2) {
			if (mah.length()>4) {

				return repo.readByNameAndMah(name, mah);
			}

		}
		return null;
	}

	@Override
	public boolean updatePriceByNameAndMah(String price, String name, String mah) {
		if (price.length()>2) {
		if (name.length() > 2) {
			if (mah.length()>4) {

					return repo.updatePriceByNameAndMah(price, name, mah);
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteByNamePriceAndMah(String name, String price, String mah) {
		
			if (name.length() > 2) {
				if (price.length()>2) {
				if (mah.length()>4) {

					return repo.deleteByNamePriceAndMah(name, price, mah);
				}
			}
		}
		
		return false;
	}

}
