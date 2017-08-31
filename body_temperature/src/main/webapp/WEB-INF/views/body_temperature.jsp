<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>ECharts</title>
    <script type="text/javascript" src="/js/echarts.min.js"></script>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <style>
        .mainStyle {
            width: 839px;
            /* border: 1px solid #000; */
            height: 700px;
            position: relative;
            text-align: right;
            z-index: 2; /* 浮在上层 */
        }

        .mainTable {
            /*去掉边框*/
            border-collapse: collapse;
            /*列宽由表格宽度和列宽度设定。*/
            table-layout: fixed;
            /*在长单词或 URL 地址内部进行换行。*/
            /*word-wrap: break-word;*/
        }

        .mainTable td{
            padding-left: 0;
            padding-right: 0;
            width : 18px;
            font-size: 10pt;
        }

        .mainTable th{
            padding-left: 0;
            padding-right: 0;
            width : 50px;
        }

        .topCanvasStyle {
            width: 839px;
            height: 176px;
            margin-top: 0;  /*上外边距*/
            position: absolute;
        }

        .bottomCanvasStyle {
            width: 839px;
            height: 88px;
            margin-top: -88px;  /*上外边距*/
            position: absolute;
        }
    </style>
</head>
<body>
    <table width="800px" border="0" cellspacing="0" cellpadding="0" align="center" style="margin-bottom: 5px;">
        <tr>
            <td width="70%" align="right"><div id="error"  style="float:left;width:300px;font-family:宋体;height:32px;line-height:32px;font-size:13px;font-weight:bold;color:red;cursor:default;"></div>
                <div style="float:right;">
                    <ul class="button_li">
                        <li style="float:left;list-style:none;"><button class="button_style" onclick="javascript:window.parent.$.unblockUI();" disabled="disabled">关闭</button></li>
                        <li style="float:left;list-style:none;"><button class="button_style" onclick="javascript:deleteForm();" id="deleteForm" disabled="disabled">打印</button></li>
                        <li style="float:left;list-style:none;"><button class="button_style" onclick="redrawed()" id="saveForm">重绘</button></li>
                    </ul>
                </div>
            </td>
        </tr>
    </table>
    <table align="center" border="1"  class="mainTable">
        <tr>
            <th colspan="2">日期</th>
            <td align="center" colspan="6">2017-7-24</td>
            <td align="center" colspan="6">2017-7-25</td>
            <td align="center" colspan="6">2017-7-26</td>
            <td align="center" colspan="6">2017-7-27</td>
            <td align="center" colspan="6">2017-7-28</td>
            <td align="center" colspan="6">2017-7-29</td>
            <td align="center" colspan="6">2017-7-30</td>
        </tr>
        <tr>
            <th colspan="2">住院日数</th>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
        </tr>
        <tr>
            <th colspan="2">手术或产后日数</th>
            <td align="center" colspan="6">0</td>
            <td align="center" colspan="6">1</td>
            <td align="center" colspan="6">2</td>
            <td align="center" colspan="6">3</td>
            <td align="center" colspan="6">4</td>
            <td align="center" colspan="6">5</td>
            <td align="center" colspan="6">6</td>
        </tr>
        <tr>
            <th colspan="2">时间</th>
            <td align="center" colspan="3">上午</td>
            <td align="center" colspan="3">下午</td>
            <td align="center" colspan="3">上午</td>
            <td align="center" colspan="3">下午</td>
            <td align="center" colspan="3">上午</td>
            <td align="center" colspan="3">下午</td>
            <td align="center" colspan="3">上午</td>
            <td align="center" colspan="3">下午</td>
            <td align="center" colspan="3">上午</td>
            <td align="center" colspan="3">下午</td>
            <td align="center" colspan="3">上午</td>
            <td align="center" colspan="3">下午</td>
            <td align="center" colspan="3">上午</td>
            <td align="center" colspan="3">下午</td>
        </tr>
        <tr>
            <th align="center">
                <span style="font-size: 9pt; color: #ff3333;">脉搏(次/分)</span>
            </th>
            <th align="center">
                <span style="font-size: 9pt; color: #ff3333;">体温℃</span>
            </th>
            <td align="center">4</td><td align="center">8</td><td align="center">12</td>
            <td align="center">4</td><td align="center">8</td><td align="center">12</td>
            <td align="center">4</td><td align="center">8</td><td align="center">12</td>
            <td align="center">4</td><td align="center">8</td><td align="center">12</td>
            <td align="center">4</td><td align="center">8</td><td align="center">12</td>
            <td align="center">4</td><td align="center">8</td><td align="center">12</td>
            <td align="center">4</td><td align="center">8</td><td align="center">12</td>
            <td align="center">4</td><td align="center">8</td><td align="center">12</td>
            <td align="center">4</td><td align="center">8</td><td align="center">12</td>
            <td align="center">4</td><td align="center">8</td><td align="center">12</td>
            <td align="center">4</td><td align="center">8</td><td align="center">12</td>
            <td align="center">4</td><td align="center">8</td><td align="center">12</td>
            <td align="center">4</td><td align="center">8</td><td align="center">12</td>
            <td align="center">4</td><td align="center">8</td><td align="center">12</td>
        </tr>
        <tr>
            <td valign="top" align="right">180</td>
            <td valign="top" align="right">42</td>
            <td  rowspan="8" colspan="42">
                <canvas id="drawing1" width="1745" height="400" class="topCanvasStyle"></canvas>
                <div id="main" class="mainStyle"></div>
                <canvas id="drawing2" width="1745" height="200" class="bottomCanvasStyle"></canvas>
            </td>
        </tr>
        <tr>
            <td valign="top" align="right">160</td>
            <td valign="top" align="right">41</td>
        </tr>
        <tr>
            <td valign="top" align="right">140</td>
            <td valign="top" align="right">40</td>
        </tr>
        <tr>
            <td valign="top" align="right">120</td>
            <td valign="top" align="right">39</td>
        </tr>
        <tr>
            <td valign="top" align="right">100</td>
            <td valign="top" align="right">38</td>
        </tr>
        <tr>
            <td valign="top" align="right">80</td>
            <td valign="top" align="right">37</td>
        </tr>
        <tr>
            <td valign="top" align="right">60</td>
            <td valign="top" align="right">36</td>
        </tr>
        <tr>
            <td valign="top" align="right">40</td>
            <td valign="top" align="right">35</td>
        </tr>

        <tbody id="tbody-breathe">
        <tr>
            <th colspan="2">呼吸</th>
            <td height="60px"></td><td></td><td></td><td></td><td></td><td></td>
            <td></td><td></td><td></td><td></td><td></td><td></td>
            <td></td><td></td><td></td><td></td><td></td><td></td>
            <td></td><td></td><td></td><td></td><td></td><td></td>
            <td></td><td></td><td></td><td></td><td></td><td></td>
            <td></td><td></td><td></td><td></td><td></td><td></td>
            <td></td><td></td><td></td><td></td><td></td><td></td>
        </tr>
        </tbody>
        <tbody id="tbody-bloodPressure">
        <tr>
            <th colspan="2">血压</th>
            <td colspan="3"></td><td colspan="3"></td>
            <td colspan="3"></td><td colspan="3"></td>
            <td colspan="3"></td><td colspan="3"></td>
            <td colspan="3"></td><td colspan="3"></td>
            <td colspan="3"></td><td colspan="3"></td>
            <td colspan="3"></td><td colspan="3"></td>
            <td colspan="3"></td><td colspan="3"></td>
        </tr>
        </tbody>
        <tbody id="tbody-totalIn">
        <tr>
            <th colspan="2">总入液量</th>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
        </tr>
        </tbody>
        <tbody id="tbody-totalOut">
        <tr>
            <th colspan="2">总出液量</th>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
        </tr>
        </tbody>
        <tbody id="tbody-poop">
        <tr>
            <th colspan="2">大便</th>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
        </tr>
        </tbody>
        <tbody id="tbody-urinate">
        <tr>
            <th colspan="2">尿量</th>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
        </tr>
        </tbody>
        <tbody id="tbody-height">
        <tr>
            <th colspan="2">身高</th>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
        </tr>
        </tbody>
        <tbody id="tbody-weight">
        <tr>
            <th colspan="2">体重</th>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
        </tr>
        </tbody>
        <tbody id="tbody-skinTest">
        <tr>
            <th colspan="2">皮试</th>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
            <td colspan="6"></td>
        </tr>
        </tbody>
    </table>

    <script type="text/javascript">
        var myChart = echarts.init(document.getElementById('main'));
        var option = {
            // 坐标轴触发
            tooltip : {
//                trigger: 'axis'
//                 鼠标移上去就只显示这一条这折线的值
                trigger: 'item',
                formatter: '{a} <br/>{b} : {c}'
            },
//             toolbox: {
//                 show: true,
//                 feature: {
//                     mark: {show: true},
//                     dataView: {show: true, readOnly: false},
//                     magicType: {show: true, type: ['line', 'bar', 'stack', 'tiled']},
//                     restore: {show: true},
//                     saveAsImage: {show: true}
//                 }
//             },

            // 组件离容器的距离
            grid: {
                left: '-1',
                top: '-1',
                bottom: '0',
                right:'0',
                width: '100%',
                // 是否显示坐标轴刻度
                containLabel: false
            },
            calculable : true,
            xAxis : [
                {
                    name:'时间(小时)',
                    type : 'category',
                    // 为true后，标签和数据点都会在两个刻度之间的带(band)中间
                    boundaryGap : true,
                    data : function(){
                        var list=[];
                        list.push(0);
                        for(var i=1; i<42; i++){
                            list.push(i);
                        }
                        return list;
                    }(),
                    // interval 表示坐标轴分割间隔
                    // 设为 0 则显示所有标签
                    // rotate 倾斜角度
                    axisLabel: {
                        interval:0,
                        rotate:40
                    },
                    // 是否显示网格线
                    splitLine:{
                        show : true,
                        lineStyle:{
                            color: ['red', '#ddd','#ddd','#ddd','#ddd','#ddd'],
                            width:1
                        }
                    }
                }
            ],
            yAxis : [
                {
                    name: '体温',
                    type : 'value',
                    // 绝对位置
                    position: 'left',
                    // 坐标轴分割的段数
                    // splitNumber: 40,
                    // 坐标轴分割间隔
                    interval:0.2,
                    // y轴的长度限制
                    max: 42,
                    min: 34,
                    axisLabel: {
                        // 单位
                        formatter: '{value} (℃)'
                    },
                    splitLine:{
                        show : true,
                        lineStyle:{
                            color: [
                                '#ddd','#ddd','#ddd',
                                '#ddd','#ddd','#ddd',
                                '#ddd','#ddd','#ddd',
                                '#ddd','#ddd','#ddd',
                                '#ddd','#ddd','#ddd',
                                'red',
                                '#ddd','#ddd','#ddd',
                                '#ddd','#ddd','#ddd',
                                '#ddd','#ddd','#ddd',
                                '#ddd','#ddd','#ddd',
                                '#ddd','#ddd','#ddd'
                            ],
                            width:1
                        }
                    }
                },
                {
                    name: '脉搏(次/分)',
                    type : 'value',
                    axisLabel:{
                        // 是否强制显示坐标轴第一个/最后一个标签
                        showMinLabel: false,
                        showMaxLabel: true
                    },
                    splitLine:{
                        show : false
                    },
                    position: 'right',
                    min:20,
                    max:180
                }
            ],
            series : []
        };
