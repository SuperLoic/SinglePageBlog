package com.mark.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mark.controller.impl.base.BaseController;
import com.mark.resources.impl.Company;

@RestController
@RequestMapping(value = "/company")
public class CompanyController extends BaseController<Company> {

}
