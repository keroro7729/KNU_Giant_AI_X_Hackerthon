package oldman.medinyang.external.openai.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ChatCompletionRequest {

    private String model;
    private List<Message> messages;
    private Double temperature;
    private Integer max_tokens;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Message {

        private String role;
        private String content;
    }
}
