package fp.firstS.pictureSaver.web;

import fp.firstS.pictureSaver.service.PictureService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pictures")
public class PictureController {


    private final PictureService pictureService;

    public PictureController(PictureService pictureService) {
        this.pictureService = pictureService;
    }

    @GetMapping("/all")
    public String getAllPictures(Model model,
                                 @PageableDefault(
                                         sort = "pictureId",
                                         size = 3
                                 )Pageable pageable) {
        var allPicturePAge = pictureService.getAllPictures(pageable);
        model.addAttribute("pictures",allPicturePAge);

        return "pictures";
    }

}
