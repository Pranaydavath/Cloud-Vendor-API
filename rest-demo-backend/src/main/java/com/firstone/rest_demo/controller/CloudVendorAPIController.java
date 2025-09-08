package com.firstone.rest_demo.controller;

import com.firstone.rest_demo.model.CloudVendor;
import com.firstone.rest_demo.response.ResponseHandler;
import com.firstone.rest_demo.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
// IMPORTANT: Add this annotation to allow requests from your frontend
@CrossOrigin(origins = "*") // Allows all origins, for development. Be more specific in production.
public class CloudVendorAPIController {
    @Autowired
    CloudVendorService cloudVendorService;

    @GetMapping("{vendorId}")
    public ResponseEntity<Object> GetCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return ResponseHandler.responseBuilder("Requested vendor Details given here", HttpStatus.OK,cloudVendorService.getCloudVendor(vendorId));
    }

    @GetMapping()
    public List<CloudVendor> GetAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();
    }


    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud vendor Updated Successfully";
    }

    // This method name was duplicated, which can cause mapping issues.
    // I've corrected it to be specific to its action.
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor Deleted Successfully";
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud vendor Created Successfully";
    }
}
