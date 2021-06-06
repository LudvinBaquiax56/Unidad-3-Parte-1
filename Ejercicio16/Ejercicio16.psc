Algoritmo Ejercicio16
	Escribir 'Ingrese el primer numero'
	Leer numero1
	Escribir 'Ingrese el segundo numero'
	Leer numero2
	Escribir 'Ingrese el tercer numero'
	Leer numero3
	Si numero1 > numero2 Entonces
		Si numero1 > numero3 Entonces
			Escribir 'El numero mayor es ' numero1
		SiNo
			Escribir 'El numero mayor es ' numero3
		Fin Si
	SiNo
		Si numero2 > numero3 Entonces
			Escribir 'El numero mayor es ' numero2
		SiNo
			Escribir 'El numero mayor es ' numero3
		Fin Si
	Fin Si
FinAlgoritmo
