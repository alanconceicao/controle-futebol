package gestaofutebol.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import gestaofutebol.dao.CampoDao;
import gestaofutebol.model.Campo;

@Service
@Transactional
public class CampoService {

	private final CampoDao campoDao;
	
	public CampoService(CampoDao campoDao) {
		this.campoDao = campoDao;
	}
	
	public void save(Campo campo){
		campoDao.save(campo);
	}
	
	public List<Campo> findAll(){
		List<Campo> campos = new ArrayList<Campo>();
		for (Campo campo : campoDao.findAll()) {
			campos.add(campo);
		}
		return campos;
	}

}
