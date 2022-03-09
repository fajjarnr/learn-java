package programmer.data;

class SocialMedia {
    String name;
}

/**
 * final
 * tidak bisa di turunkan
 */
class Facebook extends SocialMedia{
    /**
     * final method
     * tidak bisa di overide di child
     */
    final void login(String username, String password){

    }
}

//class FakeFacebook extends Facebook{
//    void login(String username, String password){}
//}