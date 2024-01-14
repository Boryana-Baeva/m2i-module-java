package dec18.TP;

public interface ITransactions {
    void depot(double montant);
    void retrait(double montant);
    void virement(double montant);
}
