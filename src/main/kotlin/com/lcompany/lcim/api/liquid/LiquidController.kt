package com.lcompany.lcim.api.liquid

import com.lcompany.lcim.api.liquid.domain.Liquid
import com.lcompany.lcim.api.liquid.repository.LiquidRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/liquid")
class LiquidController(
        val liquidRepository: LiquidRepository
) {
    @GetMapping()
    fun getLiquids(): ResponseEntity<*> {
        val liquids = liquidRepository.findAll()

        return ResponseEntity.ok(liquids)
    }

    @PostMapping()
    fun setLiquids(@RequestBody liquid: Liquid): ResponseEntity<*> {
        val res = liquidRepository.save(liquid)

        return ResponseEntity.ok(res)
    }
}