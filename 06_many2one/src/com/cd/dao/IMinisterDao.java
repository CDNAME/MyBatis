package com.cd.dao;

import com.cd.beans.Minister;

public interface IMinisterDao {
    Minister selectMinisterById(int mid);
    Minister selectMinister2CountryById(int mid);
}
