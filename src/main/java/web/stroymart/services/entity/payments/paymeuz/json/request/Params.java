package web.stroymart.services.entity.payments.paymeuz.json.request;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import web.stroymart.services.entity.payments.paymeuz.json.Account;


@Data
@RequiredArgsConstructor
public class Params {

    private String id;
    private Integer amount;
    private Account account;
    private Long time;
    private Integer reason;
    private String password;
    private Long from;
    private Long to;

}
