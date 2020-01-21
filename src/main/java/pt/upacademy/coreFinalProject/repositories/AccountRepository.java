package pt.upacademy.coreFinalProject.repositories;

import javax.enterprise.context.RequestScoped;

import pt.upacademy.coreFinalProject.models.Account;

@RequestScoped
public class AccountRepository extends EntityRepository<Account> {

	@Override
	protected Class<Account> getEntityClass() {
		return Account.class;
	}

	@Override
	protected String getAllEntities() {
		// TODO Auto-generated method stub
		return null;
	}

}
