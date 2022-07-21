package web.stroymart.services.entity.payments.paymeuz.json.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.json.error.ErrorResult;
import web.stroymart.services.entity.payments.paymeuz.json.result.CheckPerformTransactionResult;

@Data
@RequiredArgsConstructor
public class CheckPerformTransactionResponse {

    private ErrorResult error;
    private CheckPerformTransactionResult result;

}
