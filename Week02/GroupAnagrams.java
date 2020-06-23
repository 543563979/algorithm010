// hash表
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
       if (strs.length == 0) {
            return null;
        }
        // 创建长度26的哈希表
        int[] count = new int[26];
        HashMap<String, List> map = new HashMap<String, List>();
        for (String s : strs) {
            Arrays.fill(count, 0);
            // 记录字母出现的次数
            for(char ch:s.toCharArray()) {
                count[ch-'a']++;
            }

            // 将统计的数据拼接成key
            StringBuffer sb = new StringBuffer("");
            for (int i = 0 ;i < 26 ; i++) {
                sb.append("#");
                sb.append(count[i]);
            }

            String key = sb.toString();
            if (!map.containsKey(key)) map.put(sb.toString(), new ArrayList());

            map.get(key).add(s);
        }

        return new ArrayList(map.values());
    }
}