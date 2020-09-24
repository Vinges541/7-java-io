package com.example.task02;

import java.io.*;

public class Task02Main {

    public static void main(String[] args) throws IOException {
        while (System.in.available() > 0) {
            int byteFromIn = System.in.read();
            System.in.mark(1);
            int nextByteFromIn = System.in.read();
            if (!(byteFromIn == '\r' && nextByteFromIn == '\n')) {
                System.out.write(byteFromIn);
            }
            System.in.reset();
        }
        System.out.flush();
    }
}
