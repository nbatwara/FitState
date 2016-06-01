<?php include "DBconnection.php"; ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
 
<title>User Management System (Tom Cameron for NetTuts)</title>
<link rel="stylesheet" href="style.css" type="text/css" />
</head>  
<body>  
<div id="main">
<?php
if(!empty($_POST['location']) && !empty($_POST['startTime'] && !empty($_POST['endTime'])
	&& !empty($_POST['username'])&& !empty($_POST['item']))
{
    $username = mysql_real_escape_string($_POST['username']);
    $item = mysql_real_escape_string($_POST['item']);
    $location = mysql_real_escape_string($_POST['location']);
    $startTime = mysql_real_escape_string($_POST['startTime']);
    $endTime = mysql_real_escape_string($_POST['endTime']);    
     
	$addSchedule = mysql_query("SELECT * FROM schedule WHERE Username = '".$username."' AND item = '".$item."'
					AND location = '".$location."'AND startTime = '".$startTime."'AND endTime = '".$endTime."'");      
     if(mysql_num_rows($addSchedule) == 1)
     {
        echo "<h1>Error</h1>";
        echo "<p>Sorry, the schedule has been made by you. Please go back and try again.</p>";
     }
     else
     {
		$registerquery = mysql_query("INSERT INTO schedule (Username, item, location, startTime, endTime) 
				VALUES('".$username."', '".$item."', '".$location."', '".$startTime."', '".$endTime."')");
       
		echo mysql_errno($link) . ": " . mysql_error($link). "\n";

        if($registerquery)
        {
            echo "<h1>Success</h1>";
            echo "<p>Your scheduled is added</p>";
        }
        else
        {
            echo "<h1>Error</h1>";
            echo "<p>Sorry, your schedule is not added</p>";    
        }       
     }
}
else
{
    ?>
     
   <h1>add schedule</h1>
     
   <p>Please enter details below to add schedule.</p>
     
    <form method="post" action="addSchedule.php" name="addScheduleForm" id="addScheduleForm">
    <fieldset>
        <label for="username">Username:</label><input type="text" name="username" id="username" /><br />
        <label for="item">excerse item:</label><input type="text" name="item" id="item" /><br />
		<label for="location">location:</label><input type="text" name="location" id="location" /><br />
		<label for="startTime">start time:</label><input type="text" name="startTIme" id="startTIme" /><br />
		<label for="endTime">end time:</label><input type="text" name="endTime" id="endTime" /><br />
        <input type="submit" name="add" id="addSchedule" value="Add" />
    </fieldset>
    </form>
     
    <?php
}
?>
 
</div>
</body>
</html>
