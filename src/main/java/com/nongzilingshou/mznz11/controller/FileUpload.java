package com.nongzilingshou.mznz11.controller;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @author
 * @PackageName:com.nongzilingshou.mznz11.controller
 * @ClassName:fileOne
 * @Description:
 * @date2019/10/21 18:12
 */
public class FileUpload {
    public static String fileOne(MultipartFile file, String saveUrl, String fileType){
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String fileName = UUID.randomUUID() + suffix;
        String newUrl = saveUrl+"\\"+"\\"+"cover\\"+fileName;
        System.out.println("文件路径：" + newUrl);
        String[] type_array = fileType.split(",");
        System.out.println("type  :  "+type_array.length);
        File saveFile = new File(newUrl);
        if(!saveFile.getParentFile().exists()){
            saveFile.getParentFile().mkdirs();
        }
        try {
            file.transferTo(saveFile);
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败！";
        }
        return newUrl;
    }
    public static List<String> fileMany(MultipartFile[] files , String saveUrl, String fileType){
        List<String> picUrl = null;
        String newUrl = saveUrl + "\\"+ "\\pic\\";
        File saveDir = new File(newUrl);
        if(!saveDir.exists()){
            saveDir.mkdirs();
        }
        for(MultipartFile file : files){
            if(file != null){
                String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
                String fileName = UUID.randomUUID() + suffix;
                String newFileUrl = newUrl+fileName;
                File saveFile = new File(newFileUrl);
                try {
                    file.transferTo(saveFile);
                    picUrl.add(newFileUrl);
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("上传失败");
                }
            }
        }
        return picUrl;
    }
}
