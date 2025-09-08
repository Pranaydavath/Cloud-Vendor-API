package com.firstone.rest_demo.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="cloud_vendor")
public class CloudVendor {
    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
    private String vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;


    public CloudVendor() {
    }

    public CloudVendor(String vendorId,String vendorName,  String vendorAddress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }


}
