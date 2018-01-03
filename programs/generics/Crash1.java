public class Crash1 {
    class C<P> implements List<List<? super C<C<P>>>> {}
    public void crash() {
        C<Byte> amIASubtype = null;
        //IDE blowing assignment
        List<? super C<Byte>> superType = amIASubtype;
    }
}

interface List<X> { }
