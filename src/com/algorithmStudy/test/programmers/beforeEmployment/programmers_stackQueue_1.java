package com.algorithmStudy.test.programmers.beforeEmployment;


import java.util.*;

public class programmers_stackQueue_1 {
    //기능 개발
    /*
    입출력 예 #1
    첫 번째 기능은 93% 완료되어 있고 하루에 1%씩 작업이 가능하므로 7일간 작업 후 배포가 가능합니다.
    두 번째 기능은 30%가 완료되어 있고 하루에 30%씩 작업이 가능하므로 3일간 작업 후 배포가 가능합니다. -> 하지만 이전 첫 번째 기능이 아직 완성된 상태가 아니기 때문에 첫 번째 기능이 배포되는 7일째 배포됩니다.
    세 번째 기능은 55%가 완료되어 있고 하루에 5%씩 작업이 가능하므로 9일간 작업 후 배포가 가능합니다.
    따라서 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됩니다.
    */

    /*
    입출력 예 #2
    모든 기능이 하루에 1%씩 작업이 가능하므로, 작업이 끝나기까지 남은 일수는 각각 5일, 10일, 1일, 1일, 20일, 1일입니다.
    -> 어떤 기능이 먼저 완성되었더라도 앞에 있는 모든 기능이 완성되지 않으면 배포가 불가능합니다.
    따라서 5일째에 1개의 기능, 10일째에 3개의 기능, 20일째에 2개의 기능이 배포됩니다.
    */

    static class Solution {

        public int[] solution(int[] progresses, int[] speeds) {
            Queue<Integer> dueDate = new LinkedList<>();
            List<Integer> resultList = new ArrayList<>();

            for (int i = 0; i < progresses.length; i++) {
                //ceil을 사용하여 올림하기 위해 double형으로 변환 올림한 후 객체에 할당할 때 에는 int 형으로 변환 후
                //Queue에 하나씩 할당해준다.
                dueDate.add((int) Math.ceil((double) (100 - progresses[i]) / speeds[i]));
            }

            //큐에 가장 처음 할당된 값을 가져와 첫번째 기능 기준점으로 잡는다.
            int frontFunction = dueDate.poll();
            int count = 1;

            //큐의 모든 값을 꺼낼 떄 까지 반복한다.
            while (!dueDate.isEmpty()) {
                //peek() 큐에서 다음에 꺼낼 값을 확인한다.
                //비교 대상 기능의 완성기간이 다음 기능의 완성일보다 적은 기간이면 첫번쨰 기능은 완성되자마자 배포 가능을 의미
                //배포기간을 의미하는 count를 리스트에 할당하고 count를 초기화 , 비교 기준을 바꿔준다.
                if (frontFunction < dueDate.peek()) {
                    resultList.add(count);
                    count = 1;
                    frontFunction = dueDate.poll();
                } else {
                    //위의 조건이 false이면 앞의 기능 완성일이 뒤의 기능 완성일보다 큰 기간임을 의미 배포기간++ 기준점이되는 기능을 꺼내서 없앤다.
                    //-> 다음 기능과 비교하기 위함 프론트 : 7 , 다음 : 3 , 다다음 : 4 , 다다다음 : 9
                    //count ++ 후 3을 없애고 7과 4비교 count ++ 후 4를 없애고 7과 9비교
                    //배포기간을 의미하는 count를 리스트에 할당한다.
                    count++;
                    dueDate.poll();
                }
            }
            //isEmpty 조건에 걸려 마지막 count는 할당되지 않는다. -> dueDate.poll();로 마지막 인스턴스를 꺼내오는 순간 while문이 종료
            resultList.add(count);
            int[] answer = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                answer[i] = resultList.get(i);
            }

            return answer;
        }

        public static void main(String[] args) {

            int[] progresses = {95, 90, 99, 99, 80, 99};

            int[] speeds = {1, 1, 1, 1, 1, 1};
            Solution solution = new Solution();

            System.out.println("solution = " + Arrays.toString(solution.solution(progresses, speeds)));
        }
    }


    // 재귀와 2중 for문을 사용해서 해결해보려한 첫번째 알고리즘이다.
    // 재귀 알고리즘을 배워 활용해보고 싶었던 욕심에 간단한 문제를 어렵게 실패풀려다 실패했다..
    static class FailSolution {
        int[] progresses;
        int[] speeds;
        int count = 0;

        ArrayList<Integer> result = new ArrayList<>();

        ArrayList<Integer> dfs(int idx, int sum) {
            //파라미터인 sum이 100보다 크면 idx를 ++해 각 배열의 다음 요소를 인덱스할 수 있게한다.
            if (sum + progresses[idx] >= 100) {
                result.add(count);
                idx += 1;
                count = 0;
                sum = 0;
            }

            count += 1;

            //idx가 배열의 크기 -1이면 모든 배열을 탐색함을 의미 재귀를 종료한다.
            if (idx == progresses.length - 1) return result;

            dfs(idx, sum + speeds[idx]);

            return result;
        }

        public int[] failSolution(int[] progresses, int[] speeds) {
            int count = 1;
            this.progresses = progresses;
            this.speeds = speeds;
            ArrayList<Integer> resultArrayList = new ArrayList<>();
            ArrayList<Integer> dfs = dfs(0, 0);
            for (int i = 0; i < dfs.size(); ) {
                for (int x = 1; x <= dfs.size() - 1; x++) {
                    System.out.println("dfs.get(i) =" + dfs.get(i));
                    if (dfs.get(i) <= dfs.get(x)) {
                        System.out.println("dfs.get(i) =" + dfs.get(i));
                        System.out.println("dfs.get(x) =" + dfs.get(x));
                        resultArrayList.add(count);
                        count = 1;
                    } else if (dfs.get(i) >= dfs.get(x)) count++;

                    i++;

                    if (i >= dfs.size()) break;
                }
            }

            int[] answer = new int[resultArrayList.size()];

            for (int i = 0; i < resultArrayList.size(); i++) {
                answer[i] = resultArrayList.get(i);
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        //{95, 90, 99, 99, 80, 99};
        //{93, 30, 55};
        int[] progresses = {95, 90, 99, 99, 80, 99};
        //{1, 1, 1, 1, 1, 1}
        //{1, 30, 5}
        int[] speeds = {1, 1, 1, 1, 1, 1};
        FailSolution failSolution = new FailSolution();

        System.out.println("solution = " + Arrays.toString(failSolution.failSolution(progresses, speeds)));
    }
}
