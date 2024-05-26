package com.algorithmStudy.test.programmers.CodeTestBasic.Hash;

import java.util.*;

public class programmers_BestAlbum_04 {
    /*
     * Q
     * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다.
     * 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
         * 1. 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
         * 2. 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
         * 3. 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
     * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때,
     * 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
     */

    /*
     * 제한사항
     * 1. genres[i]는 고유번호가 i인 노래의 장르입니다.
     * 2. plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
     * 3. genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
     * 4. 장르 종류는 100개 미만입니다.
     * 5. 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
     * 6. 모든 장르는 재생된 횟수가 다릅니다.
     */


    static class Solution {

        static class MusicMeta{
            private int idx;
            private String genre;
            private int playing;

            public int getIdx() {
                return idx;
            }

            public String getGenre() {
                return genre;
            }

            public int getPlaying() {
                return playing;
            }

            public MusicMeta(int idx, String genre, int playing) {
                this.idx = idx;
                this.genre = genre;
                this.playing = playing;
            }
        }

        public static int[] solution(String[] genres, int[] plays) {

            List<MusicMeta> genreSortList = new ArrayList<>();

            // 1. 장르 취합 및 장르 우선순위 설정
            for (int i = 0; i < genres.length && i < plays.length; i++){
                genreSortList.add(new MusicMeta(i , genres[i] , plays[i]));
            }


            // 2. Comparator를 사용하여 장르 세부 정보 playing 값에 따라 오름차순 정렬
            Collections.sort(genreSortList, new Comparator<MusicMeta>() {
                @Override
                public int compare(MusicMeta o1, MusicMeta o2) {
                    return Integer.compare(o2.getPlaying() , o1.getPlaying());
                }
            });

            // 3. 장르 순서 정렬 진행
            Map<String , Integer> genreMap = new HashMap<>();

            for (MusicMeta musicMeta : genreSortList) {
                genreMap.put(musicMeta.getGenre(), genreMap.getOrDefault(musicMeta.getGenre() , 0 ) + musicMeta.getPlaying());
            }
            List<String> genreKeySortList = new ArrayList<>(genreMap.keySet());
            Collections.sort(genreKeySortList , (genre1 , genre2) -> Integer.compare(genreMap.get(genre2) , genreMap.get(genre1)));

            // 장르별 수록곡 찾기
            // 순위대로 장르의 인덱스를 맵에 넣는다.
            // 맵은 key -> 장르 , value -> {인덱스1 , 인덱스2}
            Map<String , List<Integer> > albumMap = new HashMap<>();
            for (String genre : genreKeySortList) {
                List<Integer> targetIndexList = new ArrayList<>();
                for (MusicMeta musicMeta : genreSortList) {
                    if (genre.equals(musicMeta.getGenre())){
                        targetIndexList.add(musicMeta.getIdx());
                        albumMap.put(genre , targetIndexList);
                        if (targetIndexList.size() == 2){
                            break;
                        }
                    }
                }
            }
            ArrayList<Integer> resultArr = new ArrayList<>();
            // 최종 취합
            for (String genre : genreKeySortList) {
                List<Integer> musicIdx = albumMap.get(genre);
                for (Integer idx : musicIdx) {
                    resultArr.add(idx);
                }
            }
            int[] answer = new int[resultArr.size()];

            for (int i = 0; i < resultArr.size(); i++) {
                answer[i] = resultArr.get(i);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        int[] answer = Solution.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});

        System.out.println("answer = " + answer.toString()); // Expect [4, 1, 3, 0]
    }
}
