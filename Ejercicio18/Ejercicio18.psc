Algoritmo Ejercicio18
	Definir numero1 Como Entero
	Definir D2 Como Entero
	Definir D3 Como Entero
	Definir D4 Como Entero
	Definir suma Como Entero
	Definir palabra como cadena
	
	Repetir
		Escribir 'Ingrese un numero no mayor de 4 digitos'
		Leer numero1
	Hasta Que numero1 < 10000
	
	palabra<-ConvertirATexto(numero1)
	Si numero1 < 1000 Entonces
		Si numero1 < 100 Entonces
			Si numero1 < 10 Entonces
				D1 <- 0
				D2 <- 0
				D3 <- 0
				D4 <- numero1
			SiNo
				D1 <- 0
				D2 <- 0
				D3 <- ConvertirANumero(Subcadena(palabra,1,1))
				D4 <- ConvertirANumero(Subcadena(palabra,2,2))
			Fin Si
		SiNo
			D1 <- 0
			D2 <- ConvertirANumero(Subcadena(palabra,1,1))
			D3 <- ConvertirANumero(Subcadena(palabra,2,2))
			D4 <- ConvertirANumero(Subcadena(palabra,3,3))
		Fin Si
	SiNo
		
		D1 <- ConvertirANumero(Subcadena(palabra,1,1))
		D2 <- ConvertirANumero(Subcadena(palabra,2,2))
		D3 <- ConvertirANumero(Subcadena(palabra,3,3))
		D4 <- ConvertirANumero(Subcadena(palabra,4,4))
	Fin Si
	suma = D1 + D2 + D3 + D4
	Escribir 'La sumo de los digitos de ' numero1 ' es ' suma 
FinAlgoritmo
