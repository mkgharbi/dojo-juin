package com.sipios.dojo.realestatebff.service;

import com.sipios.dojo.realestatebff.client.ApiClient;
import com.sipios.dojo.realestatebff.service.model.SellRealty;

import org.springframework.stereotype.Service;

@Service
public class AssetService {

    private final ApiClient apiClient;

    public AssetService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void sellAsset(SellRealty sellRealty) {
        apiClient.sellAsset(sellRealty);
    }

}
