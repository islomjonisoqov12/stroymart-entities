package web.stroymart.services.entity.payments.paymeuz.json.result;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CheckPerformTransactionResult {

    private String jsonrpc = "2.0";
    private Integer id;
    private CheckPerformTransactionItems result;


}