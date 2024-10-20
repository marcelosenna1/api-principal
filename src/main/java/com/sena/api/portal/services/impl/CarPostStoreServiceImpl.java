package com.sena.api.portal.services.impl;

import com.sena.api.portal.client.CarPostStoreClient;
import com.sena.api.portal.dto.CarPostDTO;
import com.sena.api.portal.services.CarPostStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService {

    @Autowired
    private CarPostStoreClient carPostStoreClient;

    @Override
    public List<CarPostDTO> getCarForSales() {
        return carPostStoreClient.carForSaleClient();
    }

    @Override
    public void changeCarForSale(CarPostDTO carPostDTO, String id) {
        carPostStoreClient.changeCarForSaleClient(carPostDTO, id);
    }

    @Override
    public void removerCarForSale(String id) {
        carPostStoreClient.deleteCarForSaleClient(id);
    }
}
