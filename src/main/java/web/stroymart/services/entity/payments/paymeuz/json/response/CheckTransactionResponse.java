package web.stroymart.services.entity.payments.paymeuz.json.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.json.error.ErrorResult;
import web.stroymart.services.entity.payments.paymeuz.json.result.CheckTransactionResult;

@Data
@RequiredArgsConstructor
public class CheckTransactionResponse {

    private ErrorResult error;
    private CheckTransactionResult result;

}
