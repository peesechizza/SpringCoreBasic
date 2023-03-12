package hello.core2.discount;

import hello.core2.member.Grade;
import hello.core2.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    // 등급이 VIP 일 경우 1000원 할인
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
