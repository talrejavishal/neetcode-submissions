class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp=new HashMap<String, List<String>>();
        for(String str: strs){
            String freqCode=getFrequencyCode(str);
            if(mp.get(freqCode)!=null){
                List<String> updatedList=mp.get(freqCode);
                updatedList.add(str);
                mp.put(freqCode, updatedList);
            }else{
                List<String> newList=new ArrayList<String>();
                newList.add(str);
                mp.put(freqCode, newList);
            }
        }
        return mp.values().stream().toList();
    }

    private String getFrequencyCode(String str){
        int[] code={0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0};
        for(char c:str.toCharArray()){
            code[c-'a']=code[c-'a']+1;
        }
        StringBuilder sb=new StringBuilder();
        for(int i:code){
            sb.append(i).append('#');
        }
        return sb.toString();
    }
}
