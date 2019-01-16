package net.javaguides.springboot.springsecurity;
import java.util.concurrent.TimeUnit;

import net.javaguides.springboot.springsecurity.Controller.MainController;
import net.javaguides.springboot.springsecurity.Controller.UserRegistrationController;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)    // <1>
@SpringBootTest
@WebMvcTest(UserRegistrationController.class)
public class UserRegistrationControllerTest {


    @Autowired
    private MockMvc mockMvc;   // <2>

    @Test
    public void MainControllerTest() throws Exception {
        mockMvc.perform(get("/"));
        andExpect(status().isOk())  // <4>

                .andExpect(view().name("registration"))  // <5>

                .andExpect(content().string(           // <6>
                        containsString("registration Page)")));

    }

    private UserRegistrationControllerTest andExpect(ResultMatcher ok) {
        return null;
    }
}
