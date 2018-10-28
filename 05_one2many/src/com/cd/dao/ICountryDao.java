package com.cd.dao;

import com.cd.beans.Country;

public interface ICountryDao {
    Country selectCountryById(int cid);
    Country selectCountry2MinisterById(int cid);
}
