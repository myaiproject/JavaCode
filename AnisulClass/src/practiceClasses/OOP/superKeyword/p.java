package practiceClasses.OOP.superKeyword;

// parent class called parent/super/base

 class Parent {
    String s = "নিজের এক বিঘাs";  // Instance variable
}

class C extends Parent{  // Consistent class name
    String s = "বাবার এক বিঘা জমি";// Instance variable

//child class called child/sub/derived class
    void m1() {
        System.out.println(s); // Prints the subclass's variable
         /*বাবা-মার কোন সিদ্ধান্ত ছেলে-মেয়েদের
         অনুমতি ছাড়া প্রাধান্য পাবে না। এজন্যই সন্তানের বেশিষ্ট্য প্রাধান্য পেয়ে  out put hobe নিজের এক বিঘা*/


        System.out.println(super.s);  // Prints the super class's variable
        /* remove comment before System.out.println(super.s); and run . প্রিয়তমা Super এর অর্থ বুঝতে সমস্যা হলে আপনি বললেন
        Super keyword  দ্বারা বাবা-র থেকে পাওয়া অংশ বুঝিয়েছি
         */
    }
}
class Demo {
    public static void main(String[] args) {
        C c = new C();
        c.m1();  // Calling the m1 method
    }
}
