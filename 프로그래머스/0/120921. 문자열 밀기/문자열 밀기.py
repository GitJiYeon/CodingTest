def solution(A, B):
    answer = 0
    queue = list(A);
    for i in range(len(A)):
        if "".join(queue) == B:
            return answer
        queue.insert(0, queue.pop())
        answer+=1
    return -1