package com.watermark;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.awt.*;

/**
 * Created by Wuxiang on 2017/6/23.
 */
public interface MarkService {
    public static final String MARK_TEXT = "wenteryan" ;
    public static final String FONT_NAME = "微软雅黑" ;

    public static final int FONT_SIZE = 120 ;
    public static final int FONT_STYPE = Font.BOLD ;
    public static final Color FONT_COLOR = Color.RED ;

    public static final int X = 10 ;
    public static final int Y = 10 ;

    public static float ALPHA = 0.3F ;

    public String watermark(CommonsMultipartFile file, String uploadPath,
                            String realUploadPath) ;
}
