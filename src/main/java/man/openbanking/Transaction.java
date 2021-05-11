package man.openbanking;

import lombok.Data;

@Data
public class Transaction {
    public int type;

    public Date date;

    public int accountNumber;

    public String currency;

    public float amount;

    public String merchantName;

    public String merchantLogo;

}
