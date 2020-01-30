package pt.upacademy.coreFinalProject.controllers.academyManager;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pt.upacademy.coreFinalProject.controllers.EntityControllerDTO;
import pt.upacademy.coreFinalProject.models.academyManager.Module;
import pt.upacademy.coreFinalProject.models.academyManager.DTOS.ModuleDTO;
import pt.upacademy.coreFinalProject.models.academyManager.converters.ModuleConverter;
import pt.upacademy.coreFinalProject.repositories.academyManager.ModuleRepository;
import pt.upacademy.coreFinalProject.services.academyManager.ModuleService;

@Path("academy-manager/modules")
@RequestScoped
public class ModuleController extends EntityControllerDTO<ModuleService, ModuleRepository, ModuleConverter, Module, ModuleDTO> {

}
