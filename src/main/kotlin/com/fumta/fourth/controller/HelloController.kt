package com.fumta.fourth.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("hello")
class HelloController {

  @GetMapping
  fun index(model: Model): String {
    model.addAttribute("title", "fourth sample")
    model.addAttribute("message", "Hello World!")
    return "index"
  }

  @GetMapping("/world")
  fun world(model: Model): String {
    model.addAttribute("title", "forth sample")
    model.addAttribute("message", "World World!!!")
    return "world"
  }

}