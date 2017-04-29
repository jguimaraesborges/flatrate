package com.eacorp.flatrate.facade;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.eacorp.flatrate.bean.BeanServicio;

public interface ServicioFacade {

	public abstract ArrayList<BeanServicio> listarServicio(Map<String, Object> parametros) throws DataAccessException;
}
