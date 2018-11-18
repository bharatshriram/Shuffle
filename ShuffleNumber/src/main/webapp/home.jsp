<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Home</title>
<link rel="icon" type="image/jpg" href="images/hanbit.png" />
<link rel="stylesheet" href="files/common/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="files/table/css/style.css" />
<link rel="stylesheet" type="text/css" href="files/menu/css/menu.css" />
<link rel="stylesheet" type="text/css" href="files/common/css/nav.css" />
<script src="files/common/js/jquery.min.js"></script>
<script src="files/common/js/bootstrap.min.js"></script>
<script src="files/menu/js/menu.js"></script>
<script src="js/home.js"></script>

  <% response.setHeader("Refresh", "30,home.jsp");%>      

</head>
<body>







	<div id="logo1">
	
	
								<div class="container" style="margin-top: 20px;">
							<form class="form-horizontal" method="post" action="">
<div>
									<br /> <br /> <br /> <label class="col-md-2 control-label"></label>
									<div class="col-md-12 text-center">
										<input type="button" id="previous_id" value="Previous"
											class="saveAdd" />
									
									<input type="button" id="next_id" value="Next"
											class="saveAdd" />
									
									</div>
								</div>
							</form>
							</div>
	
	
	
					<table id="table" class="row" border="0" cellpadding="0"
					cellspacing="0" style="border-top-color: red">
					<thead id="thead1">
						<tr>
							<th align=center><i>Shuffle Number</i></th>
							<th align=center><i>Date Time</i></th>
						</tr>
					</thead>
					<tbody id="Shuffletable">

					</tbody>

				</table>
	
	
	</div>
</body>
</html>