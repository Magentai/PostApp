

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("post/packagetypes")
public class PackageTypeController {

    PackageTypeRepository packageTypeRepository;
}

