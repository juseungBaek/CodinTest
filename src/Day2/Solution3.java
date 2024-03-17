package Day2;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
/*
 * 어떤 게임에는 붕대 감기라는 기술이 있습니다.

붕대 감기는 t초 동안 붕대를 감으면서 1초마다 x만큼의 체력을 회복합니다.
 t초 연속으로 붕대를 감는 데 성공한다면 y만큼의 체력을 추가로 회복합니다.
  게임 캐릭터에는 최대 체력이 존재해 현재 체력이 최대 체력보다 커지는 것은 불가능합니다.

기술을 쓰는 도중 몬스터에게 공격을 당하면 기술이 취소되고, 공격을 당하는 순간에는 체력을 회복할 수 없습니다.
 몬스터에게 공격당해 기술이 취소당하거나 기술이 끝나면 그 즉시 붕대 감기를 다시 사용하며, 연속 성공 시간이 0으로 초기화됩니다.

몬스터의 공격을 받으면 정해진 피해량만큼 현재 체력이 줄어듭니다. 
이때, 현재 체력이 0 이하가 되면 캐릭터가 죽으며 더 이상 체력을 회복할 수 없습니다.

당신은 붕대감기 기술의 정보, 캐릭터가 가진 최대 체력과 몬스터의 공격 패턴이 주어질 때 캐릭터가 끝까지 생존할 수 있는지 궁금합니다.

붕대 감기 기술의 시전 시간, 1초당 회복량, 추가 회복량을 담은 1차원 정수 배열 bandage와 최대 체력을 의미하는 정수 health, 
몬스터의 공격 시간과 피해량을 담은 2차원 정수 배열 attacks가 매개변수로 주어집니다. 
모든 공격이 끝난 직후 남은 체력을 return 하도록 solution 함수를 완성해 주세요. 
만약 몬스터의 공격을 받고 캐릭터의 체력이 0 이하가 되어 죽는다면 -1을 return 해주세요.
 */
	 public int solution(int[] bandage, int health, int[][] attacks) {
		    Map<Integer, Integer> attackInfo = new HashMap<>(); // 붕대 정보 담을 map 생성
		    int endTime = 0;	// 마지막 공격시간 
		    int curHealth = 0;	// 실시간 체력 
		    int successiveTime = 0;	// 체력회복 시간
	        curHealth = health;
	        for (int[] attack : attacks) {
	            attackInfo.put(attack[0], attack[1]); // 키값으로 공격시간, value값으로 데미지
	            endTime = attack[0];	// 반복이 다 돌고 마지막에 들어오면 값이 저장되므로 마지막 공격시간
	            
	        }

	        /* 1초부터 마지막 공격 시각까지 체력 정보 초기화 */
	        for (int i = 1; i <= endTime; i++) {
	            if (attackInfo.containsKey(i)) { // map의 키값에 반복되고 있는 숫자가 같다면 공격되는 시간
	                curHealth -= attackInfo.get(i);  // 현재체력에서 공격되는 시간의 데미지를 뺀 체력
	                successiveTime = 0;			// 공격을 받으면 체력회복시간 초기화
	            } else { 
	                curHealth += bandage[1];   // 공격이 없기때문에 현재 체력 + 붕대 초당 체력회복 값 추가
	                successiveTime++;			// 체력회복 시간

	                if (successiveTime == bandage[0]) {		// 체력회복 시간과 정해놓은 체력회복시간이 같으면
	                    curHealth += bandage[2];		// 현재 체력 + 추가 체력
	                    successiveTime = 0;			// 다시 체력회복시간 초기화
	                }
	                if (curHealth > health) {	// 현재체력이 정해놓은 체력보다 많으면
	                    curHealth = health;		// 현재체력은 정해놓은 체력으로 
	                }
	            }

	            if (curHealth <= 0) { // 이번 턴을 마치고 체력이 바닥났다면 종료
	                return -1;
	            }
	        }

	        return curHealth;
	    }
	}
