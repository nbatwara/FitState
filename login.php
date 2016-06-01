<?php

$dbservername = mysql.cs.iastate.edu//'10.25.71.66'; // ip address of 
$dbusername = 'dbu309grp11';
$dbpassword = 'jTvY85jW5J9';
$dbname = 'db309grp11';

// Create connection
$conn = mysqli_connect($dbservername, $dbusername, $dbpassword, $dbname);
// Check connection
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}
echo "connected";
//include "ConnectDB.php";
if ($_SERVER["REQUEST_METHOD"] == "POST") {
	
	if($_POST['userName']==0 || $_POST['password']==0)
		echo "blank input";
	else{
		$sql = "SELECT * FROM User WHERE 
			UserName='".$_POST['userName']."', PassWord='".$_POST['password']."'";
		$result = mysqli_query($conn, $sql);

		if (mysqli_num_rows($result) <= 0) {//not exist
			echo "failed";
		}	
		else{
			echo "success";
		}
	}
}




mysqli_close($conn);
?>