package com.swing_jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * Created by Wuxiang on 2017/1/17.
 */
//压制信息
@SuppressWarnings("serial")
public class FileWindow extends JFrame implements ActionListener,Runnable{

    Thread compiler = null;
    Thread run_prom = null;
    boolean bn = true;
    CardLayout mycard;  //声明布局
    File file_saved = null;
    JButton input_txt_button,   //按钮的定义
            compiler_text_button,
            compiler_button,
            run_prom_button,
            see_doswin_button;

    JPanel jPanel = new JPanel();
    JTextArea input_text = new JTextArea(); // 程序输入区
    JTextArea compiler_text = new JTextArea();// 编译错误显示区
    JTextArea dos_out_text = new JTextArea();// 程序的输出信息

    JTextField input_file_name_text = new JTextField();
    JTextField run_file_name_text = new JTextField();
    /*
    初始化GUI
    */
    public FileWindow() {
        // TODO Auto-generated constructor stub
        super("Java语言编译器");
        mycard = new CardLayout();
        compiler=new Thread(this);
        run_prom=new Thread(this);
        input_txt_button=new JButton("程序输入区");
        compiler_text_button=new JButton("编译结果区");
        see_doswin_button=new JButton("程序运行结果");
        compiler_button=new JButton("编译程序");
        run_prom_button=new JButton("运行程序");

        jPanel.setLayout(mycard);//设置卡片布局
        jPanel.add("input",input_text);//定义卡片名称
        jPanel.add("compiler", compiler_text);
        jPanel.add("dos",dos_out_text);
        add(jPanel,"Center");

        compiler_text.setBackground(Color.pink); //设置颜色
        dos_out_text.setBackground(Color.cyan);
        JPanel p1=new JPanel();

        p1.setLayout(new GridLayout(3, 3)); //设置表格布局
        //添加组件
        p1.add(input_txt_button);
        p1.add(compiler_text_button);
        p1.add(see_doswin_button);
        p1.add(new JLabel("输入编译文件名（*.java）："));
        p1.add(input_file_name_text);
        p1.add(compiler_button);
        p1.add(new JLabel("输入应用程序主类名："));
        p1.add(run_file_name_text);
        p1.add(run_prom_button);
        add(p1,"North");

        //定义事件
        input_txt_button.addActionListener(this);
        compiler_button.addActionListener(this);
        compiler_text_button.addActionListener(this);
        run_prom_button.addActionListener(this);
        see_doswin_button.addActionListener(this);
    }
    /*
    事件方法
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==input_txt_button)
        {
            mycard.show(jPanel,"input");
            System.out.println("---进入程序输入区---");
        }
        else if(e.getSource()==compiler_text_button)
        {
            mycard.show(jPanel,"compiler");
            System.out.println("---进入编译结果区---");
        }
        else if(e.getSource()==see_doswin_button)
        {
            mycard.show(jPanel,"dos");
            System.out.println("---进入运行结果区---");
        }
        else if(e.getSource()==compiler_button)
        {
            if(!(compiler.isAlive()))
            {
                compiler=new Thread(this);
            }
            try {
                compiler.start();

            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }

            mycard.show(jPanel,"compiler");
            System.out.println("---编译程序---");

        }
        else if(e.getSource()==run_prom_button)
        {
            if(!(run_prom.isAlive()))
            {
                run_prom=new Thread(this);
            }
            try {
                run_prom.start();
            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
            mycard.show(jPanel,"dos");
            System.out.println("---运行程序---");
        }
    }

    @Override
    public void run() {
        //TODO Auto-generated method stub
        if(Thread.currentThread()==compiler)
        {
            compiler_text.setText(null);
            String temp=input_text.getText().trim();
            byte [] buffer=temp.getBytes();
            int b=buffer.length;
            String file_name=input_file_name_text.getText().trim();

            try {
                file_saved=new File(file_name);
                FileOutputStream writefile=new FileOutputStream(file_saved);
                writefile.write(buffer, 0, b);
                writefile.close();
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("---Error！---");
            }
            try {
                //获得该进程的错误流，才可以知道运行结果到底是失败了还是成功。
                Runtime rt=Runtime.getRuntime();
                InputStream in=rt.exec("javac "+file_name).getErrorStream(); //通过Runtime调用javac命令。注意：“javac ”这个字符串是有一个空格的！！

                BufferedInputStream bufIn=new BufferedInputStream(in);

                byte[] shuzu=new byte[100];
                int n=0;
                boolean flag=true;

                //输入错误信息
                while((n=bufIn.read(shuzu, 0,shuzu.length))!=-1)
                {
                    String s=null;
                    s=new String(shuzu,0,n);
                    compiler_text.append(s);
                    if(s!=null)
                    {
                        flag=false;
                    }
                }
                //判断是否编译成功
                if(flag)
                {
                    System.out.println("---编译成功---");
                    compiler_text.append("Compile Succeed!");
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("---编译失败---");
            }
        }
        else if(Thread.currentThread()==run_prom)
        {
            //运行文件，并将结果输出到dos_out_text

            dos_out_text.setText(null);

            try {
                Runtime rt=Runtime.getRuntime();
                String path=run_file_name_text.getText().trim();
                System.out.println("path:"+path);
                Process stream=rt.exec("java "+path);//调用java命令

                InputStream in=stream.getInputStream();
                BufferedInputStream bisErr=new BufferedInputStream(stream.getErrorStream());
                BufferedInputStream bisIn=new BufferedInputStream(in);

                byte[] buf=new byte[150];
                byte[] err_buf=new byte[150];

                @SuppressWarnings("unused")
                int m=0;
                @SuppressWarnings("unused")
                int i=0;
                String s=null;
                String err=null;

                //打印编译信息及错误信息
                while((m=bisIn.read(buf, 0, 150))!=-1)
                {
                    s=new String(buf,0,150);
                    dos_out_text.append(s);
                }
                while((i=bisErr.read(err_buf))!=-1)
                {
                    err=new String(err_buf,0,150);
                    dos_out_text.append(err);
                }
            }
            catch (Exception e) {
                // TODO: handle exception
                System.out.println("---运行失败---");
            }
        }
    }
}
