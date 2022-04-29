import moeda

preço = float(input("Digite o preço do produto: R$ "))

print(f'O preço aumentado em 30% é: R$ {moeda.aumentar(preço, 30)}')
print(f'A metade do preço é : R$ {moeda.metade(preço)}')
print(f'O dobro do preço é : R$ {moeda.dobro(preço)}')
print(f'O preço do produto com uma queda de 15% é : R$ {moeda.diminuir(preço, 15)}')
