public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("John", "Doe", +1);

        CuentaBancaria cuenta1 = new CuentaBancaria(1001, cliente1, 1000.0);

        cuenta1.depositar(500.0);
        cuenta1.retirar(200.0);

        System.out.println("Nombre del cliente: " + cliente1);
        System.out.println("Saldo actual: " + cuenta1.getSaldo());

    }
}