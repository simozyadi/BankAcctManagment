package simo.devsid.Business;


import java.util.List;

import simo.devsid.entities.Client;

public interface BusinessClient {
	
	public Client saveClient(Client c);
	public List<Client> listClient();

}
