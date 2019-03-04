//package collegedreamersdemo.demo;
//
//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.concurrent.TimeUnit;
//
//import static org.hamcrest.Matchers.containsString;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class ExamPageTest {
//    @Autowired
//    private MockMvc mockMvc;   // <2>
//
//    @Test
//    public void testHomePage() throws Exception {
//        mockMvc.perform(get("/"))    // <3>
//
//                .andExpect(status().isOk())  // <4>
//
//                .andExpect(view().name("examPage"))  // <5>
//
//                .andExpect(content().string(           // <6>
//                        containsString("This is exam page")));
//    }
//    @RunWith(SpringRunner.class)
//    @SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
//    public class ExamPageBrowserTest {
//
//        @LocalServerPort
//        private int port;
//        private  HtmlUnitDriver browser;
//
//        @BeforeClass
//        public  void setup() {
//            browser = new HtmlUnitDriver();
//
//            browser.manage().timeouts()
//                    .implicitlyWait(10, TimeUnit.SECONDS);
//        }
//
//        @AfterClass
//        public void teardown() {
//            browser.quit();
//        }
//
//        @Test
//        public void testExamPage() {
//            String examPage = "http://localhost:" + port;
//            browser.get(examPage);
//
//            String titleText = browser.getTitle();
//            Assert.assertEquals("Exam Page", titleText);
//
//            String h1Text = browser.findElementByTagName("h1").getText();
//            Assert.assertEquals("Welcome to...", h1Text);
//
//            String imgSrc = browser.findElementByTagName("img")
//                    .getAttribute("src");
//            //Assert.assertEquals(homePage + "/images/TacoCloud.png", imgSrc);
//
//        }
//
//    }
