 <?php  
 require "test.php";  
 $name = "naresh";  
 $user_name = "naresh";  
 $user_pass = "naresh123";  
 $sql_query = "insert into user_info values('$name','$user_name','$user_pass');"; 

if(mysqli_query($con,$sql_query))
{
echo "<h3>Data Insert Successful...</h3>";
} 
else {
	echo "Data Insert Error...".mysqli_error($con);
}
?> 