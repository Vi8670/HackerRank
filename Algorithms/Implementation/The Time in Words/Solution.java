static String timeInWords(int h, int m) {
        String[] time={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
        String t="";
        int rem=0;
        String[] min = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourheen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
        if(m == 00)
        {
            t=time[h].concat(" o' clock");
        }
        if(m>=1 && m<=30)
        {
            if(m == 15)
            {
                t = "quarter past ".concat(time[h]);
            }
            else if(m == 30)
            {
                t = "half past ".concat(time[h]);
            }
            else if(m == 1)
            {
                t= min[m].concat(" minute past ").concat(time[h]);
            }
            else
            {
                t= min[m].concat(" minutes past ").concat(time[h]);
            } 
        }
        if(m>30 && m<=60)
        {
            rem = 60 - m;
            //min = String.valueOf(rem);
            if(m == 45)
            {
                t= "quarter to ".concat(time[h+1]);
            }
            else
            {
                t= min[rem].concat(" minutes to ").concat(time[h+1]);
            }
            
        }
        return t;
