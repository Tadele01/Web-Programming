package collegedreamersdemo.demo.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "exam")


public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="exam_id", nullable=false, updatable = false)
    private Long id;

    @Column(name = "exam_code", unique = true)
    @NotNull(message = "The course code is required")
    @Size(min = 2, max = 20)
    private String courseCode;

    @Column(name = "exam_name")
    @NotNull(message = "The name is required")
    public String exam_name;

    @Column(name = "allowed_time")
    @NotNull(message = "The time is required")
    @Min(value = 0, message = "0 is the minimun")
    @Max(value = 10, message = "10 is the maximun")
    private int credit = 2;

    @Column(name = "is_active")
    private boolean isActive;



    @Column(name = "exam_sheet")
    public String exam_sheet;

    @Column(name = "option1")
    public String option1;

    @Column(name = "option2")
    public String option2;

    @Column(name = "option3")
    public String option3;

    @Column(name = "solution")
    public String solution;







}
