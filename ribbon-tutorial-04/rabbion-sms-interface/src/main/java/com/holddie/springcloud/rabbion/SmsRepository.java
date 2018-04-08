package com.holddie.springcloud.rabbion;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/6 18:43
 */
@RepositoryRestResource(collectionResourceRel = "sms",path = "sms")
public interface SmsRepository extends PagingAndSortingRepository<SmsdomainEntity,Long> {
}
