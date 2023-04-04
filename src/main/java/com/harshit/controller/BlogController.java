package com.harshit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.harshit.bean.Blog;
import com.harshit.service.BlogService;

@RestController
@CrossOrigin
public class BlogController {
	@Autowired
	BlogService service;
	@GetMapping("/getBlogs")
	public List<Blog> getBlogs(){
		return service.findAll();
	}
	@GetMapping("/getBlog/{id}")
	public Blog getBlog(@PathVariable("id") Integer id) {
		return service.findById(id);
	}
	@GetMapping("/getBlogByAuthorName/{authorName}")
	public List<Blog> getBlogByAuthorName(@PathVariable("authorName") String authorName){
		return service.findByAuthorName(authorName);
	}
	@PostMapping("/createBlog")
	public Blog createBlog(@RequestBody Blog b) {
		return service.save(b);
	}
	@PutMapping("/updateBlog")
	public Blog updateBlog(@RequestBody Blog b) {
		return service.save(b);
	}
	@DeleteMapping("/deleteBlog/{id}")
	public void deleteBlogById(@PathVariable("id") Integer id) {
		service.deleteById(id);
	}
}
