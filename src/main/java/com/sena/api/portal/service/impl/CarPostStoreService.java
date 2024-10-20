package com.sena.api.portal.service.impl;

import com.sena.api.portal.dto.CarPostDTO;

import java.util.List;

public interface CarPostStoreService {

    List<CarPostDTO> getCarForSales();

    void changeCarForSale(CarPostDTO carPostDTO, String id);

    void removerCarForSale(String id);
}
