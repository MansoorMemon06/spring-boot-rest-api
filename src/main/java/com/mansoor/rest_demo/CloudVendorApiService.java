package com.mansoor.rest_demo;

import com.mansoor.rest_demo.model.CloudVendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorApiService {

     @Autowired
     private CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return  cloudVendor;
                //new CloudVendor("C1","vendor 1","Adress one","03333");
    }
    @PostMapping
    public  String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
      this.cloudVendor =cloudVendor;
      return "Cloud Vendor created successfully";
    }

    @PutMapping
    public  String UpdateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){

        this.cloudVendor =cloudVendor;
        return "Cloud Vendor updated successfully";
    }

    @DeleteMapping("{vendorId}")
    public  String DeleteCloudVendorDetails(String vendorId){

        this.cloudVendor =null;
        return "Cloud Vendor deleted successfully";
    }

}
