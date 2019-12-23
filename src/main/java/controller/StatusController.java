

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("post/statuses")
public class StatusController {

    StatusRepository statusRepository;
}

