package com.stackroute.PE3;


    public class ThrowException
    {
        ThrowException(String msg)
        {
            msg = "this Message is bounded to execute";
            System.out.println(msg);
        }

        public static void main(String[] args) throws Exception {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Inside final block");
            }

        }
    }

