def solution(price):
    if 500000 <= price :
        return int(price * 0.8)
        
    elif 300000 <= price and price < 500000 :
        return int(price * 0.9)
        
    elif 100000 <= price and price < 300000 :
        return int(price * 0.95)
        
    else:
        return price;
        