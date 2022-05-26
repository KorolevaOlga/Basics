package Program.Account;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Account account = new Account("Иванов И.И.", "18.02.22", "NC 12345678", 13000.1, Account.Status.BLOCKED);
        Account account1 = new Account("Иванов И.И.", "02.03.18", "VB 87654321", -01.01, Account.Status.UNBLOCKED);

        Account account2 = new Account("Петров С.К.", "12.02.22", "BG 23456789", 12830.0, Account.Status.UNBLOCKED);
        Account account3 = new Account("Петров С.К", "12.02.22", "DF 34567890", -35000.0, Account.Status.UNBLOCKED);
        Account account4 = new Account("Петров С.К.", "04.06.08", "RT 90785634", -20.0, Account.Status.BLOCKED);
        Account account5 = new Account("Петров С.К.", "03.06.12", "FD 23434556", 100000.0, Account.Status.UNBLOCKED);

        ArrayList<Account> ivanov = new ArrayList<>();
        ivanov.add(account);
        ivanov.add(account1);

        ArrayList<Account> petrov = new ArrayList<>();
        petrov.add(account2);
        petrov.add(account3);
        petrov.add(account4);
        petrov.add(account5);

        Client client = new Client("Иванов И.И.", ivanov);
        Client client1 = new Client("Петров С.К.", petrov);

        client.allSum();
        client1.negativeSum();
        client1.positiveSum();
        account1.setStatus(Account.Status.BLOCKED);

        System.out.println("Заблокированные счета клиента: ");
        client.statusBlocked();

        System.out.println("Неблокированные(доступные) счета клиента: ");
        client1.statusUnblocked();

        System.out.println("Сортировка счетов по возрастанию суммы на них: ");
        petrov.sort(Client.sortSum);
        for (Account value : petrov) {
            System.out.println(value);
        }
        System.out.println("Поиск по номеру счета: ");
        client1.askAccountNumber("BG 23456789");

    }
}
