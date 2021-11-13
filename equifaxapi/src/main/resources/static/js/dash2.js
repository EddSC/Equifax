google.charts.load('current', {'packages':['bar']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Personas', 'Deudas'],
          ['Maria', 200],
          ['Julia', 250],
          ['Adrian', 300],
          ['Pedro', 400],
          ['Javier', 650]
        ]);

        var options = {
          chart: {
            title: 'Deudas',
            subtitle: 'Deudas de las personas',
          }
        };

        var chart = new google.charts.Bar(document.getElementById('columnchart_material'));

        chart.draw(data, google.charts.Bar.convertOptions(options));
      }