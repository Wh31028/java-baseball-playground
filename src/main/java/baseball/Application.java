package baseball;

import baseball.domain.InputNum;
import baseball.domain.Judgment;
import baseball.domain.Random3Num;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void run(Scanner scanner) {
        int strike = 0;
        Random3Num random3Num = new Random3Num();
        ArrayList<Integer> answer =(ArrayList<Integer>) random3Num.create();
        while (strike !=3) {
            System.out.print("숫자를 입력해주세요 : ");
            int input = scanner.nextInt();
            ArrayList<Integer> inputNum = InputNum.input(input);
            Judgment judgment = new Judgment();
            strike =judgment.judge(answer,inputNum);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flag=1;
        while(flag==1){
            run(scanner);
            System.out.println("게임을 새로 시작하려면 1,종료하려면 2를 입력하세요");
            flag =scanner.nextInt();

        }
    }
}
