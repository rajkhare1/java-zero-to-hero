package com.rajkhare.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class ImmutableListDemo {

    private static Logger logger = Logger.getLogger(ImmutableListDemo.class.getName());

    public static void main(String[] args) {
        List<Integer> accountNumbers = new ArrayList<>();
        accountNumbers.add(325454);
        accountNumbers.add(325455);
        accountNumbers.add(325456);
        accountNumbers = Collections.unmodifiableList(accountNumbers);
        List<Integer> immutableAccountNumbers = List.of(325454, 325455, 325456);
        var arrayListObject = new ArrayList<Integer>(immutableAccountNumbers);// arrayListObject will not be immutable
        addTenDollars(immutableAccountNumbers);
    }

    private static List<Integer> addTenDollars(List<Integer> accountNumbers) {
        accountNumbers.add(545634);
        for(Integer account :  accountNumbers) {
            logger.info("Ten Dollars credited into the account: "+account);
        }
        return accountNumbers;
    }

}
