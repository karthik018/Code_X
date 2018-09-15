s = "".join(input().split()).lower()
s1 = ""
for i in s:
	if 'a' <= i <= 'z' or '0' <= i <= '9':
		s1 += i
s2 = "".join(reversed(s1))
if s1 == s2:
	print("True")
else:
	print("False")