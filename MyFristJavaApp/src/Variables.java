public class Variables {
    public static void variaveis(){


        byte byteMinimo       = Byte.MIN_VALUE;   // declaração de byte com valor mínimo que pode armazenar (-128)
        byte byteMaximo       = Byte.MAX_VALUE;   // declaração de byte com valor máximo que pode armazenar (127)

        short shortMinimo     = Short.MIN_VALUE;  // declaração de short com valor mínimo que pode armazenar (-32768)
        short shortMaximo     = Short.MAX_VALUE;  // declaração de short com valor máximo que pode armazenar (32767)

        int intMinimo         = Integer.MIN_VALUE;// declaração de int com valor mínimo que pode armazenar (-2147483648)
        int intMaximo         = Integer.MAX_VALUE;// declaração de int com valor máximo que pode armazenar (2147483647)

        long longMinimo       = Long.MIN_VALUE;   // declaração de long com valor mínimo que pode armazenar (-9223372036854775808)
        long longMaximo       = Long.MAX_VALUE;   // declaração de long com valor máximo que pode armazenar (9223372036854775807)

        float floatMinimo     = -Float.MAX_VALUE; // declaração de float com valor mínimo que pode armazenar (~-3.4028235e38f)
        float floatMaximo     = Float.MAX_VALUE;  // declaração de float com valor máximo que pode armazenar (~3.4028235e38f)

        double doubleMinimo   = -Double.MAX_VALUE;// declaração de double com valor mínimo que pode armazenar (~-1.7976931348623157e308)
        double doubleMaximo   = Double.MAX_VALUE; // declaração de double com valor máximo que pode armazenar (~1.7976931348623157e308)

        char charMinimo       = Character.MIN_VALUE; // declaração de char com menor código Unicode (0)
        char charMaximo       = Character.MAX_VALUE; // declaração de char com maior código Unicode (65535)
        char letraMinuscula   = 'm';                 // declaração de char de letra minúscula
        char letraMaiuscula   = 'M';                 // declaração de char de letra maiúscula

        boolean booleanMinimo = false; // declaração de boolean com valor mínimo (false)
        boolean booleanMaximo = true;  // declaração de boolean com valor máximo (true)

        // exibição em formato de tabela:
        System.out.println();
        System.out.println("Tipo     | Tamanho (bits) | Valor Mínimo           | Valor Máximo");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-8s | %-14d | %-23d | %-23d%n",
                          "byte", Byte.SIZE, byteMinimo, byteMaximo);
        System.out.printf("%-8s | %-14d | %-23d | %-23d%n",
                          "short", Short.SIZE, shortMinimo, shortMaximo);
        System.out.printf("%-8s | %-14d | %-23d | %-23d%n",
                          "int", Integer.SIZE,intMinimo, intMaximo);
        System.out.printf("%-8s | %-14d | %-23d | %-23d%n",
                          "long", Long.SIZE, longMinimo, longMaximo);
        System.out.printf("%-8s | %-14d | %-23.6e | %-23.6e%n",
                          "float", Float.SIZE, floatMinimo, floatMaximo);
        System.out.printf("%-8s | %-14d | %-23.6e | %-23.6e%n",
                          "double", Double.SIZE, doubleMinimo, doubleMaximo);
        //  char convertido para int para mostrar o codigo Unicode
        System.out.printf("%-8s | %-14d | %-23d | %-23d%n",
                          "char", Character.SIZE, (int)charMinimo, (int)charMaximo);
        System.out.printf("%-8s | %-14s | %-23s | %-23s%n",
                          "boolean","1", String.valueOf(booleanMinimo), String.valueOf(booleanMaximo));
        // char em forma de letras:
        System.out.println();
        System.out.println("Exemplos de char: letras minúscula = " + letraMinuscula + " e maiúscula = " + letraMaiuscula);

        /*
         * Formatação com especificadores de formato para exibição em “tabela”:
         *
         *  %-8s
         *    - '-'  : alinha o texto à esquerda (left‐align)
         *    - '8'  : largura mínima de 8 caracteres
         *    - 's'  : tipo String
         *
         *  %-14d
         *    - '-'   : alinha o número à esquerda
         *    - '14'  : largura mínima de 14 caracteres
         *    - 'd'   : tipo inteiro decimal (byte, short, int, long)
         *
         *  %-23d%n
         *    - '-'   : alinha à esquerda
         *    - '23'  : largura mínima de 23 caracteres
         *    - 'd'   : inteiro decimal
         *    - '%n'  : quebra de linha independente do sistema operacional
         *
         *  %-23.6e
         *    - '-'    : alinha à esquerda
         *    - '23'   : largura mínima de 23 caracteres
         *    - '.6'   : precisão de 6 casas decimais
         *    - 'e'    : notação científica (ex.: 3.402823e+38)
         *
         *  %-23.6e%n
         *    - mesma coisa de %-23.6e, com quebra de linha (%n) ao final
         *
         * Exemplo de uso para montar uma linha da tabela:
         *
         *   System.out.printf(
         *     "%-8s | %-14d | %-23d | %-23d%n",
         *     "byte",       // primeiro campo: texto com largura 8
         *     Byte.SIZE,    // segundo campo: inteiro com largura 14
         *     byteMinimo,   // terceiro campo: inteiro com largura 23
         *     byteMaximo    // quarto campo: inteiro com largura 23
         *   );
         *
         *  – Cada especificador reserva espaço fixo para manter colunas alinhadas.
         *  – O " | " entre os % garante um separador visual de colunas.
         *  – O uso de largura fixa + alinhamento deixa o resultado idêntico a uma tabela.
         */

    }
}

