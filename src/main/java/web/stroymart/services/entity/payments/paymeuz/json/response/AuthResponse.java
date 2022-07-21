package web.stroymart.services.entity.payments.paymeuz.json.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.json.error.ErrorResult;

@Data
@RequiredArgsConstructor
public class AuthResponse {

    private ErrorResult error;

}
