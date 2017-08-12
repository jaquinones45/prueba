
/***
proposito :genera la puntuacion de la lanzada de dos dados

**/
public Lance{

Dado dadosLance[]=new Dado[2];
private int puntuacionDados;


public void tirar(){

	Dado dado1=new Dado();
	dato1.setPuntuacion(randon.nexInt(5) +1)


	Dado dado2=new Dado();
	dato2.setPuntuacion(randon.nexInt(5) +1);

	this.puntuacion=dato1.getPuntuacion() +dato2.getPuntuacion();
} 

}