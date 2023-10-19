class Solution {
public:
    bool isPalindrome(int x) {
       long long int rev=0;
       long long int temp=x;
       while (temp!=0 && temp>0){
           rev=rev*10;
           rev=rev+temp%10;
           temp=temp/10;
       }
       if(rev==x){
           return true;
       }
       else
        return false;
    }
};
