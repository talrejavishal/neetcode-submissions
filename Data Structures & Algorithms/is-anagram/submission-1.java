class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mp=new HashMap<Character, Integer>();
        for(int i=0; i<s.length();i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0)+1);
        }
        //System.out.println("before");
        //display(mp);
        for(int i=0; i<t.length();i++){
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)-1);
        }
        //System.out.println("after");
        //display(mp);
        for(Integer x: mp.values()){
            if(x!=0){
                return false;
            }
        }
        return true;
    }
    private void display(Map<Character, Integer> mp){
        for(Map.Entry<Character, Integer> x : mp.entrySet()){
            System.out.print(x.getKey()+":"+x.getValue()+" ,");
            System.out.println();
        }
    }
}
