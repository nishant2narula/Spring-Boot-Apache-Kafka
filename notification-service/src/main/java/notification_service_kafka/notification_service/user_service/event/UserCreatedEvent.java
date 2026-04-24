package notification_service_kafka.notification_service.user_service.event;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserCreatedEvent {

    private Long id;
    private String name;
    private String email;

}
