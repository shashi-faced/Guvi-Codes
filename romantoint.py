class solution:
    def roman_to_int(self, s):
        roman = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        val = 0
        for i in range(len(s)):
            if i > 0 and roman[s[i]] > roman[s[i - 1]]:
                val += roman[s[i]] - 2 * roman[s[i - 1]]
            else:
                int_val += roman[s[i]]
        return val

print(solution().roman_to_int(input()))
