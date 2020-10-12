package com.example.demo.controller;

import com.example.demo.entity.good;
import com.example.demo.interfaces.goodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AllRequest {
    @Autowired
    private goodService goodService;

//    @RequestMapping(value = "/good",method = RequestMethod.GET)
//    @ResponseBody
//    public List<good> allGood(){
//        return goodService.allGood();
//    }

//    @GetMapping(value = "/good")
//    @ResponseBody
//    public List<good> allGood(){
//        return goodService.allGood();
//    }

//    PathVariable
//    http://localhost:8080/good/01
//    @GetMapping(value = "/selectGood1/{good_id}")
//    @ResponseBody
//    public good getGoodById1(@PathVariable("good_id") String id){
//            return goodService.getGoodById(id);
//    }

//    RequestParam
//    @GetMapping(value = "/selectGood2")
//    @ResponseBody
//    public good getGoodById2(@RequestParam("good_id") String id){
//        return goodService.getGoodById(id);
//    }


//   RequestParam
//    @DeleteMapping(value = "/deleteGood")
//    @ResponseBody
//    public Boolean deleteGoodById(@RequestParam("good_id") String id){
//        return goodService.deleteGoodById(id);
//    }

}
