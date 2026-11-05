class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] arr = magazine.toCharArray();
        int len = arr.length;
        int len1 = ransomNote.length();

        for(int i = 0; i< len1 ; i++ )
        {
            boolean mark = false;
            for (int j =0; j< len ; j++)
            {
                if (ransomNote.charAt(i) == arr[j])
                {
                    arr[j] = '0';
                    mark = true;
                    break;
                }
            }
            if (!mark)
            {
                return false;
            }
        }
        return true;
    }
}