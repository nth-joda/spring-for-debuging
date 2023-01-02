package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/adjust-connect-point")
public class AdjustInjectController {

    @GetMapping("/incoming-data/")
    public void incomingAdjustData(@RequestParam(name="param1") String sampleParam1st,
                                   @RequestParam(name="param2") String sampleParam2nd,
                                   @RequestParam(name="param...") String sampleParamNth){
        // Vấn đề: Khác gì với dashboard ???????

    }
}


