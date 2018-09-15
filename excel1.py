import string
import random
vend = {}
for i in range(1, 101):
    id = ''.join(random.choice(string.ascii_uppercase) for _ in range(5)) + ('{:04}'.format(random.randint(1, 10001)))
    name = ''.join(random.choice(string.ascii_uppercase) for _ in range(10))
    details = [id,name]
    vend[i] = details
print(vend)
