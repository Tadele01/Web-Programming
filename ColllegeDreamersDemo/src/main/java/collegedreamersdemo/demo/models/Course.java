package collegedreamersdemo.demo.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="course_id", nullable=false, updatable = false)
    private Long id;

    @Column(name = "course_code", unique = true)
//    @NotNull(message = "The course code is required")
//    @Size(min = 2, max = 20)
    public String courseCode;

    @Column(name = "course_name")
//    @NotNull(message = "The name is required")
    public String title;

    @Column(name = "course_credit")
//    @NotNull(message = "The credit is required")
//    @Min(value = 0, message = "0 is the minimun")
//    @Max(value = 10, message = "10 is the maximun")
    public int credit = 2;





    @Column(name = "description")
    public String description;


}
