/*Usaremos esta aplicacion para el calculo de cuantas piezas y pedidos necesitaremos 
 para poder poner la pista del polideportivo en buen estado. Escogeremos la empresa 
 mas economica*/
public class Polideportivo { 
   public static void main(String args[]) { 
        System.out.println("Polideportivo");
        System.out.println("\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550" +
                "\u2550\u2550\u2550\u2550");
	  
	//Ponemos las medidas de la pista
	final byte LARGO_PISTA = 40;
	final byte ANCHO_PISTA = 20;
	short superficieDeLaPista = ANCHO_PISTA * LARGO_PISTA;
	final short PRESUPUESTO = 2300;
	System.out.println("Presupuesto disponible: " + PRESUPUESTO + " euros");
	System.out.println("\n");
	System.out.println("Medidas de la Pista");
	System.out.println("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500" + 
                "\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500" +
		"\u2500");
	System.out.println("Largo de la Pista: " + LARGO_PISTA + " m");
	System.out.println("Ancho de la Pista: " + ANCHO_PISTA + " m");
	System.out.print("Superficie total de la pista: " + superficieDeLaPista + " m");
	System.out.println("\u00B2");
	System.out.println("\n");
	  
	//Tenemos ahora las medidas de las piezas que pretendemos usar
	final byte LARGO_PIEZA = 2;
	final byte ANCHO_PIEZA = 1;
	byte superficieDeLaPieza = ANCHO_PIEZA * LARGO_PIEZA;
	  
	System.out.println("Medidas de las piezas a colocar");
	System.out.println("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500" + 
		"\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500" +
		"\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
	System.out.println("Largo de la pieza: " + LARGO_PIEZA + " m");
	System.out.println("Ancho de la pieza: " + ANCHO_PIEZA + " m");
	System.out.print("Superficie total de la pieza: " + superficieDeLaPieza + " m");
	System.out.println("\u00B2");
	  
	//Calculamos el nÃºmero total de piezas que necesitaremos
	short piezasNecesarias = (ANCHO_PISTA * LARGO_PISTA)/(ANCHO_PIEZA * LARGO_PIEZA);
	System.out.println('N' + "\u00fa" + "mero de piezas necesarias: " + piezasNecesarias + " piezas");
	System.out.println("\n");
	  
	/*Tenemos dos empresas las cuales ofrecen distintos precios, necesitamos la mas economica.
        Expresamos los datos de la Empresa A y vemos si tenemos suficiente presupuesto.*/
	final byte PIEZAS_EMPRESA_A = 125;
	final short PRECIO_A = 800;
	boolean suficientePresupuestoA = (PRESUPUESTO >= (piezasNecesarias/PIEZAS_EMPRESA_A) * PRECIO_A);
	String mensajeA = (suficientePresupuestoA) ? "Tenemos el presupuesto adecuado para comprar" +
		" aqu\u00ed las piezas" : "No tenemos presupuesto suficiente";
	  
	System.out.println("Empresa A");
	System.out.println("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
	System.out.println("Piezas por pedido: " + PIEZAS_EMPRESA_A + " piezas");
	System.out.println("Precio por pedido: " + PRECIO_A + " euros");
	System.out.println(mensajeA);
	System.out.println("\n");
	  
	//Expresamos los datos de la Empresa B y vemos si tenemos suficiente presupuesto.
	final byte PIEZAS_EMPRESA_B = 80;
	final double PRECIO_B = 450.25;
	boolean suficientePresupuestoB = (PRESUPUESTO >= (piezasNecesarias/PIEZAS_EMPRESA_B) * PRECIO_B);
	String mensajeB = (suficientePresupuestoB) ? "Tenemos el presupuesto adecuado para comprar" +
		" aqu\u00ed las piezas" : "No tenemos presupuesto suficiente";
	  
	System.out.println("Empresa B");
	System.out.println("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
	System.out.println("Piezas por pedido: " + PIEZAS_EMPRESA_B + " piezas");
	System.out.println("Precio por pedido: " + PRECIO_B + " euros");
	System.out.println(mensajeB);
	//Veamos entonces ahora el presupuesto que nos vamos a gastar.
        System.out.println("Presupuesto total a gastar: " + (piezasNecesarias/(float)PIEZAS_EMPRESA_B) * PRECIO_B + 
		" euros");
	System.out.println("\n");
	  
	//Duplicamos el nÃºmero de piezas para ver cual es el presupuesto con la empresa elegida.
	piezasNecesarias *= 2;
	System.out.println("Duplicaci\u00f3n de las piezas");
	System.out.println("\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500" + 
		"\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500");
	System.out.println("Piezas que necesitamos al duplicar el valor: " + piezasNecesarias + " piezas");
	System.out.println("Presupuesto del valor de las piezas: " + (piezasNecesarias/PIEZAS_EMPRESA_B) * PRECIO_B + 
		" euros");
   }
}