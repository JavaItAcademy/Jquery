var prefix = "http://localhost:8080/";
var RestGet = function () {
	var id = $("input#thing-id").val();

	$.ajax({
		type: 'GET',
		url: prefix + id,
		dataType: 'json',
		async: true,
		success: function(result) {
			console.log(result);
			$(".hello-reaction").html('<h1>' + result.id + ' ' + result.value + '</h1>');
		},
		error: function (jqXHR, textStatus, errorThrown) {
			console.log("ERROR: ")
			console.log(jqXHR);
			console.log(textStatus);
			console.log(errorThrown);
		}

	});
};

var RestGetAll = function () {
	var str = "";
	$.ajax({
		type: 'GET',
		url: prefix + 'all',
		dataType: 'json',
		async: true,
		success: function(result) {
			console.log(result);
			$.each(result, function(index, value) {
				str = str + '<h1>' + value.id + ' ' + value.value + '</h1>';
				console.log(str);
			});
			$('.hello-reaction').html(str);
		},
		error: function (jqXHR, textStatus, errorThrown) {
			console.log("ERROR: ")
			console.log(jqXHR);
			console.log(textStatus);
			console.log(errorThrown);
		}

	});
};

var RestPost = function () {
	var id = $("input#thing-id").val();
	var name = $("input#name-value").val();

	console.log(id + " : " + name);

	var myJson = '{' +
	'	"id": ' + id + ',' + 
	'	"value": "' + name + '"' + 
	'}';
	console.log(myJson);
	
	$.ajax({
		type: 'POST',
		url: prefix,
		data: myJson,
		contentType: 'application/json',
		dataType: 'json',
		async: true,
		success: function(result) {
			console.log(result);
			$(".hello-reaction").html('<h1>' + result.id + ' ' + result.value + '</h1>');
		},
		error: function (jqXHR, textStatus, errorThrown) {
			 $('.hello-reaction').html(jqXHR.status + ' ' + jqXHR.responseText);
		}

	});	
};
