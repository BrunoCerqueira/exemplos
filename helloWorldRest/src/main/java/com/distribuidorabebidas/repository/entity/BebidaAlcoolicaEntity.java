package com.distribuidorabebidas.repository.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.distribuidorabebidas.repository.entity.enumerator.TipoBebida;

@Entity
@DiscriminatorValue(value = "0")
public class BebidaAlcoolicaEntity extends BebidaEntity {
	public BebidaAlcoolicaEntity() {
		super.setTipoBebida(TipoBebida.ALCOOLICA);
	}

	public BebidaAlcoolicaEntity(Long bebida) {
		super(bebida);
	}

}
