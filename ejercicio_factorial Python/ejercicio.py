from tkinter import N


def iterador( s):
    if s==0:
         return 1
    else:
        return s*iterador(s-1)


 
    



n1=int(input("Ingresa uun numero para conocer su factorial "))

print(f"el factorial de {n1} es")
print(iterador(n1))
