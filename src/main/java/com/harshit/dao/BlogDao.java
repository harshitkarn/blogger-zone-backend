package com.harshit.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harshit.bean.Blog;

@Repository
public interface BlogDao extends JpaRepository<Blog,Integer> {
	public List<Blog> findByAuthorName(String authorName);
}
