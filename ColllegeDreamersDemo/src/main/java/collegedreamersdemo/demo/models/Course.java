package collegedreamersdemo.demo.models;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="course_id", nullable=false, updatable = false)
    private Long id;

    @Column(name = "course_code", unique = true)
    @NotNull(message = "The course code is required")
    @Size(min = 2, max = 20)
    private String courseCode;

    @Column(name = "course_name")
    @NotNull(message = "The name is required")
    private String title;

    @Column(name = "course_credit")
    @NotNull(message = "The credit is required")
    @Min(value = 0, message = "0 is the minimun")
    @Max(value = 10, message = "10 is the maximun")
    private int credit = 2;

    @Column(name = "is_active")
    private boolean isActive;



    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredit() {
        return this.credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

}
