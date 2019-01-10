package collegedreamersdemo.demo.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegistrationForm {
    @Size(min = 2, max = 20,
            message = "Please Enter value between 5-20")
    private String firstname;

    @Size(min = 3, max = 20, message = "Please Enter value between 5- 20")
    @NotNull
    private String password;

    private String lastname;
    private String tel;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}