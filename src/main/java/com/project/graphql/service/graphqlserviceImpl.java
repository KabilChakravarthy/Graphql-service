package com.project.graphql.service;

import com.project.graphql.mapper.profileDetails;
import org.springframework.stereotype.Service;

@Service
public class graphqlserviceImpl implements graphqlservice {

    public profileDetails profileDetails(){

        profileDetails profileDetails = new profileDetails();

        profileDetails.setName("Alison");
        profileDetails.setAddress("132, My Street, Kingston, pondicherry 12401.");
        profileDetails.setEmail("alisonparkar@gmail.com");
        profileDetails.setMobile("+918753421234");
        profileDetails.setAccountno("719713158835300");
        profileDetails.setAadhaarno("4235 5264 6547");
        profileDetails.setPannumber("CBDJC5640F");

        return profileDetails;
    }
}

