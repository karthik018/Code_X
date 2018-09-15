char = list(input().split())
words = {1 : "one", 2 : "two", 3 : "three", 4 : "four", 5 : "five", 6 : "six", 7 : "seven", 8 : "eight", 9 : "nine"}
res = "This sentence contains "
dic = {"a" : 1, "b" : 0, "c" : 2, "d" : 0, "e" : 3, "f" : 0, "g" : 0, "h" : 1, "i" : 2, "j" : 0, "k" : 0, "l" : 0, "m" : 0, "n" : 4, "o" : 1, "p" : 0, "q" : 0, "r" : 0, "s" : 3, "t" : 3, "u" : 0, "v" : 0, "w" : 0, "x" : 0, "y" : 0, "z" : 0}
#NoOfChar = {1 : {"o" : 1, "n" : 1, "e" : 1}, 2 : {"t" : 1, "w" : 1, "o" : 1}, 3 : {"t" : 1, "h" : 1, "r" : 1, "e" : 2}, 4 : {"f" : 1, "o" : 1, "u" : 1, "r" : 1}, 5 : {"f" : 1, "i" : 1, "v" : 1, "e" : 1}}
ans = []
addition = {"n" : {6 : 7, 7 : 9},"e" : {},"t","w","h","r","f","u","o","i","v","s","x","g"}
if len(char) > 1:
	dic["a"] += 1
	dic["n"] += 1
	dic["d"] += 1
for c in char:
	dic[c] += 1
	if dic[c] > 1:
		dic["s"] += 1
	num = words[dic[c]]
	for i in num:
		dic[i] += 1
for c in char:
	res += words[dic[c]] + " " + c + "'s "
	ans.append(res)
for c in char:
	if c in addition:

print(ans)