package com.zipcodewilmington.looplabs;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] intArray = Arrays.stream(this.array)
                .filter(num -> Collections.frequency(Arrays.asList(this.array), num) < maxNumberOfDuplications)
                .toArray(Integer[]:: new);
        return intArray;

    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] intArray = Arrays.stream(this.array)
                .filter(num -> Collections.frequency(Arrays.asList(this.array), num) != exactNumberOfDuplications)
                .toArray(Integer[]:: new);
        return intArray;
    }
}
