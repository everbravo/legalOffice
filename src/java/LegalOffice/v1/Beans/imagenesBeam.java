package LegalOffice.v1.Beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class imagenesBeam {

   private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 0; i <= 4; i++) {
            images.add("consultorio" + i + ".jpg");
        }
    }
 
    public List<String> getImages() {
        return images;
    }
}
