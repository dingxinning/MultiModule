package com.watermark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by Wuxiang on 2017/6/23.
 * 为图片生成水印  （没有完成）
 */
@RestController
@RequestMapping("/water")
public class WaterMarkController {

    @Autowired
    private MarkService markService;

    @Autowired
    private UploadService uploadService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("watermark/index");
    }


    @RequestMapping(value="/mark", method=RequestMethod.POST)
    public ModelAndView watermark(
            @RequestParam("image")CommonsMultipartFile file, HttpSession session) throws Exception {
        String uploadPath = "/images" ;
        String realUploadPath = session.getServletContext().getRealPath(uploadPath) ;
        String imageUrl = uploadService.uploadImage(file, uploadPath, realUploadPath) ;
        String logoImageUrl = markService.watermark(file, uploadPath, realUploadPath) ;
        ModelAndView ret = new ModelAndView() ;
        ret.addObject("imageUrl", imageUrl) ;
        ret.addObject("logoImageUrl", logoImageUrl) ;
        ret.setViewName("watermark/waterMark");

        return ret ;
    }
}
