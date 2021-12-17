package JustJava;


import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        String[] name = new String[29];
        names(name);

        String[] nickTelegram = new String[29];
        nicksTelegram(nickTelegram);

        for (int i = 0; i < name.length; i++) {
            int number = 1 + i;
            System.out.println(number + "." + name[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose a student");
        int numberOfStudent = scanner.nextInt();

        switch (numberOfStudent) {
            case (1):
                System.out.println("Name is " + name[0] + " telegram nick is " + nickTelegram[0]);
                break;

        }

    }

    private static String[] nicksTelegram(String[] nickTelegram) {

        nickTelegram[0] = "@dani_kk";
        nickTelegram[1] = "@bdr2000";
        nickTelegram[2] = "@mixasy03";
        nickTelegram[3] = "@Naykelos";
        nickTelegram[4] = "@Vlad704511";
        nickTelegram[5] = "@vynnykpff";
        nickTelegram[6] = "@VovaGarasimovich";
        nickTelegram[7] = "@happyman20213";
        nickTelegram[8] = "@GrigorenkoPavlo";
        nickTelegram[9] = "@da_da_ev";
        nickTelegram[10] = "@kristmazzz";
        nickTelegram[11] = "@ddddddduuu";
        nickTelegram[12] = "-";
        nickTelegram[13] = "@R_ne_pedik";
        nickTelegram[14] = "-";
        nickTelegram[15] = "-";
        nickTelegram[16] = "@lvalue_reference";
        nickTelegram[17] = "-";
        nickTelegram[18] = "@Artemka_004";
        nickTelegram[19] = "-";
        nickTelegram[20] = "@satsapatovsky";
        nickTelegram[21] = "@KilluaZoldyck_14";
        nickTelegram[22] = "@agnesskp";
        nickTelegram[23] = "@DrunkennessBunny";
        nickTelegram[24] = "@artemiy35213";
        nickTelegram[25] = "-";
        nickTelegram[26] = "@ilfintari";
        nickTelegram[27] = "-";
        nickTelegram[28] = "-";

        return nickTelegram;
    }


    private static String[] names(String[] name) {
        name[0] = "Бабин Даніїл-Віталій";
        name[1] = "Балабан Данило";
        name[2] = "Білокур Михайло";
        name[3] = "Бортнік Микола";
        name[4] = "Будзинський Владіслав";
        name[5] = "Винник Антон";
        name[6] = "Гарасимович Володимир";
        name[7] = "Гнатенко Михайло";
        name[8] = "Григоренко Павло";
        name[9] = "Дадаєв Максим";
        name[10] = "Звєрєв Артем";
        name[11] = "Ісаєвич Даніїл";
        name[12] = "Коваленко Ігор";
        name[13] = "Коробов Гліб";
        name[14] = "Лапутько Богдан";
        name[15] = "Лобчинський Денис";
        name[16] = "Лозінський Діан";
        name[17] = "Мокітрук Владіслав";
        name[18] = "Муральов Артем";
        name[19] = "Носов Денис";
        name[20] = "Овчинскій Володимер";
        name[21] = "Павлик Олександер";
        name[22] = "Панасенко Інеса";
        name[23] = "Рибалко Олег";
        name[24] = "Сурядний Артем";
        name[25] = "Тищенко Богдан";
        name[26] = "Тимофєєва Анастасія";
        name[27] = "Шморгун Богдан";
        name[28] = "Заєць Нікіта";

        return name;
    }


}
