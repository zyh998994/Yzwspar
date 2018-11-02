<%@page language="java" import="java.util.*" pageEncoding="utf-8" %>
<html>
    <head>
        <script type="text/javascript" src="statics/js/jquery-1.8.3.min.js"></script>
        <script type="text/javascript">
            $(function(){
                $("button").click(function(){
                    alert(1);
                    $.ajax({
                        url :"/select",
                        data : {gname : $(".gname").val()} ,
                        contentType : "application/json",
                        type : "get"
                   });
                              /* $.getJSON(
                                   "/select",
                                   "gname=" + $(".gname").val(),
                                   function (result) {
                                       alert(1111);
                                    alert(result);
                                   }
                               )*/
               });
            });
        </script>
    </head>

    <body>
        <input type="text" name="gname" class="gname">
        <button>点击</button>
    </body>
</html>
