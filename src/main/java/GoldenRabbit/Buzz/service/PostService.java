package GoldenRabbit.Buzz.service;

import GoldenRabbit.Buzz.DTO.postDTO.PostRequestDTO;
import GoldenRabbit.Buzz.DTO.postDTO.PostResponseDTO;
import GoldenRabbit.Buzz.converter.postConverter.PostConverter;
import GoldenRabbit.Buzz.domain.Post;
import GoldenRabbit.Buzz.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public Post addPost(PostRequestDTO dto) {
        Post post = PostConverter.dtoToPost(dto);
        return postRepository.save(post);
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public List<PostResponseDTO> getAllPosts() {
       List<Post> posts = postRepository.findAll();

        return posts.stream()
                .map(post -> PostResponseDTO.builder()
                        .id(post.getId())
                        .content(post.getContent())
                        .title(post.getTitle())
                        .createdAt(post.getCreatedAt())
                        .build()).toList();
    }
}
