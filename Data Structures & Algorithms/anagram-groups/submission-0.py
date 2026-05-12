class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # input is a list of strings 
        # output must a nested list in any order

        # idea (brute force):  
        # 1. iterate through the list,
        # 2. compare each element with each other if anagram
        # 3. since we compare each character, we would know what they are
        #    we can track the anagrams, then make them into a list and finally
        #    remove them from the original list

        # edge case (list is empty)
        if (len(strs) == 1 and strs[0] == ""):
            return [[""]]

        res = []

        # we loop until the strs is empty

        curr = 0
        while len(strs) > 0:
            
            base = strs[0]
            group = [base]
            
            for i in range(1, len(strs)):
                if (self.isAnagram(base, strs[i])):
                    # we put those anagram of the compared string
                    group.append(strs[i])
            # after, we append the compared str
            res.append(group)
            # remove the anagram words
            self.removeAnagrams(group, strs)
        return res
        
    def isAnagram(self, str1: str, str2: str) -> bool:
        # we use hashmap
        hash1 = {}
        hash2 = {}

        # idea is to store every letter then increment by 1 per occurence
        for letter in str1:
            if letter not in hash1:
                hash1[f'{letter}'] = 0
            else:
                hash1[f'{letter}'] += 1
        
        for letter in str2:
            if letter not in hash2:
                hash2[f'{letter}'] = 0
            else:
                hash2[f'{letter}'] += 1

        return hash1 == hash2
    
    def removeAnagrams(self, group: List[str], strs: List[str]):
        for word in group:
            strs.remove(word)
        
