package com.example.demo.controller;

import com.example.demo.entity.good;
import com.example.demo.interfaces.goodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import static java.nio.file.Files.createFile;

/**
 * 控制层
 */
@Controller
@RequestMapping("/good")
public class demo {
    @Autowired
    private goodService goodService;

    /**
     * 查
     * @return
     */
    @GetMapping("/allGood")
    @ResponseBody
    public List<good> allGood(){
        return goodService.allGood();
    }

    /**
     * 查
     * @param id
     * @return
     */
    @GetMapping(value = "/selectGoodById")
    @ResponseBody
    public good getGoodById(@RequestParam("good_id") String id){
        return goodService.getGoodById(id);
    }

    /**
     * 增
     * @param good
     * @return
     */
    @PostMapping(value = "/addGood")
    @ResponseBody
    public Integer addGood(good good) {
        return goodService.addGood(good);
    }

    /**
     * 修
     * @param good
     * @return
     */
    @PutMapping(value = "/editGood")
    @ResponseBody
    public Integer editGood(good good) {
        return goodService.editGood(good);
    }

    /**
     * 删
     * @param id
     * @return
     */
    @DeleteMapping(value = "/deleteGoodById")
    @ResponseBody
    public Integer deleteGoodById(@RequestParam("good_id") String id){
        return goodService.deleteGoodById(id);
    }

    /**
     * test
     */
    @RequestMapping(value = "/test")
    @ResponseBody
    public String print(@RequestHeader("Accept-Language") String header){
        return "header=" + header;
    }

    @RequestMapping(value = "/uploadFile")
    @ResponseBody
    public String fileUpload(@RequestParam("myFile") MultipartFile file) throws Exception{
        if(file != null && file.getSize() > 0 && file.getSize() < 1024*1024){
            //上传文件的相对地址
            String path = "src/main/resources/static/upload/";
            //创建目录（判断目录是否存在，不存在则需要进行创建）
            File dir = new File(path);
            if(!dir.isDirectory()){
                dir.mkdirs();
            }
            String oldname = file.getOriginalFilename();
//            String extname = oldname.substring(oldname.lastIndexOf("."));
//            String newname = UUID.randomUUID().toString()+extname;
//            File f = new File(dir.getAbsoluteFile()+"\\"+newname);
            File f = new File(dir.getAbsoluteFile()+"\\"+oldname);
            try {
                file.transferTo(f);
                return "success";
            } catch (IllegalStateException e) {
                e.printStackTrace();
                return "failure";
            } catch (IOException e) {
                e.printStackTrace();
                return "failure";
            }
        } else {
            return "failure";
        }
    }
}
