package com.heejong.algorithm_test;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class MainActivity {

    class Solution {


        //===============================================================
        //  https://leetcode.com/problems/relative-sort-array/
        //1122. Relative Sort Array

        //PASSED


        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            int[] answer = new int[arr1.length];
            int[] answerinsert = new int[arr1.length ];

            boolean binsert=false;
            int intsertCount = 0;
            int footerintsertCount=0;

            for(int i = 0 ; i < arr2.length; i++){
                for(int j = 0 ; j < arr1.length; j++){
                    if(arr2[i] == arr1[j]){
                        answerinsert[intsertCount]= arr1[j];
                        intsertCount++;
                    }
                }

            }

            //intsertCount 넣은 만큼은 뻬고 나머지 사이즈 생성

            int[] hooter = new int[arr1.length - intsertCount];
            for(int j = 0 ; j < arr1.length; j++){
                for(int i = 0 ; i < answerinsert.length; i++){
                    if(answerinsert[i] == arr1[j]){
                        binsert = true;
                    }
                }
                if(!binsert){
                    hooter[footerintsertCount] = arr1[j];
                    footerintsertCount++;
                }
                binsert=false;
            }
            //나머지만 소팅
            Arrays.sort(hooter);

            System.arraycopy( answerinsert , 0 , answer, 0 , answerinsert.length);
            System.arraycopy( hooter , 0 , answer, intsertCount , hooter.length);

            return answer;

        }


        //===============================================================
        //https://programmers.co.kr/learn/courses/30/lessons/42748
        //K번째수

        //PASS
        /*
        public int[] solution(int[] array, int[][] commands) {
            int[] answer =  new int[commands.length];

            for(int count=0; count<commands.length; count++){


                int i,j,k;

                i = commands[count][0] -1 ;
                j = commands[count][1];
                k = commands[count][2]-1;


                int [] cmd = Arrays.copyOfRange(array, i, j);
                Arrays.sort(cmd);
                answer[count] = cmd[k];

            }
            return answer;
        }
        */



        //위장 https://programmers.co.kr/learn/courses/30/lessons/42578

        //key는 중복이 될수 없고, value는 중복가능하므로 value에 아이템 분류키를 담는다
//        public int solution(String[][] clothes) {
//            int answer = 0;
//            HashMap<String,String> numbers = new HashMap <String, String>(  );
//            for(int i=0; i<clothes.length; i++){
//
//            }
//
//            return answer;
//        }
        /*
        //전화번호 목록 :: https://programmers.co.kr/learn/courses/30/lessons/42577
        public boolean solution(String[] phone_book) {
            boolean answer = true;
            HashMap<String,String> numbers = new HashMap <String, String>(  );
            if(phone_book.length > 0){
                for(int i=0; i < phone_book.length; i++){
                    if(i==0) {
                        numbers.put( "key" + i , phone_book[i] );
                    }else{
                        for(String compare:numbers.values()){
                            if(compare.startsWith(  phone_book[i])){
                                return false;
                            }else if(phone_book[i].startsWith(  compare)){
                                return false;
                            }
                        }
                        numbers.put( "key" + i , phone_book[i]);


                    }
                }
            }
            return answer;
        }
    */


        /*
        // 완주 못한 선수 :: https://programmers.co.kr/learn/courses/30/lessons/42576
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            Map<String, Integer> names = new HashMap<String, Integer>();
            Integer a = 0;
            for (String i : participant) {
                a = names.put(i, 1);
                if (a != null) {
                    names.put(i, ++a);
                }
            }

            for (String j : completion) {
                if (names.get(j) != 1) {
                    names.put(j, (names.get(j) - 1));
                } else {
                    names.remove(j);
                }
            }

            answer = names.keySet().iterator().next();
            return answer;
        }
    */
    }
}
