Algoritmo Ejercicio13
	Definir radio Como real
	Definir altura Como real 
	Definir volumen Como Real
	Repetir
		Si radio < 0 Entonces
			Escribir 'Error numero ingresesado incorrecto'
		Fin Si
		Escribir 'Ingrese el radio del cilindro'
		Leer radio
	Hasta Que radio > 0
	Repetir
		Si radio < 0 Entonces
			Escribir 'Error numero ingresesado incorrecto'
		FinSi
		Escribir 'Ingrese la altura del cilindro'
		Leer altura
	Hasta Que altura > 0
	volumen = pi * radio*radio* altura
	Escribir 'El volumen del cilindro es ' volumen
FinAlgoritmo
