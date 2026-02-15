import json
 
# read file
with open('C:\\Users\\IMRANMOHAMMAD\\Desktop\\Full Stack Quality Engineer\\Java\\python\\currency.json', 'r') as myfile:
    data=myfile.read()
 
# parse file
obj = json.loads(data)
 
# show values
print("usd: " + str(obj['usd'])) # usd: 1
print("eur: " + str(obj['eur'])) # eur: 1.2
print("gbp: " + str(obj['gbp'])) # gbp: 1.2
