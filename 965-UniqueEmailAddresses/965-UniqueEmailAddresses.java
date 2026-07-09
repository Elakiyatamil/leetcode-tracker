// Last updated: 09/07/2026, 09:48:57
class Solution {
    public int numUniqueEmails(String[] emails) {
         Set<String> set = new HashSet<>();

        for (String email : emails) {
            int atIndex = email.indexOf('@');

            String local = email.substring(0, atIndex);
            String domain = email.substring(atIndex);

            // Remove '+' part
            int plusIndex = local.indexOf('+');
            if (plusIndex != -1) {
                local = local.substring(0, plusIndex);
            }

            // Remove dots
            local = local.replace(".", "");

            // Add cleaned email
            set.add(local + domain);
        }

        return set.size();
    }
}