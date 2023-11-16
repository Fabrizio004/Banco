public class Main {
    public static void main(String[] args) {
        // Crear un cliente
        Cliente cliente1 = new Cliente("John", "Doe", +1);

        // Crear una cuenta bancaria para el cliente
        CuentaBancaria cuenta1 = new CuentaBancaria(1001, cliente1, 1000.0);

        // Realizar operaciones en la cuenta
        cuenta1.depositar(500.0);
        cuenta1.retirar(200.0);
// En la clase Main
        System.out.println("Nombre del cliente: " + cliente1);
        System.out.println("Saldo actual: " + cuenta1.getSaldo());

    }
}
