package com.nongzilingshou.mznz11.controller;

import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @PackageName:com.nongzilingshou.mznz11.controller
 * @ClassName:
 * @Description:
 * @date2019/10/29 11:02
 */
@RestController
public class AdminController {
    @RequestMapping("/login")
    public JsonResult login (@RequestBody JSONObject obj){
        String data = obj.toString();
        System.out.println("data:"+obj.toString());
        return JsonResult.ok();
    }
}
