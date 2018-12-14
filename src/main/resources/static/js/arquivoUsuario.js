

function createTable(){	
	let xhr2 = new XMLHttpRequest();
	xhr2.open('GET', '/cliente')

	xhr2.onload = function(){
		if(this.status == 200){
			let r = JSON.parse(this.responseText);
			console.log(r);

			let tb = document.getElementById("clientes");


			for(let i=0; i <r.content.length; i++){
				let p = r.content[i];
				tb.innerHTML += `<tr><th>${p.nome}</th><th>${p.cpf}</th><th>${p.email}</th><th>${p.contato}</th><th>${p.idade}</th><th>${p.endereco}</th><th>${p.senha}</th></tr>`
			};
		};

	}
	xhr2.send();
}
createTable();


function adicionar(){
	let  xhr2 = new XMLHttpRequest();
	xhr2.open('POST', '/cliente')

	xhr2.onload = function(){
		if(this.status == 200){
			let r = JSON.parse(this.responseText);
			console.log(r);		
		}
	};

	xhr2.setRequestHeader('Content-Type', 'application/json');

	let cliente = new Object();

	let nome = document.getElementById("nome").value;
	let cpf = document.getElementById("cpf").value;
	let email = document.getElementById("email").value;
	let contato = document.getElementById("contato").value;
	let idade = document.getElementById("idade").value;
	let endereco = document.getElementById("endereco").value;
	let senha = document.getElementById("senha").value;
	
	


	cliente.nome = nome; 
	cliente.email = email;
	cliente.cpf = cpf; 
	cliente.contato = contato; 
	cliente.idade = idade; 
	cliente.endereco = endereco;
	cliente.senha = senha; 


	xhr2.send(JSON.stringify(cliente));

}
