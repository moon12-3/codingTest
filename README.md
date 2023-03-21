# codingTest
## ✨목표 : 1일 1코딩
- 1일차 - 완주하지 못한 선수(https://programmers.co.kr/learn/courses/30/lessons/42576?language=javascript)
- 2일차 - key와 value값 변경
- 3일차 - 없는 숫자 더하기(https://programmers.co.kr/learn/courses/30/lessons/86051)
- 4일차 - 내적(https://programmers.co.kr/learn/courses/30/lessons/70128/solution_groups?language=javascript)
- 5일차 - 약수의 개수와 덧셈(https://programmers.co.kr/learn/courses/30/lessons/77884/solution_groups?language=kotlin)
- 6일차 - 음양 더하기(https://programmers.co.kr/learn/courses/30/lessons/76501)
- 7일차 - 모의고사(https://programmers.co.kr/learn/courses/30/lessons/42840)
- 8일차 - k번째 수(https://programmers.co.kr/learn/courses/30/lessons/42748) // map함수를 사용하면 더 간략화 할 수 있음
- 9일차 - 2016(https://programmers.co.kr/learn/courses/30/lessons/12901)
- 10일차 - 이상한 문자 만들기(https://programmers.co.kr/learn/courses/30/lessons/12930)
- 11일차 - 가운데 글자 가져오기(https://school.programmers.co.kr/learn/courses/30/lessons/12903)
- 12일차 - 같은 숫자는 싫어(https://school.programmers.co.kr/learn/courses/30/lessons/12906) // return arr.filter((val,index) => val != arr[index+1]); 한 문장으로도 끝날 수 있었던 문제. JS의 특성을 굉장히 잘 이용한 것 같다!
- 13일차 - 두 정수 사이의 합(https://school.programmers.co.kr/learn/courses/30/lessons/12912)  // 가우스 공식을 쓰면 한 줄로도 풀이가 가능하다. return (a+b)*(Math.abs(a-b))/2; 수학공식을 잘 기억해두자
- 14일차 - 최소 직사각형(https://school.programmers.co.kr/learn/courses/30/lessons/86491?language=javascript) // 오래 고민을 했는데... 그냥 가장 큰 값을 왼쪽에, 가장 작은 값을 오른쪽에 두고 찾으면 되는 거였다.
         <br>&nbsp;&nbsp;&nbsp;&nbsp;- 예산(https://school.programmers.co.kr/learn/courses/30/lessons/12982)
- 15일차 - 나누어 떨어지는 숫자 배열(https://school.programmers.co.kr/learn/courses/30/lessons/12910)  // filter함수를 사용했다. 함수를 능숙하게 적용할 수 있게 계속 적용할 수 있는 케이스를 찾아봐야겠다.
- 16일차 - 8일차에 js로 풀었던 문제를 java를 통해 해결하였다. java의 Arrays클래스를 이용하여 풀었는데, Arrays.copyOfRange(배열, 시작, 끝)과 Arrays.sort(배열)을 쓰면 간단하게 풀 수 있다.
- 17일차 - 기지국 문제. greedy(탐욕법)을 이용했어야 하는 문제였는데, 처음엔 배열을 통해 기지국의 영향을 받는 곳은 1, 아닌 곳은 0으로 하여 탐색을 했는데 후에는 1번째 공간부터 탐색하며 이미 설치되어 있던 기지국의 영향권이라면 다음으로 넘어가는 식으로 for문 하나만 사용하여 간단하게 해결할 수 있었다.
- 18일차 - 가장 큰 수. 처음에는 버블 정렬을 사용하여 개수가 많을수록 시간복잡도가 무지막지하게 올라가 시간 초과로 풀이에 실패했었다. 따라서 Ramda식을 이용하여 Arrays.sort에서 더 시간이 적게 걸리는 방법으로 정렬하였다.
         - h-index  // h이하의 인용 수 논문들과, h-index값보다 많은 수의 h이상의 논문이 있어야 한다. 내림차순으로 정렬하여 1, 2, 3, 4, 이렇게 쭉 가다가 index값보다 논문의 인용의 수가 작아지는 순간의 index-1를 반환하였다.
         - 예산 // 상한값을 찾기. 가장 큰 값부터 1씩 깎기 시작해서 다음 큰 값과 같아질 때까지 최대 예산 값을 맞추지 못한다면 다음 큰 값도 같이 깎기 시작한다. 하지만 아직은 효율성이 조금 부족해서 개선이 필요하다 ㅠㅠ 중첩 반복문이기 때문에 이를 없앨 방법을 궁리해봐야겠다. 이분탐색 법을 사용하여 풀어보려고 생각 중
- 19일차 - skillTree. 예를 들어 강의를 듣는 순서가 무조건 B -> C-> D여야한다면 ABCE식으로 듣는 것은 가능하지만 CDAE식으로 듣는 것은 불가능해진다. 이 경우 몇 명이 올바른 스킬트리로 강의를 들었는지 구분하는 문제였다. for문을 돌려 예제의 A, E와 같이 별개의 강의인 경우는 아예 고려하지 않고 스킬 트리에 포함되어 있는 강의인 경우에만 cnt 변수를 통해 차근차근 맞는 순서인지 비교하였다.
- 20일차 - 피보나치 수 구하기. 간단하게 풀렸지만 n의 수가 굉장히 큰 경우를 고려하지 못해 처음에 조금 막혔다. 모든 연산에 %1234567을 해주면 괜찮아졌는데, 마지막이 아니라 중간 과정에 해도 결과가 달라지지 않는다는 걸 명심해야겠다. 테스트 코드가 많은 만큼 내 연산의 수가 굉장히 커질 수 있다는 걸 잊지 말자~~~~~~~~~~~~~~
- 21일차 - 제일 작은 수 제거하기. min알고리즘으로 가장 작은 수를 구하고 해당 수만을 제외한 배열을 return하였다. 
- 22일차 - 콜라츠 추측(JAVA) - 짝수면 나누기 2, 홀수면 곱하기 3 + 1 작업을 몇 번 반복해야 1이 나오는지 구하는 문제. 500번을 넘어갈 경우에는 -1을 리턴해야 하는데 오류가 발생했다. 찾아보니 int로는 계산된 수를 전부 담을 수 없었기 때문. 이런 경우가 많았기 때문에 long 형으로 바꾸는 것으로 간단하게 해결할 수 있었다.
- 같은 숫자는 싫어(JAVA) - JS로 할때는 굉장히 짧았던 게 이번에는 꽤 길어졌다. HashMap 써보려다가 알고보니 중복을 전부 제거하라는 게 아니었어서 시간만 날렸다. 문제를 잘 읽어야 하는 이유... 들어간 값이랑 현재 값이랑 비교하는 방법을 사용하였다.
- 23일차 - 기능개발(JAVA) - ArrayList를 이용해서 풀었다. 진행도에 따라 얼만큼의 날짜가 걸리는지 배열로 구하고, 1일차에 걸리는 작업시간보다 더 오랜 작업시간이 걸리는 일 전까지의 수를 더하고, 1일차 작업보다 더 오래걸리는 작업부터 다시 해당 작업보다 더 오랜 작업시간이 걸리는 일 전까지의 수를 더한다. 이런 식으로 구한 수들을 array로 바꾸어 전달했다. 
