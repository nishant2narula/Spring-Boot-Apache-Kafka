package user_service_kafka.user_service.event;

import lombok.Data;
import org.apache.kafka.common.protocol.types.Field;

@Data
public class UserCreatedEvent {

    private Long id;
    private String name;
    private String email;

}
