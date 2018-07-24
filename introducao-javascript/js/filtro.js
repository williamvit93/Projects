var campoFiltro = document.querySelector('.filtro');

campoFiltro.addEventListener('input', function(){
	var pacientes = document.querySelectorAll('.paciente');
	if(this.value.length > 0){
		pacientes.forEach(function(paciente){
			var nome = paciente.querySelector('.info-nome').textContent;
			var expressao = new RegExp(campoFiltro.value, "i"); //expressao regular para filtragem, o primeiro elemento é a string de comparação e o "i" significa case insensitive
			
			if(!expressao.test(nome)){
				paciente.classList.add('invisivel');
			}else{
				paciente.classList.remove('invisivel');
			}
	
		});
	}else{
		pacientes.forEach(function(paciente){
			paciente.classList.remove('invisivel');
		});
	}
});