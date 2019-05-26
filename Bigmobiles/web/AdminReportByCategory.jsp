<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"></script>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript">
    // Load the Visualization API and the piechart package.
    google.load('visualization', '1', {'packages': ['columnchart']});

    // Set a callback to run when the Google Visualization API is loaded.
    google.setOnLoadCallback(drawChart);

    // Callback that creates and populates a data table,
    // instantiates the pie chart, passes in the data and
    // draws it.
    function drawChart() {

        // Create the data table.    
        var data = google.visualization.arrayToDataTable([
            ['Country', 'Area(square km)'],
    <c:forEach items="${list}" var="data"> ['${data.category}',${data.income} ], </c:forEach>
        ]);
        // Set chart options
        var options = {
            'title': 'Report Category',
            is3D: true,
            pieSliceText: 'label',
            tooltip: {showColorCode: true},
            'width': 500,
            'height': 300
        };

        // Instantiate and draw our chart, passing in some options.
        var chart = new google.visualization.PieChart(document.getElementById('chart'));
        chart.draw(data, options);
    }
    </script>

<jsp:include page="2.jsp"></jsp:include>
    <div class="wrapper wrapper-content">
        <div class="col-md-6 grid-margin stretch-card">

            <div class="col-lg-12 animated fadeInRightBig">  
                <div class="col-md-10"><h1 class="text-center">Income report by Category</h1></div>
                <table border="1" id="reportData" class="table table-striped table-bordered table-hover">
                    <tr>
                        <th>No.</th>
                        <th>Category</th>
                        <th>Income</th>
                    </tr>                                
                <c:forEach var="data" items="${list}" varStatus="index" >
                    <tr>
                        <td>${index.index + 1}</td>
                        <td>${data.category}</td>
                        <td>${data.income}</td>
                    </tr>  
                </c:forEach>              
            </table>

            <div>Total Income: <%=request.getAttribute("total")%></div>

        </div>

        <div class="col-lg-9 animated fadeInDown">
            <div id="chart"></div>
        </div>

        <div>
            <input type="hidden" id="numOfBrands" value="${num}"/>
            <c:forEach items="${list}" var="data" varStatus="index">
                <input type="hidden" id="brand${index.index + 1}" value="${data.income}" name="${data.category}"/>
            </c:forEach>
        </div>
    </div>
</div>
<jsp:include page="1.jsp"></jsp:include>

