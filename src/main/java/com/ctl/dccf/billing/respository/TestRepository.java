package com.ctl.dccf.billing.respository;

import com.ctl.dccf.billing.core.user.Test;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface TestRepository extends MongoRepository<Test, Long> {

    Test findById(String id);

}

