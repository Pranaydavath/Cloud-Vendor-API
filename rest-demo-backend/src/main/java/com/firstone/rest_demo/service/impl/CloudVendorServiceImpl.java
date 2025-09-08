package com.firstone.rest_demo.service.impl;

import com.firstone.rest_demo.exception.CloudVendorNotFoundException;
import com.firstone.rest_demo.model.CloudVendor;
import com.firstone.rest_demo.repository.CloudVendorRepository;
import com.firstone.rest_demo.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
    @Autowired
    CloudVendorRepository cloudVendorRepository;



    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully created cloud vendor";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Updated cloud vendor";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Deleted cloud vendor";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
       if(cloudVendorRepository.findById(cloudVendorId).isEmpty()) {
         throw new CloudVendorNotFoundException("Cloud vendor with id " + cloudVendorId + " does not exists");
       }
       return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
