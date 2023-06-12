package lab12.Triple;

public class Triple<T extends Comparable<T>, S extends Comparable<S>, U extends Comparable<U>>
        implements Comparable<Triple<T, S, U>> {

    private T first;
    private S second;
    private U third;

    public Triple(T firstElement, S secondElement, U thirdElement) {
        first = firstElement;
        second = secondElement;
        third =  thirdElement;
    }

    public T getFirst() { return first; }
    public S getSecond() { return second; }
    public U getThird() { return third; }


    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    // CODING ASSIGNMENT #12.1  COMPARETO

    @Override
    public int compareTo(Triple<T, S, U> other) {

        if(this.getFirst().compareTo(other.getFirst())==0){
            if(this.getSecond().compareTo(other.getSecond())==0){
                return this.getThird().compareTo(other.getThird());
            }
            else{
                return this.getSecond().compareTo(other.getSecond());
            }
        }
        else{
            return this.getFirst().compareTo(other.getFirst());
        }

//		if (this.getFirst().compareTo(other.getFirst()) == 0){
//            if (this.getSecond().compareTo(other.getSecond()) == 0){
//                if(this.getThird().compareTo(other.getThird()) == 0){
//                    return 0;
//                }
//                else {
//                    if (this.getThird().compareTo(other.getThird()) > 0){
//                        return 1;
//                    }
//                    else{
//                        return -1;
//                    }
//                }
//            }
//            else{
//                if (this.getSecond().compareTo(other.getSecond()) > 0){
//                    return 1;
//                }
//                else{
//                    return -1;
//                }
//            }
//
//        }
//
//        else{
//            if (this.getFirst().compareTo(other.getFirst()) > 0){
//                return 1;
//            }
//            else {
//                return -1;
//            }
//        }


    }

}