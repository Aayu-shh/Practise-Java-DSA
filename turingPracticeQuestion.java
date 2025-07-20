import java.util.Map;
import java.util.HashMap;
public class turingPracticeQuestion {
    public static void main(String[] args) {

        // #Plan
        /*
         * count_email_domains(
         * 
         * emails=['foo@a.com', 'bar@a.com', baz@b.com', 'qux@d.com'],
         * 
         * urls=['www.a.com', 'www.b.com', 'www.c.com']
         * 
         * )
         * 
         * Create 1 hashMap > For Dictionary <string,int> URL,numOfDomains
         * Create 1 Domain Array length = emails [] ; Store everything after @ for each
         * email
         * in array (URL)
         *
         * Iterate through the domain array and match with urlString's substring after
         * www.
         * if match > {
         * get curent url in dictionary and Doman++;
         * break loop;
         * }
         */
        String[] emails = { "foo@a.com", "bar@a.com", "baz@b.com", "qux@d.com" };
        String[] urls = { "www.a.com", "www.b.com", "www.c.com" };
        String[] domains = new String[emails.length];
        int c = 0;
        Map<String, Integer> dictionary = new HashMap<>();
        for (String s : urls) {
            dictionary.put(s, 0);
        }
        for (String email : emails) {
            // domains Array creation for emails
            domains[c] = email.split("@")[1];

            // Match Domain array with URLs put count in dictionary
            for (int i = 0; i < urls.length; i++) {
                if (domains[c].equalsIgnoreCase(urls[i].replaceFirst("www.", ""))) {
                    int currVal = dictionary.get(urls[i]);
                    dictionary.put(urls[i], currVal + 1);
                }
            }
            c++;
        }
        for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
            System.out.println("URL: " + entry.getKey() + " Count of Domains: " + entry.getValue());
        }

        // System.out.println(("www.asd.com".replaceFirst("www.", "")));
        // System.out.println("www.asd.com".substring(4));
    }
}
