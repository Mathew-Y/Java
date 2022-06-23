public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode head = null;

        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode oneJump = head;
        ListNode twoJumps = head;

        while(oneJump.next != null && twoJumps.next != null && twoJumps.next.next != null) {
            oneJump = oneJump.next;
            twoJumps = twoJumps.next.next;

            if(oneJump == twoJumps) {
                return true;
            }
        }
        return false;

        
    }
}
