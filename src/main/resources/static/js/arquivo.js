

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
	let email = document.getElementById("email").value;
	let cpf = document.getElementById("cpf").value;
	let celular = document.getElementById("celular").value;
	let dataDeNascimento = document.getElementById("dataDeNascimento").value;


	cliente.nome = nome; 
	cliente.email = email;
	cliente.cpf = cpf; 
	cliente.celular = celular; 
	cliente.dataDeNascimento = dataDeNascimento; 


	xhr2.send(JSON.stringify(cliente));

}
