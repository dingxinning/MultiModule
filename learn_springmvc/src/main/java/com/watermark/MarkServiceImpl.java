package com.watermark;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Wuxiang on 2017/6/23.
 */
@Service
public class MarkServiceImpl implements MarkService {

    @Override
    public String watermark(CommonsMultipartFile file, String uploadPath, String realUploadPath) {
        // TODO Auto-generated method stub

        String logoFileName = "logo"+file.getOriginalFilename() ;
        OutputStream os = null ;
        try {
            Image image2 = ImageIO.read(file.getInputStream()) ;

            int width = image2.getWidth(null) ;
            int height = image2.getHeight(null) ;

            BufferedImage bufferImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB) ;

            Graphics2D g = bufferImage.createGraphics() ;
            g.drawImage(image2, 0, 0, width, height, null) ;

            g.setFont(new Font(FONT_NAME,FONT_STYPE,FONT_SIZE));
            g.setColor(FONT_COLOR) ;

            int width1 = FONT_SIZE*getTextLength(MARK_TEXT) ;
            int height1 = FONT_SIZE ;

            int widthDiff = width-width1 ;
            int heightDiff = height-height1 ;

            int x = X ;
            int y = Y ;

            if(x>widthDiff) {
                x = widthDiff ;
            }

            if(y>heightDiff) {
                y=heightDiff ;
            }

            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, ALPHA));

            g.drawString(MARK_TEXT, x, y+FONT_SIZE) ;
            g.dispose() ;

            os = new FileOutputStream(realUploadPath+"/"+logoFileName) ;
            JPEGImageEncoder en = JPEGCodec.createJPEGEncoder(os) ;
            en.encode(bufferImage) ;

        } catch(Exception e) {
            e.printStackTrace() ;
        } finally {
            if(os!=null) {
                try {
                    os.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        return uploadPath+"/"+logoFileName;
    }

    public int getTextLength(String text) {
        int length = text.length();

        for(int i=0; i<text.length(); i++) {
            String s = String.valueOf(text.charAt(i)) ;
            if(s.getBytes().length>1) {
                length++ ;
            }
        }

        length = length%2==0?length/2:length/2+1 ;
        return length ;
    }

}

