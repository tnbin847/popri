package com.tnbin.popri;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author PARK-SU-BIN
 * @version 0.1
 * @since 2024-06-30
 */

@Controller
public class IndexController {

    @GetMapping("/popri")
    public String index() {
        return "app/index";
    }
}
