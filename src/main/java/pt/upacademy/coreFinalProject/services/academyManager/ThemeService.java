package pt.upacademy.coreFinalProject.services.academyManager;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.academyManager.Theme;
import pt.upacademy.coreFinalProject.repositories.academyManager.ThemeRepository;
import pt.upacademy.coreFinalProject.services.core.EntityService;

@RequestScoped
public class ThemeService extends EntityService<ThemeRepository,Theme>{

}
