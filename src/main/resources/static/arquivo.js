function clique(){
	
	function createTable(){
		let xhr2 = new XMLHttpRequest();
		xhr2.open('GET', '/position')
		
		xhr2.onload = function(){
			if(this.status == 200){
				let r = JSON.parse(this.responseText);
				cosole.log(r);
				
				let tb = document.getElementById("posicoes");
				
				
				for(let i=0; i <r.content.length; i++){
					let p = r.content[i];
					if(p.coordinate)
						tb.innerHTML += `<tr><th>${p.phone.number}</th><th>${p.cor.number}</th>`
				}
				
			}
		}
	}
	
}