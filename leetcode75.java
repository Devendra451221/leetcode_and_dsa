// Given 1st and last node will always be 0

public class leetcode75 {
    Listnode removeZeroAndAdd(Listnode l) {

        Listnode d = new Listnode(-1);
        Listnode ans = d;

        int sum = 0;
        l = l.nxt;
        while (l != null) {
            if (l.dta != 0) {
                sum += l.dta;
            } else {

                Listnode newnode = new Listnode(sum);
                d.nxt = newnode;
                d = newnode;
                sum = 0;
            }
            l = l.nxt;
        }
        return ans.nxt;

    }

    public static void main(String[] args) {
        Listnode l1 = new Listnode(0);
        Listnode l11 = new Listnode(2);
        Listnode l12 = new Listnode(3);
        Listnode l13 = new Listnode(0);
        Listnode l14 = new Listnode(6);
        Listnode l15 = new Listnode(3);
        Listnode l16 = new Listnode(0);

        l1.nxt = l11;
        l11.nxt = l12;
        l12.nxt = l13;
        l13.nxt = l14;
        l14.nxt = l15;
        l15.nxt = l16;
        l16.nxt = null;

        leetcode75 obj = new leetcode75();
        Listnode ans = obj.removeZeroAndAdd(l1);
        while (ans != null) {
            System.out.print(ans.dta + " ");
            ans = ans.nxt;
        }

    }
}
