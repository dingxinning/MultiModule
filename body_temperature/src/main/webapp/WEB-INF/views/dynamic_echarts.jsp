<%--
  Created by IntelliJ IDEA.
  User: yxrsw
  Date: 2017/7/6
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>line</title>
    <script type="text/javascript" src="/js/echarts.min.js"></script>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/css/test.css">
</head>

<body>
<h1>动态数据图表展示</h1>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" style="height:400px"></div>

<script type="text/javascript" language="javascript">

    var myChart = echarts.init(document.getElementById('main'));
    myChart.showLoading({
        text : "图表数据正在努力加载..."
    });
    //定义图表options
    var options = {
        title : {
            text : "未来一周气温变化",
            subtext : "纯属虚构",
            sublink : "http://www.baidu.com"
        },
        tooltip : {
            show: true,
            trigger : 'axis'
        },
        legend : {
            data : [ '最高气温','最低气温' ],
            show: 'true'
        },
        toolbox: {
            show : true,
            feature : {
                mark : {show: true},
                dataView : {show: true, readOnly: false},
                magicType : {show: true, type: ['line', 'bar']},
                restore : {show: true},
                saveAsImage : {show: true}
            }
        },
        calculable : true,
        xAxis : [ {
            type : 'category',
            boundaryGap : false,
            data : [ '1', '2', '3', '4', '5', '6', '7' ]
        } ],
        yAxis : [ {
            type : 'value',
            axisLabel : {
                formatter : '{value} °C'
            },
            splitArea : {
                show : true
            }
        } ],
        series : [
            {
                name : '最高气温',
                type : 'line',
                data : [ 22, 19, 25, 27, 29, 26, 21 ],
                //必须是Integer类型的,String计算平均值会出错
                markPoint : {
                    data : [
                        {type : 'max', name : '最大值'},
                        {type : 'min',  name : '最小值'}
                    ]
                },
                markLine : {
                    data : [
                        {type : 'average', name : '平均值'}
                    ]
                }
            },
            {
                name : '最低气温',
                type : 'line',
                data : [ 5, 4, 2, 6, 8, 7, 5 ],
                //必须是Integer类型的,String计算平均值会出错
                markPoint : {
                    data : [
                        {type : 'max', name : '最大值'},
                        {type : 'min',  name : '最小值'}
                    ]
                },
                markLine : {
                    data : [
                        {type : 'average', name : '平均值'}
                    ]
                }
            }
        ]

    };

    myChart.setOption(options); //先把可选项注入myChart中
    myChart.hideLoading();
    // 每隔5秒更新数据
    timeId = setInterval("getChartData();",5000);
</script>


<script type="text/javascript">
    function getChartData() {
        //获得图表的options对象
        var options = myChart.getOption();
        //通过Ajax获取数据
        $.ajax({
            type : "post",
            async : false, //同步执行
            url : "http://localhost:8080/echarts/getData",
            data : {},
            dataType : "json", //返回数据形式为json
            success : function(result) {
                if (result) {
                    console.log(result);
                    options.legend.data = result.legend;
                    options.xAxis[0].data = result.category;
                    options.series[0].data = result.series[0].data;
                    options.series[1].data = result.series[1].data;
                    myChart.hideLoading();
                    myChart.setOption(options);
                }
            },
            error : function(errorMsg) {
                alert("不好意思，大爷，图表请求数据失败啦!");
                myChart.hideLoading();
            }
        });
    }
</script>
</body>
</html>
