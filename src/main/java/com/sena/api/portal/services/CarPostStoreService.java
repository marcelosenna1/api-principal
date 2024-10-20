package com.sena.api.portal.services;

import com.sena.api.portal.dto.CarPostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarPostStoreService {

    List<CarPostDTO> getCarForSales();

    void changeCarForSale(CarPostDTO carPostDTO, String id);

    void removerCarForSale(String id);
}
