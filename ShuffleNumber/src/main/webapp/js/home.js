/*   Shuffle.js

    Author     : Bharat
 */



$(document)
	.ready(
		function () {
			$("#previous_id")
				.click(
					function () {

						$
							.ajax({
								type: "GET",
								contentType: "application/json",
								url: "/ShuffleNumber/shuffle/submain/" + sessionStorage.getItem("number"),
								dataType: "JSON",
								success: function (data) {


									if (data.result == "Success") {

										alert("Success");

									}
								}
							});

					});
			return false;

		});


$(document)
	.ready(
		function () {
			$("#next_id")
				.click(
					function () {

						$
							.ajax({
								type: "GET",
								contentType: "application/json",
								url: "/ShuffleNumber/shuffle/submain/" + sessionStorage.getItem("number"),
								dataType: "JSON",
								success: function (data) {


									if (data.result == "Success") {



										alert("Success");


										$
											.getJSON(
												"/ShuffleNumber/shuffleList",
												function (data) {
													$
														.each(data.shuffleList,
															function (i, item) {
																var tr = "<tr>"
																	+ "<td align=center>"
																	+ item.shuffleNumber
																	+ "</td>"
																	+ "<td align=center>"
																	+ item.dateTime
																	+ "</td>"

																	+ "</tr>";
																$("#Shuffletable")
																	.append(tr);
															});

												});
									}

									else if (data == "Failure") {

										alert("Duplicate Data");

									}

								}
							});

					});
			return false;

		});



$(document)
	.ready(
		function () {

			$
				.ajax({
					type: "GET",
					contentType: "application/json",
					url: "/ShuffleNumber/shuffle/submain/" + sessionStorage.getItem("number"),
					dataType: "JSON",
					success: function (data) {


						if (data.result == "Success") {

							alert("Success");

							$
								.getJSON(
									"/ShuffleNumber/shuffleList",
									function (data) {
										$
											.each(data.shuffleList,
												function (i, item) {
													var tr = "<tr>"
														+ "<td align=center>"
														+ item.shuffleNumber
														+ "</td>"
														+ "<td align=center>"
														+ item.dateTime
														+ "</td>"

														+ "</tr>";
													$("#Shuffletable")
														.append(tr);
												});

									});


						} else if (data == "Failure") {

							alert("Duplicate Data");

						}
					}
				});

			return false;

		});


















$(document)
	.ready(
		function () {
			$
				.getJSON(
					"/ShuffleNumber/shuffleList",
					function (data) {
						$
							.each(data.shuffleList,
								function (i, item) {
									var tr = "<tr>"
										+ "<td align=center>"
										+ item.shuffleNumber
										+ "</td>"
										+ "<td align=center>"
										+ item.dateTime
										+ "</td>"

										+ "</tr>";
									$("#Shuffletable")
										.append(tr);
								});


						if (data.size == sessionStorage.getItem("number")) {

							$("#previous_id").prop("disabled", true);
							$("#next_id").prop("disabled", true);
						}



					});
		});






