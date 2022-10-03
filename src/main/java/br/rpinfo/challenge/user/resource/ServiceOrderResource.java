package br.rpinfo.challenge.user.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.rpinfo.challenge.user.repository.ServiceOrderRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import br.rpinfo.challenge.user.model.ServiceOrder;

//Controller da API, implementada com os métodos GET, POST, DELETE E PUT
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
@Api(value="API REST Ordens de serviço")
public class ServiceOrderResource {
	
	@Autowired
	ServiceOrderRepository serviceOrderRepository;
	
	@GetMapping("/serviceOrders")
	@ApiOperation(value="Retorna uma lista com todas as ordens de serviços armazenadas.")
	public List<ServiceOrder> getAllServiceOrders(){
		return serviceOrderRepository.findAll();
	}
	
	@GetMapping("serviceOrder/{id}")
	@ApiOperation(value="Retorna uma ordem de serviço a partir de seu id.")
	public ServiceOrder getServiceOrder(@PathVariable(name = "id", required = true) int id) {
		return serviceOrderRepository.findById(id);
	}
	
	@PostMapping("/serviceOrder")
	@ApiOperation(value="Adiciona uma ordem de serviço ao banco de dados.")
	public ServiceOrder addServiceOrder(@RequestBody ServiceOrder serviceOrder) {		
		return serviceOrderRepository.save(serviceOrder);
	}
	
	@DeleteMapping("/serviceOrder")
	@ApiOperation(value="Exclui uma ordem de serviço de acordo com o id fornecido.")
	public void deleteServiceOrder(@PathVariable(name = "id", required = true) int id) {
		ServiceOrder serviceOrder = serviceOrderRepository.findById(id);
		serviceOrderRepository.delete(serviceOrder);
	}
	
	@PutMapping("/serviceOrder")
	@ApiOperation(value="Atualiza uma ordem de serviço de acordo com o id fornecido.")
	public ServiceOrder modifyServiceOrder(@RequestBody ServiceOrder serviceOrder) {		
		return serviceOrderRepository.save(serviceOrder);
	}
}
