package com.nongzilingshou.mznz11.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * @author
 * @PackageName:com.nongzilingshou.mznz11.controller
 * @ClassName:Controller
 * @Description:
 * @date2019/10/12 15:14
 */
@RestController
public class Controller {
//    @GetMapping(value = "/views/layui/table.html")
//    public ModelAndView table() {
//
//        return new ModelAndView("layui/table.html");
//    }
@PostMapping("/upload_one")
public JsonResult UploadImage(@RequestParam(value = "file", required = false) MultipartFile file){
    if(file == null){
        return JsonResult.errorMsg("图片上传失败！");
    }else{
        String end = FileUpload.fileOne(file, StaticUtil.SAVE_URL, StaticUtil.FILE_TYPE);

        return JsonResult.ok();
    }

}
    @PostMapping("/upload_many")
    public JsonResult UploadImages(@RequestParam(value = "file", required = false) MultipartFile[] files){
        if(files.length == 0){
            return JsonResult.errorMsg("图片为空！");
        }else{
            List<String> lists = FileUpload.fileMany(files, StaticUtil.SAVE_URL, StaticUtil.FILE_TYPE);
            return JsonResult.ok();
        }
    }

    @RequestMapping("/hello")
    public String helllo() {
        return "hello world";
    }

    @GetMapping(value = "")
    public ModelAndView index() {

        return new ModelAndView("frame.html");
    }
    @GetMapping(value = "/frame.html")
    public ModelAndView index1() {

        return new ModelAndView("frame.html");
    }
    @GetMapping(value = "/tgls/modify_password.html")
    public ModelAndView modify_password() {

        return new ModelAndView("modify_password");
    }

    @GetMapping(value = "/login.html")
    public ModelAndView login() {

        return new ModelAndView("login");
    }

    @GetMapping(value = "/login1.html")
    public ModelAndView login1() {
        String name;
        int age;
        return new ModelAndView("login1");
    }

    @GetMapping(value = "/qdAPI.html")
    public ModelAndView qdAPI() {

        return new ModelAndView("qdAPI");
    }
    @GetMapping(value = "/testTableNest.html")
    public ModelAndView testTableNest() {

        return new ModelAndView("testTableNest");
    }

    @GetMapping(value = "/iconfont.html")
    public ModelAndView iconfont() {

        return new ModelAndView("iconfont");
    }

    @GetMapping(value = "/agent/agent_add.html")
    public ModelAndView agent_add() {

        return new ModelAndView("agent/agent_add");
    }

    @GetMapping(value = "/agent/agent_list.html")
    public ModelAndView agent_list() {

        return new ModelAndView("agent/agent_list");
    }

    @GetMapping(value = "/goodsManage/goodsType_list.html")
    public ModelAndView goodsType_list() {

        return new ModelAndView("goodsManage/goodsType_list");
    }

    @GetMapping(value = "/goodsManage/goods_list.html")
    public ModelAndView goods_list() {

        return new ModelAndView("goodsManage/goods_list");
    }

    @GetMapping(value = "/goodsManage/goods_add.html")
    public ModelAndView goods_add() {

        return new ModelAndView("goodsManage/goods_add");
    }

    @GetMapping(value = "/goodsManage/goods_update.html")
    public ModelAndView goods_update() {

        return new ModelAndView("goodsManage/goods_update");
    }

    @GetMapping(value = "/goodsManage/specifications_list.html")
    public ModelAndView specifications_list() {

        return new ModelAndView("goodsManage/specifications_list");
    }

    @GetMapping(value = "/goodsManage/specifications_list1.html")
    public ModelAndView specifications_list1() {

        return new ModelAndView("goodsManage/specifications_list1");
    }

    @GetMapping(value = "/base/base_add.html")
    public ModelAndView base_add() {

        return new ModelAndView("base/base_add");
    }

    @GetMapping(value = "/base/base_list.html")
    public ModelAndView base_list() {

        return new ModelAndView("base/base_list");
    }

    @GetMapping(value = "/base/base_customList.html")
    public ModelAndView base_customList() {

        return new ModelAndView("base/base_customList");
    }

    @GetMapping(value = "/base/base_customNewList.html")
    public ModelAndView base_customNewList() {

        return new ModelAndView("base/base_customNewList");
    }

    @GetMapping(value = "/base/pages.html")
    public ModelAndView pages() {

        return new ModelAndView("base/pages");
    }

    @GetMapping(value = "/base/maintain.html")
    public ModelAndView maintain() {

        return new ModelAndView("base/maintain");
    }

    @GetMapping(value = "/print/outPrintData.html")
    public ModelAndView outPrintData() {

        return new ModelAndView("print/outPrintData");
    }

    @GetMapping(value = "/reportForm/reportForm1.html")
    public ModelAndView reportForm1() {

        return new ModelAndView("reportForm/reportForm1");
    }

    @GetMapping(value = "/categoryManage/category_List.html")
    public ModelAndView category_List() {

        return new ModelAndView("categoryManage/category_List");
    }

    @GetMapping(value = "/categoryManage/category_Manage.html")
    public ModelAndView category_Manage() {

        return new ModelAndView("categoryManage/category_Manage");
    }

    @GetMapping(value = "/ordersManage/order_List.html")
    public ModelAndView orders_List() {

        return new ModelAndView("ordersManage/order_List");
    }

    @GetMapping(value = "/usersManage/user_List.html")
    public ModelAndView user_List() {

        return new ModelAndView("usersManage/user_List");
    }

    @GetMapping(value = "/usersManage/user_add.html")
    public ModelAndView user_add() {

        return new ModelAndView("usersManage/user_add");
    }
}
