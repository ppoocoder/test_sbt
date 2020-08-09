package org.ppoocoder.springboot.web;

import org.ppoocoder.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//RestController : Json을 반환하는 컨트롤러로 만들어줌
//                 예전에 @ResponseBody를 각 메소드마다 선언했던것을 한번에 사용할수 있게 해줌
@RestController
public class HelloController {
    // HTTP Method인 Get요청을 API로 만들어줌
    //      예전에 @RequestMapping(method=RequetMethd.GET)으로 사용됨
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);

    }
}
