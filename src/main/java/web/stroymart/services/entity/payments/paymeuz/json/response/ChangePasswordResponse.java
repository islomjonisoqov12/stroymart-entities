package web.stroymart.services.entity.payments.paymeuz.json.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.json.error.ErrorResult;
import web.stroymart.services.entity.payments.paymeuz.json.result.ChangePasswordResult;


@Data
@RequiredArgsConstructor
public class ChangePasswordResponse {

    private ErrorResult error;
    private ChangePasswordResult result;

}
