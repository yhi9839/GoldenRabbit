package GoldenRabbit.Buzz.DTO.postDTO;

import GoldenRabbit.Buzz.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostRequestDTO {
    private String title;
    private String content;


}
