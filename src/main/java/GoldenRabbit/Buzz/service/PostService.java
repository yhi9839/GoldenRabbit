package GoldenRabbit.Buzz.service;

import GoldenRabbit.Buzz.DTO.postDTO.PostRequestDTO;
import GoldenRabbit.Buzz.converter.postConverter.PostConverter;
import GoldenRabbit.Buzz.domain.Post;
import GoldenRabbit.Buzz.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
