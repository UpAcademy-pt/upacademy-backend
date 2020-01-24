package pt.upacademy.coreFinalProject.services;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import pt.upacademy.coreFinalProject.controllers.UserController;
import pt.upacademy.coreFinalProject.models.Account;
import pt.upacademy.coreFinalProject.models.DTOS.UserDTO;
import pt.upacademy.coreFinalProject.repositories.AccountRepository;

@RequestScoped
public class AccountService extends EntityService<AccountRepository,Account> {
	
	@Inject
	protected UserController userController;
	
	public Collection<Account> getByUserRole(String role) {
		Collection<UserDTO> usersByRole = userController.getAdminFilter(null, role, null);
		Collection<Long> userIdsByRole = usersByRole.stream().map(user -> user.getId()).collect(Collectors.toList());
		return repository.getByUserIds(userIdsByRole);
	}
	
	public Account getByUserId(long userId) {
		Optional<Account> account = repository.getByUserId(userId).stream().findFirst();
		if (account.isPresent()) {
			return account.get();
		} else {
			//throw new IllegalArgumentException(String.format("Account with user id %d doesn't exist", userId));
			return null;
		}
		
	}
}
