package com.course.model;

import javax.persistence.*;

@Entity
@Table(name = "Coursee")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer Id;
    @Column(name="Subject")
    private String Subject;
    @Column(name="SubjectDesc")
    private String SubjectDesc;
    public Integer getId() { return Id; }

    public String getSubject() { return Subject; }

    public String getSubjectDesc() { return SubjectDesc; }
    public Course() {}
    public Course(Integer Id, String Subject, String SubjectDesc) {
        this.Id = Id; this.Subject= Subject; this.SubjectDesc=SubjectDesc;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + Id+ ", Subject='" + Subject+ '\'' +
                ", SubjectDescription='" +SubjectDesc +  '\'' + '}';

    }
}
