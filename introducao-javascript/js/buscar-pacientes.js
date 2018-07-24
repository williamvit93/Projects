var botaoBuscar = document.querySelector("#buscar-paciente");

botaoBuscar.addEventListener('click', function(){
	var xhr = new XMLHttpRequest();
	xhr.open("GET", "http://api-pacientes.herokuapp.com/pacientes");

	xhr.addEventListener('load', function(){
		var erros = document.querySelector('#erro-ajax');
		if(xhr.status == 200){
			erros.classList.add('invisivel');
			
			var pacientes = JSON.parse(xhr.responseText);
			console.log(pacientes);
			
			pacientes.forEach(function(paciente){
			adicionaPacienteNaTabela(paciente);
			});	
		}else{
			erros.classList.remove('invisivel');
		}
		
	});
	
	xhr.send();	
});
