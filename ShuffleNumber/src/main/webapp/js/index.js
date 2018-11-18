/**
 * 
 */




$(document)
    .ready(
        function () {
            $("#Shuffle_action")
                .click(
                    function () {

                        var shuffle_number = $("#shuffle_number").val();


                        if (shuffle_number == "") {
                            bootbox.alert("Enter Number");
                            return false;
                        } else {
                            var number_Addpattern = /^[0-9]*$/;
                            if (!number_Addpattern.test(shuffle_number)) {
                                bootbox.alert('Enter a valid Number');
                                return false;
                            }
                        }


                        sessionStorage.setItem("number", shuffle_number);


                        $
                            .ajax({
                                type: "GET",
                                contentType: "application/json",
                                url: "/ShuffleNumber/shuffle/main/" + sessionStorage.getItem("number"),
                                dataType: "JSON",
                                success: function (data) {


                                    if (data.result == "Success") {

                                        sessionStorage.setItem("number", shuffle_number);
                                        alert("Success");

                                        bootbox
                                            .confirm(
                                                "Shuffle Started Successfully!",
                                                function (
                                                    result) {
                                                    window.location = "home.jsp";
                                                });
                                    }
                                }
                            });

                    });
            return false;

        });