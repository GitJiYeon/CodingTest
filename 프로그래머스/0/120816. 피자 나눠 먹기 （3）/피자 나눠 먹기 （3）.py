def solution(slice, n):
    fan = n // slice
    namugi = n % slice
    
    
    if namugi > 0 :
        return fan + 1
    else: 
        return fan