package com.github.bearcoding.forum.service.user.repository.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * ip信息
 *
 *
 *
 */
@Data
public class IpInfo implements Serializable {
    private static final long serialVersionUID = -4612222921661930429L;

    private String firstIp;

    private String firstRegion;

    private String latestIp;

    private String latestRegion;
}