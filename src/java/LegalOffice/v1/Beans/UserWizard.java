package LegalOffice.v1.Beans;

import LegalOffice.v1.model.UserModel;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.FlowEvent;
 
@ManagedBean
@ViewScoped
public class UserWizard implements Serializable {
 
    private UserModel usuario = new UserModel();
     
    private boolean skip;

    public UserModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UserModel usuario) {
        this.usuario = usuario;
    }
     
    
     
    public void save() {        
        FacesMessage msg = new FacesMessage("Exitoso", "Bienvenido :" + usuario.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public boolean isSkip() {
        return skip;
    }
 
    public void setSkip(boolean skip) {
        this.skip = skip;
    }
     
    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case usuario goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }
}