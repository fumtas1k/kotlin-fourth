package com.fumta.fourth.controller

import com.fumta.fourth.greeter.Greeter
import com.fumta.fourth.request.HelloRequest
import com.fumta.fourth.response.HelloResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("greeter")
class GreeterRestController(private val greeter: Greeter) {

  @GetMapping("/hello")
  fun hello(@RequestParam("name") name: String): HelloResponse {
    return HelloResponse(greeter.sayHello(name))
  }

  @GetMapping("/hello/{name}")
  fun helloPathValue(@PathVariable("name") name: String): HelloResponse {
    return HelloResponse(greeter.sayHello(name))
  }

  @PostMapping("/hello")
  fun helloByPost(@RequestBody request: HelloRequest): HelloResponse {
    return HelloResponse(greeter.sayHello(request.name))
  }
}