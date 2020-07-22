package timezone;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "valid_from")
//    @Column(name = "valid_from", columnDefinition = "timestamp with time zone")
    private LocalDateTime validFrom;

}
