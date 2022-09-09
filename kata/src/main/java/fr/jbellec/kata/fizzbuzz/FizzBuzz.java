package fr.jbellec.kata.fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzz {

    public String kata(final int start, final int end) {
        StringBuilder result = new StringBuilder(valueOf(start));
        int index = start;
        while (index < end) {
            index++;
            String value = applyRuleFor3(index) + applyRuleFor5(index);

            if ("".equals(value)) {
                value = valueOf(index);
            }
            result.append(" ").append(value);
        }
        return result.toString();
    }

    private static String applyRuleFor3(int index) {
        return applyRule(index, 3);
    }

    private static String applyRuleFor5(int index) {
        return applyRule(index, 5);
    }

    private static String applyRule(int index, int ruleNumber) {
        String value = "";
        String label = ruleNumber == 5 ? "Buzz" : "Fizz";
        if (index % ruleNumber == 0) {
            value = label;
        }
        if (valueOf(index).contains(valueOf(ruleNumber))) {
            value = value + label;
        }
        return value;
    }
}
