package com.sena.api.portal.services.impl;

import com.sena.api.portal.client.CarPostStoreClient;
import com.sena.api.portal.dto.OwnerPostDTO;
import com.sena.api.portal.services.OwnerPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerPostServiceImpl implements OwnerPostService {

    @Autowired
    private CarPostStoreClient carPostStoreClient;

    @Override
    public void createOwnerCar(OwnerPostDTO ownerPostDTO) {
        carPostStoreClient.ownerPostsClient(ownerPostDTO);
    }
}
