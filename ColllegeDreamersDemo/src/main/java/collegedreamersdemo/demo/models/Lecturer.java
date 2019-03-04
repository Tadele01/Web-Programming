package collegedreamersdemo.demo.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "lecturer")
public class Lecturer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="lecturer_id", nullable=false, updatable = false)
    private Long id;

    @Column(name = "lecturer_name")
    @NotNull(message = "The lecturer name is required")
    @Size(min = 2, max = 200)
    private String lecturerName;

    @Column(name = "lecturer_lab")
    @Size(min = 2, max = 200)
    private String lecturerLab;

    @Column(name = "lecturer_contact")
    @Size(min = 2, max = 20)
    private String lecturerContact;

    @Column(name = "lecturer_address")
    @Size(min = 2, max = 200)
    private String lecturerAddress;








    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getLecturerLab() {
        return lecturerLab;
    }

    public void setLecturerLab(String lecturerLab) {
        this.lecturerLab = lecturerLab;
    }

    public String getLecturerContact() {
        return lecturerContact;
    }

    public void setLecturerContact(String lecturerContact) {
        this.lecturerContact = lecturerContact;
    }

    public String getLecturerAddress() {
        return lecturerAddress;
    }

    public void setLecturerAddress(String lecturerAddress) {
        this.lecturerAddress = lecturerAddress;
    }

}
