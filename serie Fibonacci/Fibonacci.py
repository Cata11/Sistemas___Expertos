 
def pideNumero():
    while True:
        n=int(input("ingresa un numero mayor a 1:"))
        if n>1:
            return n
 
def generaFibonnaci(n):
    lista=[]
    for i in range(0,n):
        if i==0 or i==1:
            lista.append(1)
        else:
            lista.append(lista[-2]+lista[-1])
    return lista
 
def muestraLista(lista):
    for i in lista:
        if(i!=lista[-1]):
            print(f"{i}",end="+")
        else:
            print(f"{i}")
 
n=pideNumero()
 
lista=generaFibonnaci(n)
muestraLista(lista)