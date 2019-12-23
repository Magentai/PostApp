

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("post/transfers")
public class TransferController {

    TransferRepository transferRepository;
}

