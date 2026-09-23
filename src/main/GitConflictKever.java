package main;

public class GitConflictKever {

    public static void main(String[] args) {
        int valasztas = 1;
        String[] pakli = new String [22];
        String[] regiPakli = pakli.clone();
            switch (valasztas) {        
            case 1 -> {
                    for(int i = 1; i <= 7; i++){
                        pakli[i] = regiPakli[19-(i-1)*3];
                        pakli[i+7]=regiPakli[20-(i-1)*3];
                        pakli[i+14]=regiPakli[21-(i-1)*3];
                    }
                }
             case 2 -> {
                    for (int i = 1; i <= 7; i++) {
                        pakli[i] = pakli[19 - (i - 1) * 3]; 
                        pakli[i + 7] = pakli[20 - (i - 1) * 3];
                        pakli[i + 14] = pakli[21 - (i - 1) * 3]; 
                    }
                }

                case 3 -> {
                    for (int i = 1; i <= 7; i++) {
                        pakli[i] = pakli[19 - (i - 1) * 3]; 
                        pakli[i + 7] = pakli[21 - (i - 1) * 3]; 
                        pakli[i + 14] = pakli[20 - (i - 1) * 3]; 
                    }
                }
        }
    }
}