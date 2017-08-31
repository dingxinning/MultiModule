<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>ECharts</title>
    <script type="text/javascript" src="/js/echarts.min.js"></script>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <style>
        .mainStyle {
            width: 615px;
            /* border: 1px solid #000; */
            height: 586px;
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

        .mainTable td {
            padding-left: 0;
            padding-right: 0;
            width: 8px;
            font-size: 8pt;
        }

        .mainTable th {
            padding-left: 0;
            padding-right: 0;
            width: 60px;
        }

        .canvasStyle {
            width: 615px;
            height: 145px;
            margin-top: 0; /*上外边距*/
            position: absolute;
        }
    </style>
</head>
<body>
<table width="800px" border="0" cellspacing="0" cellpadding="0" align="center" style="margin-bottom: 5px;">
    <tr>
        <td width="7%">周数：</td>
        <td>
            <select id="thedate" name="thedate">
                <option value="1">第一周</option>
                <option value="2">第二周</option>
            </select>
        </td>
        <td width="70%" align="right">
            <div id="error"
                 style="float:left;width:300px;font-family:宋体;height:32px;line-height:32px;font-size:13px;font-weight:bold;color:red;cursor:default;"></div>
            <div style="float:right;">
                <ul class="button_li">
                    <li style="float:left;list-style:none;">
                        <button class="button_style" onclick="javascript:change2img();"
                                id="changeForm">img
                        </button>
                    </li>
                    <li style="float:left;list-style:none;">
                        <button class="button_style" onclick="javascript:clearEcharts();"
                                id="testForm">清空
                        </button>
                    </li>
                    <li style="float:left;list-style:none;">
                        <button class="button_style" onclick="javascript:redrawed()"
                                id="saveForm">重绘
                        </button>
                    </li>
                </ul>
            </div>
        </td>
    </tr>
</table>

<table align="center" border="1" class="mainTable">
    <tr id="myDate">
        <th colspan="2">日期</th>
        <td align="center" colspan="6"></td>
        <td align="center" colspan="6"></td>
        <td align="center" colspan="6"></td>
        <td align="center" colspan="6"></td>
        <td align="center" colspan="6"></td>
        <td align="center" colspan="6"></td>
        <td align="center" colspan="6"></td>
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
        <td align="center">4</td>
        <td align="center">8</td>
        <td align="center">12</td>
        <td align="center">4</td>
        <td align="center">8</td>
        <td align="center">12</td>
        <td align="center">4</td>
        <td align="center">8</td>
        <td align="center">12</td>
        <td align="center">4</td>
        <td align="center">8</td>
        <td align="center">12</td>
        <td align="center">4</td>
        <td align="center">8</td>
        <td align="center">12</td>
        <td align="center">4</td>
        <td align="center">8</td>
        <td align="center">12</td>
        <td align="center">4</td>
        <td align="center">8</td>
        <td align="center">12</td>
        <td align="center">4</td>
        <td align="center">8</td>
        <td align="center">12</td>
        <td align="center">4</td>
        <td align="center">8</td>
        <td align="center">12</td>
        <td align="center">4</td>
        <td align="center">8</td>
        <td align="center">12</td>
        <td align="center">4</td>
        <td align="center">8</td>
        <td align="center">12</td>
        <td align="center">4</td>
        <td align="center">8</td>
        <td align="center">12</td>
        <td align="center">4</td>
        <td align="center">8</td>
        <td align="center">12</td>
        <td align="center">4</td>
        <td align="center">8</td>
        <td align="center">12</td>
    </tr>
    <tr>
        <td valign="top" align="right">180</td>
        <td valign="top" align="right">42</td>
        <td rowspan="8" colspan="42">
            <canvas id="drawing" width="1745" height="400" class="canvasStyle"></canvas>
            <div id="main" class="mainStyle"></div>
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

    <tbody data-kyee-tbody=footer>
    <tr id="breathe">
        <th colspan="2">
            呼吸(次/分)
        </th>
        <td height="30px"></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr id="bloodPressure">
        <th colspan="2">
            血压(mmHg)
        </th>
        <td colspan="3">
        </td>
        <td colspan="3">
        </td>
        <td colspan="3">
        </td>
        <td colspan="3">
        </td>
        <td colspan="3">
        </td>
        <td colspan="3">
        </td>
        <td colspan="3">
        </td>
        <td colspan="3">
        </td>
        <td colspan="3">
        </td>
        <td colspan="3">
        </td>
        <td colspan="3">
        </td>
        <td colspan="3">
        </td>
        <td colspan="3">
        </td>
        <td colspan="3">
        </td>
    </tr>
    <tr id="totalIn">
        <th colspan="2">
            总入液量(ml)
        </th>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
    </tr>
    <tr id="poop">
        <th colspan="2">
            大便(次)
        </th>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
    </tr>
    <tr id="urinate">
        <th colspan="2">
            尿量(ml)
        </th>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
    </tr>
    <tr id="weight">
        <th colspan="2">
            体重(Kg)
        </th>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
    </tr>
    <tr id="skinTest">
        <th colspan="2">
            皮试
        </th>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
        <td colspan="6">
        </td>
    </tr>
    </tbody>
</table>

<script type="text/javascript">
    var myChart = echarts.init(document.getElementById('main'));
    var option = {
        tooltip: {
            trigger: 'item',
            formatter: '{a} <br/>{b} : {c}'
        },
        grid: {
            left: '-1',
            top: '-1',
            bottom: '0',
            right: '0',
            width: '100%',
            containLabel: false
        },
        calculable: true,
        xAxis: [
            {
                name: '时间(小时)',
                type: 'category',
                boundaryGap: true,
                data: function () {
                    var list = [];
                    list.push(0);
                    for (var i = 1; i < 42; i++) {
                        list.push(i);
                    }
                    return list;
                }(),
                axisLabel: {
                    interval: 0,
                    rotate: 40
                },
                splitLine: {
                    show: true,
                    lineStyle: {
                        color: ['red', '#ddd', '#ddd', '#ddd', '#ddd', '#ddd'],
                        width: 1
                    }
                }
            }
        ],
        yAxis: [
            {
                name: '体温',
                type: 'value',
                position: 'left',
                interval: 0.2,
                max: 42,
                min: 34,
                axisLabel: {
                    show: false,
                    formatter: '{value} (℃)'
                },
                splitLine: {
                    show: true,
                    lineStyle: {
                        color: [
                            '#ddd', '#ddd', '#ddd',
                            '#ddd', '#ddd', '#ddd',
                            '#ddd', '#ddd', '#ddd',
                            '#ddd', '#ddd', '#ddd',
                            '#ddd', '#ddd', '#ddd',
                            'red',
                            '#ddd', '#ddd', '#ddd',
                            '#ddd', '#ddd', '#ddd',
                            '#ddd', '#ddd', '#ddd',
                            '#ddd', '#ddd', '#ddd',
                            '#ddd', '#ddd', '#ddd',
                        ],
                        width: 1
                    }
                },
            },
            {
                name: '脉搏(次/分)',
                type: 'value',
                axisLabel: {
                    show: false,
                    showMinLabel: true,
                    showMaxLabel: true
                },
                splitLine: {
                    show: false
                },
                position: 'right',
                min: 20,
                max: 180
            }
        ],
        series: [],
        graphic: [
            {
                type: 'group',
                id: 'textGroup1',
                left: 0,
                top: 0,
                bounding: 'all',
                children: []
            }
        ]


    };
    myChart.setOption(option);

    // 重新绘制
    function redrawed() {

        $.ajax({
            type: "post",
            async: false, //同步执行
            url: "http://localhost:9090/emr-server/nursing-record-service/temperature",
            data: {
                areacode:"anhui_lx",
                patientId: "6242861",
                inpno:"13330",
                weeknum: 58
            },
            dataType: "json",
            success: function (data) {
                var result = data.data;
                if (!result) return;
                sortData(result);

                var trDate = window.document.getElementById("myDate");
                getCurrentDate(result, trDate);

                changeData2Day(result);

                fillEchartsData(result, myChart);

//                //利用canvas绘制事件
//                var drawing = document.getElementById("drawing");
//                fillCanvasEventsData(result, drawing);

                //利用echarts本身的graphic绘制事件
                fillEchartsEventsData(result, myChart);

                var breathe = window.document.getElementById("breathe");
                fillBreatheData(result, breathe);

                var bloodPressure = window.document.getElementById("bloodPressure");
                fillBloodPressureData(result, bloodPressure);

                var totalIn = window.document.getElementById("totalIn");
                fillTotalInData(result, totalIn);

                var poop = window.document.getElementById("poop");
                fillPoopData(result, poop);

                var urinate = window.document.getElementById("urinate");
                fillUrinateData(result, urinate);

                var weight = window.document.getElementById("weight");
                fillWeightData(result, weight);

                var skinTest = window.document.getElementById("skinTest");
                fillSkinTestData(result, skinTest);

            },
            error: function (error) {
                console.log(error);
            }
        })
    }

    // 将echarts 替换为 img 图片，方便打印
    function change2img() {
        var img = new Image();
        img.src = myChart.getConnectedDataURL({
            pixelRatio:1,
            type:"img"
        });
//        console.log(img);

        var main=window.document.getElementById('main');
//        console.log(main.innerHTML);
        main.replaceWith(img);
    }

    // 清空echarts 和canvas
    function clearEcharts() {
        // 获取echarts
        var options = myChart.getOption();
        // 每次点击重绘按钮之后，清空之前的数据
        options.series = [];
        // 隐藏动画加载效果
        myChart.hideLoading();
        myChart.setOption(options, true);

        // 获取canvas
        var drawing = document.getElementById("drawing");
        var context = drawing.getContext("2d");
        // 清空canvas
        context.clearRect(0, 0, 1745, 400);
    }

    function changeData2Day(result) {
        for (var m = 0; m < result.length; m++) {
            result[m].当前日期 = new Date(result[m].当前日期).getDay();
            if (result[m].当前日期 == 0) {
                result[m].当前日期 = 7;
            }
        }
    }

    function sortData(result) {
        result.sort(function (a, b) {
            return a.当前日期 - b.当前日期
        });
    }

    function getCurrentDate(result, trDate) {
        var stringDate = "<th colspan='2'>日期</th>";
        var index = 1;
        var day;
        var year;
        var month;
        var date;
        for (var i = 0; i < result.length; i++) {
            var myDate = new Date(result[i].当前日期);
            day = myDate.getDay();
            day = (day == 0) ? 7 : day;
            if (index !== day) {
                for (var m = index; m < day; m++) {
                    stringDate += "<td colspan='6'></td>";
                }
                index = day;
            }
            year = myDate.getFullYear();
            month = myDate.getMonth() + 1;
            date = myDate.getDate();
            stringDate += "<td colspan='6'>" + year + "-" + month + "-" + date + "</td>";
            index++;
        }
        for (var j = index; j <= 7; j++) {
            stringDate += "<td colspan='6'></td>";
        }
        trDate.innerHTML = stringDate;
    }

    function fillEchartsData(result, myChart) {
        var options = myChart.getOption();
        options.series = [];
        var xlData = [];
        var mbData = [];
        var twData = [];
        var jwData = [];
        var twIndex;
        var preIndex = -1;
        var preTemperature;
        var preTemperatureType;
        var hxIndex = 0;

        for (var i = 0; i < result.length; i++) {
            twIndex = (result[i].当前日期 - 1) * 6 + (2 - 2) / 4;

            // 脉搏数据
            if (result[i].脉搏2 !== null) {
                mbData[twIndex] = parseInt(result[i].脉搏2);
            }
            // 心率数据
            if (result[i].心率2 !== null) {
                xlData[twIndex] = parseInt(result[i].心率2);
            }
            // 体温数据
            if (result[i].体温2 !== null) {

                // 从第二个点开始
                if (preIndex !== -1) {
                    // 前一个节点显示
                    twData[preIndex] = preTemperature;
                    // 后一个节点隐藏， 为了画出两点之间的线段
                    twData[twIndex] = {
                        value: parseFloat(result[i].体温2),
                        itemStyle: {normal: {opacity: 0}}
                    };
                }
                // 绘制数据 （type应该对应的是前一个点的类型）
                pushTWData(options, twData, preTemperatureType);

                // 保存当前节点的信息
                preIndex = twIndex;
                preTemperature = parseFloat(result[i].体温2);
                preTemperatureType = result[i].体温类型2;

                //一坐标点一个数据，不清空的话 数据重复
                twData = [];
            }
            // 降温数据，当且仅当 体温数据存在
            if (result[i].降温2 !== null && result[i].体温2 !== null) {
                if (parseInt(result[i].降温2) < parseFloat(result[i].体温2)) {
                    jwData.push([twIndex, parseInt(result[i].降温2)]);
                    jwData.push({
                        value: [twIndex, parseFloat(result[i].体温2)],
                        itemStyle: {normal: {opacity: 0}}
                    });
                    pushJWData(options, jwData);
                    jwData = [];
                }
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (6 - 2) / 4;

            if (result[i].脉搏6 !== null) {
                mbData[twIndex] = parseInt(result[i].脉搏6);
            }
            if (result[i].心率6 !== null) {
                xlData[twIndex] = parseInt(result[i].心率6);
            }
            if (result[i].体温6 !== null) {
                if (preIndex !== -1) {
                    twData[preIndex] = preTemperature;
                    twData[twIndex] = {
                        value: parseFloat(result[i].体温6),
                        itemStyle: {normal: {opacity: 0}}
                    };
                }
                pushTWData(options, twData, preTemperatureType);
                preIndex = twIndex;
                preTemperature = parseFloat(result[i].体温6);
                preTemperatureType = result[i].体温类型6;
                twData = [];
            }
            if (result[i].降温6 !== null && result[i].体温6 !== null) {
                if (parseInt(result[i].降温6) < parseFloat(result[i].体温6)) {
                    jwData.push([twIndex, parseInt(result[i].降温6)]);
                    jwData.push({
                        value: [twIndex, parseFloat(result[i].体温6)],
                        itemStyle: {normal: {opacity: 0}}
                    });
                    pushJWData(options, jwData);
                    jwData = [];
                }
            }


            twIndex = (result[i].当前日期 - 1) * 6 + (10 - 2) / 4;
            if (result[i].脉搏10 !== null) {
                mbData[twIndex] = parseInt(result[i].脉搏10);
            }
            if (result[i].心率10 !== null) {
                xlData[twIndex] = parseInt(result[i].心率10);
            }
            if (result[i].体温10 !== null) {
                if (preIndex !== -1) {
                    twData[preIndex] = preTemperature;
                    twData[twIndex] = {
                        value: parseFloat(result[i].体温10),
                        itemStyle: {normal: {opacity: 0}}
                    };
                }
                pushTWData(options, twData, preTemperatureType);
                preIndex = twIndex;
                preTemperature = parseFloat(result[i].体温10);
                preTemperatureType = result[i].体温类型10;
                twData = [];
            }
            if (result[i].降温10 !== null && result[i].体温10 !== null) {
                if (parseInt(result[i].降温10) < parseFloat(result[i].体温10)) {
                    jwData.push([twIndex, parseInt(result[i].降温10)]);
                    jwData.push({
                        value: [twIndex, parseFloat(result[i].体温10)],
                        itemStyle: {normal: {opacity: 0}}
                    });
                    pushJWData(options, jwData);
                    jwData = [];
                }
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (14 - 2) / 4;
            if (result[i].脉搏14 !== null) {
                mbData[twIndex] = parseInt(result[i].脉搏14);
            }
            if (result[i].心率14 !== null) {
                xlData[twIndex] = parseInt(result[i].心率14);
            }
            if (result[i].体温14 !== null) {
                if (preIndex !== -1) {
                    twData[preIndex] = preTemperature;
                    twData[twIndex] = {
                        value: parseFloat(result[i].体温14),
                        itemStyle: {normal: {opacity: 0}}
                    };
                }
                pushTWData(options, twData, preTemperatureType);
                preIndex = twIndex;
                preTemperature = parseFloat(result[i].体温14);
                preTemperatureType = result[i].体温类型14;
                twData = [];
            }
            if (result[i].降温14 !== null && result[i].体温14 !== null) {
                if (parseInt(result[i].降温14) < parseFloat(result[i].体温14)) {
                    jwData.push([twIndex, parseInt(result[i].降温14)]);
                    jwData.push({
                        value: [twIndex, parseFloat(result[i].体温14)],
                        itemStyle: {normal: {opacity: 0}}
                    });
                    pushJWData(options, jwData);
                    jwData = [];
                }
            }


            twIndex = (result[i].当前日期 - 1) * 6 + (18 - 2) / 4;
            if (result[i].脉搏18 !== null) {
                mbData[twIndex] = parseInt(result[i].脉搏18);
            }
            if (result[i].心率18 !== null) {
                xlData[twIndex] = parseInt(result[i].心率18);
            }
            if (result[i].体温18 !== null) {
                if (preIndex !== -1) {
                    twData[preIndex] = preTemperature;
                    twData[twIndex] = {
                        value: parseFloat(result[i].体温18),
                        itemStyle: {normal: {opacity: 0}}
                    };
                }
                pushTWData(options, twData, preTemperatureType);
                preIndex = twIndex;
                preTemperature = parseFloat(result[i].体温18);
                preTemperatureType = result[i].体温类型18;
                twData = [];
            }
            if (result[i].降温18 !== null && result[i].体温18 !== null) {
                if (parseInt(result[i].降温18) < parseFloat(result[i].体温18)) {
                    jwData.push([twIndex, parseInt(result[i].降温18)]);
                    jwData.push({
                        value: [twIndex, parseFloat(result[i].体温18)],
                        itemStyle: {normal: {opacity: 0}}
                    });
                    pushJWData(options, jwData);
                    jwData = [];
                }
            }


            twIndex = (result[i].当前日期 - 1) * 6 + (22 - 2) / 4;
            if (result[i].脉搏22 !== null) {
                mbData[twIndex] = parseInt(result[i].脉搏22);
            }
            if (result[i].心率22 !== null) {
                xlData[twIndex] = parseInt(result[i].心率22);
            }
            if (result[i].体温22 !== null) {
                if (preIndex !== -1) {
                    twData[preIndex] = preTemperature;
                    twData[twIndex] = {
                        value: parseFloat(result[i].体温22),
                        itemStyle: {normal: {opacity: 0}}
                    };
                }
                pushTWData(options, twData, preTemperatureType);
                preIndex = twIndex;
                preTemperature = parseFloat(result[i].体温22);
                preTemperatureType = result[i].体温类型22;
                twData = [];
            }
            if (result[i].降温22 !== null && result[i].体温22 !== null) {
                if (parseInt(result[i].降温22) < parseFloat(result[i].体温22)) {
                    jwData.push([twIndex, parseInt(result[i].降温22)]);
                    jwData.push({
                        value: [twIndex, parseFloat(result[i].体温22)],
                        itemStyle: {normal: {opacity: 0}}
                    });
                    pushJWData(options, jwData);
                    jwData = [];
                }
            }
        }
        pushMBData(options, mbData);
        pushXLData(options, xlData);
        twData[preIndex] = preTemperature;
        pushTWData(options, twData, preTemperatureType);
        myChart.hideLoading();
        myChart.setOption(options, true);
    }

    function fillEchartsEventsData(result, myChart) {
        var options = myChart.getOption();
        options.graphic[0].elements = [];
        var eventData;
        var twIndex;

        for (var i = 0; i < result.length; i++) {

            twIndex = (result[i].当前日期 - 1) * 6 + (2 - 2) / 4;
            eventData = [];
            if (result[i].事件类型2 !== "无") {
                switchEventType2(result[i].事件类型2, eventData);
                if (result[i].事件时间2 !== null) {
                    eventData.push(' ');
                    for (var n = 0; n < result[i].事件时间2.length; n++) {
                        eventData.push(result[i].事件时间2.substring(n, n + 1));
                    }
                }
                pushEventsData(options, 14.6 * twIndex, eventData);
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (6 - 2) / 4;
            eventData = [];
            if (result[i].事件类型6 !== "无") {
                switchEventType2(result[i].事件类型6, eventData);
                if (result[i].事件时间6 !== null) {
                    eventData.push(' ');
                    for (n = 0; n < result[i].事件时间6.length; n++) {
                        eventData.push(result[i].事件时间6.substring(n, n + 1));
                    }
                }
                pushEventsData(options, 14.6 * twIndex, eventData);
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (10 - 2) / 4;
            eventData = [];
            if (result[i].事件类型10 !== "无") {
                switchEventType2(result[i].事件类型10, eventData);
                if (result[i].事件时间10 !== null) {
                    eventData.push(' ');
                    for (n = 0; n < result[i].事件时间10.length; n++) {
                        eventData.push(result[i].事件时间10.substring(n, n + 1));
                    }
                }
                pushEventsData(options, 14.6 * twIndex, eventData);
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (14 - 2) / 4;
            eventData = [];
            if (result[i].事件类型14 !== "无") {
                switchEventType2(result[i].事件类型14, eventData);
                if (result[i].事件时间14 !== null) {
                    eventData.push(' ');
                    for (n = 0; n < result[i].事件时间14.length; n++) {
                        eventData.push(result[i].事件时间14.substring(n, n + 1));
                    }
                }
                pushEventsData(options, 14.6 * twIndex, eventData);
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (18 - 2) / 4;
            eventData = [];
            if (result[i].事件类型18 !== "无") {
                switchEventType2(result[i].事件类型18, eventData);
                if (result[i].事件时间18 !== null) {
                    eventData.push(' ');
                    for (n = 0; n < result[i].事件时间18.length; n++) {
                        eventData.push(result[i].事件时间18.substring(n, n + 1));
                    }
                }
                pushEventsData(options, 14.6 * twIndex, eventData);
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (22 - 2) / 4;
            eventData = [];
            if (result[i].事件类型22 !== "无") {
                switchEventType2(result[i].事件类型22, eventData);
                if (result[i].事件时间22 !== null) {
                    eventData.push(' ');
                    for (n = 0; n < result[i].事件时间22.length; n++) {
                        eventData.push(result[i].事件时间22.substring(n, n + 1));
                    }
                }
                pushEventsData(options, 14.6 * twIndex, eventData);
            }
        }

        myChart.hideLoading();
        myChart.setOption(options, true);
    }

    function switchEventType2(eventType, eventData) {
        switch (eventType) {
            case "入院":
                eventData.push('入', '院');
                break;
            case "分娩":
                eventData.push('分', '娩');
                break;
            case "转出":
                eventData.push('转', '出');
                break;
            case "手术":
                eventData.push('手', '术');
                break;
            case "出院":
                eventData.push('出', '院');
                break;
            case "死亡":
                eventData.push('死', '亡');
                break;
            case "外出":
                eventData.push('外', '出');
                break;
            case "拒测":
                eventData.push('拒', '测');
                break;
        }
    }

    function fillCanvasEventsData(result, drawing) {
        // 获取canvas
        var context = drawing.getContext("2d");
        // 先清空canvas
        context.clearRect(0, 0, 1745, 400);
        context.font = "900 30px 宋体";
        context.textAlign = "middle";
        var twIndex;

        for (var i = 0; i < result.length; i++) {
            twIndex = (result[i].当前日期 - 1) * 6 + (2 - 2) / 4;
            // 事件描述
            if (result[i].事件类型2 !== "无") {
                switchEventType1(result[i].事件类型2, context, twIndex);
                if (result[i].事件时间2 !== null) {
                    context.fillText("|", 8 + twIndex * 41.5, 110);
                    for (var n = 0; n < result[i].事件时间2.length; n++) {
                        context.fillText(result[i].事件时间2.substring(n, n + 1), 8 + twIndex * 41.5, 150 + n * 40);
                    }
                }
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (6 - 2) / 4;
            if (result[i].事件类型6 !== "无") {
                switchEventType1(result[i].事件类型6, context, twIndex);
                if (result[i].事件时间6 !== null) {
                    context.fillText("|", 8 + twIndex * 41.5, 110);
                    for (n = 0; n < result[i].事件时间6.length; n++) {
                        context.fillText(result[i].事件时间6.substring(n, n + 1), 8 + twIndex * 41.5, 150 + n * 40);
                    }
                }
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (10 - 2) / 4;
            if (result[i].事件类型10 !== "无") {
                switchEventType1(result[i].事件类型10, context, twIndex);
                if (result[i].事件时间10 !== null) {
                    context.fillText("|", 8 + twIndex * 41.5, 110);
                    for (n = 0; n < result[i].事件时间10.length; n++) {
                        context.fillText(result[i].事件时间10.substring(n, n + 1), 8 + twIndex * 41.5, 150 + n * 40);
                    }
                }
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (14 - 2) / 4;
            if (result[i].事件类型14 !== "无") {
                switchEventType1(result[i].事件类型14, context, twIndex);
                if (result[i].事件时间14 !== null) {
                    context.fillText("|", 8 + twIndex * 41.5, 110);
                    for (n = 0; n < result[i].事件时间14.length; n++) {
                        context.fillText(result[i].事件时间14.substring(n, n + 1), 8 + twIndex * 41.5, 150 + n * 40);
                    }
                }
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (18 - 2) / 4;
            if (result[i].事件类型18 !== "无") {
                switchEventType1(result[i].事件类型18, context, twIndex);
                if (result[i].事件时间18 !== null) {
                    context.fillText("|", 8 + twIndex * 41.5, 110);
                    for (n = 0; n < result[i].事件时间18.length; n++) {
                        context.fillText(result[i].事件时间18.substring(n, n + 1), 8 + twIndex * 41.5, 150 + n * 40);
                    }
                }
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (22 - 2) / 4;
            if (result[i].事件类型22 !== "无") {
                switchEventType1(result[i].事件类型22, context, twIndex);
                if (result[i].事件时间22 !== null) {
                    context.fillText("|", 8 + twIndex * 41.5, 110);
                    for (n = 0; n < result[i].事件时间22.length; n++) {
                        context.fillText(result[i].事件时间22.substring(n, n + 1), 8 + twIndex * 41.5, 150 + n * 40);
                    }
                }
            }

        }
    }

    function switchEventType1(eventType, context, twIndex) {
        switch (eventType) {
            case "入院":
                context.fillText("入", 8 + twIndex * 41.5, 30);
                context.fillText("院", 8 + twIndex * 41.5, 70);
                break;
            case "分娩":
                context.fillText("分", 8 + twIndex * 41.5, 30);
                context.fillText("娩", 8 + twIndex * 41.5, 70);
                break;
            case "转出":
                context.fillText("转", 8 + twIndex * 41.5, 30);
                context.fillText("出", 8 + twIndex * 41.5, 70);
                break;
            case "手术":
                context.fillText("手", 8 + twIndex * 41.5, 30);
                context.fillText("术", 8 + twIndex * 41.5, 70);
                break;
            case "出院":
                context.fillText("出", 8 + twIndex * 41.5, 30);
                context.fillText("院", 8 + twIndex * 41.5, 70);
                break;
            case "死亡":
                context.fillText("死", 8 + twIndex * 41.5, 30);
                context.fillText("亡", 8 + twIndex * 41.5, 70);
                break;
            case "外出":
                context.fillText("外", 8 + twIndex * 41.5, 30);
                context.fillText("出", 8 + twIndex * 41.5, 70);
                break;
            case "拒测":
                context.fillText("拒", 8 + twIndex * 41.5, 30);
                context.fillText("测", 8 + twIndex * 41.5, 70);
                break;
        }
    }

    function fillBreatheData(result, breathe) {
        var stringBreathe = "<th colspan='2'>呼吸(次/分)</th>";
        var hxIndex = 0;
        var index = 1;

        for (var i = 0; i < result.length; i++) {
            // 利用index，补足空的数据
            if (index !== result[i].当前日期) {
                for (var m = index; m < result[i].当前日期; m++) {
                    stringBreathe += "<td height='30px'></td><td></td><td></td><td></td><td></td><td></td>";
                }
                index = result[i].当前日期;
            }
            twIndex = (result[i].当前日期 - 1) * 6 + (2 - 2) / 4;
            // 填充呼吸数据
            if (result[i].呼吸2 !== null) {
                // 上下显示数据，先上再下
                if (hxIndex % 2 === 0) {
                    stringBreathe += "<td height='30px' valign='top'>" + result[i].呼吸2 + "</td>";
                } else {
                    stringBreathe += "<td height='30px' valign='bottom'>" + result[i].呼吸2 + "</td>";
                }
                hxIndex++;
            } else {
                stringBreathe += "<td height='30px'></td>";
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (6 - 2) / 4;
            if (result[i].呼吸6 !== null) {
                if (hxIndex % 2 === 0) {
                    stringBreathe += "<td height='30px' valign='top'>" + result[i].呼吸6 + "</td>";
                } else {
                    stringBreathe += "<td height='30px' valign='bottom'>" + result[i].呼吸6 + "</td>";
                }
                hxIndex++;
            } else {
                stringBreathe += "<td height='30px'></td>";
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (10 - 2) / 4;
            if (result[i].呼吸10 !== null) {
                if (hxIndex % 2 === 0) {
                    stringBreathe += "<td height='30px' valign='top'>" + result[i].呼吸10 + "</td>";
                } else {
                    stringBreathe += "<td height='30px' valign='bottom'>" + result[i].呼吸10 + "</td>";
                }
                hxIndex++;
            } else {
                stringBreathe += "<td height='30px'></td>";
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (14 - 2) / 4;
            if (result[i].呼吸14 !== null) {
                if (hxIndex % 2 === 0) {
                    stringBreathe += "<td height='30px' valign='top'>" + result[i].呼吸14 + "</td>";
                } else {
                    stringBreathe += "<td height='30px' valign='bottom'>" + result[i].呼吸14 + "</td>";
                }
                hxIndex++;
            } else {
                stringBreathe += "<td height='30px'></td>";
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (18 - 2) / 4;
            if (result[i].呼吸18 !== null) {
                if (hxIndex % 2 === 0) {
                    stringBreathe += "<td height='30px' valign='top'>" + result[i].呼吸18 + "</td>";
                } else {
                    stringBreathe += "<td height='30px' valign='bottom'>" + result[i].呼吸18 + "</td>";
                }
                hxIndex++;
            } else {
                stringBreathe += "<td height='30px'></td>";
            }

            twIndex = (result[i].当前日期 - 1) * 6 + (22 - 2) / 4;
            if (result[i].呼吸22 !== null) {
                if (hxIndex % 2 === 0) {
                    stringBreathe += "<td height='30px' valign='top'>" + result[i].呼吸22 + "</td>";
                } else {
                    stringBreathe += "<td height='30px' valign='bottom'>" + result[i].呼吸22 + "</td>";
                }
                hxIndex++;
            } else {
                stringBreathe += "<td height='30px'></td>";
            }

            index++;
        }
        // 填充剩余标签
        for (var j = index; j <= 7; j++) {
            stringBreathe += "<td height='30px'></td><td></td><td></td><td></td><td></td><td></td>";
        }
        breathe.innerHTML = stringBreathe;
    }

    function fillBloodPressureData(result, bloodPressure) {
        var stringBloodPressure = "<th colspan='2'>血压(mmHg)</th>";
        var index = 1;

        for (var i = 0; i < result.length; i++) {
            // 利用index，补足空的数据
            if (index !== result[i].当前日期) {
                for (var m = index; m < result[i].当前日期; m++) {
                    stringBloodPressure += "<td colspan='3'></td><td colspan='3'></td>";
                }
                index = result[i].当前日期;
            }
            // 早上血压
            if (result[i].早上收缩压 || result[i].早上舒张压) {
                stringBloodPressure += "<td colspan='3'>" + result[i].早上收缩压 + "/" + result[i].早上舒张压 + "</td>";
            } else {
                stringBloodPressure += "<td colspan='3'></td>";
            }
            // 下午血压
            if (result[i].下午收缩压 || result[i].下午舒张压) {
                stringBloodPressure += "<td colspan='3'>" + result[i].下午收缩压 + "/" + result[i].下午舒张压 + "</td>";
            } else {
                stringBloodPressure += "<td colspan='3'></td>";
            }
            index++;
        }
        // 填充剩余标签
        for (var j = index; j <= 7; j++) {
            stringBloodPressure += "<td colspan='3'></td><td colspan='3'></td>";
        }
        bloodPressure.innerHTML = stringBloodPressure;
    }

    function fillTotalInData(result, totalIn) {
        var stringTotalIn = "<th colspan='2'>总入液量(ml)</th>";
        var index = 1;

        for (var i = 0; i < result.length; i++) {
            if (index !== result[i].当前日期) {
                for (var m = index; m < result[i].当前日期; m++) {
                    stringTotalIn += "<td colspan='6'></td>";
                }
                index = result[i].当前日期;
            }
            // 入量
            if (result[i].入量) {
                stringTotalIn += "<td colspan='6'>" + result[i].入量 + "</td>";
            } else {
                stringTotalIn += "<td colspan='6'></td>";
            }
            index++;
        }
        for (var j = index; j <= 7; j++) {
            stringTotalIn += "<td colspan='6'></td>";
        }
        totalIn.innerHTML = stringTotalIn;
    }

    function fillPoopData(result, poop) {
        var stringPoop = "<th colspan='2'>大便(次)</th>";
        var index = 1;
        for (var i = 0; i < result.length; i++) {
            if (index !== result[i].当前日期) {
                for (var m = index; m < result[i].当前日期; m++) {
                    stringPoop += "<td colspan='6'></td>";
                }
                index = result[i].当前日期;
            }
            // 大便
            if (result[i].大便类型 === "数值" && result[i].大便 !== null) {
                stringPoop += "<td colspan='6'>" + result[i].大便 + "</td>";
            } else if (result[i].大便类型 === "/E") {
                stringPoop += "<td colspan='6'>" + result[i].大便 + "/E" + "</td>";
            } else if (result[i].大便类型 === "※") {
                stringPoop += "<td colspan='6'>※</td>";
            } else if (result[i].大便类型 === "☆") {
                stringPoop += "<td colspan='6'>☆</td>";
            } else {
                stringPoop += "<td colspan='6'></td>";
            }
            index++;
        }
        for (var j = index; j <= 7; j++) {
            stringPoop += "<td colspan='6'></td>";
        }
        poop.innerHTML = stringPoop;
    }

    function fillUrinateData(result, urinate) {
        var stringUrinate = "<th colspan='2'>尿量(ml)</th>";
        var index = 1;

        for (var i = 0; i < result.length; i++) {
            if (index !== result[i].当前日期) {
                for (var m = index; m < result[i].当前日期; m++) {
                    stringUrinate += "<td colspan='6'></td>";
                }
                index = result[i].当前日期;
            }
            // 小便  尿量(ml)
            if (result[i].小便类型 === "数值" && result[i].小便 !== null) {
                stringUrinate += "<td colspan='6'>" + result[i].小便 + "</td>";
            } else if (result[i].小便类型 === "/c" && result[i].小便 !== null) {
                stringUrinate += "<td colspan='6'>" + result[i].小便 + "/c" + "</td>";
            } else {
                stringUrinate += "<td colspan='6'></td>";
            }
            index++;
        }
        for (var j = index; j <= 7; j++) {
            stringUrinate += "<td colspan='6'></td>";
        }
        urinate.innerHTML = stringUrinate;
    }

    function fillWeightData(result, weight) {
        var stringWeight = "<th colspan='2'>体重(Kg)</th>";
        var index = 1;
        for (var i = 0; i < result.length; i++) {
            if (index !== result[i].当前日期) {
                for (var m = index; m < result[i].当前日期; m++) {
                    stringWeight += "<td colspan='6'></td>";
                }
                index = result[i].当前日期;
            }
            // 体重
            if (result[i].体重类型 === "数值" && result[i].体重 !== null) {
                stringWeight += "<td colspan='6'>" + result[i].体重 + "</td>";
            } else {
                if (result[i].体重类型 === "平车") {
                    stringWeight += "<td colspan='6'>平车</td>";
                } else if (result[i].体重类型 === "卧床") {
                    stringWeight += "<td colspan='6'>卧床</td>";
                } else if (result[i].体重类型 === "抱入") {
                    stringWeight += "<td colspan='6'>抱入</td>";
                } else if (result[i].体重类型 === "轮椅") {
                    stringWeight += "<td colspan='6'>轮椅</td>";
                } else {
                    stringWeight += "<td colspan='6'></td>";
                }
            }
            index++;
        }
        for (var j = index; j <= 7; j++) {
            stringWeight += "<td colspan='6'></td>";
        }
        weight.innerHTML = stringWeight;
    }

    function fillSkinTestData(result, skinTest) {
        var stringSkinTest = "<th colspan='2'>皮试</th>";
        var index = 1;
        for (var i = 0; i < result.length; i++) {
            if (index !== result[i].当前日期) {
                for (var m = index; m < result[i].当前日期; m++) {
                    stringSkinTest += "<td colspan='6'></td>";
                }
                index = result[i].当前日期;
            }
            // 皮试
            if (result[i].敏感药物 !== null) {
                stringSkinTest += "<td colspan='6'>" + result[i].敏感药物 + "</td>";
            } else {
                stringSkinTest += "<td colspan='6'></td>";
            }
            index++;
        }
        for (var j = index; j <= 7; j++) {
            stringSkinTest += "<td colspan='6'></td>";
        }
        skinTest.innerHTML = stringSkinTest;
    }

    function pushMBData(options, mbData) {
        options.series.push({
            name: '脉搏',
            type: 'line',
            yAxisIndex: 1,
            data: mbData,
            animation: true,
            connectNulls: true,
            smooth: false,
            symbolSize: 10,
            symbol: 'circle',
            itemStyle: {
                normal: {
                    color: 'red'
                }
            },
            lineStyle: {
                normal: {
                    color: 'red'
                }
            }
        });
    }

    function pushXLData(options, xlData) {
        options.series.push({
            name: '心率',
            type: 'line',
            yAxisIndex: 1,
            data: xlData,
            animation: true,
            connectNulls: true,
            smooth: false,
            symbolSize: 10,
            symbol: 'emptyCircle',
            itemStyle: {
                normal: {
                    color: 'red'
                }
            },
            lineStyle: {
                normal: {
                    color: 'red'
                }
            }
        });
    }

    function pushTWData(options, twData, twlx) {
        if (twlx === "腋温") {
            options.series.push({
                name: '腋表',
                type: 'line',
                data: twData,
                animation: true,
                connectNulls: true,
                smooth: false,
                symbolSize: 10,
                symbol: 'kyeecross',
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
        } else if (twlx === "口温") {
            options.series.push({
                name: '口表',
                type: 'line',
                data: twData,
                animation: true,
                connectNulls: true,
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
        } else if (twlx === "肛温") {
            options.series.push({
                name: '肛表',
                type: 'line',
                data: twData,
                animation: true,
                connectNulls: true,
                smooth: false,
                symbolSize: 10,
                symbol: 'emptyCircle',
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
        }
    }

    function pushJWData(options, jwData) {
        options.series.push({
            name: '降温',
            type: 'line',
            itemStyle: {
                normal: {
                    color: 'red'
                }
            },
            lineStyle: {
                normal: {
                    color: 'red',
                    type: 'dashed'
                }
            },
            symbolSize: 10,
            symbol: 'emptyCircle',
            animation: true,
            data: jwData
        });
    }

    function pushEventsData(options, leftPosition, eventData) {
        options.graphic[0].elements.push(
            {
                type: 'text',
                top: '0',
                left: leftPosition,
                style: {
                    text: eventData.join('\n'),
                    font: 'bolder 13px cursive'
                }
            }
        );
    }
</script>
</body>
</html>