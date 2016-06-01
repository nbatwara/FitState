<?php
echo "I am working";
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
?>