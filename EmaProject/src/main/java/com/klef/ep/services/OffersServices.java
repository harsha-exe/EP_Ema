package com.klef.ep.services;

import java.util.List;

import javax.ejb.Remote;

import com.klef.ep.models.Offers;

@Remote
public interface OffersServices {
	public String addOffers(Offers o);
	public String updateOffers(Offers o);
	public String deleteOffers(int id);
	public List<Offers> viewAllOffers();
	public Offers viewOffersById(int id);
	
	
}
