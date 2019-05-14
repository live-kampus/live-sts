package com.capgemini.cityservice.service;

import java.util.List;

import org.springframework.util.MultiValueMap;

import com.capgemini.cityservice.entity.City;

public interface CityService {

	public City addNew(City city);

	public List<City> getAllCities();

	public City getCityById(int cityId);

	public void deleteByCityId(int cityId);
}
