package GoldenRabbit.Buzz.controller;

import GoldenRabbit.Buzz.DTO.postDTO.PostRequestDTO;
import GoldenRabbit.Buzz.DTO.postDTO.PostResponseDTO;
import GoldenRabbit.Buzz.apiPayLoad.ApiResponse;
import GoldenRabbit.Buzz.converter.postConverter.PostConverter;
import GoldenRabbit.Buzz.domain.Post;
import GoldenRabbit.Buzz.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
