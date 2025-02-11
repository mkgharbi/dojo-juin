package com.sipios.dojo.realestatebff.service;

import com.sipios.dojo.realestatebff.client.ApiClient;
import com.sipios.dojo.realestatebff.service.model.Realty;
import com.sipios.dojo.realestatebff.service.model.User;
import com.sipios.dojo.realestatebff.service.model.UserAmount;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {

    private final ApiClient apiClient;

    public UserService(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public UserAmount getUserAmountDTOService() {
        User user = apiClient.retrieveCurrentUser();
        BigDecimal amount = apiClient.retrieveUserAmount().amount();
        return new UserAmount(user.id(), amount);
    }

}
