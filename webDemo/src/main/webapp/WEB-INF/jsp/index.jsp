<!DOCTYPE html>
<html>

<head>
    <title>TrainingBudget</title>
    <style type="text/css">
        body,
        html {
        margin:0;
        padding:0;
        color:#000;
        background:white;
        text-align:center;
        }
        div#wrap {

        width:350px;
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
         width:100%;
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
        font-size:24px;
        font-weight:bold;
        margin-top:70px;
        }
        input#id,input#name {
            width:75%;
            height:40px;
            font-size:35px;
        }
        div input#start {
            width:170px;
            height:40px;
            margin-top:70px;
            box-sizing: content-box;
            border-radius: 10px;
            cursor: pointer;
            font-size:55;
            background-color:white;
            border:1px solid black;
        }
    #logo img {
        margin-top:10%;
        vertical-align:center;

    }

    </style>
</head>
<body>

    <div id="wrap">
        <div id="logo">
            <img src='images/logo.png'/>
        </div>
       <!-- <div id="nav"></div>-->
        <div id="main">
            <form action="tbQuery" method="post">

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