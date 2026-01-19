from collections import defaultdict
import sys
input = sys.stdin.readline

N = int(input())
nums = []
for _ in range(N):
    nums.append(int(input()))
nums.sort()
#산술평균
print( round(sum(nums) / N) )

#중앙값
print( nums[len(nums) // 2] )

# 최빈값
cnt = defaultdict(int)

for n in nums:
    cnt[n] += 1

mx = max(cnt.values())
modes = [k for k, v in cnt.items() if v == mx]
modes.sort()

print(modes[1] if len(modes) > 1 else modes[0])

#범위
print( max(nums) - min(nums) )

