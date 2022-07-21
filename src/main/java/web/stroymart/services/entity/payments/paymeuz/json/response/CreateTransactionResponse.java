package web.stroymart.services.entity.payments.paymeuz.json.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.json.error.ErrorResult;
import web.stroymart.services.entity.payments.paymeuz.json.result.CreateTransactionResult;


@Data
@RequiredArgsConstructor
public class CreateTransactionResponse {

    private ErrorResult error;
    private CreateTransactionResult result;

}
