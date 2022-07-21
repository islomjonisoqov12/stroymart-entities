package web.stroymart.services.entity.payments.paymeuz.json.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.json.error.ErrorResult;
import web.stroymart.services.entity.payments.paymeuz.json.result.CancelTransactionResult;

@Data
@RequiredArgsConstructor
public class CancelTransactionResponse {

    private ErrorResult error;
    private CancelTransactionResult result;

}
