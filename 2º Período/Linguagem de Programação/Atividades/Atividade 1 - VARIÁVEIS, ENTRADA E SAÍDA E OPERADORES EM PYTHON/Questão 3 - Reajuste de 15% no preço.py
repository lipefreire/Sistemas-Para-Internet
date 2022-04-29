preço = float (input("Digite o preço do produto em reais : R$ "))
reajuste15 = (preço / 100) * 15
reajuste_feito = reajuste15 + preço

print("O produto sofrerá um aumento de : ",reajuste15," reais.")
print("O preço do produto com aumento de 15% é de : R$ ", reajuste_feito)
