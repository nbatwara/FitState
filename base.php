<?php
session_start();
 
$dbhost = "mysql.cs.iastate.edu"; // this will ususally be 'localhost', but can sometimes differ
$dbname = "db309grp11"; // the name of the database that you are going to use for this project
$dbuser = "dbu309grp11"; // the username that you created, or were given, to access your database
$dbpass = "jTvY85jW5J9"; // the password that you created, or were given, to access your database
 

mysql_connect($dbhost, $dbuser, $dbpass) or die("MySQL Error: " . mysql_error());
$link= mysql_connect($dbhost, $dbuser, $dbpass);
mysql_select_db($dbname) or die("MySQL Error: " . mysql_error());
?>
