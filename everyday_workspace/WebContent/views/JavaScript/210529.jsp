<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>

<style>
	.explanation{
        font-family: 맑은고딕;
        font-size: 11pt;
        margin-left: -50px;
    }
    .frameMsg{
        background-color: rgb(235, 235, 235);
        padding: 10px;
    }
</style>
<body>
    <div class="test1">
        <h3>문제1</h3>
        <pre class="explanation">
            아직 실행 중
            https://blog.naver.com/masichyun77/222359408750
            https://jsbeginners.com/pass-the-message-project/

        </pre>
        <label for=""><b>답)</b></label>
        <p class="answer1"></p>
    </div>
  	  
    <div class="frameMsg" align=center>
        <div class="a">
            <h3>보내고 싶은 메세지를 입력하세요</h3> 
        </div>
        <form class="messageBox">
            <input type="text" name="" id="massage">
            <button type="submit" class="submitBtn">제출</button>
        </form>
        <h3>전달된 마지막 메세지</h3>
        <h4 class="messageContent"></h4>
    </div>
    <script>
	(function(){
        const form = document.querySelector(".messageBox");

        form.addEventListener('sumbit', function(e){
            e.preventDefault()
            const message = doucment.querySelector("#massage");
            const feedback
        })
    })

    </script>

    <br><br>

    <div class="test2">
        <h3>문제2</h3>
        <pre class="explanation">
            여기도 문제지
        </pre>
        <label for=""><b>답)</b></label>
        <p class="answer2"></p>
    </div>
    <script>

    </script>
    
</body>
</html>