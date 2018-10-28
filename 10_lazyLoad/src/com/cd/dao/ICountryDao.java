package com.cd.dao;

import com.cd.beans.Country;

public interface ICountryDao {
    Country selectCountry2MinisterById(int cid);
}
