package man.openbanking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import man.openbanking.TransactionService;
import man.openbanking.Transaction;

@RestController
@RequestMapping(path="",
                produces="application/json")
@CrossOrigin(origins="*")
public class TransactionController {
    private TransactionService s; 

    @GetMapping("/transactions")
    public Transaction[] home() {
        return this.s.findAllByAccountNumber();
    }
}
