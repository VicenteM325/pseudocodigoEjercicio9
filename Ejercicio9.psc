Algoritmo Ejercicio9
	Repetir
		Escribir "Ingrese temperatura 1: "
		Leer T1
		Escribir "Ingrese temperatura 2: "
		Leer T2
		Si (T1 >= 5 & T1 <= 15) Entonces
			suma1 = suma1+T1
			c <- c+1
		FinSi
		Si (T2 >= 5 & T2 <= 15) Entonces
			suma2 = suma2+T2
			a <- a+1
		Fin Si
	Hasta Que T1 = 0
	promedio1 = suma1/c
	promedio2 = suma2/a
	Escribir "El promedio de temperaturas T1 entre 5 y 15 grados es = " promedio1
	Escribir "El promedio de temperaturas T2 entre 5 y 15 grados es = " promedio2
FinAlgoritmo
