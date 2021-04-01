package com.tcodes;

import com.tcodes.errors.ErrorOne;
import com.tcodes.errors.ErrorThree;
import com.tcodes.errors.ErrorTwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter one/two/three or null");
        String type = new Scanner(System.in).next();
        try {
            throwErrors(type);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("Done");
        }
    }

    public static void throwErrors(String errType) throws Exception {
        if(errType.equals("one"))
            throw new ErrorOne(errType);
        if(errType.equals("two"))
            throw new ErrorTwo(errType);
        if(errType.equals("three"))
            throw new ErrorThree(errType);
        if(errType.equals("null"))
            throw new NullPointerException(errType);
    }
}
