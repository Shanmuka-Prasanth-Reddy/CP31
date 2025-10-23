import java.util.*;

public class DeletiveEditing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            String p = sc.next();

            int[] total = new int[26];
            for (char ch : s.toCharArray()) total[ch - 'A']++;

            int[] need = new int[26];
            for (char ch : p.toCharArray()) need[ch - 'A']++;

            boolean possible = true;
            for (int i = 0; i < 26; i++) {
                if (need[i] > total[i]) {
                    possible = false;
                    break;
                }
            }

            if (!possible) {
                System.out.println("NO");
                continue;
            }

            int[] skip = new int[26];
            for (int i = 0; i < 26; i++) skip[i] = total[i] - need[i];

            StringBuilder filtered = new StringBuilder();
            for (char ch : s.toCharArray()) {
                int idx = ch - 'A';
                if (skip[idx] > 0) skip[idx]--;
                else filtered.append(ch);
            }

            System.out.println(filtered.toString().equals(p) ? "YES" : "NO");
        }
    }
}
