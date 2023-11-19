package com.example.demo

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.stereotype.Component

@Component
@RefreshScope // 해당 annotation이 있어야 'refresh'했을 때 @Bean이 새로 생성된다.
class YebaliConfig(
    @Value("\${yebali.name}")
    val name: String,
)