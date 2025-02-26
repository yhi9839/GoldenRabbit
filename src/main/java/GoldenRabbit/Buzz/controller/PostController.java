package GoldenRabbit.Buzz.controller;

import GoldenRabbit.Buzz.DTO.postDTO.PostRequestDTO;
import GoldenRabbit.Buzz.DTO.postDTO.PostResponseDTO;
import GoldenRabbit.Buzz.apiPayLoad.ApiResponse;
import GoldenRabbit.Buzz.converter.postConverter.PostConverter;
import GoldenRabbit.Buzz.domain.Post;
import GoldenRabbit.Buzz.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("")
    public ApiResponse<PostResponseDTO> createPost(@RequestBody PostRequestDTO postRequestDTO) {
        Post post = postService.addPost(postRequestDTO);
        return ApiResponse.onSuccess(PostConverter.postToResponseDTO(post));
    }
//
//    @GetMapping("")
//    public ApiResponse<List<PostResponseDTO>> getAllPosts() {
//        List<P>
//    }
    @GetMapping("/{postId}")
    public String getPost(@PathVariable("postId") Long postId, Model model) {
        Post post = postService.getPostById(postId);
        model.addAttribute("post", PostConverter.postToResponseDTO(post));
        return "article";
    }

    @PostMapping("/fortest")
    public ApiResponse<List<PostResponseDTO>> fortestPost(@RequestBody PostRequestDTO postRequestDTO) {
        List<PostResponseDTO> posts = postService.getAllPosts();
        return ApiResponse.onSuccess(posts);
    }
}
