package web.stroymart.services.entity.payments.paymeuz.json.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.json.error.ErrorResult;
import web.stroymart.services.entity.payments.paymeuz.json.result.PerformTransactionResult;


@Data
@RequiredArgsConstructor
public class PerformTransactionResponse {

    private ErrorResult error;
    private PerformTransactionResult result;

}
