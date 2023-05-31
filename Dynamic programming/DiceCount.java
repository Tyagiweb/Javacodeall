public class DiceCount {
    static int count=0;
    static int memocount=0;
    static int tab=0;
//LC-1155
//normal 

    static int countWays(int currentvalue,int endvalue){
        count++;
        if(currentvalue==endvalue) {
            return 1;
            

    }
    if(currentvalue>endvalue){
        return 0;
    }
    int count=0;
    for(int dice=1;dice<=6;dice++){
        count=count+countWays(currentvalue+dice, endvalue);
    }
    return count;
}

//Memorization 

static int memorization(int currentvalue,int endvalue,int cache[]){
    memocount++;
    if(currentvalue==endvalue) {
        return 1;
        }
        if(currentvalue>endvalue){
            return 0;
            }
            if(cache[currentvalue]!=0){
                return cache[currentvalue];
                }
                int count=0;
                for(int dice=1;dice<=6;dice++){
                    count=count+memorization(currentvalue+dice, endvalue,cache);
                    }
                    cache[currentvalue]=count;
                    return count;
                    }



    static int tabulzation(int start,int end){
        
        int cache[]=new int[end+1];
        cache[end]=1;
        for(int i=end-1;i>=0;i--){
            int count=0;
            for(int dice=1;dice<=6 && dice+i<cache.length;dice++){
                count+=cache[dice+i];
                tab++;
        }
        cache[i]=count;
    }
        return cache[start];
        
    }                

    public static void main(String[] args) {
        int endvalue=10;
        int currentvalue=0;
        int cache[]=new int[endvalue+1];
        System.out.println(countWays(currentvalue,endvalue));
        System.out.println(count);
        System.out.println(memorization(currentvalue,endvalue,cache));
        System.out.println(memocount);
        System.out.println(tabulzation(currentvalue, endvalue));
        System.out.println(tab);
        
    }
    
}
