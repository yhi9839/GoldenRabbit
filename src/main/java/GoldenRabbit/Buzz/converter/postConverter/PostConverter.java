package GoldenRabbit.Buzz.converter.postConverter;

import GoldenRabbit.Buzz.DTO.postDTO.PostRequestDTO;
import GoldenRabbit.Buzz.DTO.postDTO.PostResponseDTO;
import GoldenRabbit.Buzz.domain.Post;

public class PostConverter {

    public static Post dtoToPost(PostRequestDTO dto) {
        return Post.builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .build();
    }

    public static PostResponseDTO postToResponseDTO(Post post) {
        return PostResponseDTO.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent()).build();
    }

}
