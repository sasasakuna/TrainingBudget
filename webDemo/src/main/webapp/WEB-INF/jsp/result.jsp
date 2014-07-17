<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset="utf-8">
    <title>TrainingBudget Query Results</title>
    <meta http-equiv="Content-Type" content="text/html charset=utf-8">

    <style type="text/css">
        body,
        html {
        margin:0;
        padding:0;
        color:#000;
        background:white;
        }
        #wrap {

        width:750px;
        margin:0 auto;
        }
        #logo {
         padding:5px 10px;
         height:100px;
        }
        #nav {
         padding:5px 10px;
         height:30px;
        }
        #main {
         float:left;
         width:750px;
         height:480px;
         background:#efefef;
        }

        #footer {
         clear:both;
        }

        #footer p {
         text-align:center;
        }



    </style>
</head>
<body>

    <div id="wrap">
        <div id="logo"></div>
      <!-- <div id="nav">

       </div>-->
        <div id="main">
            <table class="queryResult">
                <thead>
                <tr>
                    <th>EmployeeID</th>
                    <th>Name</th>
                    <th>Type</th>
                    <th>Cost</th>
                </tr>
                </thead>

                <tbody>
                    <c:forEach var="record" items="${allRecords}">
                        <tr>
                            <td>${record.id}</td>
                            <td>${record.name}</td>
                            <td>${record.type}</td>
                            <td>${record.cost}</td>
                        </tr>

                    </c:forEach>

                    <script type="text/javascript">
                    var trs = $("tbody tr");
                    trs.sort(function(a,b){
                       //var aValue = $(a).find('td:last-child').text();
                        var aValue = $(a).find('td:nth-child(4)').text();
                        var bValue = $(b).find('td:last-child').text();
                        //console.log(aValue, bValue);

                        return +aValue < +bValue;
                    });

                    trs.each(function(idx,tr){
                        $('table tbody').append(tr);
                    });
                    </script>


                </tbody>



            </table>
        </div>

        <div id="footer"><p>ThoughtWorks Chengdu Office</p></div>
    </div>
</body>
</html>