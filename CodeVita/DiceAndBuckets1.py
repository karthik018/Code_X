dic = {23: 115, 30: 270, 31: 124, 25: 50, 35: 210, 40: 40, 32: 160, 33: 264, 27: 108, 37: 111, 38: 152, 19: 38, 36: 216, 26: 104, 20: 60, 14: 14, 29: 116, 34: 170, 18: 36, 16: 16, 22: 66, 41: 82, 47: 47, 28: 168, 39: 156, 13: 13, 45: 45, 44: 44, 24: 24, 12: 12}
m = int(input())
capacityConsumed = 0
overflown = 0
total = 49 * m
for i in dic:
	if dic[i] > m:
		capacityConsumed += m
		overflown += dic[i] - m
	else:
		capacityConsumed += dic[i]
print(capacityConsumed)
print(overflown)
print(total - capacityConsumed)