package Medium.LongestPallindromicSubstring;

public class LongestPallindromicSubstring {
    //The code gives timeout error for below input string:
    //"civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"
    //Comeback to this question after learning dynamic programming
    //45 of 140 testcases passed with below solution
    
    public String longestPalindrome(String s) {

        int max=-99;
        String result="";
        //generate all substrings
        for(int i=0;i<=s.length();i++){
           for(int j=i+1;j<=s.length();j++){
            String subs=s.substring(i,j);
            if(isPallindrome(subs)){        //check if substring is pallindrome 
                if(max<subs.length()){
                    max=subs.length();
                    result=subs;
                }
            }
           // System.out.println(subs);
           }
        }    
    
    return result;
        }
    
        boolean isPallindrome(String x){
            String r="";
            for(int i=x.length()-1;i>=0;i--){
                char c=x.charAt(i);
                r=r+c;
            }
            if(x.equals(r)){
                return true;
            }
            return false;
        }

}
