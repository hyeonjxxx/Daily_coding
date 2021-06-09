<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

	<style>
		/* 각자 수정 */
        tbody>tr:hover{cursor: pointer;}
        table *{text-align: center;}


        /* pagination */
        .pagination {display: inline-block;}

        .pagination a {
            color: black;
            float: left;
            padding: 8px 16px;
            text-decoration: none;
            transition: background-color .3s;
        }

        .pagination a.active { color: rgb(52, 152, 219);}

        .pagination a:hover:not(.active) {background-color: #ddd;} 
	</style>
</head>
<body>

	<%@ include file="admin_header.jsp" %>
	<div class="content_wrap" align="center">
        <div class="title" align="left">
            <label>회원조회</label>
        </div>
        <div class="container">
            <table class="table table-bordered" >
                <thead class="table-secondary">
                    <tr>
                        <th>회원번호</th>
                        <th>이메일</th>
                        <th>이름</th>
                        <th>가입일</th>
                        <th>파트너 유무</th>
                        <th>파트너명</th>
                        <th>상태</th>
                        <th>관리</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>28</td>
                        <td>USER11@gmail.com</td>
                        <td>김지원</td>
                        <td>2021-05-17</td>
                        <td>Y</td>
                        <td>니브</td>
                        <td>Y</td>
                        <td><button>탈퇴</button></td>
                    </tr>
                </tbody>
            </table>
        </div>
        
        <br clear="both"><br>

        <!-- 페이징 -->
        
        <div class="pagination">
            <a href="#">&laquo;</a>
            <a href="#">1</a>
            <a href="#" class="active">2</a>
            <a href="#">3</a>
            <a href="#">4</a>
            <a href="#">5</a>
            <a href="#">6</a>
            <a href="#">&raquo;</a>
       </div>

    </div>
</body>
</html>