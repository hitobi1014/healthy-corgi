package com.hc.member.infrastructure.repository.command

import com.hc.member.infrastructure.entity.MemberEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MemberCommandRepository : JpaRepository<MemberEntity, Int>