package com.project.graphql.controller;

import com.project.graphql.mapper.profileDetails;
import com.project.graphql.service.graphqlservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class graphqlcontroller {

    @Autowired
    final com.project.graphql.service.graphqlservice graphqlservice;

    public graphqlcontroller(graphqlservice graphqlservice){
        this.graphqlservice = graphqlservice;
    }

    @QueryMapping
    public profileDetails profileDetails(){
        System.out.println("fetcging data...");
        return this.graphqlservice.profileDetails();
    }

}
