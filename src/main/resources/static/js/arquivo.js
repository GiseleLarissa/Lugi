

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

				tb.innerHTML += `<tr><th>${p.nome}</th><th>${p.email}</th><th>${p.cpf}</th><th>${p.celular}</th> <th>${p.dataDeNascimento}</th></tr>`				

			};
		};

	}
	xhr2.send();
}
createTable();


function adicionar(){
	let  xhr = new XMLHttpRequest();
	xhr.open('POST', '/cliente')

	xhr.onload = function(){
		if(this.status == 200){
			let r = JSON.parse(this.responseText);
			cosole.log(r);		
		}
	};

	xhr.setRequestHeader('Content-Type', 'application/json');

	let cliente = new Object();

	let espacoNome = document.getElementById("nome");
	let espacoEmail = document.getElementById("email");
	let espacoCpf = document.getElementById("cpf")
	let espacoCelular = document.getElementById("celular");
	let espacoDataDeNascimento = document.getElementById("dataNascimento");


	cliente.espacoNome = espacoNome.value; 
	cliente.espacoEmail = espacoEmail.value;
	cliente.espacoCpf = espacoCpf.value; 
	cliente.espacoCelular = espacoCelular.value; 
	cliente.espacoDataDENascimento = espacoDataDeNascimento.value; 


	xhr.send(JSON.stringify(cliente));

}

adicionar();