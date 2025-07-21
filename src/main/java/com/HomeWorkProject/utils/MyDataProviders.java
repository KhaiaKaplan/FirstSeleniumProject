package com.HomeWorkProject.utils;

import com.HomeWorkProject.models.User;
import org.testng.annotations.DataProvider;

import java.io.*;
import java.util.*;

public class MyDataProviders {

    @DataProvider
    public Iterator<Object[]> addUserFromCsv() throws IOException {
        List<Object[]> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(new File("src/test/resources/pass.csv")));

        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{new User()
                    .setGender(split[0])
                    .setFirstName(split[1])
                    .setLastName(split[2])
                    .setEmail(split[3])
                    .setPassword(split[4])
                    .setConfirmPassword(split[5])
            });
            line = reader.readLine();
        }
        return list.iterator();
    }

}
