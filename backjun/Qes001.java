package com.company.backjun;

import java.util.HashMap;
import java.util.Map;

public class Qes001 {
    public static int solution(String[] friends, String[] gifts) {
        Map<String, Integer> giftBalance = new HashMap<>(); // 각 친구의 선물 지수 (받은 선물 수 - 준 선물 수)
        Map<String, Map<String, Integer>> giftRecords = new HashMap<>(); // 친구들 간의 선물 교환 기록

        // 초기화
        for (String friend : friends) {
            giftBalance.put(friend, 0);
            giftRecords.put(friend, new HashMap<>());
        }

        // 선물 교환 기록 처리
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];
            
            // 선물 교환 기록 업데이트
            giftRecords.get(giver).merge(receiver, 1, Integer::sum);
            // 선물 지수 업데이트
            giftBalance.put(giver, giftBalance.get(giver) - 1);
            giftBalance.put(receiver, giftBalance.get(receiver) + 1);
        }

        Map<String, Integer> nextMonthGifts = new HashMap<>();
        for (String giver : giftRecords.keySet()) {
            for (String receiver : giftRecords.get(giver).keySet()) {
                int giftsFromGiverToReceiver = giftRecords.get(giver).get(receiver);
                int giftsFromReceiverToGiver = giftRecords.get(receiver).getOrDefault(giver, 0);

                if (giftsFromGiverToReceiver > giftsFromReceiverToGiver) {
                    nextMonthGifts.merge(giver, 1, Integer::sum);
                } else if (giftsFromGiverToReceiver == giftsFromReceiverToGiver) {
                    if (giftBalance.get(giver) > giftBalance.get(receiver)) {
                        nextMonthGifts.merge(giver, 1, Integer::sum);
                    } else if (giftBalance.get(giver) < giftBalance.get(receiver)) {
                        nextMonthGifts.merge(receiver, 1, Integer::sum);
                    }
                }
            }
        }
        System.out.println(nextMonthGifts);

        // 가장 많은 선물을 받게 될 친구의 선물 수를 반환
        return nextMonthGifts.values().stream().max(Integer::compare).orElse(0);
    }

    public static void main(String[] args) {
//        String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
//        String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};

        System.out.println(solution(friends, gifts)); // 예상 결과는 4
    }
}
