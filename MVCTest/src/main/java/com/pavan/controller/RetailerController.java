package com.pavan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pavan.dao.MasterTableRepository;
import com.pavan.models.MasterTable;

@Controller
@RequestMapping(value = "/retailer")
public class RetailerController {

	@Autowired
	private MasterTableRepository repository;

	@RequestMapping("/locations")
	@ResponseBody
	public List<MasterTable> test() {
		List<MasterTable> songsList = null;
		try {
			songsList = (List<MasterTable>) repository.findByTown();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return songsList;
	}
	

	@RequestMapping(value = "/search/{category}", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public @ResponseBody List<MasterTable> getRetailers(@PathVariable("category") String town) {

		List<MasterTable> songsList = null;
		try {
			songsList = (List<MasterTable>) repository.findRetailerByTown(town);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return songsList;
	}
	

}
