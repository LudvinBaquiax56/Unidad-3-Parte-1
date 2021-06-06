Algoritmo Ejercicio20
	Definir num Como Entero
	Definir palabra como cadena
	Repetir
		Escribir 'Ingrese un numero de 5 digitos'
		Leer num
	Hasta Que num > 9999 & num < 100000
	palabra <- ConvertirATexto(num)
	D1 = Subcadena(palabra, 1,1)
	D2 = Subcadena(palabra, 2,2)
	D4 = Subcadena(palabra, 4,4)
	D5 = Subcadena(palabra, 5,5)
	Si (D1 = D5 & D2 = D4) Entonces
		Escribir 'Es capicua'
	SiNo
		Escribir 'No es capicua'
	Fin Si
FinAlgoritmo
