package com.web.webapp;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Class defining when error pages should be displayed.
 * @version 2023.07.14
 * @author Hari Rathod
 */
@Controller
public class ErrorController {

    /**
     * Display the error.html page when a mapping to /error is made.
     * @return The error.html page.
     */
    @GetMapping("/error")
    public String handleError(HttpServletResponse response)
    {
        // Set a standard HTTP response code of 404. If other classes want to use a different code, then they can do so, and it will overwrite this.
        response.setStatus(404);
        return "error";

        // TODO: (Potentially - time permitting) add separate error pages for 404, 500, etc.
    }

}

