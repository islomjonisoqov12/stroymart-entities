package web.stroymart.services.entity.payments.paymeuz.json.error;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ErrorResult {

    private String jsonrpc = "2.0";
    private Integer id;
    private Error error;
}
