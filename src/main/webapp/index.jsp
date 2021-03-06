<!DOCTYPE html>
<html class="h-100">
  <head>
    <title>Frontenda</title>
    <meta charset="UTF-8">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
    <body style="background-color:#1A3E58;">
    <div class="container" style="margin-top:10%;">
        <div class="d-flex justify-content-center">
        <div class="card col-md-4" mclass="card col-md-4 shadow bg-white rounded mb-5 p-3" >
            <div class="card-body">
                <center><h3 class="card-title"><span class="text-dark"><b><i class="fa fa-cube"></i> Delta</b></span> Login</h3></center><br>
                <hr />
                <form action="login"  method="POST" class="">
            <div class="form-group">
                <!--lable for="username">Username:</lable-->
                <input id="email" type="email" name="email" class="form-control" placeholder="email"/>
            </div>
            <div class="form-group">
                <!--label for="password">Password:</label-->
                <input id="password" type="password" name="password" class="form-control" placeholder="password"/>
            </div>
            <button type="submit" class="btn btn-lg  btn-primary col-md-12 col-sm-12 col-xm-12 col-lg-12">Login</button>
        </form>
                <br>
                <center>
                <p class="small"><a href="#create">create account</a> or <a href="#reset">reset password</a></p>
                </center>
            </div>
        </div>
        </div>
    </div>
    </body>
</html>
