<?php  
 require "test.php";  
 $user_name = "neh_username";  
 $user_pass =  "neh123";  
 $sql_query = "select name from user_info where user_name like '$user_name' and user_pass like '$user_pass';";  
 $result = mysqli_query($con,$sql_query);  
 if(mysqli_num_rows($result) >0 )  
 {  
 $row = mysqli_fetch_assoc($result);  
 $name =$row["name"];  
 echo "Login Success..Welcome ".$name;  
 }  
 else  
 {   
 echo "Login Failed.......Try Again..";  
 }  
?> 