<html>
<body>
<?php
// Check if the form is submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Retrieve form data
    $name = $_POST["name"];
    $email = $_POST["email"];
    $crn = $_POST["crn"];
    $lin = $_POST["lin"];
}
?>
    Welcome <?php echo $name?>! 

</body>
</html>
