package simo.devsid.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simo.devsid.entities.Client;
import simo.devsid.repository.ClientRepository;

@Service
public class BusinessClientImpl implements BusinessClient{
	
	 @Autowired
	private ClientRepository clientRepository ;

	@Override
	public Client saveClient(Client c) {
		// TODO Auto-generated method stub
		return clientRepository.save(c);
	}

	@Override
	public List<Client> listClient() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

}
