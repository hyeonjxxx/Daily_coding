<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>5.20 (수)</title>
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script type="text/javascript">
   $(document).ready(function() {
        // 1. 전체선택 / 전체해제 
        $(".all_checked").click(function() {
            if($(".all_checked").prop("checked")) {
                $(".single").prop("checked", true);
            }else{
                $(".single").prop("checked", false);
            }
        });
        // 1개 이상 해체시 전체해제 
        $(".single").click(function() {
            /* 체크된 체크박수 수 */
            var selected_box = $(".single:checkbox:checked").length;
            /* 전체 체크박스 수  */
            var check_box = $(".single:checkbox").length;
            
            /* 체크된 수 == 전체 수  => checkAll가 true */
            if(selected_box == check_box){
                $(".all_checked").prop("checked", true);
            }else{
                $(".all_checked").prop("checked", false);
            }
        });
    });    
</script>
</head>
<body>
<table border="1">
        <thead>
            <th><input type="checkbox" class="all_checked"></th>
            <th>이름</th>
            <th>나이</th>
            <th>성별</th>
            <th>직업</th>
        </thead>
        <tbody>
            <tr>
                <td><input type="checkbox" class="single"></td>
                <td>아이유</td>
                <td>29</td>
                <td>여</td>
                <td>가수 겸배우</td>
            </tr>
            <tr>
                <td><input type="checkbox" class="single"></td>
                <td>아이유</td>
                <td>29</td>
                <td>여</td>
                <td>가수 겸배우</td>
            </tr>
            <tr>
                <td><input type="checkbox" class="single"></td>
                <td>아이유</td>
                <td>29</td>
                <td>여</td>
                <td>가수 겸배우</td>
            </tr>
            <tr>
                <td><input type="checkbox" class="single"></td>
                <td>아이유</td>
                <td>29</td>
                <td>여</td>
                <td>가수 겸배우</td>
            </tr>
        </tbody>

        
    </table>
    
    <!-- 1. 전체선택 / 전체해제 -->
    <!-- 방법1 -->
    <!--
    <script>
        $("#all_checked").click( function(){
            var checked = $(this).is(":checked");
            
            if(checked){
                $("#single").prop("checked", true);
            }else{

            }

        });
    </script>
     -->

</body>
</html>