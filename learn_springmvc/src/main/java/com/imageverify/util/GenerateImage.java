package com.imageverify.util;

import com.imageverify.model.BufferedImageWarp;
import com.imageverify.model.GenerateImageGroup;
import com.imageverify.model.ImageGroup;
import com.imageverify.model.ImageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import javax.servlet.ServletRequest;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by Wuxiang on 2017/6/24.
 */
public class GenerateImage {

    private static final Logger log= LoggerFactory.getLogger(GenerateImage.class);

    private static Map<String,ImageGroup> imageGroupMap=new HashMap<>();

    private static Map<Integer,Map<String,ImageGroup>> countGroupMap=new HashMap<>();

    /**
     * 生成图片
     * @throws IOException
     */
    public static ImageResult generateImage(ServletRequest request) throws IOException {
        initImage();
        GenerateImageGroup generateImageGroup = randImageGroups();
        List<BufferedImageWarp> imageWarps=new ArrayList<>();
        String realPath = request.getServletContext().getRealPath("/assets/");
        for (ImageGroup group:generateImageGroup.getGroups()) {
            for (String imgName:group.getPaths()) {
                imageWarps.add(new BufferedImageWarp(false,getBufferImage(realPath+File.separator+imgName)));
            }
        }
        for (String imgName:generateImageGroup.getKeyGroup().getPaths()){
            imageWarps.add(new BufferedImageWarp(true,getBufferImage(realPath+File.separator+imgName)));
        }
        ImageResult imageResult = meregeImage(request,imageWarps, generateImageGroup.getKeyGroup().getName());
        return imageResult;
    }

    /**
     * 将文件生成为BufferImage类型
     * @param path
     * @return
     * @throws IOException
     */
    private static BufferedImage getBufferImage(String path) throws IOException {
        File file=new File(path);
        log.debug(path);
        return ImageIO.read(file);
    }

    /**
     * 初始化图片
     */
    public static void  initImage() {
        ImageGroup group=new ImageGroup("订书机",2,"dsj/1.jpg","dsj/2.jpg");
        ImageGroup group0=new ImageGroup("书本",2,"book/1.jpg","book/2.jpg");
        ImageGroup group1=new ImageGroup("蘑菇",2,"mg/1.jpg","mg/2.jpg");
        ImageGroup group2=new ImageGroup("云",2,"cloud/1.jpg","cloud/2.jpg");
        ImageGroup group3=new ImageGroup("吸铁石",2,"xts/1.jpg","xts/2.jpg");
        ImageGroup group4=new ImageGroup("包包",4,"bb/1.jpg","bb/2.jpg","bb/3.jpg","bb/4.jpg");
        ImageGroup group5=new ImageGroup("柚子",4,"yz/1.jpg","yz/2.jpg","yz/3.jpg","yz/4.jpg");
        ImageGroup group6=new ImageGroup("糖葫芦",4,"thl/1.jpg","thl/2.jpg","thl/3.jpg","thl/4.jpg");
        ImageGroup group7=new ImageGroup("老虎",4,"lh/1.jpg","lh/2.jpg","lh/3.jpg","lh/4.jpg");
        ImageGroup group8=new ImageGroup("土豆",6,"td/1.jpg","td/2.jpg","td/3.jpg","td/4.jpg","td/5.jpg","td/6.jpg");
        ImageGroup group9=new ImageGroup("仙人球",6,"xrq/1.jpg","xrq/2.jpg","xrq/3.jpg","xrq/4.jpg","xrq/5.jpg","xrq/6.jpg");
        ImageGroup group10=new ImageGroup("兔子",6,"tz/1.jpg","tz/2.jpg","tz/3.jpg","tz/4.jpg","tz/5.jpg","tz/6.jpg");
        initMap(group,group0,group1,group2,group3,group4,group5,group6,group7,group8,group9,group10);
    }

    /**
     * 初始化图
     * @param groups
     */
    public static void initMap(ImageGroup... groups){
        for (ImageGroup group:groups) {
            imageGroupMap.put(group.getName(),group);
            if (!countGroupMap.containsKey(group.getCount())){
                countGroupMap.put(group.getCount(),new HashMap<String, ImageGroup>());
            }
            countGroupMap.get(group.getCount()).put(group.getName(),group);
        }
    }

    /**
     * 获取随机数
     * @param min
     * @param max
     * @return
     */
    private static int random(int min,int max){
        Random r=new Random();
        log.debug(min+""+max);
        return r.nextInt(max-min)+min;
    }
    private static int random(int min,int max,Integer... ex){
        int num=random(min,max);
        List<Integer> notList=Arrays.asList(ex);
        /**
         * 由于这里容易出现死循环
         */
        while (notList.contains(num)){
            num=random(min,max);
        }
        return num;
    }

