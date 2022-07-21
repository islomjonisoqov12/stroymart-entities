package web.stroymart.services.entity.payments.paymeuz.json.error;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Error {

    private Integer code;
    private String message;

}
