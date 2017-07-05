package com.shenyi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cjm on 7/5/17.
 */

@RestController
public class News {

    @RequestMapping("/news")
    public String getNews() {
        return "this is news.";
    }
}