//        initMarkLine(option);
        myChart.setOption(option);
//
//        var div=document.getElementById("main").childNodes[0];
//        var canvas=div.childNodes[0];
//        var url= canvas.toDataURL('img/png');
//        var img = '<img src="' + url  + '"></img>';
////        console.log(img);
//        div.replaceChild(img,canvas);

        // 重新绘制
        function redrawed() {

            var options = myChart.getOption();
            var breathe=window.document.getElementById("tbody-breathe");

            // 获取canvas
            var drawing1=document.getElementById("drawing1");
            var drawing2=document.getElementById("drawing2");
            var context1=drawing1.getContext("2d");
            var context2=drawing2.getContext("2d");
            // 先清空canvas
            context1.clearRect(0,0,1745,400);
            context2.clearRect(0,0,1745,400);
            context1.font="900 30px 宋体";
            context1.textAlign="middle";
            context2.font="900 30px 宋体";
            context2.textAlign="middle";

            // 每次点击重绘按钮之后，清空之前的数据
            options.series=[];
//            initMarkLine(options);

            $.ajax({
                type : "post",
                async : false, //同步执行
                url : "http://localhost:8080/sign/getDetailInfoByInpno",
                data : {
                    inpno: "0123456789"
                },
                dataType : "json",
                success : function(result) {
                    if (result) {


                        // 将小时数和天数两个变量的意义 合起来
                        for(var m=0;m<result.length;m++){
                            result[m].time =result[m].time+(result[m].theDate-1)*24;
                        }
                        //按从小到大排序
                        result.sort(function(a,b){ return a.time-b.time });

                        var xlData=[];
                        var mbData=[];
                        var twData=[];
                        var jwData=[];
                        var index;
                        var preIndex = -1;
                        var preTemperature;
                        var preTemperatureType;
                        var stringBreathe = "<tr><th colspan='2'>呼吸</th>";
                        var hxIndex=0;

                        for(var i=0; i < result.length; i++){
                            index = calculateIndex(result[i].time);
                            // 事件描述
                            if(result[i].comment1Type!=null){
                                if(result[i].comment1Type!=="0"){
                                    switch (result[i].comment1Type){
                                        case "1":
                                            context1.fillText("入", 8+index*41.5, 30);
                                            context1.fillText("院", 8+index*41.5, 70);
                                            break;
                                        case "2":
                                            context1.fillText("分", 8+index*41.5, 30);
                                            context1.fillText("娩", 8+index*41.5, 70);
                                            break;
                                        case "3":
                                            context1.fillText("转", 8+index*41.5, 30);
                                            context1.fillText("出", 8+index*41.5, 70);
                                            break;
                                        case "4":
                                            context1.fillText("手", 8+index*41.5, 30);
                                            context1.fillText("术", 8+index*41.5, 70);
                                            break;
                                        case "5":
                                            context1.fillText("出", 8+index*41.5, 30);
                                            context1.fillText("院", 8+index*41.5, 70);
                                            break;
                                        case "6":
                                            context1.fillText("死", 8+index*41.5, 30);
                                            context1.fillText("亡", 8+index*41.5, 70);
                                            break;
                                        case "7":
                                            context2.fillText("外", 8+index*41.5, 30);
                                            context2.fillText("出", 8+index*41.5, 70);
                                            break;
                                        case "8":
                                            context2.fillText("拒", 8+index*41.5, 30);
                                            context2.fillText("测", 8+index*41.5, 70);
                                            break;
                                    }
                                    if(result[i].comment1Type!=="7" && result[i].comment1Type!=="8"){
                                        context1.fillText("|", 8+index*41.5, 110);
                                        for(var j=0;j<result[i].comment1.length;j++){
                                            context1.fillText(result[i].comment1.substring(j,j+1), 8+index*41.5, 150+j*40);
                                        }
                                    }
                                }
                            }

                            // 脉搏数据
                            if(result[i].pulse){
                                mbData[index]=result[i].pulse;
                            }
                            // 心率数据
                            if(result[i].heartRate){
                                xlData[index]=result[i].heartRate;
                            }
                            // 体温数据
                            if(result[i].temperature){

                                // 从第二个点开始
                                if(preIndex!==-1){
                                    // 前一个节点显示
                                    twData[preIndex]=preTemperature;
                                    // 后一个节点隐藏， 为了画出两点之间的线段
                                    twData[index]= {
                                        value:result[i].temperature,
                                        itemStyle : {normal:{opacity : 0}}
                                    };
                                }
                                // 绘制数据 （type应该对应的是前一个点的类型）
                                pushTWData(options,twData,preTemperatureType);

                                // 保存当前节点的信息
                                preIndex=index;
                                preTemperature=result[i].temperature;
                                preTemperatureType=result[i].temperatureType;

                                //一坐标点一个数据，不清空的话 数据重复
                                twData=[];
                            }
                            // 降温数据，当且仅当 体温数据存在
                            if(result[i].reductionTemperature && result[i].temperature){
                                jwData.push([index,result[i].reductionTemperature]);
                                jwData.push({
                                    value:[index,result[i].temperature],
                                    itemStyle : {normal:{opacity : 0}}
                                });
                                pushJWData(options,jwData);
                                jwData=[];
                            }

                            // 填充呼吸数据
                            if(result[i].breathe){
                                // 上下显示数据，先上再下
                                if(hxIndex % 2 ===0){
                                    stringBreathe+="<td height='60px' valign='top' class='tdStyle'>"+result[i].breathe+"</td>";
                                }else {
                                    stringBreathe+="<td height='60px' valign='bottom' class='tdStyle'>"+result[i].breathe+"</td>";
                                }
                                hxIndex++;
                            }else{
                                stringBreathe+="<td height='60px'></td>";
                            }
                        }
                        // 绘制体温最后一个节点
                        twData[preIndex]=preTemperature;
                        pushTWData(options,twData,preTemperatureType);
                        // 将脉搏数据 push到 series
                        pushMBData(options,mbData);
                        // 将心率数据 push到 series
                        pushXLData(options,xlData);
                        // 填充呼吸的 剩余标签
                        for(var j=result.length;j<42;j++){
                            stringBreathe+="<td></td>";
                        }
                        // 填充呼吸的 闭合标签
                        stringBreathe+="</tr>";
                        breathe.innerHTML = stringBreathe;

                        // 隐藏动画加载效果
                        myChart.hideLoading();
                        myChart.setOption(options);

                    }
                },

                error : function(xhr,textStatus) {
                    alert("图表请求数据失败!");
                    myChart.hideLoading();
                }
            });

            var bloodPressure=window.document.getElementById("tbody-bloodPressure");
            var totalIn=window.document.getElementById("tbody-totalIn");
            var totalOut=window.document.getElementById("tbody-totalOut");
            var poop=window.document.getElementById("tbody-poop");
            var urinate=window.document.getElementById("tbody-urinate");
            var height=window.document.getElementById("tbody-height");
            var weight=window.document.getElementById("tbody-weight");
            var skinTest=window.document.getElementById("tbody-skinTest");

            $.ajax({
                type: "post",
                async: false, //同步执行
                url: "http://localhost:8080/sign/getPTempInfoByInpno",
                data: {
                    inpno: "0123456789"
                },
                dataType: "json",
                success: function (result) {
                    if(result){
                        //按从小到大排序
                        result.sort(function(a,b){ return a.theDate-b.theDate });

                        var stringBloodPressure="<tr><th colspan='2'>血压</th>";
                        var stringTotalIn="<tr><th colspan='2'>总入液量</th>";
                        var stringTotalOut="<tr><th colspan='2'>总出液量</th>";
                        var stringPoop="<tr><th colspan='2'>大便</th>";
                        var stringUrinate="<tr><th colspan='2'>小便</th>";
                        var stringHeight="<tr><th colspan='2'>身高</th>";
                        var stringWeight="<tr><th colspan='2'>体重</th>";
                        var stringSkinTest="<tr><th colspan='2'>皮试</th>";
                        var index=1;
                        for(var i=0;i<result.length;i++){

                            // 利用index，补足空的数据
                            if(index!==result[i].theDate){
                                for(var m=index;m<result[i].theDate;m++){
                                    stringBloodPressure+="<td colspan='3'></td><td colspan='3'></td>";
                                    stringTotalIn+="<td colspan='6'></td>";
                                    stringTotalOut+="<td colspan='6'></td>";
                                    stringPoop+="<td colspan='6'></td>";
                                    stringUrinate+="<td colspan='6'></td>";
                                    stringHeight+="<td colspan='6'></td>";
                                    stringWeight+="<td colspan='6'></td>";
                                    stringSkinTest+="<td colspan='6'></td>";
                                }
                                index=result[i].theDate;
                            }

                            // 早上血压
                            if(result[i].sbp1 || result[i].dbp1){
                                stringBloodPressure+="<td colspan='3' class='tdStyle'>"+result[i].sbp1+"/"+result[i].dbp1+"</td>";
                            }else {
                                stringBloodPressure+="<td colspan='3'></td>";
                            }
                            // 下午血压
                            if(result[i].sbp2 || result[i].dbp2){
                                stringBloodPressure+= "<td colspan='3' class='tdStyle'>"+result[i].sbp2+"/"+result[i].dbp2+"</td>";
                            }else {
                                stringBloodPressure+="<td colspan='3'></td>";
                            }
                            // 入量
                            if(result[i].intake){
                                stringTotalIn+="<td colspan='6' class='tdStyle'>"+result[i].intake+"</td>";
                            }else{
                                stringTotalIn+="<td colspan='6'></td>";
                            }
                            // 出量
                            if(result[i].output){
                                stringTotalOut+="<td colspan='6' class='tdStyle'>"+result[i].output+"</td>";
                            }else {
                                stringTotalOut+="<td colspan='6'></td>";
                            }
                            // 大便
                            if(result[i].poopInfo){
                                stringPoop+="<td colspan='6' class='tdStyle'>"+result[i].poopInfo+"</td>";
                            }else {
                                stringPoop+="<td colspan='6'></td>";
                            }
                            // 小便
                            if(result[i].urinateInfo){
                                stringUrinate+="<td colspan='6' class='tdStyle'>"+result[i].urinateInfo+"</td>";
                            }else {
                                stringUrinate+="<td colspan='6'></td>";
                            }
                            // 身高
                            if(result[i].height){
                                stringHeight+="<td colspan='6' class='tdStyle'>"+result[i].height+"</td>";
                            }else {
                                stringHeight+="<td colspan='6'></td>";
                            }
                            // 体重
                            if(result[i].weight){
                                if(result[i].weightType===1){
                                    stringWeight+="<td colspan='6' class='tdStyle'>"+result[i].weight+"</td>";
                                }else if(result[i].weightType===2){
                                    stringWeight+="<td colspan='6' class='tdStyle'>平车</td>";
                                }else if(result[i].weightType===3){
                                    stringWeight+="<td colspan='6' class='tdStyle'>卧床</td>";
                                }else if(result[i].weightType===4){
                                    stringWeight+="<td colspan='6' class='tdStyle'>报入</td>";
                                }else if(result[i].weightType===5){
                                    stringWeight+="<td colspan='6' class='tdStyle'>轮椅</td>";
                                }
                            }else {
                                stringWeight+="<td colspan='6'></td>";
                            }
                            // 皮试
                            if(result[i].skinTest){
                                stringSkinTest+="<td colspan='6' class='tdStyle'>"+result[i].skinTest+"</td>";
                            }else {
                                stringSkinTest+="<td colspan='6'></td>";
                            }

                            index++;
                        }
                        // 填充剩余标签
                        for(var j=index;j<7;j++){
                            stringBloodPressure+="<td colspan='3'></td><td colspan='3'></td>";
                            stringTotalIn+="<td colspan='6'></td>";
                            stringTotalOut+="<td colspan='6'></td>";
                            stringPoop+="<td colspan='6'></td>";
                            stringUrinate+="<td colspan='6'></td>";
                            stringHeight+="<td colspan='6'></td>";
                            stringWeight+="<td colspan='6'></td>";
                            stringSkinTest+="<td colspan='6'></td>";
                        }
                        stringBloodPressure+="</tr>";
                        stringTotalIn+="</tr>";
                        stringTotalOut+="</tr>";
                        stringPoop+="</tr>";
                        stringUrinate+="</tr>";
                        stringHeight+="</tr>";
                        stringWeight+="</tr>";
                        stringSkinTest+="</tr>";
                        bloodPressure.innerHTML = stringBloodPressure;
                        totalIn.innerHTML=stringTotalIn;
                        totalOut.innerHTML=stringTotalOut;
                        poop.innerHTML=stringPoop;
                        urinate.innerHTML=stringUrinate;
                        height.innerHTML=stringHeight;
                        weight.innerHTML=stringWeight;
                        skinTest.innerHTML=stringSkinTest;
                    }
                },
                error : function(xhr,textStatus) {
                    alert("数据请求失败!");
                }
            });
        }

        // 计算索引
        function calculateIndex(time) {
            return newIndex = (time-2)/4;
        }

        // 绘制标记线
        function initMarkLine(option) {
            var data=[];
            data.push([0,37],[42,37]);
            data.push([6,34],[6,42]);
            data.push([12,34],[12,42]);
            data.push([18,34],[18,42]);
            data.push([24,34],[24,42]);
            data.push([30,34],[30,42]);
            data.push([36,34],[36,42]);
            for(var i=0;i<data.length;i=i+2){
                option.series.push({
                    type:'line',
                    data:[
                        data[i],data[i+1]
                    ],
                    animation : false,
                    symbol:'none',
                    smooth:true,
                    itemStyle : {normal:{color : 'red'}},
                    lineStyle : {normal:{color : 'red'}}
                });
            }
        }

        // 初始化数组
        function initData(data) {
            for(var i=0;i<43;i++){
                data.push([i,'-']);
            }
        }

        // 清空数组
        function spliceArray(array) {
            array.splice(0,array.length);
        }

        function pushMBData(options,mbData) {
            options.series.push({
                name:'脉搏',
                type:'line',
                yAxisIndex: 1,
                data: mbData,
                animation : true,
                connectNulls : true,
                smooth:false,
                symbolSize : 10,
                symbol: 'circle',
                itemStyle : {
                    normal:{
                        color : 'red'
                    }
                },
                lineStyle : {
                    normal:{
                        color : 'red'
                    }
                }
            });
        }

        function pushXLData(options,xlData) {
            options.series.push({
                name:'心率',
                type:'line',
                yAxisIndex: 1,
                data: xlData,
                animation : true,
                connectNulls : true,
                smooth:false,
                symbolSize : 10,
                symbol: 'emptyCircle',
                itemStyle : {
                    normal:{
                        color : 'red'
                    }
                },
                lineStyle : {
                    normal:{
                        color : 'red'
                    }
                }
            });
        }

        function pushTWData(options,twData,twlx) {
            if(twlx===1) {
                options.series.push({
                    name: '口表',
//                    name: '体温',
                    type: 'line',
                    data: twData,
                    // 是否开启动画
                    animation: true,
                    // 是否连接空数据
                    connectNulls: true,
                    // 是否平滑曲线显示。
                    smooth: false,
                    symbolSize: 10,
                    symbol: 'circle',
                    itemStyle: {
                        normal: {
                            color: 'blue'
                        }
                    },
                    lineStyle: {
                        normal: {
                            color: 'blue'
                        }
                    }
                });
            }else if(twlx===2){
                options.series.push({
                    name:'腋表',
//                    name:'体温',
                    type:'line',
                    data:twData,
                    animation : true,
                    connectNulls : true,
                    smooth:false,
                    symbolSize : 10,
                    symbol: 'image:///img//叉号.png',
                    itemStyle : {
                        normal:{
                            color : 'blue'
                        }
                    },
                    lineStyle : {
                        normal:{
                            color : 'blue'
                        }
                    }
                });
            }else if(twlx===3){
                options.series.push({
                    name:'肛表',
//                    name:'体温',
                    type:'line',
                    data: twData,
                    animation : true,
                    connectNulls : true,
                    smooth: false,
                    symbolSize : 10,
                    symbol: 'emptyCircle',
                    itemStyle : {
                        normal:{
                            color : 'blue'
                        }
                    },
                    lineStyle : {
                        normal:{
                            color : 'blue'
                        }
                    }
                });
            }
        }

        function pushJWData(options,jwData) {
            options.series.push({
                name: '降温',
                type: 'line',
                itemStyle : {
                    normal:{
                        color : 'red'
                    }
                },
                lineStyle : {
                    normal:{
                        color : 'red',
                        type:'dashed'
                    }
                },
                symbolSize : 10,
                symbol: 'emptyCircle',
                animation : true,
                data:jwData
            });
        }
    </script>
</body>
</html>