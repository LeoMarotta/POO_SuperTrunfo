
package supertrunfo;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paulo Emilio
 */
public class SuperTrunfo {

   
    public static void main(String[] args) {

        Random gerador = new Random();
        Cartas [] c = new Cartas[32];
        int escolha1 , escolha2, contador1=0, contador2=0;
        Scanner sc = new Scanner(System.in);
        
        
        c[0] = new Cartas();
        c[1] = new Cartas();
        c[2] = new Cartas();
        c[3] = new Cartas();
        c[4] = new Cartas();
        c[5] = new Cartas();
        c[6] = new Cartas();
        c[7] = new Cartas();
        c[8] = new Cartas();
        c[9] = new Cartas();
        c[10] = new Cartas();
        c[11] = new Cartas();
        c[12] = new Cartas();
        c[13] = new Cartas();
        c[14] = new Cartas();
        c[15] = new Cartas();
        c[16] = new Cartas();
        c[17] = new Cartas();
        c[18] = new Cartas();
        c[19] = new Cartas();
        c[20] = new Cartas();
        c[21] = new Cartas();
        c[22] = new Cartas();
        c[23] = new Cartas();
        c[24] = new Cartas();
        c[25] = new Cartas();
        c[26] = new Cartas();
        c[27] = new Cartas();
        c[28] = new Cartas();
        c[29] = new Cartas();
        c[30] = new Cartas();
        c[31] = new Cartas();

        c[0].canhao = 203.0;
        c[0].comprimento = 6.5;
        c[0].largura = 3.15;
        c[0].nome = "Obus M110";
        c[0].peso = 25.0;
        c[0].potencia = 420.0;
        c[0].velocidade = 50.0;
        c[0].indalfa = "e";
        c[0].indnum = 2;
        
        c[1].canhao = 100.0;
        c[1].comprimento = 6.45;
        c[1].largura = 3.28;
        c[1].nome = "T 62";
        c[1].peso = 36.0;
        c[1].potencia = 580.0;
        c[1].velocidade = 50.0;
        c[1].indalfa = "A";
        c[1].indnum = 3;
    
        c[2].canhao = 90;
        c[2].comprimento = 6.23;
        c[2].largura = 2.98;
        c[2].nome = "Canhao Anti-Tanque";
        c[2].peso = 25.7;
        c[2].potencia = 500;
        c[2].velocidade = 70;
        c[2].indalfa = "D";
        c[2].indnum = 1;
    
        c[3].canhao = 20;
        c[3].comprimento = 7.34;
        c[3].largura = 2.98;
        c[3].nome = "Tanque Patrulha 2 Luchs";
        c[3].peso = 19;
        c[3].potencia = 400;
        c[3].velocidade = 100;
        c[3].indalfa = "F";
        c[3].indnum = 1;

        c[4].canhao = 120;
        c[4].comprimento = 7.51;
        c[4].largura = 3.50;
        c[4].nome = "Chieftain";
        c[4].peso = 54.8;
        c[4].potencia = 720;
        c[4].velocidade = 43;
        c[4].indalfa = "A";
        c[4].indnum = 2;
       
        c[5].canhao = 20;
        c[5].comprimento = 6.79;
        c[5].largura = 3.24;
        c[5].nome = "Marder Special";
        c[5].peso = 25.5;
        c[5].potencia = 600;
        c[5].velocidade = 78;
        c[5].indalfa = "C";
        c[5].indnum = 1;

        c[6].canhao = 12.7;
        c[6].comprimento = 4.86;
        c[6].largura = 2.64;
        c[6].nome = "M 113";
        c[6].peso = 10.9;
        c[6].potencia = 215;
        c[6].velocidade = 68.5;
        c[6].indalfa = "C";
        c[6].indnum = 4;

        c[7].canhao = 7.62;
        c[7].comprimento = 4.71;
        c[7].largura = 2.28;
        c[7].nome = "Tanque Radar especial 10";
        c[7].peso = 8.2;
        c[7].potencia = 164;
        c[7].velocidade = 60;
        c[7].indalfa = "G";
        c[7].indnum = 3;

        c[8].canhao = 105;
        c[8].comprimento = 4.88;
        c[8].largura = 2.23;
        c[8].nome = "AMX 13";
        c[8].peso = 14.8;
        c[8].potencia = 250;
        c[8].velocidade = 69;
        c[8].indalfa = "D";
        c[8].indnum = 3;

        c[9].canhao = 7.5;
        c[9].comprimento = 5.70;
        c[9].largura = 2.70;
        c[9].nome = "AMX VTP M - 56";
        c[9].peso = 14;
        c[9].potencia = 250;
        c[9].velocidade = 60;
        c[9].indalfa = "C";
        c[9].indnum = 3;

        c[10].canhao = 7.62;
        c[10].comprimento = 3.84;
        c[10].largura = 1.91;
        c[10].nome = "Tanque Patrulha Ferret";
        c[10].peso = 4.5;
        c[10].potencia = 129;
        c[10].velocidade = 72;
        c[10].indalfa = "F";
        c[10].indnum = 2;

        c[11].canhao = 105;
        c[11].comprimento = 6.94;
        c[11].largura = 3.37;
        c[11].nome = "Leopard A4";
        c[11].peso = 42.4;
        c[11].potencia = 830;
        c[11].velocidade = 65;
        c[11].indalfa = "A";
        c[11].indnum = 1;

        c[12].canhao = 152;
        c[12].comprimento = 6.20;
        c[12].largura = 2.70;
        c[12].nome = "Sheridan M551";
        c[12].peso = 16.5;
        c[12].potencia = 300;
        c[12].velocidade = 65;
        c[12].indalfa = "B";
        c[12].indnum = 2;

        c[13].canhao = 20;
        c[13].comprimento = 4.43;
        c[13].largura = 2.34;
        c[13].nome = "Hotch Kiss Especial";
        c[13].peso = 8.4;
        c[13].potencia = 164;
        c[13].velocidade = 58;
        c[13].indalfa = "B";
        c[13].indnum = 4;
       
        c[14].canhao = 76;
        c[14].comprimento = 5.60;
        c[14].largura = 3.91;
        c[14].nome = "M 41";
        c[14].peso = 25.4;
        c[14].potencia = 500;
        c[14].velocidade = 65;
        c[14].indalfa = "D";
        c[14].indnum = 4;

        c[15].canhao = 12.7;
        c[15].comprimento = 4.59;
        c[15].largura = 2.41;
        c[15].nome = "Blindado de Transporte de Infantaria Mecanica";
        c[15].peso = 9;
        c[15].potencia = 215;
        c[15].velocidade = 71;
        c[15].indalfa = "B";
        c[15].indnum = 3;

        c[16].canhao = 90;
        c[16].comprimento = 6.87;
        c[16].largura = 3.63;
        c[16].nome = "M48A2";
        c[16].peso = 47.6;
        c[16].potencia = 810;
        c[16].velocidade = 51;
        c[16].indalfa = "A";
        c[16].indnum = 4;

        c[17].canhao = 35;
        c[17].comprimento = 8.17;
        c[17].largura = 3.25;
        c[17].nome = "Tanque Anti - AÃ©reo Gepard";
        c[17].peso = 45.6;
        c[17].potencia = 830;
        c[17].velocidade = 62;
        c[17].indalfa = "E";
        c[17].indnum = 4;

        c[18].canhao = 7.62;
        c[18].comprimento = 7.98;
        c[18].largura = 3.25;
        c[18].nome = "Tanque Leopard Sapador";
        c[18].peso = 40.8;
        c[18].potencia = 830;
        c[18].velocidade = 62;
        c[18].indalfa = "G";
        c[18].indnum = 1;

        c[19].canhao = 500;
        c[19].comprimento = 6.24;
        c[19].largura = 2.98;
        c[19].nome = "Tanque LanÃ§a Foguetes";
        c[19].peso = 23;
        c[19].potencia = 500;
        c[19].velocidade = 70;
        c[19].indalfa = "D";
        c[19].indnum = 2;

        c[20].canhao = 7.62;
        c[20].comprimento = 5.11;
        c[20].largura = 2.82;
        c[20].nome = "Especial FV432";
        c[20].peso = 15.3;
        c[20].potencia = 240;
        c[20].velocidade = 52;
        c[20].indalfa = "C";
        c[20].indnum = 2;

        c[21].canhao = 0;
        c[21].comprimento = 11;
        c[21].largura = 3.63;
        c[21].nome = "Tanque Ponte M 42 AZ";
        c[21].peso = 54;
        c[21].potencia = 865;
        c[21].velocidade = 45;
        c[21].indalfa = "H";
        c[21].indnum = 4;

        c[22].canhao = 155;
        c[22].comprimento = 6.61;
        c[22].largura = 3.58;
        c[22].nome = "CanhÃ£o Obus M 109 G";
        c[22].peso = 24.5;
        c[22].potencia = 312;
        c[22].velocidade = 56;
        c[23].indalfa = "E";
        c[23].indnum = 1;

        c[23].canhao = 75;
        c[23].comprimento = 5.56;
        c[23].largura = 2.38;
        c[23].nome = "Tanque Patrulha EBR";
        c[23].peso = 13.5;
        c[23].potencia = 200;
        c[23].velocidade = 100;
        c[23].indalfa = "F";
        c[23].indnum = 3;

        c[24].canhao = 7.62;
        c[24].comprimento = 8.40;
        c[24].largura = 3.43;
        c[24].nome = "Tanque com Guindaste M 88";
        c[24].peso = 52;
        c[24].potencia = 826;
        c[24].velocidade = 50;
        c[24].indalfa = "H";
        c[24].indnum = 2;

        c[25].canhao = 7.62;
        c[25].comprimento = 7.57;
        c[25].largura = 3.25;
        c[25].nome = "Tanque Leopard com Guindaste";
        c[25].peso = 40;
        c[25].potencia = 830;
        c[25].velocidade = 62;
        c[25].indalfa = "H";
        c[25].indnum = 1;

        c[26].canhao = 0;
        c[26].comprimento = 5.11;
        c[26].largura = 2.82;
        c[26].nome = "Unidade MÃ©dica Blindada FV 432";
        c[26].peso = 15.2;
        c[26].potencia = 420;
        c[26].velocidade = 52;
        c[26].indalfa = "G";
        c[26].indnum = 2;

        c[27].canhao = 7.62;
        c[27].comprimento = 6.74;
        c[27].largura = 2.94;
        c[27].nome = "Blindado de Transporte de Infantaria Mecanizada";
        c[27].peso = 14.5;
        c[27].potencia = 360;
        c[27].velocidade = 100;
        c[27].indalfa = "F";
        c[27].indnum = 4;

        c[28].canhao = 7.62;
        c[28].comprimento = 4.86;
        c[28].largura = 2.69;
        c[28].nome = "Tanque de Comando M5 77";
        c[28].peso = 11;
        c[28].potencia = 215;
        c[28].velocidade = 68;
        c[28].indalfa = "G";
        c[28].indnum = 4;

        c[29].canhao = 30;
        c[29].comprimento = 4.39;
        c[29].largura = 2.18;
        c[29].nome = "Scimitar";
        c[29].peso = 7.94;
        c[29].potencia = 195;
        c[29].velocidade = 80;
        c[29].indalfa = "B";
        c[29].indnum = 1;

        c[30].canhao = 40;
        c[30].comprimento = 6.20;
        c[30].largura = 3.28;
        c[30].nome = "Tanque Anti- AÃ©reo M 42";
        c[30].peso = 22;
        c[30].potencia = 480;
        c[30].velocidade = 72;
        c[30].indalfa = "E";
        c[30].indnum = 3;

        c[31].canhao = 0;
        c[31].comprimento = 11.40;
        c[31].largura = 4.00;
        c[31].nome = "Tanque Ponte Bebber";
        c[31].peso = 41;
        c[31].potencia = 830;
        c[31].velocidade = 60;
        c[31].indalfa = "H";
        c[31].indnum = 3;        

        int turno=0;
        int carac=0;
        
        for(int i=0;i<17;i++){
            
            if(turno==0){
            
            escolha1 = gerador.nextInt(31);
            escolha2 = gerador.nextInt(31);
            
            System.out.println("A carta do Jogador 1: \n");
            
            System.out.println("Nome:"+c[escolha1].nome+"\n"+
                               "Canhao:"+c[escolha1].canhao+"\n"+
                               "Potencia:"+c[escolha1].potencia+"\n"+
                               "Peso:"+c[escolha1].peso+"\n"+
                               "Velocidade:"+c[escolha1].velocidade+"\n"+
                               "Comprimento:"+c[escolha1].comprimento+"\n"+
                               "Largura:"+c[escolha1].largura+"\n");
            
            System.out.println("Qual caracteristica deseja comparar? \n 1-Canhao \n "
                                + "2-Potencia \n 3-Peso \n 4-Velocidade \n 5-Comprimento \n 6-Largura \n");
            carac = sc.nextInt();
            
            switch(carac){                
                case 1:
                    System.out.println("\n\nComparar canhao:\n Jogador 1:" + c[escolha1].canhao + "\n Jogador 2:" + c[escolha2].canhao + comp(c[escolha1].canhao, c[escolha2].canhao) + "\n");
                    if((c[escolha1].indalfa!="E" && c[escolha1].indnum!=3) && (c[escolha2].indnum!=1)){
                            contador1++;
                            turno=0;
                            System.out.println("SUPER TRUNFO JOGADOR 1");
                    }else if((c[escolha2].indalfa!="E" && c[escolha2].indnum!=3) && (c[escolha1].indnum!=1)){
                            contador2++;
                            turno=1;
                            System.out.println("SUPER TRUNFO JOGADOR 2");
                    }else {
                        if(comp(c[escolha1].canhao, c[escolha2].canhao).equals("\nJogador 1 vence")){
                            contador1++;
                            turno=0;
                        }else if(comp(c[escolha1].canhao, c[escolha2].canhao).equals("\nJogador 2 vence")){
                            contador2++;
                            turno=1;
                        }
                    } 
                    break;
                    
                case 2:
                    System.out.println("\n\nComparar potencia:\n Jogador 1:" + c[escolha1].potencia + "\n Jogador 2:" + c[escolha2].potencia + comp(c[escolha1].potencia, c[escolha2].potencia) + "\n");
                    if((c[escolha1].indalfa!="E" && c[escolha1].indnum!=3) && (c[escolha2].indnum!=1)){
                            contador1++;
                            turno=0;
                            System.out.println("SUPER TRUNFO JOGADOR 1");
                    }else if((c[escolha2].indalfa!="E" && c[escolha2].indnum!=3) && (c[escolha1].indnum!=1)){
                            contador2++;
                            turno=1;
                            System.out.println("SUPER TRUNFO JOGADOR 2");
                    }else {
                        if(comp(c[escolha1].potencia, c[escolha2].potencia).equals("\nJogador 1 vence")){
                            contador1++;
                            turno=0;
                        }else if(comp(c[escolha1].potencia, c[escolha2].potencia).equals("\nJogador 2 vence")){
                            contador2++;
                            turno=1;
                        }
                    } 
                    break;
                    
                case 3:
                    System.out.println("\n\nComparar peso:\n Jogador 1:" + c[escolha1].peso + "\n Jogador 2:" + c[escolha2].peso + comp(c[escolha1].peso, c[escolha2].peso) + "\n");
                    if((c[escolha1].indalfa!="E" && c[escolha1].indnum!=3) && (c[escolha2].indnum!=1)){
                            contador1++;
                            turno=0;
                            System.out.println("SUPER TRUNFO JOGADOR 1");
                    }else if((c[escolha2].indalfa!="E" && c[escolha2].indnum!=3) && (c[escolha1].indnum!=1)){
                            contador2++;
                            turno=1;
                            System.out.println("SUPER TRUNFO JOGADOR 2");
                    }else {
                        if(comp(c[escolha1].peso, c[escolha2].peso).equals("\nJogador 1 vence")){
                            contador1++;
                            turno=0;
                        }else if(comp(c[escolha1].peso, c[escolha2].peso).equals("\nJogador 2 vence")){
                            contador2++;
                            turno=1;
                        }
                    } 
                    break;
                    
                case 4:
                    System.out.println("\n\nComparar velocidade:\n Jogador 1:" + c[escolha1].velocidade + "\n Jogador 2:" + c[escolha2].velocidade + comp(c[escolha1].velocidade, c[escolha2].velocidade) + "\n");
                    if((c[escolha1].indalfa!="E" && c[escolha1].indnum!=3) && (c[escolha2].indnum!=1)){
                            contador1++;
                            turno=0;
                            System.out.println("SUPER TRUNFO JOGADOR 1");
                    }else if((c[escolha2].indalfa!="E" && c[escolha2].indnum!=3) && (c[escolha1].indnum!=1)){
                            contador2++;
                            turno=1;
                            System.out.println("SUPER TRUNFO JOGADOR 2");
                    }else {
                        if(comp(c[escolha1].velocidade, c[escolha2].velocidade).equals("\nJogador 1 vence")){
                            contador1++;
                            turno=0;
                        }else if(comp(c[escolha1].velocidade, c[escolha2].velocidade).equals("\nJogador 2 vence")){
                            contador2++;
                            turno=1;
                        }
                    } 
                    break;
                    
                case 5:
                    System.out.println("\n\nComparar pomprimento:\n Jogador 1:" + c[escolha1].comprimento + "\n Jogador 2:" + c[escolha2].comprimento + comp(c[escolha1].comprimento, c[escolha2].comprimento) + "\n");
                    if((c[escolha1].indalfa!="E" && c[escolha1].indnum!=3) && (c[escolha2].indnum!=1)){
                            contador1++;
                            turno=0;
                            System.out.println("SUPER TRUNFO JOGADOR 1");
                    }else if((c[escolha2].indalfa!="E" && c[escolha2].indnum!=3) && (c[escolha1].indnum!=1)){
                            contador2++;
                            turno=1;
                            System.out.println("SUPER TRUNFO JOGADOR 2");
                    }else {
                        if(comp(c[escolha1].comprimento, c[escolha2].comprimento).equals("\nJogador 1 vence")){
                            contador1++;
                            turno=0;
                        }else if(comp(c[escolha1].comprimento, c[escolha2].comprimento).equals("\nJogador 2 vence")){
                            contador2++;
                            turno=1;
                        }
                    } 
                    break;
                    
                case 6:
                    System.out.println("\n\nComparar largura:\n Jogador 1:" + c[escolha1].largura + "\n Jogador 2:" + c[escolha2].largura + comp(c[escolha1].largura, c[escolha2].largura) + "\n");
                    if((c[escolha1].indalfa!="E" && c[escolha1].indnum!=3) && (c[escolha2].indnum!=1)){
                            contador1++;
                            turno=0;
                            System.out.println("SUPER TRUNFO JOGADOR 1");
                    }else if((c[escolha2].indalfa!="E" && c[escolha2].indnum!=3) && (c[escolha1].indnum!=1)){
                            contador2++;
                            turno=1;
                            System.out.println("SUPER TRUNFO JOGADOR 2");
                    }else {
                        if(comp(c[escolha1].largura, c[escolha2].largura).equals("\nJogador 1 vence")){
                            contador1++;
                            turno=0;
                        }else if(comp(c[escolha1].largura, c[escolha2].largura).equals("\nJogador 2 vence")){
                            contador2++;
                            turno=1;
                        }
                    } 
                    break;
            }
            carac = 0;
            }else if(turno==1){
            
            escolha1 = gerador.nextInt(31);
            escolha2 = gerador.nextInt(31);
            
            System.out.println("A carta do Jogador 2: \n");
            
            System.out.println("Nome:"+c[escolha2].nome+"\n"+
                               "Canhao:"+c[escolha2].canhao+"\n"+
                               "Potencia:"+c[escolha2].potencia+"\n"+
                               "Peso:"+c[escolha2].peso+"\n"+
                               "Velocidade:"+c[escolha2].velocidade+"\n"+
                               "Comprimento:"+c[escolha2].comprimento+"\n"+
                               "Largura:"+c[escolha2].largura+"\n");
            
            System.out.println("Qual caracteristica deseja comparar? \n 1-Canhao \n "
                                + "2-Potencia \n 3-Peso \n 4-Velocidade \n 5-Comprimento \n 6-Largura \n");
            carac = sc.nextInt();
            
            switch(carac){                
                case 1:
                    System.out.println("\n\nComparar canhao:\n Jogador 1:" + c[escolha1].canhao + "\n Jogador 2:" + c[escolha2].canhao + comp(c[escolha1].canhao, c[escolha2].canhao) + "\n");
                    if((c[escolha1].indalfa!="E" && c[escolha1].indnum!=3) && (c[escolha2].indnum!=1)){
                            contador1++;
                            turno=0;
                            System.out.println("SUPER TRUNFO JOGADOR 1");
                    }else if((c[escolha2].indalfa!="E" && c[escolha2].indnum!=3) && (c[escolha1].indnum!=1)){
                            contador2++;
                            turno=1;
                            System.out.println("SUPER TRUNFO JOGADOR 2");
                    }else {
                        if(comp(c[escolha1].canhao, c[escolha2].canhao).equals("\nJogador 1 vence")){
                            contador1++;
                            turno=0;
                        }else if(comp(c[escolha1].canhao, c[escolha2].canhao).equals("\nJogador 2 vence")){
                            contador2++;
                            turno=1;
                        }
                    } 
                    break;
                    
                case 2:
                    System.out.println("\n\nComparar potencia:\n Jogador 1:" + c[escolha1].potencia + "\n Jogador 2:" + c[escolha2].potencia + comp(c[escolha1].potencia, c[escolha2].potencia) + "\n");
                    if((c[escolha1].indalfa!="E" && c[escolha1].indnum!=3) && (c[escolha2].indnum!=1)){
                            contador1++;
                            turno=0;
                            System.out.println("SUPER TRUNFO JOGADOR 1");
                    }else if((c[escolha2].indalfa!="E" && c[escolha2].indnum!=3) && (c[escolha1].indnum!=1)){
                            contador2++;
                            turno=1;
                            System.out.println("SUPER TRUNFO JOGADOR 2");
                    }else {
                        if(comp(c[escolha1].potencia, c[escolha2].potencia).equals("\nJogador 1 vence")){
                            contador1++;
                            turno=0;
                        }else if(comp(c[escolha1].potencia, c[escolha2].potencia).equals("\nJogador 2 vence")){
                            contador2++;
                            turno=1;
                        }
                    } 
                    break;
                    
                case 3:
                    System.out.println("\n\nComparar peso:\n Jogador 1:" + c[escolha1].peso + "\n Jogador 2:" + c[escolha2].peso + comp(c[escolha1].peso, c[escolha2].peso) + "\n");
                    if((c[escolha1].indalfa!="E" && c[escolha1].indnum!=3) && (c[escolha2].indnum!=1)){
                            contador1++;
                            turno=0;
                            System.out.println("SUPER TRUNFO JOGADOR 1");
                    }else if((c[escolha2].indalfa!="E" && c[escolha2].indnum!=3) && (c[escolha1].indnum!=1)){
                            contador2++;
                            turno=1;
                            System.out.println("SUPER TRUNFO JOGADOR 2");
                    }else {
                        if(comp(c[escolha1].peso, c[escolha2].peso).equals("\nJogador 1 vence")){
                            contador1++;
                            turno=0;
                        }else if(comp(c[escolha1].peso, c[escolha2].peso).equals("\nJogador 2 vence")){
                            contador2++;
                            turno=1;
                        }
                    } 
                    break;
                    
                case 4:
                    System.out.println("\n\nComparar velocidade:\n Jogador 1:" + c[escolha1].velocidade + "\n Jogador 2:" + c[escolha2].velocidade + comp(c[escolha1].velocidade, c[escolha2].velocidade) + "\n");
                    if((c[escolha1].indalfa!="E" && c[escolha1].indnum!=3) && (c[escolha2].indnum!=1)){
                            contador1++;
                            turno=0;
                            System.out.println("SUPER TRUNFO JOGADOR 1");
                    }else if((c[escolha2].indalfa!="E" && c[escolha2].indnum!=3) && (c[escolha1].indnum!=1)){
                            contador2++;
                            turno=1;
                            System.out.println("SUPER TRUNFO JOGADOR 2");
                    }else {
                        if(comp(c[escolha1].velocidade, c[escolha2].velocidade).equals("\nJogador 1 vence")){
                            contador1++;
                            turno=0;
                        }else if(comp(c[escolha1].velocidade, c[escolha2].velocidade).equals("\nJogador 2 vence")){
                            contador2++;
                            turno=1;
                        }
                    } 
                    break;
                    
                case 5:
                    System.out.println("\n\nComparar pomprimento:\n Jogador 1:" + c[escolha1].comprimento + "\n Jogador 2:" + c[escolha2].comprimento + comp(c[escolha1].comprimento, c[escolha2].comprimento) + "\n");
                    if((c[escolha1].indalfa!="E" && c[escolha1].indnum!=3) && (c[escolha2].indnum!=1)){
                            contador1++;
                            turno=0;
                            System.out.println("SUPER TRUNFO JOGADOR 1");
                    }else if((c[escolha2].indalfa!="E" && c[escolha2].indnum!=3) && (c[escolha1].indnum!=1)){
                            contador2++;
                            turno=1;
                            System.out.println("SUPER TRUNFO JOGADOR 2");
                    }else {
                        if(comp(c[escolha1].comprimento, c[escolha2].comprimento).equals("\nJogador 1 vence")){
                            contador1++;
                            turno=0;
                        }else if(comp(c[escolha1].comprimento, c[escolha2].comprimento).equals("\nJogador 2 vence")){
                            contador2++;
                            turno=1;
                        }
                    } 
                    break;
                    
                case 6:
                    System.out.println("\n\nComparar largura:\n Jogador 1:" + c[escolha1].largura + "\n Jogador 2:" + c[escolha2].largura + comp(c[escolha1].largura, c[escolha2].largura) + "\n");
                    if((c[escolha1].indalfa!="E" && c[escolha1].indnum!=3) && (c[escolha2].indnum!=1)){
                            contador1++;
                            turno=0;
                            System.out.println("SUPER TRUNFO JOGADOR 1");
                    }else if((c[escolha2].indalfa!="E" && c[escolha2].indnum!=3) && (c[escolha1].indnum!=1)){
                            contador2++;
                            turno=1;
                            System.out.println("SUPER TRUNFO JOGADOR 2");
                    }else {
                        if(comp(c[escolha1].largura, c[escolha2].largura).equals("\nJogador 1 vence")){
                            contador1++;
                            turno=0;
                        }else if(comp(c[escolha1].largura, c[escolha2].largura).equals("\nJogador 2 vence")){
                            contador2++;
                            turno=1;
                        }
                    } 
                    break;
            }
            
            carac = 0;

            }
        }

        if(contador1>contador2){
            System.out.println(" Vitoria do jogador 1\n Placar:\nJogador 1:" + contador1 + "\nJogador 2:" + contador2);
        }else if(contador1<contador2){
            System.out.println(" Vitoria do jogador 2\n Placar:\nJogador 1:" + contador1 + "\nJogador 2:" + contador2);
        }
    }

    private static String comp(double a, double b) {
        if(a>b){
            return "\nJogador 1 vence";
        }else if(a<b){
            return "\nJogador 2 vence";
        }else{
            return "\nEmpate";
        }
    }
}
