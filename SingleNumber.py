a = list(map(int,input().split(",")))
dic = {}
for i in a:
	try:
		dic[i] += 1
	except:
		dic[i] = 1
for i in dic:
	if dic[i] == 1:
		print(i)
		break