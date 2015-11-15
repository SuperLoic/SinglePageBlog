package com.mark.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mark.controller.impl.base.BaseController;
import com.mark.resources.impl.Customer;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController extends BaseController<Customer> {

}
