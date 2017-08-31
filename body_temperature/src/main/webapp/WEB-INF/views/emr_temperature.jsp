<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<style type="text/css">
			.exm2{ width:98%; height:550px; background-color:#d9eaee; padding:8px;}
			.exm3{ width:100%; height:20px; margin:0 auto; padding-bottom:5px;}
			.exm3 span{ font-size:13px; color:#6ba3b6; font-family:"微软雅黑"; font-weight:bold;}
			.exmpad{ padding-left:842px;}
			.exm4{ width:99%; height:93%; border:1px solid #b6cfd6; background-color:#fff;font-size:13px;font-family:"微软雅黑"; line-height:22px;overflow: auto;}
			
			.exm_l{ width:200px; float:left; display:inline;}
			.exm_l1{ background:url(/img/ysz1.gif) no-repeat center bottom; height:50px;border-left:1px solid #b6cfd6; border-right:1px solid #b6cfd6; text-align:center; line-height:40px; font-size:14px; font-weight:bold;}
			.exm_l2{ height:4px; overflow:hidden;}
			.exm_l3{ border-left:1px solid #b6cfd6; border-right:1px solid #b6cfd6; padding:0px 10px;}
			.exm_bg{ background:url(/img/exm2.gif) repeat-x;}
			
			.exm_r{ width:688px; margin-left:10px; background-color:#ecf7fa;}
			.exm_r1{ width:514px;}
			.exm_r2{ width:474px; background:url(/img/jy2.gif) repeat-y; padding:20px;}
			.exm_r3{ font-size:16px; font-weight:bold; text-align:center;}
			.exm_r4{ text-align:center; height:45px; line-height:45px; font-family:"长城行楷体"; font-size:28px;}
			.exm_r5{ text-align:right; border-bottom:2px solid #000;}
			.exm_bor{ border-bottom:1px solid #000;}
			.exm_r6{ height:40px;}
			.exm_r7{ padding-bottom:10px;}
			.exm_r8{ padding:10px 0px; height:160px; }
			.exm_r9{ height:165px; padding:5px 0px;}
			.STYLE2 {font-size: 12px;}
			.exm_txt{ width:80px; background:none; border:none; border-bottom:1px solid #000;font-family:"微软雅黑";}
			.exm_txt1{ width:35px; background:none; border:none; border-bottom:1px solid #000; font-family:"微软雅黑";}
			.exm_bot{ height:32px; padding:5px 0px; text-align:center;}
			.exm_bot ul{ width:490px; margin:0 auto;}
			.bgr{ background:url(/img/bt2.jpg) repeat-x;}
			.btn{
				background:url(/img/btn.jpg) no-repeat;
				width:92px; 
				height:32px; 
				text-align: center; 
				border:0;
				font-size:14px; 
				font-family:Microsoft YaHei,Lucida Grande,Helvetica,Tahoma,Arial,sans-serif; 
				color:#000; 
			}
			.btn:hover{ 
				background:url(/img/btn1.jpg);
			}
			div.gridbox .objbox{
				scrollbar-face-color: #E3EBF8; 
				scrollbar-shadow-color: #c6d8f0; 
				scrollbar-highlight-color: #FFFFFF; 
				scrollbar-3dlight-color: #E3EBF8; 
				scrollbar-darkshadow-color:#d8e4f3; 
				scrollbar-track-color: #FFFFFF; 
				scrollbar-arrow-color: #9bb8de;
			}
			div.gridbox_dhx_custom table.hdr td{
				font-family:微软雅黑;
				font-size:12px;
				font-weight: bold;
			}
			div.gridbox_dhx_custom table.hdr td:first-child{
				border-left:1px solid #b6cfd6;
			}
			div.gridbox_dhx_custom .odd_dhx_custom{
				background-color:#FFFDDE;
			}
			div.gridbox_dhx_custom .ev_dhx_custom{
				background-color:#FFFDDE;
			}
			div.gridbox_dhx_custom table.obj.row20px tr.rowselected td{
				background-color:#D3EFFB;
			}
			.textarea01{
				overflow:auto;
				border-bottom: 1px solid #93AFBA;
				height:24px;
				width:576px;
				margin-top:5px;
				scrollbar-face-color: #E3EBF8;
				scrollbar-shadow-color: #c6d8f0;
				scrollbar-highlight-color: #FFFFFF;
				scrollbar-3dlight-color: #E3EBF8;
				scrollbar-darkshadow-color:#d8e4f3;
				scrollbar-track-color: #FFFFFF;
				scrollbar-arrow-color: #9bb8de;
			}
			.luru_1{ width:276px;}
			.luru_2{ width:258px; padding:8px;}
			.luru_3{ width:96%; padding-left:15px;}
			.luru_4{ width:100%; height:40px; background:url(/img/luru2.jpg) no-repeat 0px 36px;}
			.luru_5{ width:99.9%;  border:1px solid #93afba; border-bottom:none; border-top:none; padding:5px 0px; }
			.luru_6{ width:90px; height:20px;}
			.luru_7{ border-bottom:1px solid #93afba;}
			.luru_8{ border-top:1px solid #93afba;}
			.luru_9{ border-right:2px solid #93afba;}
			.luru_10{ border-bottom:1px solid #dfeaf7;}
			.luru_11{ color:#3d7f98; font-weight:bold;}
			.luru_12{ padding-left:10px;}
			.luru_13{ width:55px; height:22px; vertical-align:middle;}
			.luru_14{ width:50px; height:18px;border:1px solid #93AFBA;}
			.luru_15{ width:30px; height:18px;border:1px solid #93AFBA;}
			.luru_16{ width:100px; height:18px;border:1px solid #93AFBA;}
			.luru_17{ width:65px; height:22px; vertical-align:middle;}
			.ted_1{ font-size:12px; color:#000;}
			.ted_2{ font-size:30px; font-weight:bold; text-align:center; height:60px;}
			.ted_3{ border-top:2px solid #000; border-left:2px solid #000;border-bottom:1px solid #000;border-right:1px solid #000;}
			.ted_4{}
			.ted_4 td{
				border-bottom:1px solid #000;
				border-right:1px solid #000;
				text-align:center;
				font-size:12px;
				overflow:hidden;
				table-layout: fixed;
				word-wrap:break-word;
			}
			.ted_5{ color:#f00;}
			.ted_6{ border-bottom-color:#fff;}
			.test{border: 1px red solid;}
			.test2{border: 1px green solid;}
			.yzkj_7{ width:90px; height:20px;height:20px;vertical-align:middle;border:1px solid #93AFBA;line-height:20px;}
			.datetime {background:#FFFFFF url("/img/datePicker.gif") 75px 0px no-repeat;}
			.rk_txt2{border:1px solid #93AFBA;}
			.button_li li{ float:right; display:inline; text-align:center; line-height:32px;margin:0 5px;padding:0;}
			.button_style{background:url(/img/btn2.jpg) no-repeat; width:72px; height:32px; text-align: center; border:none;line-height:32px; font-size:14px; font-family:Microsoft YaHei,Lucida Grande,Helvetica,Tahoma,Arial,sans-serif;cursor:pointer;}
		</style>
		<script type="text/javascript" src="/js/jquery.min.js"></script>
	</head>
	<body style="padding:0px;margin:0px">
	<input type="hidden" id="inpno" value="${param.inpno}"/>
		<div class="exm2" align="center">
	    	<div class="exm3">
	        	<span style="float:left;">体征录入</span>
	            <span style="float:right;"><img id="close_iframe_img" src="/img/close.gif" align="absmiddle" style="cursor: pointer;" onclick="javascript:window.parent.$.unblockUI();"/></span>
	        </div>
	        <div class="exm4" style="padding-top:7px;">
	        	<div class="luru_3">
					  <div class="luru_4" id="div_top">
				    	<ul class="xx1">
				            <li id="one1" class="li11 xxhover" style="cursor:pointer;" onclick="setTab('one',1,2);"><span id="entry">体征录入</span></li>
				            <li id="one2" class="li33" style="cursor:pointer;" onclick="setTab('one',2,2);"><span id="temperature">体温单</span></li>
				            <li class="clear"></li>
				          </ul>
				    </div>
				    <div id="con_one_1" class="luru_5">
				    	<table width="99%" border="0" cellspacing="0" cellpadding="0" style="margin-bottom: 5px;">
				          <tr>
				            <td width="7%" >日期：</td>
				            <td width="23%" align="left"><img src="/img/left.jpg" title="前一天" style="cursor:pointer;vertical-align:middle;" id="preday" onclick="javascript:switchDays(-1)"/>&nbsp;<input  type="text" id="thedate" readonly="readonly" class="yzkj_7 datetime" value="<fmt:formatDate value="${enddate}" pattern="yyyy-MM-dd"/>"/>
				            <img src="/img/right.jpg" title="后一天" id="nextday" style="cursor:pointer;vertical-align:middle;" onclick="javascript:switchDays(1)"/></td>
				            <td width="70%" align="right"><div id="error"  style="float:left;width:300px;font-family:宋体;height:32px;line-height:32px;font-size:13px;font-weight:bold;color:red;cursor:default;"></div><div style="float:right;">
								<ul class="button_li">
					        		<li><button class="button_style" onclick="javascript:window.parent.$.unblockUI();">关&nbsp;闭</button></li>
					        		<li><button class="button_style" onclick="javascript:deleteForm();" id="deleteForm" disabled="disabled">删&nbsp;除</button></li>
					        		<li><button class="button_style" onclick="javascript:saveForm();" id="saveForm">保&nbsp;存</button></li>
            					</ul>
				            </td>
				          </tr>
				        </table>
				        <table id="main_table" width="99%" height="80%" border="0" cellspacing="0" cellpadding="0" >
				        <form id="contentForm">
				          <tr bgcolor="#e4edf9" align="center">
				            <td class="luru_7 luru_8 luru_9 " width="14%"><span class="luru_11">项目/时间点</span></td>
				            <td class="luru_7 luru_8 " width="14%"><span class="luru_11">2</span></td>
				            <td class="luru_7 luru_8 " width="14%"><span class="luru_11">6</span></td>
				            <td class="luru_7 luru_8 luru_9 " width="15%" time=""><span class="luru_11">10</span></td>
				            <td class="luru_7 luru_8 " width="14%"><span class="luru_11">14</span></td>
				            <td class="luru_7 luru_8 " width="14%"><span class="luru_11">18</span></td>
				            <td class="luru_7 luru_8 " width="15%"><span class="luru_11">22</span></td>
				          </tr>
				          <tr>
				            <td class="luru_9 luru_12 luru_10" bgcolor="#f6faff" height="30" >脉搏(次/分)</td>
				            <td class="luru_10 luru_9" align="center"><input  id="mb_2" name="mb_2"  type="text" class="luru_14" /></td>
				            <td class="luru_10 luru_9" align="center"><input  id="mb_6" name="mb_6"  type="text" class="luru_14"/></td>
				            <td class="luru_10 luru_9" align="center" ><input  id="mb_10" name="mb_10"  type="text" class="luru_14"/></td>
				            <td class="luru_10 luru_9" align="center"><input  id="mb_14" name="mb_14"  type="text" class="luru_14"/></td>
				            <td class="luru_10 luru_9" align="center"><input  id="mb_18" name="mb_18"  type="text" class="luru_14"/></td>
				            <td class="luru_10" align="center"><input  id="mb_22" name="mb_22"  type="text" class="luru_14"/></td>
				          </tr>
				          <tr>
				            <td class="luru_9 luru_12 luru_10" bgcolor="#f6faff" height="30" >心率(次/分)</td>
				            <td class="luru_10 luru_9" align="center"><input  id="xl_2" name="xl_2"  type="text" class="luru_14" /></td>
				            <td class="luru_10 luru_9" align="center"><input  id="xl_6" name="xl_6"  type="text" class="luru_14"/></td>
				            <td class="luru_10 luru_9" align="center" ><input  id="xl_10" name="xl_10"  type="text" class="luru_14"/></td>
				            <td class="luru_10 luru_9" align="center"><input  id="xl_14" name="xl_14"  type="text" class="luru_14"/></td>
				            <td class="luru_10 luru_9" align="center"><input  id="xl_18" name="xl_18"  type="text" class="luru_14"/></td>
				            <td class="luru_10" align="center"><input  id="xl_22" name="xl_22"  type="text" class="luru_14"/></td>
				          </tr>
				          <tr>
				            <td class="luru_9 luru_12 luru_10" bgcolor="#f6faff" height="30" >体温(℃)</td>
				            <td class="luru_10 luru_9" align="center"><select id="twlx_2" name="twlx_2"  class="luru_13">
				                  <option value="1">口 </option>
				                  <option value="2" selected="selected">腋 </option>
				                  <option value="3">肛 </option>
				                  <option value="4">不升 </option>
				                </select>&nbsp;<input id="tw_2" name="tw_2" type="text" class="luru_15"/></td>
				            <td class="luru_10 luru_9" align="center"><select id="twlx_6" name="twlx_6"  class="luru_13">
				                 <option value="1">口 </option>
				                  <option value="2" selected="selected">腋 </option>
				                  <option value="3">肛 </option>
				                  <option value="4">不升 </option>
				                </select>&nbsp;<input id="tw_6" name="tw_6" type="text" class="luru_15"/></td>
				            <td class="luru_10 luru_9" align="center" ><select id="twlx_10" name="twlx_10"  class="luru_13">
				                  <option value="1">口 </option> 
				                  <option value="2" selected="selected">腋 </option>
				                  <option value="3">肛 </option>
				                  <option value="4">不升 </option>
				                </select>&nbsp;<input id="tw_10" name="tw_10" type="text" class="luru_15"/></td>
				            <td class="luru_10 luru_9" align="center"><select id="twlx_14" name="twlx_14"  class="luru_13">
				                  <option value="1">口 </option>
				                  <option value="2" selected="selected">腋 </option>
				                  <option value="3">肛 </option>
				                  <option value="4">不升 </option>
				                </select>&nbsp;<input id="tw_14" name="tw_14" type="text" class="luru_15"/></td>
				            <td class="luru_10 luru_9" align="center"><select id="twlx_18" name="twlx_18"  class="luru_13">
				                  <option value="1">口 </option>
				                  <option value="2" selected="selected">腋 </option>
				                  <option value="3">肛 </option>
				                  <option value="4">不升 </option>
				                </select>&nbsp;<input id="tw_18" name="tw_18" type="text" class="luru_15"/></td>
				            <td class="luru_10" align="center"><select id="twlx_22" name="twlx_22"  class="luru_13">
				                  <option value="1">口 </option> 
				                  <option value="2" selected="selected">腋 </option>
				                  <option value="3">肛 </option>
				                  <option value="4">不升 </option>
				                </select>&nbsp;<input id="tw_22" name="tw_22" type="text" class="luru_15"/></td>
				          </tr>
				          <tr>
				            <td class="luru_9 luru_12 luru_10" bgcolor="#f6faff" height="30">降温(℃)</td>
				            <td class="luru_10 luru_9"  align="center"><input id="jw_2" name="jw_2"  type="text" class="luru_14"/></td>
				            <td class="luru_10 luru_9"  align="center"><input id="jw_6" name="jw_6"  type="text" class="luru_14"/></td>
				            <td class="luru_10 luru_9"  align="center" ><input id="jw_10" name="jw_10" type="text" class="luru_14"/></td>
				            <td class="luru_10 luru_9"  align="center"><input id="jw_14" name="jw_14"  type="text" class="luru_14"/></td>
				            <td class="luru_10 luru_9"  align="center"><input id="jw_18" name="jw_18"  type="text" class="luru_14"/></td>
				            <td class="luru_10"  align="center"><input id="jw_22" name="jw_22"  type="text" class="luru_14"/></td>
				          </tr>
				          <tr>
				            <td class="luru_9 luru_12 luru_10" bgcolor="#f6faff">事件<br/>描述（时间）</td>
				            <td class="luru_10 luru_9" align="center"><select id="sjlx_2" name="sjlx_2"  class="luru_13">
				            	  <option value="0"></option>
				                  <option value="1">入院</option>
				                  <option value="2">出院</option>
				                  <option value="3">转入</option>
				                  <option value="4">手术</option>
				                  <option value="5">转院</option>
				                  <option value="6">死亡</option>
				                  <option value="7">分娩</option>
				                  <option value="8">术后</option>
				                </select><br/><input id="sjms_2" name="sjms_2"  type="text" class="luru_16"/></td>
				            <td class="luru_10 luru_9" align="center"><select id="sjlx_6"  name="sjlx_6" class="luru_13">
				            	  <option value="0"></option>
				                  <option value="1">入院</option>
				                  <option value="2">出院</option>
				                  <option value="3">转入</option>
				                  <option value="4">手术</option>
				                  <option value="5">转院</option>
				                  <option value="6">死亡</option>
				                  <option value="7">分娩</option>
				                  <option value="8">术后</option>
				                </select><br/><input id="sjms_6" name="sjms_6"  type="text" class="luru_16"/></td>
				            <td align="center" class="luru_9 luru_10"><select id="sjlx_10" name="sjlx_10"  class="luru_13">
				            	  <option value="0"></option>
				                  <option value="1">入院</option>
				                  <option value="2">出院</option>
				                  <option value="3">转入</option>
				                  <option value="4">手术</option>
				                  <option value="5">转院</option>
				                  <option value="6">死亡</option>
				                  <option value="7">分娩</option>
				                  <option value="8">术后</option>
				                </select><br/><input id="sjms_10" name="sjms_10" type="text" class="luru_16"/></td>
				            <td class="luru_10 luru_9" align="center"><select id="sjlx_14" name="sjlx_14"  class="luru_13">
				            	  <option value="0"></option>
				                  <option value="1">入院</option>
				                  <option value="2">出院</option>
				                  <option value="3">转入</option>
				                  <option value="4">手术</option>
				                  <option value="5">转院</option>
				                  <option value="6">死亡</option>
				                  <option value="7">分娩</option>
				                  <option value="8">术后</option>
				                </select><br/><input id="sjms_14" name="sjms_14"  type="text" class="luru_16"/></td>
				            <td class="luru_10 luru_9"  align="center"><select id="sjlx_18" name="sjlx_18"  class="luru_13">
				            	  <option value="0"></option>
				                  <option value="1">入院</option>
				                  <option value="2">出院</option>
				                  <option value="3">转入</option>
				                  <option value="4">手术</option>
				                  <option value="5">转院</option>
				                  <option value="6">死亡</option>
				                  <option value="7">分娩</option>
				                  <option value="8">术后</option>
				                </select><br/><input id="sjms_18" name="sjms_18"  type="text" class="luru_16"/></td>
				            <td class="luru_10" align="center"><select id="sjlx_22" name="sjlx_22"  class="luru_13">
				            	  <option value="0"></option>
				                  <option value="1">入院</option>
				                  <option value="2">出院</option>
				                  <option value="3">转入</option>
				                  <option value="4">手术</option>
				                  <option value="5">转院</option>
				                  <option value="6">死亡</option>
				                  <option value="7">分娩</option>
				                  <option value="8">术后</option>
				                </select><br/><input id="sjms_22" name="sjms_22"  type="text" class="luru_16"/></td>
				          </tr>				          
				          <tr>
				            <td class="luru_9 luru_12 luru_10" bgcolor="#f6faff" height="30">呼吸(次/分)</td>
				            <td class="luru_10 luru_9" align="center"><select id="hxj_2" name="hxj_2"  class="luru_17" onchange="if(this.options[this.selectedIndex].value=='1'){$('#hx_2').hide().val('')};else{$('#hx_2').show()}">
				                  <option value="0">数值</option>
				                  <option value="1">呼吸机 </option>
				                </select>&nbsp;<input id="hx_2" name="hx_2"  type="text" class="luru_15"/></td>
				            <td class="luru_10 luru_9" align="center"><select id="hxj_6" name="hxj_6"  class="luru_17" onchange="if(this.options[this.selectedIndex].value=='1'){$('#hx_6').hide().val('')};else{$('#hx_6').show()}">
				                  <option value="0">数值</option>
				                  <option value="1">呼吸机 </option>
				                </select>&nbsp;<input id="hx_6" name="hx_6"  type="text" class="luru_15"/></td>
				            <td align="center" class="luru_9 luru_10"><select id="hxj_10" name="hxj_10"  class="luru_17" onchange="if(this.options[this.selectedIndex].value=='1'){$('#hx_10').hide().val('')};else{$('#hx_10').show()}">
				                  <option value="0">数值</option>
				                  <option value="1">呼吸机 </option>
				                </select>&nbsp;<input id="hx_10" name="hx_10" type="text" class="luru_15"/></td>
				            <td class="luru_10 luru_9" align="center"><select id="hxj_14" name="hxj_14"  class="luru_17" onchange="if(this.options[this.selectedIndex].value=='1'){$('#hx_14').hide().val('')};else{$('#hx_14').show()}">
				                  <option value="0">数值</option>
				                  <option value="1">呼吸机 </option>
				                </select>&nbsp;<input id="hx_14" name="hx_14"  type="text" class="luru_15"/></td>
				            <td class="luru_10 luru_9" align="center"><select id="hxj_18" name="hxj_18"  class="luru_17" onchange="if(this.options[this.selectedIndex].value=='1'){$('#hx_18').hide().val('')};else{$('#hx_18').show()}">
				                  <option value="0">数值</option>
				                  <option value="1">呼吸机 </option>
				                </select>&nbsp;<input id="hx_18" name="hx_18"  type="text" class="luru_15"/></td>
				            <td class="luru_10" align="center"><select id="hxj_22" name="hxj_22"  class="luru_17" onchange="if(this.options[this.selectedIndex].value=='1'){$('#hx_22').hide().val('')};else{$('#hx_22').show()}">
				                  <option value="0">数值</option>
				                  <option value="1">呼吸机 </option>
				                </select>&nbsp;<input id="hx_22" name="hx_22" type="text" class="luru_15"/></td>
				          </tr>
				          <tr>
				            <td class="luru_9 luru_12 luru_10" bgcolor="#f6faff" height="30" >血压(mmHg)</td>
				            <%--<c:choose>--%>
				            <%--<c:when test="${temperature_bp==3}">--%>
				            <td class="luru_10 luru_9" align="center" colspan="2"><input id="swssy" name="swssy"  type="text" class="luru_14" style="text-align:right;"/><strong style="color:#93AFBA">/</strong><input id="swszy" name="swszy"  type="text" class="luru_14"/></td>
				            <td class="luru_10 luru_9"  align="center" colspan="2"><input id="xwssy" name="xwssy"  type="text" class="luru_14" style="text-align:right;"/><strong style="color:#93AFBA">/</strong><input id="xwszy" name="xwszy"  type="text" class="luru_14"/></td>
				            <td class="luru_10"  align="center" colspan="2"><input id="ssy3" name="ssy3"  type="text" class="luru_14" style="text-align:right;"/><strong style="color:#93AFBA">/</strong><input id="szy3" name="szy3"  type="text" class="luru_14"/></td>
				            <%--</c:when>--%>
				            <%--<c:otherwise>--%>
				            <td class="luru_10 luru_9" align="center" colspan="3"><input id="swssy" name="swssy"  type="text" class="luru_14" style="text-align:right;"/><strong style="color:#93AFBA">/</strong><input id="swszy" name="swszy"  type="text" class="luru_14"/></td>
				            <td class="luru_10"  align="center" colspan="3"><input id="xwssy" name="xwssy"  type="text" class="luru_14" style="text-align:right;"/><strong style="color:#93AFBA">/</strong><input id="xwszy" name="xwszy"  type="text" class="luru_14"/></td>
				            <%--</c:otherwise>--%>
				            <%--</c:choose>--%>
				            </tr>
				          <tr>
				            <td class="luru_9 luru_12 luru_10" bgcolor="#f6faff" height="30">入量(ml)</td>
				            <td colspan="6" align="left" class="luru_10">&nbsp;&nbsp;<input id="rl"  name="rl" type="text"  class="luru_16"/></td>
				          </tr>
				          <tr>
				            <td class="luru_9 luru_12 luru_10" bgcolor="#f6faff" height="30" >出量(ml)</td>
				            <td colspan="6" align="left" class="luru_10">&nbsp;&nbsp;<input id="cl" name="cl" type="text"  class="luru_16"/></td>
				          </tr>
				          <tr>
				            <td class="luru_9 luru_12 luru_10" bgcolor="#f6faff" height="30">大便(次/日)</td>
				            <td colspan="6" align="left" class="luru_10">&nbsp;&nbsp;<input id="dbcs" name="dbcs" type="text"  class="luru_16"/>&nbsp;参考字符：E，※，☆</td>
				          </tr>
						  <tr>
								<td class="luru_9 luru_12 luru_10" bgcolor="#f6faff" height="30">小便(次/日)</td>
								<td colspan="6" align="left" class="luru_10">&nbsp;&nbsp;<input id="xbcs" name="xbcs" type="text"  class="luru_16"/>&nbsp;</td>
						  </tr>
				          <tr>
				            <td class="luru_9 luru_12 luru_10" bgcolor="#f6faff" height="30">体重(kg)</td>
				            <td colspan="6" align="left" class="luru_10" id="coltd1">&nbsp;&nbsp;<select id="tzlx" name="tzlx"  class="luru_13" onchange="if(this.options[this.selectedIndex].value!='1'){$('#tz').hide().val('')};else{$('#tz').show()}">
				                  <option value="1">数值 </option>
				                  <option value="2">平车 </option>
				                  <option value="3">卧床 </option>
				                  <option value="4">抱入 </option>
				                  <option value="5">轮椅 </option>
				                </select>&nbsp;<input id="tz" name="tz" type="text"  class="luru_16"/></td>
				            <td class="luru_12 luru_10" bgcolor="#f6faff" height="30" style="display:none;" id="qtxtd1"><span id="qtxmcspan1">&nbsp;</span><input type="hidden" name="qtxmc1" id="qtxmc1"/></td>   
				            <td  align="left" class="luru_10" style="display:none;" id="qtxtd2">&nbsp;&nbsp;<input id="qtx1" name="qtx1" type="text"  class="luru_16"/></td> 
				            <td class="luru_12 luru_10" bgcolor="#f6faff" height="30" style="display:none;" id="qtxtd5"><span id="qtxmcspan3">&nbsp;</span><input type="hidden" name="qtxmc3" id="qtxmc3"/></td>
				            <td  align="left" class="luru_10" style="display:none;" id="qtxtd6">&nbsp;&nbsp;<input id="qtx3" name="qtx3" type="text"  class="luru_16"/></td> 
				          </tr>
				          <tr>
				            <td class="luru_9 luru_12 luru_10" bgcolor="#f6faff" height="30">身高(cm)</td>
				            <td colspan="6" align="left" class="luru_10" id="coltd2">&nbsp;&nbsp;<select id="sglx" name="sglx"  class="luru_13" onchange="if(this.options[this.selectedIndex].value!='1'){$('#sg').hide().val('')};else{$('#sg').show()}">
				                  <option value="1">数值 </option>
				                  <option value="2">其它 </option>
				                </select>&nbsp;<input id="sg" name="sg" type="text"  class="luru_16"/></td>
							<td class="luru_12 luru_10" bgcolor="#f6faff" height="30" style="display:none;" id="qtxtd3"><span id="qtxmcspan2">&nbsp;</span><input type="hidden" name="qtxmc2" id="qtxmc2"/></td>   
				            <td colspan="3" align="left" class="luru_10" style="display:none;" id="qtxtd4">&nbsp;&nbsp;<input id="qtx2" name="qtx2" type="text"  class="luru_16"/></td>				                
				          </tr>
				          </form>
				        </table>
					</div>
				  <div id="con_one_2" class="ted_1 luru_5"  style="display:none;" >
				  <table width="99%" border="0" cellspacing="0" cellpadding="0" style="margin-bottom: 5px;">
				          <tr>
				            <td width="7%" >周期：</td>
				            <td width="13%" align="left">
				            <select id="theweek" onchange="javascript:drawTemperature(this.options[this.selectedIndex].value)">     
<%--<c:forEach items="${weekMap}" var="entry" varStatus="status">--%>
	<%--<option value="${entry.value}" <c:if test="${status.last}">selected="selected"</c:if> num="${entry.key}">${weekMap.size}第${entry.key}周</option>--%>
<%--</c:forEach></select></td> <td width="80%" align="left"><div id="error2"  style="float:left;display:none;width:300px;font-family:宋体;height:32px;line-height:32px;font-size:13px;font-weight:bold;color:red;cursor:default;">体温单绘制中...</div><div style="float:right;">--%>
								<ul class="button_li">
									<li><button class="button_style" onclick="javascript:window.parent.$.unblockUI();">关&nbsp;闭</button></li>
					        		<li><button class="button_style" onclick="javascript:doPrint();return false;">打&nbsp;印</button></li>
					        		<li><button class="button_style" onclick="javascript:drawTemperature($('#theweek').val());return false;">重&nbsp;绘</button></li>
            					</ul>
				            </td>
				          </tr>
				        </table>
				  <div id="temperatureDiv" style="height:412px;overflow-x: hidden;overflow-y:auto;"><img id="temperatureImg"/></div>
				  </div>
				  <div id="div_bottom" style="margin-bottom:5px;">
				     <table width="100%" height="4" border="0" cellspacing="0" cellpadding="0">
				      <tr>
				        <td width="4"><img src="/img/bt1.jpg" /></td>
				        <td width="99.9%" class="bgr"></td>
				        <td width="4"><img src="/img/bt3.jpg" /></td>
				      </tr>
				    </table>
				  </div>
				</div>
   		</div></div>
	</body>
<script type="text/javascript">	
var myCalendar,temperatureImgLoad=false;
function saveForm()
{
	$("#saveForm").attr("disabled",true);
	var pass= true;
	$("input[id*='mb_']").each(function(ind,ele){
		var mb = $(this).val();
		if(mb!="" && (isNaN(mb) || mb<20||mb>180 )){
			showIdError("脉搏填写不规范！","error");
			$(this).select();
			pass =  false;
			return false;
		}
	});
	if(!pass){
		$("#saveForm").attr("disabled",false);
		return false;
	}
	$("input[id*='xl_']").each(function(ind,ele){
		var mb = $(this).val();
		if(mb!="" && (isNaN(mb) || mb<20||mb>180 )){
			showIdError("心率填写不规范！","error");
			$(this).select();
			pass =  false;
			return false;
		}
	});
	if(!pass){
		$("#saveForm").attr("disabled",false);
		return false;
	}
	$("input[id*='tw_']").each(function(ind,ele){
		var mb = $(this).val();
		if(mb!="" && (isNaN(mb)|| mb<34||mb>42)){
			showIdError("体温填写不规范！","error");
			$(this).select();
			pass =  false;
			return false;
		}
	});
	if(!pass){
		$("#saveForm").attr("disabled",false);
		return false;
	}
	$("input[id*='jw_']").each(function(ind,ele){
		var mb = $(this).val();
		if(mb!="" && (isNaN(mb) || mb<34||mb>42)){
			showIdError("降温填写不规范！","error");
			$(this).select();
			pass =  false;
			return false;
		}
	});
	if(!pass){
		$("#saveForm").attr("disabled",false);
		return false;
	}
	$("input[id*='hx_']").each(function(ind,ele){
		var mb = $(this).val();
		if(mb!="" && isNaN(mb)){
			showIdError("呼吸填写不规范！","error");
			$(this).select();
			pass =  false;
			return false;
		}
	});
	if(!pass){
		$("#saveForm").attr("disabled",false);
		return false;
	}
	$.ajax({
		url:"emr/save_temperature.htm",
        type:"post",
        cache: false,
        data:$("#contentForm").serialize()+"&thedate="+$("#thedate").val()+"&inpno="+$("#inpno").val(),
        error:function(){
        	showIdError("系统错误！","error");
			$("#saveForm").attr("disabled",false);
        	return false;
        },
        success: function(reply){
        	var data=$.parseJSON(reply);
			if(data[0].excCount > 0){
				showIdError("保存成功！","error");
				$("#deleteForm").attr("disabled",false);
			}else{
				showIdError("保存失败！","error");
			}
			$("#saveForm").attr("disabled",false);
        }
    });
}

//function deleteForm()
//{
//	if(window.confirm("确定删除这天体征？")){
//		$("#deleteForm").attr("disabled",true);
//		$.ajax({
//			type:"get",
//			async : false,
//			cache: false,
//			url:"emr/del_thedate_temperature.htm",
//			data: "inpno="+$("#inpno").val()+"&thedate="+$("#thedate").val(),
//			success: function(reply){
//				var data=$.parseJSON(reply);
//				if(data[0].excCount >0){
//					$("#contentForm")[0].reset();
//					showIdError("删除成功！","error");
//				}else{
//					showIdError("删除失败！","error");
//					$("#deleteForm").attr("disabled",false);
//				}
//			},
//			error:function(){
//				showIdError("系统错误！","error");
//				$("#deleteForm").attr("disabled",false);
//				return false;
//			}
//		});
//	}
//}

function initForm()
{
	$("#contentForm")[0].reset();
	$("#tz").show();
	$("#sg").show();
	$.ajax({
		type:"get",
		async : false,   
		cache: false,
		url:"emr/load_thedate_temperature.htm",
		data: "inpno="+$("#inpno").val()+"&thedate="+$("#thedate").val(),
		success: function(reply){
			var data=$.parseJSON(reply);
			if(data[0].infoid!=""){
				var list  = data[0].detailInfoList;
				$("#mb_2").val(list[0].pulse==0?"":list[0].pulse);
				$("#mb_6").val(list[1].pulse==0?"":list[1].pulse);
				$("#mb_10").val(list[2].pulse==0?"":list[2].pulse);
				$("#mb_14").val(list[3].pulse==0?"":list[3].pulse);
				$("#mb_18").val(list[4].pulse==0?"":list[4].pulse);
				$("#mb_22").val(list[5].pulse==0?"":list[5].pulse);
				
				$("#xl_2").val(list[0].heartrate==0?"":list[0].heartrate);
				$("#xl_6").val(list[1].heartrate==0?"":list[1].heartrate);
				$("#xl_10").val(list[2].heartrate==0?"":list[2].heartrate);
				$("#xl_14").val(list[3].heartrate==0?"":list[3].heartrate);
				$("#xl_18").val(list[4].heartrate==0?"":list[4].heartrate);
				$("#xl_22").val(list[5].heartrate==0?"":list[5].heartrate);
				
				$("#twlx_2").val(list[0].temperaturetype);
				$("#tw_2").val(list[0].temperature==0?"":list[0].temperature);
				$("#twlx_6").val(list[1].temperaturetype);
				$("#tw_6").val(list[1].temperature==0?"":list[1].temperature);
				$("#twlx_10").val(list[2].temperaturetype);
				$("#tw_10").val(list[2].temperature==0?"":list[2].temperature);
				$("#twlx_14").val(list[3].temperaturetype);
				$("#tw_14").val(list[3].temperature==0?"":list[3].temperature);
				$("#twlx_18").val(list[4].temperaturetype);
				$("#tw_18").val(list[4].temperature==0?"":list[4].temperature);
				$("#twlx_22").val(list[5].temperaturetype);
				$("#tw_22").val(list[5].temperature==0?"":list[5].temperature);
				
				$("#jw_2").val(list[0].reductiontemperature==0?"":list[0].reductiontemperature);
				$("#jw_6").val(list[1].reductiontemperature==0?"":list[1].reductiontemperature);
				$("#jw_10").val(list[2].reductiontemperature==0?"":list[2].reductiontemperature);
				$("#jw_14").val(list[3].reductiontemperature==0?"":list[3].reductiontemperature);
				$("#jw_18").val(list[4].reductiontemperature==0?"":list[4].reductiontemperature);
				$("#jw_22").val(list[5].reductiontemperature==0?"":list[5].reductiontemperature);
				
				$("#sjlx_2").val(list[0].comment1type);
				$("#sjms_2").val(list[0].comment1);
				$("#sjlx_6").val(list[1].comment1type);
				$("#sjms_6").val(list[1].comment1);
				$("#sjlx_10").val(list[2].comment1type);
				$("#sjms_10").val(list[2].comment1);
				$("#sjlx_14").val(list[3].comment1type);
				$("#sjms_14").val(list[3].comment1);
				$("#sjlx_18").val(list[4].comment1type);
				$("#sjms_18").val(list[4].comment1);
				$("#sjlx_22").val(list[5].comment1type);
				$("#sjms_22").val(list[5].comment1);
				
				$("#hxj_2").val(list[0].breathetype);
				if(list[0].breathetype==1){
					$("#hx_2").hide();
				}else{
					$("#hx_2").show();
				}
				$("#hxj_6").val(list[1].breathetype);
				if(list[1].breathetype==1){
					$("#hx_6").hide();
				}else{
					$("#hx_6").show();
				}
				$("#hxj_10").val(list[2].breathetype);
				if(list[2].breathetype==1){
					$("#hx_10").hide();
				}else{
					$("#hx_10").show();
				}
				$("#hxj_14").val(list[3].breathetype);
				if(list[3].breathetype==1){
					$("#hx_14").hide();
				}else{
					$("#hx_14").show();
				}
				$("#hxj_18").val(list[4].breathetype);
				if(list[4].breathetype==1){
					$("#hx_18").hide();
				}else{
					$("#hx_18").show();
				}
				$("#hxj_22").val(list[5].breathetype);
				if(list[5].breathetype==1){
					$("#hx_22").hide();
				}else{
					$("#hx_22").show();
				}
				$("#hx_2").val(list[0].breathe==0?"":list[0].breathe);
				$("#hx_6").val(list[1].breathe==0?"":list[1].breathe);
				$("#hx_10").val(list[2].breathe==0?"":list[2].breathe);
				$("#hx_14").val(list[3].breathe==0?"":list[3].breathe);
				$("#hx_18").val(list[4].breathe==0?"":list[4].breathe);
				$("#hx_22").val(list[5].breathe==0?"":list[5].breathe);
				
				$("#swssy").val(data[0].sbp1);
				$("#swszy").val(data[0].dbp1);
				$("#xwssy").val(data[0].sbp2);
				$("#xwszy").val(data[0].dbp2);
				
				<%--<c:if test="${temperature_bp==3}">--%>
				$("#ssy3").val(data[0].sbp3);
				$("#szy3").val(data[0].dbp3);
				<%--</c:if>--%>

				$("#rl").val(data[0].intake==0?"":data[0].intake);
				$("#cl").val(data[0].output==0?"":data[0].output);
				$("#dbcs").val(data[0].poopinfo);
                $("#xbcs").val(data[0].urinateinfo);//edit add by lidu 2017年5月5日17:35:54 小便体征录赋值
                $("#tzlx").val(data[0].weighttype);
				if(data[0].weighttype!=1){
					$("#tz").hide();
				}
				$("#sglx").val(data[0].heighttype);
				if(data[0].heighttype!=1){
					$("#sg").hide();
				}
				$("#tz").val(data[0].weight==0?"":data[0].weight);
				$("#sg").val(data[0].height==0?"":data[0].height);
				
				if(data[0].additems1!=""){
					$("#coltd1").attr("colspan",2);
					$("#qtxmcspan1").text(data[0].additems1);
					$("#qtxmc1").val(data[0].additems1);
					$("#qtxtd1").css("display","block");
					$("#qtxtd2").css("display","block");
					$("#qtx1").val(data[0].additemsvalue1);
				}
				
				if(data[0].additems2!=""){
					$("#coltd2").attr("colspan",2);
					$("#qtxmcspan2").text(data[0].additems2);
					$("#qtxmc2").val(data[0].additems2);
					$("#qtxtd3").css("display","block");
					$("#qtxtd4").css("display","block");
					$("#qtx2").val(data[0].additemsvalue2);
				}
				
				if(data[0].additems3!=""){
					$("#coltd1").attr("colspan",2);
					$("#qtxmcspan3").text(data[0].additems3);
					$("#qtxmc3").val(data[0].additems3);
					$("#qtxtd5").css("display","block");
					$("#qtxtd6").css("display","block");
					$("#qtx3").val(data[0].additemsvalue3);
				}
				$("#deleteForm").attr("disabled",false);
			}else{
				$("#deleteForm").attr("disabled",true);
				if(data[0].additems1!=""){
					$("#coltd1").attr("colspan",2);
					$("#qtxmcspan1").text(data[0].additems1);
					$("#qtxmc1").val(data[0].additems1);
					$("#qtxtd1").css("display","block");
					$("#qtxtd2").css("display","block");
					$("#qtx1").val("");
				}
				if(data[0].additems2!=""){
					$("#coltd2").attr("colspan",2);
					$("#qtxmcspan2").text(data[0].additems2);
					$("#qtxmc2").val(data[0].additems2);
					$("#qtxtd3").css("display","block");
					$("#qtxtd4").css("display","block");
					$("#qtx2").val("");
				}
				if(data[0].additems3!=""){
					$("#coltd1").attr("colspan",2);
					$("#qtxmcspan3").text(data[0].additems3);
					$("#qtxmc3").val(data[0].additems3);
					$("#qtxtd5").css("display","block");
					$("#qtxtd6").css("display","block");
					$("#qtx3").val("");
				}
			}
		},
		error:function(){
			showIdError("系统错误！","error");
		}
	});
}

<%--function doPrint(){--%>
	<%--LODOP.PRINT_INIT("体温单");--%>
	<%--var calDateStr = countDate($("#theweek").val(),6);--%>
	<%--var calDateStr2 = calDateStr.replace(/-/g,"/");--%>
	<%--var dm = new Date(Date.parse(calDateStr2));--%>
	<%--var de = new Date(Date.parse("<fmt:formatDate value="${enddate}" pattern="yyyy/MM/dd"/>"));--%>
	<%--if(dm>de){ --%>
		<%--calDateStr = "<fmt:formatDate value="${enddate}" pattern="yyyy-MM-dd"/>";--%>
	<%--}--%>
	<%--var num=$("#theweek").find("option:selected").attr("num");--%>
	<%--<c:choose> --%>
	  <%--<c:when test="${emrPageType=='16K'}">--%>
	  <%--LODOP.SET_PRINT_PAGESIZE(1,"195mm","270mm","");--%>
	  <%--LODOP.ADD_PRINT_IMAGE(0,0,"195mm","270mm","<img border='0' src='<%=basePath%>/emr/draw_temperature.htm?inpno=${param.inpno}&thedate="+calDateStr+"'/>");--%>
	  <%--LODOP.ADD_PRINT_TEXT("253mm","89mm","16mm","2mm","第"+num+"页");--%>
	  <%--</c:when> --%>
	  <%--<c:otherwise> --%>
	  <%--LODOP.SET_PRINT_PAGESIZE(1,"210mm","297mm","A4");--%>
	  <%--LODOP.ADD_PRINT_IMAGE(0,10,"210mm","297mm","<img border='0' src='<%=basePath%>/emr/draw_temperature.htm?inpno=${param.inpno}&thedate="+calDateStr+"'/>");--%>
	  <%--LODOP.ADD_PRINT_TEXT("280mm","94.5mm","16mm","2mm","第"+num+"页");--%>
	  <%--</c:otherwise> --%>
	  <%--</c:choose>   --%>
	  <%--LODOP.SET_PRINT_STYLEA(0,"FontSize",10);--%>
	  <%--LODOP.PREVIEW();--%>
	  <%--//LODOP.PRINT();--%>
<%--}--%>

function showIdError(error,id)
{
	var $id = $("#"+id);
	if (!window.errorids){
        window.errorids=new Array();
	}
	var idexist = false;
    for (var i=0,elen = errorids.length; i<elen; i+=1){
	   if(id == errorids[i].attr("id")){
		   idexist = true;
	   }else{
    	   errorids[i].html("");
	   }
   }
    if(!idexist)errorids.push($id);	
	$id.stop().html(error).show(0).delay(5000).hide(0);  
}

function setTab(name,cursel,n){
	for(i=1;i<=n;i++){
		var $menu=$("#"+name+i);
		var $con=$("#con_"+name+"_"+i);
		if(i==cursel){
			if(i==2 && !temperatureImgLoad){
				$("#error2").show();
				$("#temperatureImg").attr("src","emr/draw_temperature.htm?inpno=${param.inpno}&thedate=<fmt:formatDate value="${enddate}" pattern="yyyy-MM-dd"/>&time="+new Date().valueOf());
				temperatureImgLoad = true;
			}
			$menu.addClass("xxhover");
			$con.css("display","block");
		}else{
			$menu.removeClass("xxhover");
			$con.css("display","none");
		}
	}
	if(cursel=='1')
	{
		$('#mb_2').focus();
	}
}

function drawTemperature(a){
	var calDateStr = countDate(a,6);
	var calDateStr2 = calDateStr.replace(/-/g,"/");
	var dm = new Date(Date.parse(calDateStr2));
	var de = new Date(Date.parse("<fmt:formatDate value="${enddate}" pattern="yyyy/MM/dd"/>"));
	if(dm>de){ 
		calDateStr = "<fmt:formatDate value="${enddate}" pattern="yyyy-MM-dd"/>";
	}
	$("#error2").show();
	$("#temperatureImg").attr("src","emr/draw_temperature.htm?inpno=${param.inpno}&thedate="+calDateStr+"&time="+new Date().valueOf());
}

function countDate(startDate,num){
	var tempAry = startDate.split("-");
	var tempdate = new Date(tempAry[0],tempAry[1]-1,tempAry[2]);
	tempdate.setDate(tempdate.getDate()+num);
	var monthn = tempdate.getMonth()+1<10?"0"+(tempdate.getMonth()+1):tempdate.getMonth()+1;
	var daten = tempdate.getDate()<10?"0"+tempdate.getDate():tempdate.getDate();
	var theDate = tempdate.getFullYear()+"-"+monthn+"-"+daten;
	return theDate;
}

function switchDays(d){
	var thedate = $("#thedate").val();
	var calDateStr = countDate(thedate,d);
	var startdate="<fmt:formatDate value="${inp_regist.admiss_date}" pattern="yyyy-MM-dd"/>"; 
	var enddate="<fmt:formatDate value="${enddate}" pattern="yyyy-MM-dd"/>";   
	if(calDateStr == startdate){
		$("#preday").hide();
	}else{
		$("#preday").show();
	}
	if(calDateStr == enddate){
		$("#nextday").hide();
	}else{
		$("#nextday").show();
	}
	startdate = startdate.replace(/-/g,"/");
	enddate = enddate.replace(/-/g,"/");
	var ds = new Date(Date.parse(startdate));
	var de = new Date(Date.parse(enddate));
	var calDateStr2 = calDateStr.replace(/-/g,"/");
	var dm = new Date(Date.parse(calDateStr2));
	if(ds<=dm && dm<=de){
		$("#thedate").val(calDateStr);
	}else{
		return false;
	}
	initForm();
}

function getNowDayString(nowtime){
	if(typeof nowtime == "undefined") nowtime = new Date();
	var yearn = nowtime.getFullYear();
	var monthn = nowtime.getMonth()+1<10?"0"+(nowtime.getMonth()+1):nowtime.getMonth()+1;
	var daten = nowtime.getDate()<10?"0"+nowtime.getDate():nowtime.getDate();
	return yearn+"-"+monthn+"-"+daten;
}

$(function(){
	$('#mb_2').focus();
	<%--<c:choose><c:when test="${param.input=='true'}">--%>
	myCalendar = new dhtmlXCalendarObject(["thedate"]);
	myCalendar.setDateFormat("%Y-%m-%d");	
    myCalendar.setSensitiveRange("<fmt:formatDate value="${inp_regist.admiss_date}" pattern="yyyy-MM-dd"/>","<fmt:formatDate value="${enddate}" pattern="yyyy-MM-dd"/>");
    myCalendar.attachEvent("onClick",function(date){ 
    	initForm();
    	var selectday = getNowDayString(date);
    	if(selectday=="<fmt:formatDate value="${inp_regist.admiss_date}" pattern="yyyy-MM-dd"/>"){
    		$("#preday").hide();
    	}else{
    		$("#preday").show();
    	}
    	if(selectday=="<fmt:formatDate value="${enddate}" pattern="yyyy-MM-dd"/>"){
    		$("#nextday").hide();
    	}else{
    		$("#nextday").show();
    	}
    });
    initForm();
	if("<fmt:formatDate value="${enddate}" pattern="yyyy-MM-dd"/>"=="<fmt:formatDate value="${inp_regist.admiss_date}" pattern="yyyy-MM-dd"/>"){
		$("#preday").hide();
	}
	$("#nextday").hide();
	<%--</c:when>--%>
	<%--<c:otherwise>--%>
	$("#error2").show();
	$("#temperatureImg").attr("src","emr/draw_temperature.htm?inpno=${param.inpno}&thedate=<fmt:formatDate value="${enddate}" pattern="yyyy-MM-dd"/>&time="+new Date().valueOf());
	<%--</c:otherwise></c:choose>--%>
	$("#temperatureImg").load(function(){$("#error2").hide();}); 
});	
</script>	
</html>
