google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          ['Task', 'Dias vencidos'],
          ['Maria',     11],
          ['Julia',      2],
          ['Adrian',  2],
          ['Pedro', 2],
          ['Javier',    7]
        ]);

        var options = {
          title: 'Dias vencidos'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
      }