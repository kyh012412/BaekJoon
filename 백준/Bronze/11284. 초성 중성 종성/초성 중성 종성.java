import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {	
	
    // 한글 유니코드 범위의 시작과 끝
    private static final int HANGUL_BASE = 0xAC00;
    private static final int HANGUL_END = 0xD7A3;
	
    // 초성 리스트
    private static final char[] INITIAL_CONSONANTS = {
        'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'
    };
    
    // 중성 리스트
    private static final char[] MEDIAL_VOWELS = {
	    'ㅏ', 'ㅐ', 'ㅑ', 'ㅒ', 'ㅓ', 'ㅔ', 'ㅕ', 'ㅖ', 'ㅗ', 'ㅘ', 'ㅙ', 'ㅚ', 'ㅛ', 'ㅜ', 'ㅝ', 'ㅞ', 'ㅟ', 'ㅠ', 'ㅡ', 'ㅢ', 'ㅣ'
	};
    
    // 종성 리스트
    private static final char[] FINAL_CONSONANTS = {
	    '\n', 'ㄱ', 'ㄲ', 'ㄳ', 'ㄴ', 'ㄵ', 'ㄶ', 'ㄷ', 'ㄹ', 'ㄺ', 'ㄻ', 'ㄼ', 'ㄽ', 'ㄾ', 'ㄿ', 'ㅀ', 'ㅁ', 'ㅂ', 'ㅄ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'
	};
    
    public static char get_initial_consonant(char targetChar) {
    	int intTarget = (int)targetChar;
    	int index = (intTarget - HANGUL_BASE)/(MEDIAL_VOWELS.length*FINAL_CONSONANTS.length);
//    	System.out.println(intTarget - HANGUL_BASE);
//    	System.out.println(MEDIAL_VOWELS.length*FINAL_CONSONANTS.length);    	
    	return INITIAL_CONSONANTS[index];
    }
    
    public static char get_medial_vowel(char targetChar) {
    	int intTarget = (int)targetChar;
    	int temp = (intTarget - HANGUL_BASE)%(MEDIAL_VOWELS.length*FINAL_CONSONANTS.length); //초성 이후의 종성과 중성을 조합여 나온 순서
    	int index = temp/FINAL_CONSONANTS.length;
    	return MEDIAL_VOWELS[index];
    }
    
    public static char get_fianl_consonant(char targetChar) {
    	int intTarget = (int)targetChar;
    	int temp = (intTarget - HANGUL_BASE)%(MEDIAL_VOWELS.length*FINAL_CONSONANTS.length); //초성 이후의 종성과 중성을 조합여 나온 순서
    	int index = temp%FINAL_CONSONANTS.length;
    	return FINAL_CONSONANTS[index];
    }
    
    public static int get_order_from_consonant(String target,int type) {
    	if(target.length()==0) return 0;
//    	System.out.println(target);
    	return get_order_from_consonant(target.charAt(0),type);
    }
    
    public static int get_order_from_consonant(char targetChar,int type) {
    	switch(type) {
	    	default:
	    	case 0: 
	    		for(int i=0;i<INITIAL_CONSONANTS.length;i++) {
	    			if(targetChar==INITIAL_CONSONANTS[i]) {
	    				return i;
	    			}
	    		}
	    	case 1: 
	    		for(int i=0;i<MEDIAL_VOWELS.length;i++) {
	    			if(targetChar==MEDIAL_VOWELS[i]) {
	    				return i;
	    			}
	    		}
	    	case 2:	 
	    		for(int i=0;i<FINAL_CONSONANTS.length;i++) {
	    			if(targetChar==FINAL_CONSONANTS[i]) {
	    				return i;
	    			}
	    		}	
	    	}
    	return -1;
    }

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String target = br.readLine();
		
		char f,s,t;
		f=s=t=0;
		
		char targetChar = target.charAt(0);
		f = get_initial_consonant(targetChar);
		s = get_medial_vowel(targetChar);
		t = get_fianl_consonant(targetChar);

		bw.write(f+"\n");
		bw.write(s+"\n");
		bw.write(t);
		
		br.close();
		bw.close();
	}
}