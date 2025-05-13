package br.com.estruturaJava;

import java.util.logging.Logger;

public class RepresentacaoNumerica {
    private static final Logger logger = Logger.getLogger(RepresentacaoNumerica.class.getName());


    public static void representacaoNumerica() {
        // Declarações literais de diferentes tipos numéricos
        int decimal = 123_456;                     // decimal com underscore
        int binario = 0b1010_1111_0101;            // binário
        int hexadecimal = 0x12AF_2020;             // hexadecimal
        int octal = 0444;                          // octal

        long longHex = 0x4A8_17C80L;               // long hexadecimal

        float numeroRacional_float = 1.2345e3f;    // float em notação científica
        double numeroRacional_double = 6.022e23;   // double em notação científica

        // Formato da tabela: Tipo | Valor declarado | Valor exibido
        String formatacao = "%-15s | %-20s | %-15s%n";

        StringBuilder sb = new StringBuilder();
        sb.append(System.lineSeparator());
        sb.append(String.format(formatacao, "Tipo", "Valor Declarado", "Valor Exibido"));
        sb.append("---------------------------------------------------------------\n");

        sb.append(String.format(formatacao, "decimal",      "123_456",          decimal));
        sb.append(String.format(formatacao, "binário",      "0b1010_1111_0101", binario));
        sb.append(String.format(formatacao, "hexadecimal",  "0x12AF_2020",      hexadecimal));
        sb.append(String.format(formatacao, "octal",        "0444",             octal));


        sb.append(String.format(formatacao, "long hex.",    "0x4A8_17C80L",     longHex));

        sb.append(String.format(formatacao, "float",        "1.2345e3f",        numeroRacional_float));
        sb.append(String.format(formatacao, "double",       "6.022e23",         numeroRacional_double));

        logger.info(sb.toString());
    }
}
