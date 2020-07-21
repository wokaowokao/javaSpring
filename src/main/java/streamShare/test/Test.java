package streamShare.test;

/**
 * @author zhangyawei Created on 2020/7/10.
 */
public class Test {
    public static void main(String[] args) {
        /**
         *      *                        DISTINCT  SORTED  ORDERED  SIZED  SHORT_CIRCUIT
         *      *          SPLITERATOR      01       01       01      01        00
         *      *               STREAM      01       01       01      01        00
         *      *                   OP      11       11       11      10        01
         *      *          TERMINAL_OP      00       00       10      00        01
         *      * UPSTREAM_TERMINAL_OP      00       00       10      00        00

         */

        //StreamOpFlag.DISTINCT
        //DISTINCT(0,
        //            set(StreamOpFlag.Type.SPLITERATOR).set(StreamOpFlag.Type.STREAM).setAndClear(StreamOpFlag.Type.OP))
        //int 0
        //mask:
        // SPLITERATOR set
        // STREAM set
        // OP setAndClear

        //NOT_DISTINCT  -> clear ->position  DISTINCT:position:0  0
        //NOT_SORTED  -> clear ->position  DISTINCT:position:1    10<<1


          //position *= 2;
    }
   static void  wokao(int i){
        System.out.println(Integer.toBinaryString(i));

    }
}
