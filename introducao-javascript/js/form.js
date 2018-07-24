//pega o botão do formulário
var botaoAdicionar = document.querySelector("#adicionar-paciente");


//adiciona evento de click ao botão
botaoAdicionar.addEventListener("click", function (event){
	//pára o evento padrão do botão 
	event.preventDefault();
	
	//pega o formulário de adicionar novo paciente
	var form = document.querySelector("#form-adiciona");
	
	
	//pega a tabela de pacientes
	var tabela = document.querySelector("#tabela-pacientes");
	
	//pega os valores digitados no formulário
	var paciente = ObterPacienteDoForm(form);
	
	erros = ValidaPaciente(paciente);
	
	if(erros.length >0){
		exibeMensagensDeErros(erros);
		
		return;
	}

	//adiciona a linha na tabela
	tabela.appendChild(MontaTr(paciente));
	
	form.reset();
	var mensagensErro = document.querySelector("#mensagem-erro");
	mensagensErro.innerHTML = "";
});

function adicionaPacienteNaTabela(paciente){
	var tabela = document.querySelector("#tabela-pacientes");
	tabela.appendChild(MontaTr(paciente));
}

function ObterPacienteDoForm(form){
	var paciente = {
		nome: form.nome.value,
		peso: form.peso.value,
		altura: form.altura.value,
		gordura: form.gordura.value,
		imc: CalculaImc(form.peso.value, form.altura.value)
	}
	return paciente;
}

function MontaTr(paciente){
	
	var pacienteTr = document.createElement("tr");
	
	pacienteTr.classList.add("paciente");
	
	pacienteTr.appendChild(MontaTd(paciente.nome, "info-nome"));
	pacienteTr.appendChild(MontaTd(paciente.peso, "info-peso"));
	pacienteTr.appendChild(MontaTd(paciente.altura, "info-altura"));
	pacienteTr.appendChild(MontaTd(paciente.gordura, "info-gordura"));
	pacienteTr.appendChild(MontaTd(paciente.imc, "info-imc"));
	
	return pacienteTr;
}

function MontaTd(dado, classe){
	
	var td = document.createElement("td");
	td.textContent = dado;
	td.classList.add(classe);
	
	return td;
}

function ValidaPaciente(paciente){
	
	var erros = [];
	
	if(!ValidaAltura(paciente.altura)){
		erros.push("Altura Inválida");
	}
	
	if(!ValidaPeso(paciente.peso)){
		erros.push("Peso Inválido");
	}
	
	if(paciente.peso.length == 0){
		erros.push("O peso não pode ser em branco");
	}
	if(paciente.altura.length == 0){
		erros.push("A altura não pode ser em branco");
	}
	if(paciente.gordura.length == 0){
		erros.push("A gordura não pode ser em branco");
	}
	if(paciente.nome.length == 0){
		erros.push("O nome não pode ser em branco");
	}
	return erros;
}


function exibeMensagensDeErros(erros){
	var ul = document.querySelector("#mensagem-erro");
			ul.innerHTML = "";
			
		erros.forEach(function (erro){
			var li = document.createElement("li");
			li.textContent = erro;
			ul.classList.add("paciente-invalido");
			ul.classList.add("erroForm");
			ul.appendChild(li);
			
		});
		ul.classList.remove('invisivel');
}
