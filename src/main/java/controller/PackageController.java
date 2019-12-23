

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("post/packages")
public class PackageController {

    PackageRepository packageRepository;
}

