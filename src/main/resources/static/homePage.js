$("input[type='number']").val('0');

$("#totalDisplay").hide();

$("#orderForm").submit(function (event) {
    var formData = {
      veggieTacos: $("#veggieTacos").val(),
      chickenTacos: $("#chickenTacos").val(),
      beefTacos: $("#beefTacos").val(),
      chorizoTacos: $("#chorizoTacos").val(),
    };

    $.ajax({
      type: "POST",
      url: "/getTotal",
      data: formData,
      dataType: "json",
      encode: true
    }).done(function(response) {
    	$('#orderForm').hide();
    	$('#totalText').html((Math.round(response * 100) / 100).toFixed(2));
    	$("#totalDisplay").show();
    });

    event.preventDefault();
  });
  
  $("#newOrder").click(function() {
  	location.reload();
  });