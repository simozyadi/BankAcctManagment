package simo.devsid.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import simo.devsid.Business.BusinessClient;
import simo.devsid.entities.Client;

@RestController
public class ClientRestService {
	
	@Autowired
	private BusinessClient businessClient;

	@RequestMapping(value = "/clients",method = RequestMethod.POST)
	public Client saveClient(@RequestBody Client c) {
		return businessClient.saveClient(c);
	}

	@RequestMapping(value = "/clients",method = RequestMethod.GET)
	public List<Client> listClient() {
		return businessClient.listClient();
	}

}
