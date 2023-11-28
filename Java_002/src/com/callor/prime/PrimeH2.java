package com.callor.prime;

public class PrimeH2 {
	// 2~100까지의 소수들의 합 : 1060

	    public static void main(String[] args) {
	    	int sum=0;
	    	for(int i = 1; i<100;i++) {
	        int num = i+1;
	        int index =0;
	        for(index = 2; index<num; index++) {
	        	if (num% index==0) {
	        		break;
	        	}
	        }
	       /* if(index<num) {
	        	//prime 아니다
	        }else {
	        	System.out.println(num+"는 소수");
	        }
	        if(index<num) {
	        	//prime 아니다
	        }else { System.out.println(num+"는 소수");
	        */
	        if (index >= num) {
	        	 System.out.println(num+"는 소수");
	        	 sum +=num;
	        }
	    	}
	    	System.out.printf("2~100까지의 수 중 소수들의 합 : %d \n", sum);

	       
	    }
	}

