package com.firstone.rest_demo.exception;

import lombok.Data;

@Data
public class CloudVendorNotFoundException extends RuntimeException {


    public CloudVendorNotFoundException(String message) {
        super(message);
    }

    public CloudVendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
