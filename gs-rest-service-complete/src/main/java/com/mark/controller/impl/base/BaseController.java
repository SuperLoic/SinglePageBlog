package com.mark.controller.impl.base;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mark.services.impl.Service;
import com.mark.services.inf.IService;

public class BaseController<T> {

	@RequestMapping(method = RequestMethod.GET)
	public List<T> read() {
		return service.read();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public T read(@PathVariable long id) {
		return service.read(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public T create(@RequestBody T t) {
		return service.create(t);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public T update(@RequestBody T t) {
		return service.update(t);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public T delete(@PathVariable long id) {
		return service.delete(id);
	}

	IService<T> service = new Service<T>();
}
