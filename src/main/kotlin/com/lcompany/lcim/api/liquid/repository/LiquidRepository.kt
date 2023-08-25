package com.lcompany.lcim.api.liquid.repository

import com.lcompany.lcim.api.liquid.domain.Liquid
import org.springframework.data.jpa.repository.JpaRepository

interface LiquidRepository: JpaRepository<Liquid, String>