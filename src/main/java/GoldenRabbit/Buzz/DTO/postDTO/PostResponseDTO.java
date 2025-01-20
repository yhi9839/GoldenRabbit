package GoldenRabbit.Buzz.DTO.postDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class PostResponseDTO {
    private Long id;
    private String title;
    private String content;
}
