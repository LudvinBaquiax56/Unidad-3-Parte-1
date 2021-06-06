Algoritmo Ejercicio17
	Escribir 'Ingrese el primer lado'
	Leer lado1
	Escribir 'Ingrese el segundo lado'
	Leer lado2
	Escribir 'Ingrese el tercer lado'
	Leer lado3
	Si lado1=lado2 Y lado1=lado3 Entonces
		Escribir 'El trinagulo es EQUILATERO'
	SiNo
		Si lado1=lado2 O lado1=lado3 O lado2=lado3 Entonces
			Escribir 'El trinagulo es ISOSELES'
		SiNo
			Escribir 'El triangulo es ESCALENO'
		FinSi
	FinSi
FinAlgoritmo
