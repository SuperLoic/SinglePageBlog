package com.mark.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

import com.mark.resources.inf.IDAccessor;
import com.mark.services.inf.IService;

public class Service<T> implements IService<T> {
	private ConcurrentMap<Long, T> map = new ConcurrentHashMap<Long, T>();
	private AtomicLong ato = new AtomicLong();

	@Override
	public T create(T t) {
		if (IDAccessor.class.isInstance(t)) {
			IDAccessor iid = IDAccessor.class.cast(t);
			long id = ato.incrementAndGet();
			iid.setId(id);
			map.putIfAbsent(id, t);
		}
		return t;
	}

	@Override
	public List<T> read() {
		List<T> list = new ArrayList<T>();
		list.addAll(map.values());
		return list;
	}

	@Override
	public T read(long id) {
		return map.get(id);
	}

	@Override
	public T update(T t) {
		if (IDAccessor.class.isInstance(t)) {
			IDAccessor iid = IDAccessor.class.cast(t);
			long id = iid.getId();
			map.replace(id, map.get(id), t);
		}
		return t;
	}

	@Override
	public T delete(long id) {
		return map.remove(id);
	}

}
