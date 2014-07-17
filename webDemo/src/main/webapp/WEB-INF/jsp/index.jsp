<!DOCTYPE html>
<html>

<head>
    <title>TrainingBudget</title>
    <meta http-equiv="Content-Type" content="text/html charset=utf-8">
    <style type="text/css">
        body,
        html {
        margin:0;
        padding:0;
        color:#000;
        background:white;
        }
        div#wrap {

        width:750px;
        margin:0 auto;
        }
        div#logo {
         padding:5px 10px;
         height:100px;
        }
        div#nav {
         padding:5px 10px;
         height:30px;
        }
        div#main {
         float:left;
         width:750px;
         height:480px;
         background:#efefef;
        }

        div#footer {
         clear:both;
        }

        div#footer p {
         text-align:center;
        }


        form p {
        text-align:left
        font-size:62px;
        margin-left:40px;
        margin-top:70px;
        }
        input#id,input#name {
            width:270px;
            height:40px;
            margin-left:40px;
            font-size:35px;
        }
        div input#start {
            width:170px;
            height:40px;
            margin-left:70px;
            margin-top:70px;
            box-sizing: content-box;
            border-radius: 10px;
            cursor: pointer;
            font-size:55;
        }


    </style>
</head>
<body>

    <div id="wrap">
        <div id="logo"></div>
       <!-- <div id="nav"></div>-->
        <div id="main">
            <form action="tbQuery" method="post">
                <p>UserName</p>
                <input type="text" name="name" id="name"/>
                <p>EmployeeID</p>
                <input type="text" name="id" id="id"/>
                <div>
                    <input type="submit" id = "start" name = "start" value="Query"/>
                </div>
            </form>
        </div>

        <div id="footer"><p>ThoughtWorks Chengdu Office</p></div>
    </div>
</body>
</html>