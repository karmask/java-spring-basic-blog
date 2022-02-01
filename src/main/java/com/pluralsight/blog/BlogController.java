package com.pluralsight.blog;

import java.util.List;

import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BlogController {
    private PostRepository postRepository;

    @RequestMapping("/")
    public String listPosts(ModelMap modelMap) {
        modelMap.put("title", "Blog Post 1");
        List<Post> allPosts=postRepository.getAllPosts();
        modelMap.put("posts", allPosts);
        return "home";
    }

    public BlogController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    
}
