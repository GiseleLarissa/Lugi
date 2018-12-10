
function createTable(){	
	let xhr2 = new XMLHttpRequest();
	xhr2.open('GET', '/carro')

	xhr2.onload = function(){
		if(this.status == 200){
			let r = JSON.parse(this.responseText);
			console.log(r);

			let tb = document.getElementById("carros");


			for(let i=0; i <r.content.length; i++){
				let p = r.content[i];
				tb.innerHTML += `<tr><th>${p.modelo}</th><th>${p.ano}</th><th>${p.cor}</th><th>${p.valorDaDiaria}</th></tr>`				

			};
		};

	}
	xhr2.send();
}
createTable();


function adicionar(){
	let  xhr2 = new XMLHttpRequest();
	xhr2.open('POST', '/carro')

	xhr2.onload = function(){
		if(this.status == 200){
			let r = JSON.parse(this.responseText);
			console.log(r);		
		}
	};

	xhr2.setRequestHeader('Content-Type', 'application/json');

	let carro = new Object();

	let modelo = document.getElementById("modelo").value;
	let ano = document.getElementById("ano").value;
	let cor = document.getElementById("cor").value;
	let valorDaDiaria = document.getElementById("valorDaDiaria").value;


	carro.modelo = modelo; 
	carro.ano = ano;
	carro.cor = cor; 
	carro.valorDaDiaria = valorDaDiaria; 


	xhr2.send(JSON.stringify(carro));

}
