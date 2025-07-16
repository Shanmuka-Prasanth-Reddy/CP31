t=int(input())
for _ in range(t):
    s=int(input())
    l,r=0,0
    res=0
    for i in range(1,51):
        if s%i==0:
            res+=1
        else:
            break
    print(res)