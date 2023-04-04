package com.harshit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshit.bean.Blog;
import com.harshit.dao.BlogDao;

@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	BlogDao dao;
	@Override
	public Blog save(Blog b) {
		// TODO Auto-generated method stub
		return dao.save(b);
	}

	@Override
	public List<Blog> findByAuthorName(String authorName) {
		// TODO Auto-generated method stub
		return dao.findByAuthorName(authorName);
	}

	@Override
	public Blog update(Blog b) {
		// TODO Auto-generated method stub
		return dao.save(b);
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public List<Blog> findAll() {
		// TODO Auto-generated method stub
		List<Blog> l1 = new ArrayList<>();
		dao.findAll().forEach(blog->l1.add(blog));
		return l1;
	}
	@Override
	public Blog findById(Integer id) {
		// TODO Auto-generated method stub]
		return dao.findById(id).orElse(null);
	}

}
