def solution(n, arr1, arr2):
    answer = []
    for n1, n2 in zip(arr1, arr2):
        tempStr = ''
        num1 = format(n1, 'b').zfill(n) #  .zfill(n) n자리를 0으로 채움
        num2 = format(n2, 'b').zfill(n)
        
        #아래 4줄을 한번에 작성
        tempStr = ''.join('#' if i != '0' or j != '0' else ' ' for i, j in zip(num1, num2))
        """
        for i, j in zip(num1, num2):
            if i == '0' and j == '0':
                tempStr+=' '
            else:
                tempStr+='#'
        """
        answer.append(tempStr)
        
    return answer