def solution(hp):
    generalAnts = hp // 5;
    hp %= 5; 
    soldierAnts = hp // 3;
    hp %= 3;
        
    workerAnts = hp;
        
    return int(generalAnts + soldierAnts + workerAnts)