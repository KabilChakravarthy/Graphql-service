package com.project.graphql.service;

import com.project.graphql.mapper.profileDetails;

import java.beans.Transient;

public interface graphqlservice {

    @Transient
    public profileDetails profileDetails();

}
