<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
                    <th>Expense_Date</th>
                    <th>Expense_Type</th>
                    <th>Cost_in_Home_Currency</th>
                </tr>
                </thead>

                <tbody>
                    <c:forEach var="record" items="${expenseRecords}">
                        <tr>
                            <td>${record.empl_ID}</td>
                            <td>${record.name}</td>
                            <td>${record.expense_Date}</td>
                            <td>${record.expense_Type}</td>
                            <td>${record.cost_in_Home_Currency}</td>
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

             <div class="totalBudget">
                        <p> 总经费：${totalBudget} RMB</p>
                    </div>
                    <div class="balance">
                        <p>可用余额：${balance} RMB</p>
                    </div>
        </div>



        <div id="footer"><p>ThoughtWorks Chengdu Office</p></div>
    </div>
</body>
</html>