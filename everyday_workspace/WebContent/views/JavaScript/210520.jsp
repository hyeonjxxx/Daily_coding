<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>5.20 (수)</title>
</head>
<body>
<table border="1">
        <thead>
            <th><input type="checkbox" id="all_checked"></th>
            <th>이름</th>
            <th>나이</th>
            <th>성별</th>
            <th>직업</th>
        </thead>
        <tbody>
            <tr>
                <td><input type="checkbox" id="single"></td>
                <td>아이유</td>
                <td>29</td>
                <td>여</td>
                <td>가수 겸배우</td>
            </tr>
            <tr>
                <td><input type="checkbox" id="single"></td>
                <td>아이유</td>
                <td>29</td>
                <td>여</td>
                <td>가수 겸배우</td>
            </tr>
            <tr>
                <td><input type="checkbox" id="single"></td>
                <td>아이유</td>
                <td>29</td>
                <td>여</td>
                <td>가수 겸배우</td>
            </tr>
            <tr>
                <td><input type="checkbox" id="single"></td>
                <td>아이유</td>
                <td>29</td>
                <td>여</td>
                <td>가수 겸배우</td>
            </tr>
        </tbody>

        
    </table>
    
    <!-- 1. 전체선택 / 전체해제 -->
    <!--  -->
    <script>
        $("#all_checked").on("click", function(){
            var checked = $(this).is(":checked");
            
            if(checked){
                $("#single").prop("checked", true);
            }else{

            }

        });
    </script>

</body>
</html>