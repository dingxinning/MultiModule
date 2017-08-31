<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Sign Entry</title>
    <script type="text/javascript" src="/js/jquery.min.js"></script>
</head>
<body style="padding:0px;margin:0px;">
<input type="hidden" id="inpno" value="0123456789"/>
    <table width="800px" border="0" cellspacing="0" cellpadding="0" align="center" style="margin-bottom: 5px;">
        <tr>
            <td width="7%" >日期：</td>
            <td>
                <select id="thedate" name="thedate">
                    <option value="1">星期一 </option> 
                    <option value="2">星期二 </option>
                    <option value="3">星期三 </option>
                    <option value="4">星期四 </option>
                    <option value="5">星期五 </option>
                    <option value="6">星期六 </option>
                    <option value="7">星期七 </option>
                </select>
            </td>
            <td width="70%" align="right"><div id="error"  style="float:left;width:300px;font-family:宋体;height:32px;line-height:32px;font-size:13px;font-weight:bold;color:red;cursor:default;"></div>
                <div style="float:right;">
                    <ul class="button_li">
                        <li style="float:left;list-style:none;"><button class="button_style" onclick="javascript:window.parent.$.unblockUI();" disabled="disabled">关闭</button></li>
                        <li style="float:left;list-style:none;"><button class="button_style" onclick="javascript:deleteForm();" id="deleteForm" disabled="disabled">删除</button></li>
                        <li style="float:left;list-style:none;"><button class="button_style" onclick="saveForm()" id="saveForm">保存</button></li>
                    </ul>
                </div>
            </td>
        </tr>
    </table>

    <table width="800px"  border="0" cellspacing="0" cellpadding="0" align="center" >
        <form id="contentForm">
            <tr bgcolor="#e4edf9" align="center">
                <td  width="14%"><span >项目/时间点</span></td>
                <td width="14%"><span >2</span></td>
                <td width="14%"><span >6</span></td>
                <td  width="15%" time=""><span >10</span></td>
                <td width="14%"><span >14</span></td>
                <td width="14%"><span >18</span></td>
                <td width="15%"><span >22</span></td>
            </tr>

            <tr>
                <td bgcolor="#f6faff" height="30" >脉搏(次/分)</td>
                <td align="center"><input  id="mb_2" name="mb_2"  type="text" style="width:100px" /></td>
                <td align="center"><input  id="mb_6" name="mb_6"  type="text" style="width:100px"/></td>
                <td align="center" ><input  id="mb_10" name="mb_10"  type="text" style="width:100px"/></td>
                <td align="center"><input  id="mb_14" name="mb_14"  type="text" style="width:100px" /></td>
                <td align="center"><input  id="mb_18" name="mb_18"  type="text" style="width:100px"/></td>
                <td  align="center"><input  id="mb_22" name="mb_22"  type="text" style="width:100px"/></td>
            </tr>

            <tr>
                <td bgcolor="#f6faff" height="30" >心率(次/分)</td>
                <td align="center"><input  id="xl_2" name="xl_2"  type="text"  style="width:100px"/></td>
                <td align="center"><input  id="xl_6" name="xl_6"  type="text" style="width:100px" /></td>
                <td align="center" ><input  id="xl_10" name="xl_10"  type="text" style="width:100px"/></td>
                <td align="center"><input  id="xl_14" name="xl_14"  type="text" style="width:100px"/></td>
                <td align="center"><input  id="xl_18" name="xl_18"  type="text" style="width:100px"/></td>
                <td  align="center"><input  id="xl_22" name="xl_22"  type="text" style="width:100px"/></td>
            </tr>

             <tr>
                <td bgcolor="#f6faff" height="30" >体温(℃)</td>
                <td align="center"><select id="twlx_2" name="twlx_2">
                        <option value="1">口 </option>
                        <option value="2" selected="selected">腋 </option>
                        <option value="3">肛 </option>
                        <option value="4">不升 </option>
                    </select>&nbsp;<input id="tw_2" name="tw_2" type="text" style="width:50px" /></td>
                <td align="center"><select id="twlx_6" name="twlx_6">
                        <option value="1">口 </option>
                        <option value="2" selected="selected">腋 </option>
                        <option value="3">肛 </option>
                        <option value="4">不升 </option>
                    </select>&nbsp;<input id="tw_6" name="tw_6" type="text" style="width:50px" /></td>
                <td align="center" ><select id="twlx_10" name="twlx_10">
                        <option value="1">口 </option> 
                        <option value="2" selected="selected">腋 </option>
                        <option value="3">肛 </option>
                        <option value="4">不升 </option>
                    </select>&nbsp;<input id="tw_10" name="tw_10" type="text" style="width:50px" /></td>
                <td align="center"><select id="twlx_14" name="twlx_14">
                        <option value="1">口 </option>
                        <option value="2" selected="selected">腋 </option>
                        <option value="3">肛 </option>
                        <option value="4">不升 </option>
                    </select>&nbsp;<input id="tw_14" name="tw_14" type="text"  style="width:50px"/></td>
                <td align="center"><select id="twlx_18" name="twlx_18">
                        <option value="1">口 </option>
                        <option value="2" selected="selected">腋 </option>
                        <option value="3">肛 </option>
                        <option value="4">不升 </option>
                    </select>&nbsp;<input id="tw_18" name="tw_18" type="text" style="width:50px"/></td>
                <td  align="center"><select id="twlx_22" name="twlx_22">
                        <option value="1">口 </option> 
                        <option value="2" selected="selected">腋 </option>
                        <option value="3">肛 </option>
                        <option value="4">不升 </option>
                    </select>&nbsp;<input id="tw_22" name="tw_22" type="text" style="width:50px"/></td>
			</tr>

            <tr>
                <td bgcolor="#f6faff" height="30" >降温</td>
                <td align="center"><input style="width:100px" id="jw_2" name="jw_2" type="text" /></td>
                <td align="center"><input style="width:100px" id="jw_6" name="jw_6" type="text" /></td>
                <td align="center"><input style="width:100px" id="jw_10" name="jw_10" type="text" /></td>
                <td align="center"><input style="width:100px" id="jw_14" name="jw_14" type="text" /></td>
                <td align="center"><input style="width:100px" id="jw_18" name="jw_18" type="text" /></td>
                <td align="center"><input style="width:100px" id="jw_22" name="jw_22" type="text" /></td>
			</tr>

            <tr>
                <td bgcolor="#f6faff" height="30" >事件<br/>描述（时间）</td>
                <td align="center"><select id="sjlx_2" name="sjlx_2">
                            <option value="0"></option>
                            <option value="1">入院</option>
                            <option value="2">分娩</option>
                            <option value="3">转出</option>
                            <option value="4">手术</option>
                            <option value="5">出院</option>
                            <option value="6">死亡</option>
                            <option value="7">外出</option>
                            <option value="8">拒测</option>
				                </select><br/><input id="sjms_2" name="sjms_2" style="width:100px"  type="text" /></td>
                <td align="center"><select id="sjlx_6"  name="sjlx_6">
                    <option value="0"></option>
                    <option value="1">入院</option>
                    <option value="2">分娩</option>
                    <option value="3">转出</option>
                    <option value="4">手术</option>
                    <option value="5">出院</option>
                    <option value="6">死亡</option>
                    <option value="7">外出</option>
                    <option value="8">拒测</option>
				                </select><br/><input id="sjms_6" name="sjms_6" style="width:100px"  type="text" /></td>
                <td align="center"><select id="sjlx_10" name="sjlx_10">
                    <option value="0"></option>
                    <option value="1">入院</option>
                    <option value="2">分娩</option>
                    <option value="3">转出</option>
                    <option value="4">手术</option>
                    <option value="5">出院</option>
                    <option value="6">死亡</option>
                    <option value="7">外出</option>
                    <option value="8">拒测</option>
				                </select><br/><input id="sjms_10" name="sjms_10" style="width:100px"  type="text" /></td>
                <td align="center"><select id="sjlx_14" name="sjlx_14" >
                    <option value="0"></option>
                    <option value="1">入院</option>
                    <option value="2">分娩</option>
                    <option value="3">转出</option>
                    <option value="4">手术</option>
                    <option value="5">出院</option>
                    <option value="6">死亡</option>
                    <option value="7">外出</option>
                    <option value="8">拒测</option>
				                </select><br/><input id="sjms_14" name="sjms_14" style="width:100px"  type="text" /></td>
                <td align="center"><select id="sjlx_18" name="sjlx_18" >
                    <option value="0"></option>
                    <option value="1">入院</option>
                    <option value="2">分娩</option>
                    <option value="3">转出</option>
                    <option value="4">手术</option>
                    <option value="5">出院</option>
                    <option value="6">死亡</option>
                    <option value="7">外出</option>
                    <option value="8">拒测</option>
				                </select><br/><input id="sjms_18" name="sjms_18" style="width:100px"  type="text" /></td>
                <td align="center"><select id="sjlx_22" name="sjlx_22" >
                    <option value="0"></option>
                    <option value="1">入院</option>
                    <option value="2">分娩</option>
                    <option value="3">转出</option>
                    <option value="4">手术</option>
                    <option value="5">出院</option>
                    <option value="6">死亡</option>
                    <option value="7">外出</option>
                    <option value="8">拒测</option>
				                </select><br/><input id="sjms_22" name="sjms_22" style="width:100px"  type="text" /></td>
			</tr>

             <tr>
                <td bgcolor="#f6faff" height="30">呼吸(次/分)</td>
                <td align="center"><select id="hxj_2" name="hxj_2">
                        <option value="0">数值</option>
                        <option value="1">呼吸机 </option>
                    </select>&nbsp;<input id="hx_2" name="hx_2"  type="text" style="width:50px"/></td>
                <td align="center"><select id="hxj_6" name="hxj_6"  onchange="if(this.options[this.selectedIndex].value=='1'){$('#hx_6').hide().val('')};else{$('#hx_6').show()}">
                        <option value="0">数值</option>
                        <option value="1">呼吸机 </option>
                    </select>&nbsp;<input id="hx_6" name="hx_6"  type="text" style="width:50px"/></td>
                <td align="center" ><select id="hxj_10" name="hxj_10"  onchange="if(this.options[this.selectedIndex].value=='1'){$('#hx_10').hide().val('')};else{$('#hx_10').show()}">
                        <option value="0">数值</option>
                        <option value="1">呼吸机 </option>
                    </select>&nbsp;<input id="hx_10" name="hx_10" type="text" style="width:50px" /></td>
                <td align="center"><select id="hxj_14" name="hxj_14"  onchange="if(this.options[this.selectedIndex].value=='1'){$('#hx_14').hide().val('')};else{$('#hx_14').show()}">
                        <option value="0">数值</option>
                        <option value="1">呼吸机 </option>
                    </select>&nbsp;<input id="hx_14" name="hx_14"  type="text" style="width:50px"/></td>
                <td align="center"><select id="hxj_18" name="hxj_18"  onchange="if(this.options[this.selectedIndex].value=='1'){$('#hx_18').hide().val('')};else{$('#hx_18').show()}">
                        <option value="0">数值</option>
                        <option value="1">呼吸机 </option>
                    </select>&nbsp;<input id="hx_18" name="hx_18"  type="text" style="width:50px"/></td>
                <td  align="center"><select id="hxj_22" name="hxj_22"  onchange="if(this.options[this.selectedIndex].value=='1'){$('#hx_22').hide().val('')};else{$('#hx_22').show()}">
                        <option value="0">数值</option>
                        <option value="1">呼吸机 </option>
                    </select>&nbsp;<input id="hx_22" name="hx_22" type="text" style="width:50px"/></td>
            </tr>

            <tr>
                <td bgcolor="#f6faff" height="30" >血压(mmHg)</td>
                <td align="center" colspan="3">
                    <input id="swssy" name="swssy"  type="text"  style="text-align:right; width:50px;"/>
                    <strong style="color:#93AFBA">/</strong>
                    <input id="swszy" name="swszy"  type="text" style="width:50px;"/>
                </td>
                <td  align="center" colspan="3">
                    <input id="xwssy" name="xwssy"  type="text"  style="text-align:right; width:50px;"/>
                    <strong style="color:#93AFBA">/</strong>
                    <input id="xwszy" name="xwszy"  type="text" style="width:50px;"/>
                </td>
            </tr>

            <tr>
                <td bgcolor="#f6faff" height="30">入量(ml)</td>
                <td colspan="6" align="left" >&nbsp;&nbsp;<input id="rl"  name="rl" type="text" style="width:100px;" /></td>
            </tr>

            <tr>
                <td bgcolor="#f6faff" height="30" >出量(ml)</td>
                <td colspan="6" align="left" >&nbsp;&nbsp;<input id="cl" name="cl" type="text" style="width:100px;" /></td>
            </tr>
            <tr>
                <td bgcolor="#f6faff" height="30">大便(次/日)</td>
                <td colspan="6" align="left" >&nbsp;&nbsp;<input id="dbcs" name="dbcs" type="text" style="width:100px;" />&nbsp;参考字符：E，※，☆</td>
            </tr>
            <tr>
                    <td bgcolor="#f6faff" height="30">小便(次/日)</td>
                    <td colspan="6" align="left" >&nbsp;&nbsp;<input id="xbcs" name="xbcs" type="text" style="width:100px;" />&nbsp;</td>
            </tr>
            <tr>
                <td bgcolor="#f6faff" height="30">身高(cm)</td>
                <td colspan="6" align="left"  id="coltd2">&nbsp;&nbsp;<select id="sglx" name="sglx"  onchange="if(this.options[this.selectedIndex].value!='1'){$('#sg').hide().val('')};else{$('#sg').show()}">
                    <option value="1">数值 </option>
                    <option value="2">其它 </option>
                </select>&nbsp;<input id="sg" name="sg" type="text" style="width:100px;" /></td>
                <td bgcolor="#f6faff" height="30" style="display:none;" id="qtxtd3">
                    <span id="qtxmcspan2">&nbsp;</span>
                    <input type="hidden" name="qtxmc2" id="qtxmc2"/>
                </td>
                <td colspan="3" align="left"  style="display:none;" id="qtxtd4">
                    &nbsp;&nbsp;<input id="qtx2" name="qtx2" type="text"  />
                </td>
            </tr>
            <tr>
                <td bgcolor="#f6faff" height="30">体重(kg)</td>
                <td colspan="6" align="left"  id="coltd1">&nbsp;&nbsp;<select id="tzlx" name="tzlx"  onchange="if(this.options[this.selectedIndex].value!='1'){$('#tz').hide().val('')};else{$('#tz').show()}">
                        <option value="1">数值 </option>
                        <option value="2">平车 </option>
                        <option value="3">卧床 </option>
                        <option value="4">抱入 </option>
                        <option value="5">轮椅 </option>
                    </select>&nbsp;<input id="tz" name="tz" type="text" style="width:100px;" /></td>
                <td bgcolor="#f6faff" height="30" style="display:none;" id="qtxtd1">
                    <span id="qtxmcspan1">&nbsp;</span>
                    <input type="hidden" name="qtxmc1" id="qtxmc1"/>
                </td>   
                <td  align="left"  style="display:none;" id="qtxtd2">
                    &nbsp;&nbsp;<input id="qtx1" name="qtx1" type="text"  />
                </td> 
                <td bgcolor="#f6faff" height="30" style="display:none;" id="qtxtd5">
                    <span id="qtxmcspan3">&nbsp;</span>
                    <input type="hidden" name="qtxmc3" id="qtxmc3"/>
                </td>
                <td  align="left"  style="display:none;" id="qtxtd6">
                    &nbsp;&nbsp;<input id="qtx3" name="qtx3" type="text"  />
                </td> 
            </tr>
            <tr>
                <td bgcolor="#f6faff" height="30">皮试</td>
                <td colspan="6" align="left">&nbsp;&nbsp;
                    <input id="ps" name="ps" type="text"  class="luru_16"/>&nbsp;参考值：阴性/阳性
                </td>
            </tr>
        </form>
    </table>

    <script type="text/javascript">
        function saveForm(){
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
            var data=$("#contentForm").serialize()+"&thedate="+$("#thedate").val()+"&inpno="+$("#inpno").val();
//            console.log(data);

            $.ajax({
                url:"http://localhost:8080/sign/save",
                type:"post",
                cache: false,
                data: data,
                success: function(reply){
//                    console.log(reply);
                    if(reply=="success"){
                        showIdError("保存成功！","error");
                    }else{
                        showIdError("保存失败！","error");
                    }
                    // var data=$.parseJSON(reply);
                    // if(data[0].excCount > 0){
                    //     showIdError("保存成功！","error");
                    //     $("#deleteForm").attr("disabled",false);
                    // }else{
                    //     showIdError("保存失败！","error");
                    // }
                    // $("#saveForm").attr("disabled",false);
                },
                error:function(){
                    showIdError("系统错误！","error");
                    $("#saveForm").attr("disabled",false);
                    return false;
                }
            });
        }

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
    </script>
</body>
</html>