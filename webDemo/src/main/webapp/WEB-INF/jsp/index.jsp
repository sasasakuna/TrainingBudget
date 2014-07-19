<!DOCTYPE html>
<html>

<head>
    <title>TrainingBudget</title>
    <link type="text/css" rel="stylesheet" href="index.css"/>
    <style type="text/css">
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
                <p>${status}</p>


                <div>
                    <input type="submit" id = "start" name = "start" value="Query"/>
                </div>
            </form>
        </div>

        <div id="footer"><p>ThoughtWorks Chengdu Office</p></div>
    </div>
</body>
</html>