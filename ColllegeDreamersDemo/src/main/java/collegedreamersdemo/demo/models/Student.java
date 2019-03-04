
package collegedreamersdemo.demo.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "student")
public class Student  implements Serializable {
    private static final long serialVersionUID = 902783495L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="student_id", nullable=false, updatable = false)
    private Long id;

    @Column(name="student_number", nullable=false,unique=true)
    private String student_number;

    @Column(name = "student_name")
    @NotNull(message = "The student name is required")
    @Size(min = 2, max = 200)
    private String studentName;

    @Column(name = "studentContact")
    @Size(min = 2, max = 20)
    private String studentContact;

    @Column(name = "studentAddress")
    @Size(min = 2, max = 200)
    private String studentAddress;

    @Column(name = "student_nationality")
    @Size(min = 2, max = 200)
    private String studentNationality;

    @Column(name = "supervised_start")
    private LocalDate supervisedStart;

    @Column(name = "supervised_end")
    private LocalDate supervisedEnd;

    @ManyToOne(targetEntity = Lecturer.class)
    private Lecturer lecturer;





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentNationality() {
        return studentNationality;
    }

    public void setStudentNationality(String studentNationality) {
        this.studentNationality = studentNationality;
    }

    public LocalDate getSupervisedStart() {
        return supervisedStart;
    }

    public void setSupervisedStart(LocalDate supervisedStart) {
        this.supervisedStart = supervisedStart;
    }

    public LocalDate getSupervisedEnd() {
        return supervisedEnd;
    }

    public void setSupervisedEnd(LocalDate supervisedEnd) {
        this.supervisedEnd = supervisedEnd;
    }

}
