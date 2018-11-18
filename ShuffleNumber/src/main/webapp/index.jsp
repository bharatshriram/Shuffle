<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home</title>
<link rel="icon" type="image/jpg" href="images/hanbit.png" />
<link rel="stylesheet" href="files/common/css/bootstrap.css">
<link id="afterStyle" rel="stylesheet" type="text/css"
	href="files/menu/css/menu.css" />
<link rel="stylesheet" type="text/css" href="files/common/css/nav.css" />
<link rel="stylesheet" type="text/css" href="files/table/css/style.css" />
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet" type="text/css"
	href="files/common/css/glyphicon_common.css" />
<link rel="stylesheet" href="files/common/css/font-awesome.min.css">


<script src="files/common/js/jquery.min.js"></script>
<script src="files/common/js/bootstrap.min.js"></script>
<script src="files/common/js/bootbox.min.js"></script>
<script src="files/common/js/bootbox.js"></script>
<script src="files/menu/js/menu.js"></script>

<script src="js/index.js"></script>

</head>
<body>







	<div id="logo1">


		<div class="container" style="margin-top: 20px;">
			<form class="form-horizontal" method="post" action="">
				<div>


					<label for="End Date" class="col-sm-1 control-label"> How Many number to Shuffle?
						<span id="star"><sup style="color: red">*</sup></span>
					</label>

					<div class="col-md-2">
						<div class="input-group">
							<span class="input-group-addon" style="background-color: #9e9e9e">
								<i style="color: white" class="glyphicon glyphicon-calendar"></i>
							</span> <input type="text" class="form-control input-md" id="shuffle_number"
								placeholder="Shuffle Number" />
						</div>
					</div>



					<br /> <br /> <br /> <label class="col-md-2 control-label"></label>
					<div class="col-md-12 text-center">
						<input type="button" id="Shuffle_action" value="Submit"
							class="saveAdd" />


					</div>
				</div>
			</form>
		</div>




	</div>
</body>
</html>