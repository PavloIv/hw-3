class ATM{
  public int countBanknotes(int sum){
  int a = sum;
  int i = 0;
      while(a > 0){
      
       if(a >= 500){
       a = a - 500;
       }else if(a >= 200){
       a = a - 200;
       }else if(a >= 100){
       a = a - 100;
       }else if(a >= 50){
       a = a - 50;
       }else if(a >= 20){
       a = a - 20;
       }else if(a >= 10){
       a = a - 10;
       }else if(a >= 5){
       a = a - 5;
       }else if(a >= 2){
       a = a - 2;
       }else{
       a = a - 1;
       }
        i++;
      }

    return i;
  }
}
