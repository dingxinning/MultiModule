package com.utils;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuxiang on 2018/7/12 15:00
 *
 * 读取excel文件
 * 1. xls格式
 * 2. xlsx格式
 */
public class ExcelUtil {
    /**
     * 读取xls文件
     *
     * @param path  文件的绝对路径
     * @param index 工作簿的索引 默认0
     * @throws IOException
     */
    public static List<List<String>> readXls(String path, Integer index) throws IOException {
        FileInputStream in = new FileInputStream(path);
        HSSFWorkbook book = new HSSFWorkbook(in);
        HSSFSheet sheet = book.getSheetAt(index);
        HSSFRow row;
        String cell;
        List<List<String>> lists = new ArrayList<>();
        for (int i = sheet.getFirstRowNum(); i < sheet.getPhysicalNumberOfRows(); i++) {
            row = sheet.getRow(i);
            List<String> subLists = new ArrayList<>();

            int nullNumber = 0;
            for (int j = row.getFirstCellNum(); j < row.getPhysicalNumberOfCells() + nullNumber; j++) {
                if (row.getCell(j) != null) {
                    cell = row.getCell(j).toString();
                } else {
                    cell = "NULL";
                    nullNumber++;
                }
                subLists.add(cell);
                System.out.print(cell + " \t");
            }
            lists.add(subLists);
            System.out.println("");
        }
        return lists;
    }

    /**
     * 读取xlsx文件
     *
     * 问题：row.getPhysicalNumberOfCells() 有bug，当excel中cell的值为null时，读取的长度小于实际长度
     * 优化：增加nullNumber
     * @param path  文件的绝对路径
     * @param index 工作簿的索引 默认0
     * @throws IOException
     */
    public static List<List<String>> readXlsx(String path, Integer index) throws IOException {
        XSSFWorkbook xwb = new XSSFWorkbook(path);
        XSSFSheet sheet = xwb.getSheetAt(index);
        XSSFRow row;
        String cell;
        List<List<String>> lists = new ArrayList<>();
        for (int i = sheet.getFirstRowNum(); i < sheet.getPhysicalNumberOfRows(); i++) {
            row = sheet.getRow(i);
            List<String> subLists = new ArrayList<>();

            int nullNumber = 0;
            for (int j = row.getFirstCellNum(); j < row.getPhysicalNumberOfCells() + nullNumber; j++) {
                if (row.getCell(j) != null) {
                    cell = row.getCell(j).toString();
                } else {
                    cell = "NULL";
                    nullNumber++;
                }
                subLists.add(cell);
//                System.out.print(cell + "\t");
            }
            lists.add(subLists);
//            System.out.println("");
        }
        return lists;
    }

    public static void main(String[] args) throws IOException {
        List<List<String>> list = readXlsx("D:\\test.xlsx", 0);
        System.out.println(list);
    }
}
