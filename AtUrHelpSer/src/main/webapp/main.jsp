<!DOCTYPE html>
<html lang="en-US">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>AtUrHelp.</title>
<meta name="keywords" content="aturhelp web page, aturhelp web page template" />
<meta name="description" content="This is aturhelp style web pag" />

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/aturhelp.css" />

<script type="text/javascript" src="js/angular.min.js"></script>
<script type="text/javascript" src="js/angular-route.min.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript" src="js/aturhelp.js"></script>
<script type="text/javascript" src="js/blog.js"></script>
<script type="text/javascript" src="js/contact.js"></script>
<script type="text/javascript" src="js/projects.js"></script>
<script type="text/javascript" src="js/register.js"></script>


<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="js/jquery.slide.js"></script>


</head>
<body ng-app="MainModule">
  <center>
     <div ng-include="'header.html'"></div> 
     <div ng-view>
     ..loading
     </div>
     </div>
     
     <div ng-include="'footer.html'"></div> 
  </center>
</body>
</html>