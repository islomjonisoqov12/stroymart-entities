package web.stroymart.services.entity.payments.paymeuz.json.result;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class CancelTransactionItems {

    private String transaction;
    private Long cancel_time;
    private Integer state;

}
