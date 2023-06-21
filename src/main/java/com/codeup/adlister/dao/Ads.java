package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.util.List;

public interface Ads {
    // get a list ogit checkout -b jdbc-exercisef all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    void insert(Ad ad);


}
