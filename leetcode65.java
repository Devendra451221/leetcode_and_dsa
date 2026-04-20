
class Listnode {
    int dta;
    Listnode nxt;

    Listnode(int dta) {
        this.dta = dta;
    }

    Listnode(int dta, Listnode nxt) {
        this.dta = dta;
        this.nxt = nxt;
    }

    Listnode() {
        super();
    }
}

public class leetcode65 {

    public static Listnode reverse(Listnode head) {
        Listnode p = head;
        Listnode pre = null;
        Listnode t = null;
        while (p != null) {
            t = p.nxt;
            p.nxt = pre;
            pre = p;
            p = t;
        }

        return pre;
    }

    Listnode doubleTheList(Listnode l) {
        Listnode p = reverse(l);

        Listnode d = new Listnode(-1);
        Listnode ans = d;

        int sum = 0;
        int carry = 0;
        while (p != null) {
            int n = p.dta;

            carry = sum / 10;
            sum = n + n + carry;
            int digit = sum % 10;

            Listnode t = new Listnode(digit);
            d.nxt = t;
            d = t;

            p = p.nxt;
        }
        if(carry>0)
        {
            Listnode t = new Listnode(carry);
            d.nxt = t;
            d = t;
        }
        ans=reverse(ans.nxt);
        return ans;
    }

    public static void main(String[] args) {
        Listnode l1 = new Listnode(4);
        Listnode l11 = new Listnode(3);
        Listnode l12 = new Listnode(1);
        Listnode l13 = new Listnode(9);

        l1.nxt = l11;
        l11.nxt = l12;
        l12.nxt = l13;
        l13.nxt = null;

        leetcode65 obj = new leetcode65();
        Listnode ans = obj.doubleTheList(l1);
        while (ans != null) {
            System.out.print(ans.dta + " ");
            ans = ans.nxt;
        }

    }
}
