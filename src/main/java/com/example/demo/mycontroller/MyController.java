package com.example.demo.mycontroller;

import com.example.demo.dto.MyResponseDto;
import com.example.demo.dto.mypackagedto;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @GetMapping(path="hello")

        public String hello(){
        return "success" ;
    }

    @PostMapping(path="/hellopost")
        public String world(){
            return "success" ;
    }

    @PutMapping(path = "/helloput")
    public String myhello(@RequestParam String query){
        return "query" + query;
    }

    @PutMapping(value = "/string")
    public String myworld(@RequestBody mypackagedto request ){
      return   request.toString();
    }

    @GetMapping(path = "/employee/{employeeid}")
    public MyResponseDto getemployeeid(@PathVariable String employeeid){
        MyResponseDto response =new MyResponseDto();
        response.setId(employeeid);
        return response;

    }

}
