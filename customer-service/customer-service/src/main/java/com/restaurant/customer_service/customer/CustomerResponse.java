package com.restaurant.customer_service.customer;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class CustomerResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private LocalDateTime createdAt;


    public static CustomerResponse from(Customer customer){
        CustomerResponse response = new CustomerResponse();
        response.id = customer.getId();
        response.firstName = customer.getFirstName();
        response.lastName = customer.getLastName();
        response.email = customer.getEmail();
        response.phone = customer.getPhone();
        response.createdAt = customer.getCreatedAt();
        return response;
    }
}
