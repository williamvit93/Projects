 var tabela = document.querySelector("table");
 var pacientes = document.querySelectorAll(".paciente");
 

	 tabela.addEventListener("dblclick", function(event){
		 
		 event.target.parentNode.classList.add("fadeOut");
		 
		 setTimeout(function(){
			//pega o pai do alvo do evento, ou seja, o tr da td clicada
		event.target.parentNode.remove(); 
		 },1000);
		 
		
	 });