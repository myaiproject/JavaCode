package Encapsulation100code.accessModifiers.AccessingStaticProtectedMembers;


class Child extends Parent {
    public void showProtectedStaticVar(){
        System.out.println("Protected Static Variable: " + protectedStaticVar);
    }
}
