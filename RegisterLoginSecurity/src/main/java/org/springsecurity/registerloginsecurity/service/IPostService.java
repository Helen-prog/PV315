package org.springsecurity.registerloginsecurity.service;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;
import org.springsecurity.registerloginsecurity.entity.Post;

import java.util.List;

public interface IPostService {
    public Post savaPost(Post post);
    public List<Post> getAllPost();
    public Boolean deletePost(int id);
    public Post getPostById(int id);
    public Post updatePost(Post post, MultipartFile image);
    public List<Post> getAllSelectPosts(String category);
    public List<Post> searchPost(String ch);
    public Page<Post> getAllPostPagination(Integer pageNo, Integer pageSize, String category);
}
