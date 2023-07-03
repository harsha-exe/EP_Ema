package com.klef.ep.controllers;

import javax.ejb.EJB;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.klef.ep.models.Offers;
import com.klef.ep.services.OffersServices;

@Path("ocentrance")
public class OffersServiceController {
@EJB(lookup = "java:global/EmaProject/OffersServicesImpl!com.klef.ep.services.OffersServices")
OffersServices ofservice;
@POST
@Path("addoffer")
@Produces(MediaType.APPLICATION_JSON)
public String addOffers(Offers o) {
	return ofservice.addOffers(o);
}
}
