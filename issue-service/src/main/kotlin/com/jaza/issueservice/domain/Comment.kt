package com.jaza.issueservice.domain

import javax.persistence.*

@Entity
@Table
class Comment(
        @Id
        @GeneratedValue
        val id: Long? = null,

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "issue_id")
        val issue: Issue,

        @Column
        val userId: Long,

        @Column
        val username: String,

        @Column
        var body: String,
): BaseEntity()