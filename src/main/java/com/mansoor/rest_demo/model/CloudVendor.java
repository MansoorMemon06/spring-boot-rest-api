package com.mansoor.rest_demo.model;


import jakarta.persistence.*;

@Entity
@Table(name = "cloud_vendor")
public class CloudVendor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String vendorId;

    @Column(name = "vendor_name")
    private  String vendorName;

    @Column(name = "vendor_address")
    private  String vendorAdrress;

    @Column(name = "vendor_number")
    private  String vendorPhoneNumber;



    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAdrress() {
        return vendorAdrress;
    }

    public void setVendorAdrress(String vendorAdrress) {
        this.vendorAdrress = vendorAdrress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }


    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAdrress, String vendorPhoneNumber) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAdrress = vendorAdrress;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}
