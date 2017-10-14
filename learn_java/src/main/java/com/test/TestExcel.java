package com.test;

import com.utils.ReadResourcesFile;
import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Wuxiang on 2017/3/11.
 *
 * 生成 excel
 * 生成文件的位置位于 target/classes目录下
 */
public class TestExcel {

    public static void main(String[] args) throws IOException
    {
        //1. 创建Workbook和Sheet
        String filePath= ReadResourcesFile.getPath("sample.xls");//文件路径
        System.out.println("xls文件存放于："+filePath);
        HSSFWorkbook workbook = new HSSFWorkbook();//创建Excel文件(Workbook)

        //2.创建单元格
        HSSFSheet sheet = workbook.createSheet("Test");// 创建工作表(Sheet)
        HSSFRow row = sheet.createRow(0);// 创建行,从0开始
        HSSFCell cell = row.createCell(0);// 创建行的单元格,也是从0开始
        cell.setCellValue("李志伟");// 设置单元格内容
        row.createCell(1).setCellValue(false);// 设置单元格内容,重载
        row.createCell(2).setCellValue(new Date());// 设置单元格内容,重载
        row.createCell(3).setCellValue(12.345);// 设置单元格内容,重载

        //3.创建文档摘要信息
        workbook.createInformationProperties();//创建文档信息
        DocumentSummaryInformation dsi= workbook.getDocumentSummaryInformation();//摘要信息
        dsi.setCategory("类别:Excel文件");//类别
        dsi.setManager("管理者:李志伟");//管理者
        dsi.setCompany("公司:--");//公司
        SummaryInformation si = workbook.getSummaryInformation();//摘要信息
        si.setSubject("主题:--");//主题
        si.setTitle("标题:测试文档");//标题
        si.setAuthor("作者:李志伟");//作者
        si.setComments("备注:POI测试文档");//备注

        FileOutputStream out = new FileOutputStream(filePath);
        workbook.write(out);//保存Excel文件
        out.close();//关闭文件流
        System.out.println("生成完毕，OK!");
    }
}
