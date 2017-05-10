package com.campussay.controller;

import com.campussay.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/area")
public class AreaController {
	@Autowired 
	private AreaService areaService;
	
	  @RequestMapping("insert")
	  @ResponseBody
	  public int insert(){
	  
		  return areaService.insert(1, 1, "1");
	  }
}