    /**
     * 获取随机图片组
     * @return
     */
    public static GenerateImageGroup randImageGroups(){
        List<ImageGroup> result=new ArrayList<>();
        /**
         * 产生随机数
         */
        int num=random(0,imageGroupMap.size());
        //获取相关的需要选中的key
        String name=new ArrayList<String>(imageGroupMap.keySet()).get(num);
        ImageGroup keyGroup = imageGroupMap.get(name);
        /**
         * 重新建立这个文件图
         */
        Map <Integer,Map<String,ImageGroup>> thisCoutGroup=new HashMap<>(countGroupMap);
        //将在该数量下的组移除key
        thisCoutGroup.get(keyGroup.getCount()).remove(name);
        //留下的数量
        int leftCount=8-keyGroup.getCount();
        //如果留下4个
        if (leftCount==4){
            //继续产生随机数
            if (new Random().nextInt()%2==0){//判断产生的随机数是否被二整除是则产生4个图片的组合
                List<ImageGroup> groups=new ArrayList<>(thisCoutGroup.get(4).values());
                /**
                 * 如果数量大于1则再次产生随机数
                 */
                if (groups.size()>1){
                    num=random(0,groups.size());
                }else{
                    num=0;
                }
                result.add(groups.get(num));
            }else{//为奇数的时候则是2个2个的组合
                List<ImageGroup> groups=new ArrayList<>(thisCoutGroup.get(2).values());
                int num1=random(0,groups.size());
                result.add(groups.get(num1));
                int num2=random(0,groups.size(),num1);
                result.add(groups.get(num2));
            }
        }else if (leftCount==6){
            if (new Random().nextInt()%2==0){//偶数2+4+2
                List<ImageGroup> groups1=new ArrayList<>(thisCoutGroup.get(4).values());
                int num1=random(0,groups1.size());
                result.add(groups1.get(num1));
                List<ImageGroup> groups2=new ArrayList<>(thisCoutGroup.get(2).values());
                int num2=random(0,groups2.size());
                result.add(groups2.get(num2));
            }else{
                List<ImageGroup> groups=new ArrayList<>(thisCoutGroup.get(2).values());
                int num1=random(0,groups.size());
                result.add(groups.get(num1));
                int num2=random(0,groups.size(),num1);
                result.add(groups.get(num2));
                int num3=random(0,groups.size(),num1,num2);
                result.add(groups.get(num3));
            }
        }else if(leftCount==2){
            List<ImageGroup> groups=new ArrayList<>(thisCoutGroup.get(2).values());
            result.add(groups.get(random(0,groups.size())));
        }
        return  new GenerateImageGroup(keyGroup,result);
    }
    private static ImageResult meregeImage(ServletRequest request, List<BufferedImageWarp> imageWarps, String tip) throws IOException {
        Collections.shuffle(imageWarps);
        int width=100;
        int height=100;
        int totalWidth=4*width;
        BufferedImage destImage=new BufferedImage(totalWidth,200,BufferedImage.TYPE_INT_BGR);
        int x1=0;
        int x2=0;
        int order=0;
        List<Integer> keyOrderList=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        Set<Integer> keySet=new HashSet<>();
        for (BufferedImageWarp image:imageWarps) {
            int[] rgb=image.getBufferedImage().getRGB(0,0,width,height,null,0,width);
            if (image.isKey()){
                keyOrderList.add(order);
                int x=(order%4)*100;
                int y=order>4?0:100;
                keySet.add(order);

            }
            if (order<4){
                destImage.setRGB(x1,0,width,height,rgb,0,width);
                x1+=width;
            }else{
                destImage.setRGB(x2,height,width,height,rgb,0,width);
                x2+=width;
            }
            order++;
        }
        String fileName=UUID.randomUUID().toString().replaceAll("-","");
        String fileUrl=request.getServletContext().getRealPath("assets/tmp/")+File.separator+fileName+".jpg";
        saveImage(destImage,fileUrl,"jpeg");
        ImageResult result=new ImageResult();
        result.setName(fileName+".jpg");
        result.setKeySet(keySet);
        result.setTip(tip);
        result.setUniqueKey(fileName);
        return result;
    }

    private static boolean saveImage(BufferedImage destImage, String fileUrl, String format) throws IOException {
        File file=new File(fileUrl);
        log.debug(file.getAbsolutePath());
        return ImageIO.write(destImage,format,file);
    }
}

