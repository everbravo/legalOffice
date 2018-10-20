package LegalOffice.v1.Beans;

import LegalOffice.v1.model.loginModel;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class loginBeam {
  
   private loginModel logueo = new loginModel();

    public loginModel getLogueo() {
        return logueo;
    }

    public void setLogueo(loginModel logueo) {
        this.logueo = logueo;
    }

    
    
    
}
