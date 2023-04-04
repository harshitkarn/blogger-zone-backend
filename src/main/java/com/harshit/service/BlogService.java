package com.harshit.service;

import java.util.List;

import com.harshit.bean.Blog;

public interface BlogService {
	public Blog save(Blog b);
	public List<Blog> findByAuthorName(String authorName);
	public Blog update(Blog b);
	public void deleteById(Integer id);
	public List<Blog> findAll();
	public Blog findById(Integer id);
}
