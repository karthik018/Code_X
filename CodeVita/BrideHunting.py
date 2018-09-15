import sys
def isValid(n,m,x,y):
	if x == 0  and y == 0:
		return False
	if 0 <= x < n and 0 <= y < m:
		return True
	return False
n,m = map(int,input().split())
houses = []
for i in range(n):
	row = list(map(int,input().split()))
	houses.append(row)
qualities = []
for i in range(n):
	qualities.append([0]*m)
maximum = []
max1 = 1
for i in range(n):
	for j in range(m):
		if i == 0 and j == 0:
			pass
		count = 0
		if houses[i][j] > 0:
			if(isValid(n,m,i-1,j-1)):
				if houses[i-1][j-1] > 0:
					count += 1
			if(isValid(n,m,i,j-1)):
				if houses[i][j-1] > 0:
					count += 1
			if(isValid(n,m,i+1,j-1)):
				if houses[i+1][j-1] > 0:
					count += 1
			if(isValid(n,m,i-1,j)):
				if houses[i-1][j] > 0:
					count += 1
			if(isValid(n,m,i+1,j)):
				if houses[i+1][j] > 0:
					count += 1
			if(isValid(n,m,i-1,j+1)):
				if houses[i-1][j+1] > 0:
					count += 1
			if(isValid(n,m,i,j+1)):
				if houses[i][j+1] > 0:
					count += 1
			if(isValid(n,m,i+1,j+1)):
				if houses[i+1][j+1] > 0:
					count += 1
			qualities[i][j] = count
			if max1 < count:
				max1 = count
				maximum = []
				maximum.append((i,j))
			elif max1 == count:
				maximum.append((i,j))
l = len(maximum) 
print(l)
if l == 0:
	print("No suitable girl found")
else:
	distance = [0]*l
	Dist = []	
	min1 = sys.maxsize
	for i in range(l):
		distance[i] = max(maximum[i][0],maximum[i][1])
		if distance[i] < min1:
			min1 = distance[i]
			Dist = []
			Dist.append(maximum[i])
		elif distance[i] == min1:
			Dist.append(maximum[i])
	if len(Dist) > 1:
		print("Polygamy not allowed")
	else:
		x = Dist[0][0]
		y = Dist[0][1]
		print(x+1,y+1,qualities[x][y],sep=":")