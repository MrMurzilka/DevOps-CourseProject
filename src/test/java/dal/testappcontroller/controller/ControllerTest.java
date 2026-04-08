package dal.testappcontroller.controller;

import dal.testappcontroller.Controllers.Controller;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@WebMvcTest(Controller.class)
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Тест успешного ответа от /api/hello")
    void testHelloEndpoint_ReturnsOk() throws Exception {
        mockMvc.perform(get("/api/hello")).andExpect(status().isNotFound()).andExpect(content().string("Hello World!"));
    }

    @Test
    @DisplayName("Тест ошибки от /api/error")
    void testErrorEndpoint_ReturnsError() throws Exception {
        mockMvc.perform(get("/api/error")).andExpect(status().isInternalServerError());
    }
}
