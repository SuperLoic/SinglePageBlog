package com.mark.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mark.controller.impl.base.BaseController;
import com.mark.resources.impl.Profile;

@RestController
@RequestMapping(value = "/profile")
public class ProfileController extends BaseController<Profile> {
}
